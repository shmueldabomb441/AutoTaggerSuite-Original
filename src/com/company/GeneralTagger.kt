package com.company

import org.jaudiotagger.audio.AudioFileIO
import org.jaudiotagger.audio.exceptions.CannotReadException
import org.jaudiotagger.audio.exceptions.CannotWriteException
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException
import org.jaudiotagger.audio.mp3.MP3File
import org.jaudiotagger.tag.FieldKey
import org.jaudiotagger.tag.TagException
import java.awt.Dimension
import java.awt.Font
import java.io.*
import java.nio.file.Files
import java.nio.file.Paths
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit
import java.util.logging.Level
import java.util.logging.Logger
import javax.swing.*

class GeneralTagger {
    var rejected = File("C:\\TD_Library\\validate_process\\Rejected")
    var moveToMaster = File("C:\\TD_Library\\validate_process\\MoveToMaster")
    var sourceFolder = System.getProperty("user.dir").substring(System.getProperty("user.dir").lastIndexOf(File.separator) + 1)

    @Throws(IOException::class)
    fun main() {
        try {
            val tdPushEnder = TDPushEnder()
            if (tdPushEnder.myDataSyncIsStillRunning) tdPushEnder.killMyDataSync()
            val errorLog = File(System.getProperty("user.dir") + "\\SystemErrorLog.txt")
            val ps = PrintStream(errorLog)
            val series = String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "\\Series.txt")))
            val speaker = String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "\\Speaker.txt")))
            val category = String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "\\Category.txt")))
            val files = File(System.getProperty("user.dir")).listFiles()


            //check if there are any mp3 files in source folder:
            findMp3CounterAndMp3FileSizeOfFileList(files)
            if (mp3Counter > 0) tagMp3s(mp3Counter, series, speaker, category, files, totalFilesizeToBeMoved) else {
                //TODO add message box here letting the user know that there are no mp3s in the folder
                // and ask if they want to run TD_Process and then close.run process, run push, push
                // will run a Hanging prevention program right hefore it getsvto Sync Databades, wait
                // a few seconds for it to statt, the hang7nt or2vention oeogram will get the mp3Counter
                // and total filesoze and wait a cwrtain ratio (wnich i still need to determine using
                // test samoling,part of whicg will ddtermine if times are moee consixtently cslculated
                // usung mo3Counter r filesize) andcsee if it hung at tdLiveSync_A.mydsp by waitiing the
                // amouny and them checking to see if the next messabe was added to the TimeStamp file(meaning
                // the windows error message box popped up ssaying the initial connection to mySQL failed),
                // kill the process and its tree, start  the new .bat(which i still have to create)which
                // only has tdLiveSync_A.mydsp and B so it can pick up whee irt left off, check again.
                // 4his t7me it will probably get past tdLiveSync_A.mydsp, so obviously check again wnd
                // thixvtime it willvpribwgky getbup ro tbe place where uou cgeck if vtdLiveSync_B.mydsp
                // hangsthe upload script would get mp3Counter of validate_prrocess and their total filesize,
                // run td_push and
                var reply1 = 1
                reply1 = textbox("There are no .mp3 files in the current folder. Would you like to run the upload script in case any files got stuck in the upload process the last time the script was run and have not yet been uploaded? You can also run it to simply to update the site after a change.", "No Files Found")
                if (reply1 == 0) /*Yes*/ {
                    //run the upload script scoped to validate process:
                    val validate_process = File("C:\\TD_Library\\validate_process").listFiles()
                    findMp3CounterAndMp3FileSizeOfFileList(validate_process)
                    val timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds = 3 + totalFilesizeToBeMoved / 32.93251667
                    runTD_Process(timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds)
                    runTDPush()
                    System.exit(5)
                } else {
                    setLookAndFeelOfGUIToNimbusStyle()
                    JOptionPane.showMessageDialog(null, "Upload script will not run. AutoTagger will now close.")
                }
            }
        } catch (ex: NullPointerException) {
            val a = GeneralTagger()
            a.textboxStackTrace(ex)
            write0ToSingletonFileAndClose()
        } catch (ex: TagException) {
            val a = GeneralTagger()
            a.textboxStackTrace(ex)
            write0ToSingletonFileAndClose()
        } catch (ex: ReadOnlyFileException) {
            val a = GeneralTagger()
            a.textboxStackTrace(ex)
            write0ToSingletonFileAndClose()
        } catch (ex: CannotReadException) {
            val a = GeneralTagger()
            a.textboxStackTrace(ex)
            write0ToSingletonFileAndClose()
        } catch (ex: InvalidAudioFrameException) {
            val a = GeneralTagger()
            a.textboxStackTrace(ex)
            write0ToSingletonFileAndClose()
        } catch (ex: IOException) {
            val a = GeneralTagger()
            a.textboxStackTrace(ex)
            write0ToSingletonFileAndClose()
        } catch (ex: CannotWriteException) {
            val a = GeneralTagger()
            a.textboxStackTrace(ex)
            write0ToSingletonFileAndClose()
        } catch (ex: InterruptedException) {
            val a = GeneralTagger()
            a.textboxStackTrace(ex)
            write0ToSingletonFileAndClose()
        }
    }

    fun findMp3CounterAndMp3FileSizeOfFileList(files: Array<File>) {
        for (file in files) {
            if (!file.isFile) continue
            val bits = file.name.split("\\.".toRegex()).toTypedArray()
            val endsInMp3 = bits[bits.size - 1].equals("mp3", ignoreCase = true)
            if (endsInMp3) {
                mp3Counter += 1
                totalFilesizeToBeMoved += GetFileSize.MebiBytes(file) //replace with +=;add filesize of this .mp3 to total filesize of mp3s which need to be moved
            }
        }
    }

    @Throws(CannotReadException::class, IOException::class, TagException::class, ReadOnlyFileException::class, InvalidAudioFrameException::class, CannotWriteException::class, InterruptedException::class)
    fun tagMp3s(mp3Counter: Int, series: String?, speaker: String?, category: String?, files: Array<File>, totalFilesizeToBeMoved: Long) {
        val errorLog = File(System.getProperty("user.dir") + "\\SystemErrorLog.txt")
        val ps = PrintStream(errorLog)
        for (file in files) {
            if (!file.isFile) continue
            val bits = file.name.split("\\.".toRegex()).toTypedArray()
            val endsInMp3 = bits[bits.size - 1].equals("mp3", ignoreCase = true)
            if (bits.size > 0 && endsInMp3) {
                val f = AudioFileIO.read(file) as MP3File
                val tag = f.tag
                if (tag.getFirst(FieldKey.TITLE) != null) {
                    tag.deleteField(FieldKey.TITLE)
                }
                tag.setField(FieldKey.TITLE, file.name)
                //  if (tag.getFirst(FieldKey.TITLE).contains("\\.mp3")) {
                //add code here which: stores the current title in a variable
                //add code here which: deletes the current .mp3 file's title(and then then the next line sets the stored title to the mp3 while replacing ".mp3"
                //  tag.setField(FieldKey.TITLE,tag.getFirst(FieldKey.TITLE).replace("\\.mp3",""));}
                // else if(tag.getFirst(FieldKey.TITLE).contains("\\.MP3")){
                // tag.setField(FieldKey.TITLE,tag.getFirst(FieldKey.TITLE).replace("\\.MP3",""));}
                if (tag.getFirst(FieldKey.ALBUM) != null) {
                    tag.deleteField(FieldKey.ALBUM)
                }
                tag.setField(FieldKey.ALBUM,  /*"Halacha;Chaye Adam"*/category)
                if (tag.getFirst(FieldKey.ARTIST) != null) {
                    tag.deleteField(FieldKey.ARTIST)
                }
                tag.setField(FieldKey.ARTIST,  /*"Rabbi Eliyahu Reingold"*/speaker)
                if (tag.getFirst(FieldKey.CONDUCTOR) != null) {
                    tag.deleteField(FieldKey.CONDUCTOR)
                }
                tag.setField(FieldKey.CONDUCTOR,  /*"Daily Halacha - "+*/series)
                if (tag.getFirst(FieldKey.TITLE).contains(".mp3")) {
                    val before = tag.getFirst(FieldKey.TITLE)
                    val after = before.replace(".mp3", "")
                    tag.deleteField(FieldKey.TITLE)
                    tag.setField(FieldKey.TITLE, after)
                } else if (tag.getFirst(FieldKey.TITLE).contains(".MP3")) {
                    val before = tag.getFirst(FieldKey.TITLE)
                    val after = before.replace(".MP3", "")
                    tag.deleteField(FieldKey.TITLE)
                    tag.setField(FieldKey.TITLE, after)
                }
                f.commit()
                val temp = Files.move(Paths.get(file.toString()), Paths.get("C:\\TD_Library\\validate_process\\" + file.name))
            }
        }
        uploadThem(ps, mp3Counter, totalFilesizeToBeMoved)
    }

    @Throws(IOException::class, InterruptedException::class)
    fun uploadThem(ps: PrintStream?, mp3Counter: Int, totalFilesizeToBeMoved: Long) {
        var mp3Counter = mp3Counter
        var totalFilesizeToBeMoved = totalFilesizeToBeMoved
        try {
            //this program takes place in validate_process and MoveToMaster
            val tdPushEnder = TDPushEnder()
            if (GetFileSize.MebiBytes(moveToMaster) != 0L) totalFilesizeToBeMoved += GetFileSize.MebiBytes(moveToMaster)
            if (moveToMaster.list().size != 0) mp3Counter += moveToMaster.list().size
            val flatRateOfTimeItTakesToSyncDatabaseMeasuredInSeconds = 110 //but Thread.sleep() only accepts milliseconds, you when passing these numbers, multiply them by 1,000 to go from milliseconds to seconds
            val timeItTakesToMoveTheseToMasterMeasuredInSeconds = 10 + totalFilesizeToBeMoved / 100.0
            val timeItTakesToUploadTheseToServerMeasuredInSeconds = 15 + totalFilesizeToBeMoved / 4.2 /*1 divided by 4.2MBps--the lowest possible speed it could take--it could really do about 7MBps, just being conservative*/
            val timeItTakesTD_PushToParseFilesMeasuredInSeconds = 5 + .6 * mp3Counter /*which is about 1.66 files parsed per second--it can actually parse of 2.4 files a second, but this is conservative*/
            val timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds = 10 + totalFilesizeToBeMoved / 32.93251667
            val timeItShouldTakeTD_PushToFinishMeasuredInSeconds = (timeItTakesTD_PushToParseFilesMeasuredInSeconds + timeItTakesToUploadTheseToServerMeasuredInSeconds + timeItTakesToMoveTheseToMasterMeasuredInSeconds + flatRateOfTimeItTakesToSyncDatabaseMeasuredInSeconds).toLong()
            runTD_Process(timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds) //now also handles rejection notification and message boxes about moving the files back
            runTDPush()
            var timesTDWasRan = 0
            val amountOfFilesInMasterBefore = moveToMaster.list().size
            do {
                var noFileHaveBeenMoved: Boolean
                if (tdPushEnder.tdPushIsStillRunning && moveToMaster.list().size == amountOfFilesInMasterBefore) { /*if by time it hangs there should be no more files in the folder, then check if the amount of files moved was zero(it never got off the ground), using this: "&& numFilesInMoveToMasterBeforeTD_PushIsRun==numFilesNow" so if none of them are moved, don't kill it. , */
                    tdPushEnder.killTDPush()
                } else if (tdPushEnder.tdPushIsStillRunning && moveToMaster.list().size > 0 /*There are less files than when we started, but there are still files (i.e. files have been moved)*/) {
                    val x = moveToMaster.list().size
                    TimeUnit.SECONDS.sleep(20)
                    val y = moveToMaster.list().size
                    if (x == y) /*if it is mamash stuck there, then*/ tdPushEnder.killTDPush() else if (x - y > 0) /*if files moved since i last checked(i.e. if files are still moving)*/ {
                        while (moveToMaster.list().size > 0) TimeUnit.SECONDS.sleep(20) //so long as there are files in the folder, wait. That is, wait until there are no more files
                        waitForTDPush(flatRateOfTimeItTakesToSyncDatabaseMeasuredInSeconds + 8.toLong()) //now you know for sure that all that TD_Push has to do is sync the databse, so wait that time and then check if it is still running,because all of the files are gon, so "moving to master on local" phase is done
                        continue  //recheck condition, namely, if it is still running after it should have finished
                    } else  /*if after you waited 20 seconds, all of the files were gone:*/ {
                        waitForTDPush(flatRateOfTimeItTakesToSyncDatabaseMeasuredInSeconds + 8.toLong())
                        continue
                    } //wait for it to sync databases, as is explained in the previous if statement's waitForTDPush comment(line 92 as of now)
                } else if (tdPushEnder.tdPushIsStillRunning && moveToMaster.list().size == 0 /*there are no more files in Master*/) {
                    tdPushEnder.killTDPush()
                }
                if (timesTDWasRan == 4) {
                    val out = PrintStream(FileOutputStream(System.getProperty("user.dir") + "\\SystemErrorLog.txt"))
                    val t = Throwable()
                    t.printStackTrace(out)
                    val dateFormat: DateFormat = SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
                    val date = Date()
                    val dateWriter: Writer = FileWriter(System.getProperty("user.dir") + "\\SystemErrorLog.txt", true)
                    dateWriter.write(dateFormat.format(date) + "     TD_PUSH had to restart too many times (4 times) because it failed to finish executing.")
                    dateWriter.close()
                    write0ToSingletonFileAndClose()
                    System.exit(3)
                }
                runTDPush()
                timesTDWasRan += 1
                waitForTDPush(timeItShouldTakeTD_PushToFinishMeasuredInSeconds)
            } while (tdPushEnder.tdPushIsStillRunning) //Run TD_Push and then wait. if TD_Push is still running after it should have finished: kill it, start a new one, and then wait for it again
            //TODO: move the following lines up to immidoately after runTDPush() once you figuire everything out
        } catch (ex: IOException) {
            val a = GeneralTagger()
            a.textboxStackTrace(ex)
            write0ToSingletonFileAndClose()
        } catch (ex: InterruptedException) {
            val a = GeneralTagger()
            a.textboxStackTrace(ex)
            write0ToSingletonFileAndClose()
        }
        write0ToSingletonFileAndClose()
    }

    @Throws(InterruptedException::class)
    fun waitForTDPush(timeItShouldTakeTD_PushToFinishMeasuredInSeconds: Long) {
        TimeUnit.SECONDS.sleep(timeItShouldTakeTD_PushToFinishMeasuredInSeconds) //it is already measured in milliseconds so i dont have to multiply it by 1,000
    }

    @Throws(InterruptedException::class)
    fun waitForTD_Process(timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds: Double) {
        TimeUnit.SECONDS.sleep( /*accepts milliseconds*/Math.ceil(1 + timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds).toLong() /*1,000 ms in 1 second*/ /*the 1+ is just in case timeItTakes... evaluates to zero(they are just using it to upload)*/) //0.03036512544770260 is 1 divided by the rate at which TD_Process to process shiurim. ((amount transfered)/rate of transfer)=time it will take to tranfer. Manipulating this equation provides the formula: multiply how many GBs need to be processed by TD_Process by 0.03036512544770260 to obtain how long it will take for TD_Process to go through them, and therefore how long to wait until it should be done by. Rates for processing time of TD_process, TD_Push's initial parsing of the files,(average time it takes to upload,) and MoveToMaster, were originially computed in an Excel spreadsheet titled "Multipliers for GeneralTagger" located in C:\Users\mglazer\Documents.
    }

    @Throws(IOException::class)
    fun runTD_Process(timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds: Double) {
        //TD_Process:
        try {
            val amountofFilesInRejectedBeforeTDProcess = rejected.list().size
            val before = rejected.listFiles()
            Runtime.getRuntime().exec("cmd /K tdsync - shmuly.bat", null, File("C:\\PHPTest\\"))
            waitForTD_Process(1 + timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds)
            val amountofFilesInRejectedAfterTDProcess = rejected.list().size
            val amountofFilesRejected = amountofFilesInRejectedAfterTDProcess - amountofFilesInRejectedBeforeTDProcess
            val after = rejected.listFiles()
            //Rejection Notifications
            if (amountofFilesRejected > 0) {
                if (amountofFilesRejected == mp3Counter) notifyThatAllFilesWereRejectedAndMoveBack(before, amountofFilesRejected, after) else {
                    val firstMessageWithoutAssociatedFiles = """$amountofFilesRejected files were rejected by the system for the following reason(s): 

${readRejectedFile("no")}

To see the files which were rejected along with their associated reason for rejection, press "Show Files", and the TextArea will be updated to show the associated files. Do you want to move the rejected files back to their original folder ($sourceFolder) so that they can be corrected and reprocessed? If you do so, feel free to delete the files which the system indicated were a duplicate of a file already uploaded (by prepending "DUPLICATE-UPDATED" to their filename). Files with "DUPLICATE-DOUBLE-CATEGORY" prepended to their title were rejected because they have two categories in their category tag, and those two categories are different than the categor[y](ies) of the version of the file which was previously uploaded. Click "Yes" to move the files back to their original folder, and "No" to leave them in the Rejected folder."""
                    val firstMessageWithAssociatedFiles = """$amountofFilesRejected files were rejected by the system for the following reason(s): 

${readRejectedFile("yes")}

To no longer see the files which were rejected, press "Don't Show Files",and the TextArea will be updated to only show the reason(s) for rejection. Do you want to move the rejected files back to their original folder ($sourceFolder) so that they can be corrected and reprocessed? If you do so, feel free to delete the files which the system indicated were a duplicate of a file already uploaded (by prepending "DUPLICATE-UPDATED" to their filename). Files with "DUPLICATE-DOUBLE-CATEGORY" prepended to their title were rejected because they have two categories in their category tag, and those two categories are different than the categor[y](ies) of the version of the file which was previously uploaded. Click "Yes" to move the files back to their original folder, and "No" to leave them in the Rejected folder."""
                    textbox(before, after, firstMessageWithoutAssociatedFiles, firstMessageWithAssociatedFiles, "Files Rejected")
                }
            }
        } catch (ex: IOException) {
            val a = GeneralTagger()
            a.textboxStackTrace(ex)
            write0ToSingletonFileAndClose()
        } //TD_Process
        catch (ex: InterruptedException) {
            val a = GeneralTagger()
            a.textboxStackTrace(ex)
            write0ToSingletonFileAndClose()
        }
    }

    @Throws(IOException::class)
    fun notifyThatAllFilesWereRejectedAndMoveBack(before: Array<File>, amountofFilesRejected: Int, after: Array<File>) {
        val panel = JPanel()
        setLookAndFeelOfGUIToNimbusStyle()
        JOptionPane.showMessageDialog(panel, """All files were rejected for the following reason(s): 

${readRejectedFile("no")}They will now be moved back to their original folder($sourceFolder). Please try reformatting them (adjusting the input files (e.g. Speaker.txt, etc.) ), and running AutoTagger again. If any files now contain "DUPLICATE" in their title, feel free to delete them, as they have previously been uploaded to the database.""", "All Files Rejected", JOptionPane.ERROR_MESSAGE)
        moveRejectedFilesBackToOrigin(before, after)
    }

    @Throws(IOException::class)
    fun readRejectedFile(titleOrNo: String): StringBuilder {
        var fileName = ""
        if (titleOrNo.equals("title", ignoreCase = true) || titleOrNo.equals("yes", ignoreCase = true)) fileName = "C:\\PHPTest\\rejectionReasonWithTitle.txt" else if (titleOrNo.equals("no", ignoreCase = true)) fileName = "C:\\PHPTest\\rejectionReason.txt"
        var line: String? = null
        val message = StringBuilder()
        try {
            // FileReader reads text files in the default encoding.
            val fileReader = FileReader(fileName)
            // Always wrap FileReader in BufferedReader.
            val bufferedReader = BufferedReader(fileReader)
            while (bufferedReader.readLine().also { line = it } != null) message.append(line).append("\n")
            bufferedReader.close()
        } catch (ex: IOException) {
            val a = GeneralTagger()
            a.textboxStackTrace(ex)
            write0ToSingletonFileAndClose()
        }
        return message
    }

    @Throws(IOException::class)
    fun moveRejectedFilesBackToOrigin(before: Array<File>, after: Array<File>) {
        //code to move all files in the after array that were not in the before array back to their folder of origin:
        val rejected = ArrayList<File>()
        for (value in after) {
            var found = false
            for (s in before) {
                if (value == s) {
                    found = true
                    break
                }
            }
            if (!found) rejected.add(value)
        }
        val rejected1 = arrayOfNulls<File>(rejected.size)
        rejected.toArray(rejected1)
        for (file in rejected1) {
            if (!file!!.isFile) continue
            val temp = Files.move(Paths.get(file.toString()), Paths.get(System.getProperty("user.dir") + file.name))
        }
    }

    @Throws(IOException::class, InterruptedException::class)
    fun runTDPush() {
        Runtime.getRuntime().exec("java -jar C:\\TD_Library\\Scripts\\runTDPUSH.jar")
    }

    @Throws(IOException::class)
    fun textbox(message: String, title: String?): Int {
        val scrollPane = formatJScrollPane_SizeAndFont_Etc(message)
        val buttons = arrayOf<Any>("Yes", "No")
        return JOptionPane.showOptionDialog(null, scrollPane, title, JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, buttons, null)
    }

    @Throws(IOException::class)
    fun textbox(before: Array<File>, after: Array<File>, messageWithoutAssociatedFiles: String?, messageWithAssociatedFiles: String?, title: String?) {
        val scrollPane = formatJScrollPane_SizeAndFont_Etc(messageWithoutAssociatedFiles)
        val scrollPane1 = formatJScrollPane_SizeAndFont_Etc(messageWithAssociatedFiles)
        val buttons = arrayOf<Any>("Show Files", "Yes", "No")
        val buttons1 = arrayOf<Any>("Don't Show Files", "Yes", "No")
        var rc = 3
        do {
            rc = JOptionPane.showOptionDialog(null, scrollPane, title, JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, buttons, null)
            if (rc == 0) {
                //TODO figuire this out so that the line below this one shows the reasons for rejection along with the associated rejected file(i already have a method for that)
                rc = JOptionPane.showOptionDialog(null, scrollPane1, title, JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, buttons1, null)
            }
            if (rc == 1) {
                moveRejectedFilesBackToOrigin(before, after)
                JOptionPane.showMessageDialog(null, "All rejected files were moved back to their origin.")
            }
            if (rc == 2) {
                val areYouSure = "Are you sure you do not want to move the rejected files back to their original folder ($sourceFolder)? Click \"Yes\" to leave them where they are or click \"No\" to move them back to their original folder. If you decide to leave them where they are, you can always find them in the folder located at C:\\TD_Library\\validate_process\\Rejected and deal with them later. This folder can be accessed by either copying and pasting its location as it is found in the previous sentence into the search bar in Windows Explorer(the built-in program the Windows user uses for navigating through folders on the computer), by typing in the address into the Windows Explorer search bar exactly as it is found in the previous sentence, or by manually following the file path, starting from the C:\\ drive and continuing through the folder titled \"TD_Library\", etc. \n\nClick \"Yes\" to leave the files where they are, or click \"No\" to move the files back to their original folder.\n"
                val areYouSureResponse = JOptionPane.showOptionDialog(null, areYouSure, title, JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, null, null)
                if (areYouSureResponse == JOptionPane.YES_OPTION) {
                    JOptionPane.showMessageDialog(null, "All rejected files will be left in the Rejected folder. You can find them later in the folder located at C:\\TD_Library\\validate_process\\Rejected .")
                } else {
                    moveRejectedFilesBackToOrigin(before, after)
                    JOptionPane.showMessageDialog(null, "All rejected files were moved back to their origin.")
                }
            }
        } while (rc == 0)
    }

    @Throws(IOException::class)
    fun textboxError(message: String?) {
        val scrollPane = formatJScrollPane_SizeAndFont_Etc(message)
        JOptionPane.showMessageDialog(null, scrollPane, "Error", JOptionPane.ERROR_MESSAGE)
    }

    @Throws(IOException::class)
    fun textboxError(message: String?, icon: Icon?) {
        val scrollPane = formatJScrollPane_SizeAndFont_Etc(message)
        JOptionPane.showMessageDialog(null, scrollPane, "Error", JOptionPane.ERROR_MESSAGE, icon)
    }

    @Throws(IOException::class)
    fun textboxStackTrace(ex: Throwable) {
        setLookAndFeelOfGUIToNimbusStyle()
        val fullExceptionType = ex.toString()
        val exceptionType = fullExceptionType.substring(fullExceptionType.lastIndexOf(".") + 1)
        val aVsAn: String
        val ch = exceptionType[0]
        aVsAn = if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            "An"
        } else {
            "A"
        }
        val stackTraceWriter = StringWriter()
        ex.printStackTrace(PrintWriter(stackTraceWriter))
        val textArea = JTextArea("$aVsAn $exceptionType error has occured. Please see an administrator about the following error message:\n\n$stackTraceWriter")
        val scrollPane = JScrollPane(textArea)
        textArea.lineWrap = false
        textArea.wrapStyleWord = true
        textArea.isEditable = false
        scrollPane.preferredSize = Dimension(500, 200)
        val font = Font("Calibri", Font.BOLD, 18)
        textArea.font = font
        JOptionPane.showMessageDialog(null, scrollPane, "Error", JOptionPane.ERROR_MESSAGE)
    }

    @Throws(IOException::class)
    fun formatJScrollPane_SizeAndFont_Etc(message: String?): JScrollPane {
        setLookAndFeelOfGUIToNimbusStyle()
        val textArea = JTextArea(message)
        val scrollPane = JScrollPane(textArea)
        textArea.lineWrap = true
        textArea.wrapStyleWord = true
        textArea.isEditable = false
        scrollPane.preferredSize = Dimension(500, 200)
        val font = Font("Calibri", Font.BOLD, 18)
        textArea.font = font
        return scrollPane
    }

    companion object {
        @Throws(IOException::class)
        fun listRunningProcesses(): List<String> {
            val processes: MutableList<String> = ArrayList()
            try {
                var line: String
                val p = Runtime.getRuntime().exec("tasklist.exe /fo csv /nh")
                val input = BufferedReader(InputStreamReader(p.inputStream))
                while (input.readLine().also { line = it } != null) {
                    if (line.trim { it <= ' ' } != "") {
                        // keep only the process name
                        line = line.substring(1)
                        processes.add(line.substring(0, line.indexOf("\"")))
                    }
                }
                input.close()
            } catch (ex: Exception) {
                val a = GeneralTagger()
                a.textboxStackTrace(ex)
                write0ToSingletonFileAndClose()
            }
            return processes
        }// display the result

        //TODO: add rulebook of GeneralTagger to every new folder which uses it, which includes the funcitonality of there being a spell checker, the program simply doubling as an automatic uploader, AND THAT IT SHOULD NOT BE RUNNING WHILE SOMETHING ELSE IS BEING UPLOADED, BECAUSE IT WILL DELETE ANY MySyncData.exe(PROGRAM WHICH SYNCS LOCAL DATABASE TO WEBSITE(I.E PUSHES SHIUR LIVE TO WEBSITE)) INSTANCES WHICH ARE OPEN AT THE TIME OF THE PROGRAM'S EXECUTION
        //TODO: Update ReingoldTagger with all of the features of GeneralTagger
        //TODO  Get in order: the method for replacing ".MP3" or ".mp3" in the title with an empty string/deleting it
        //TODO: add taskkill for aws.exe, also, for some reason, something is not working when all of the files are .MP3
        //TODO: something is severely wrong since i finished up the final draft(including the while loops)
        //TODO: talk to Mr. Hyatt about protocol for dealing with the scenario in which the flat rate/time it takes to sync the database has become significantly longer than 100 seconds, such that my program is always shutting TD_Push down.
        //TODO: add code to deal with the following case:the Tagger moves shiurim to MoveToMaster, and it turns out that there are already shiurim there(and potentially many of them). This will mean that let's say the Tagger only moved 2 shiurim, it will only wait for two shiurim, when really TD_PUSH will have to deal with 40 shiurim. So, add code which, before it runs TD_Proccess(moves the shiurim to MoveToMastewr), adds the current amount of mp3s in MoveToMaster to mp3Counter,and volume of filesize in MoveToMaster to TotalFilesizeToBeMoved. And, make sure that is added to the total cjechbon of how long to wait(you know, at the top of the method, all of those variables in a row)...
        //TODO: add in plan for dealing with a shiur being rejected by the TD_Proccess If the size of the rejected folder after running TD_Process is bigger than before TD_Process(a file was added into it)...do something. Create a JPane Warning box? Email me or Mr. Mond to go take care of the shiur?
        //TODO: Why do i have a method called getAllCurrentlyRunningProcesses() and listRunningProcesses()? Maybe i should rename them so they don't sound so similair...
        //TODO: add implementation for reading C:\TD_Library\Scripts\InfinityHanging.txt and then starting a timer that waits a certain amount of time and then kills td_push
        //TODO: as an addition to ^^^^ we will probably still have to make a cheshbon for how long to wait to start checking whether the file reads "1"(do i mean "0"? i just got very tired and am not thinking straight)
        //TODO: add feature which checks whether TD_Process is done through reading a file
        //TODO: in uploadThem2 for when there are no files in the autotagger sourceFolder and simplifying to an uploader, instead of waiting a crazy amount of time(~5 minutes, right?) for the shiurim to process, just get the size of the files in validate_process, size of MoveToMaster, and the mp3Counter and make the appropriate cheshbonos...duh!! why would you ever do it the way you did it before??
        //TODO: run a lot of shiurim through ShmulyTD_PUSHALL to see how long it takes for  tdLiveSync_B.mydsp to finish properly and where TD_PUSH normally hangs(because i forgot)
        @JvmStatic
        @get:Throws(IOException::class)
        val allCurrentlyRunningProcesses: String
            get() {
                val processes = listRunningProcesses()
                var result = ""

                // display the result
                val it = processes.iterator()
                var x = 0
                while (it.hasNext()) {
                    result += it.next() + ","
                    x++
                    if (x == 10) {
                        result += "\n"
                        x = 0
                    }
                }
                return result
            }

        var mp3Counter = 0
        var totalFilesizeToBeMoved: Long = 0

        @Throws(IOException::class)
        fun write0ToSingletonFileAndClose() {
            val fileWriter: Writer = FileWriter("C:\\PHPTest\\TDProccess.TDPush.txt", false)
            fileWriter.write("0 \n")
            fileWriter.close()
        }

        @JvmStatic
        @Throws(IOException::class)
        fun readBatchFile(ps: PrintStream?, fileName: String?): String {
            var line: String? = null
            val message = StringBuilder()
            try {
// FileReader reads text files in the default encoding.
                val fileReader = FileReader(fileName)

// Always wrap FileReader in BufferedReader.
                val bufferedReader = BufferedReader(fileReader)
                while (bufferedReader.readLine().also { line = it } != null) {
                    message.append(line)
                }

// Always close files.
                bufferedReader.close()
            } catch (ex: IOException) {
                val a = GeneralTagger()
                a.textboxStackTrace(ex)
                write0ToSingletonFileAndClose()
            }
            message.setLength(message.length - 1)
            return message.toString()
        }

        @JvmStatic
        @Throws(IOException::class)
        fun setLookAndFeelOfGUIToNimbusStyle() {
            for (info in UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus" == info.name) {
                    try {
                        UIManager.setLookAndFeel(info.className)
                    } catch (ex: ClassNotFoundException) {
                        Logger.getLogger(Demo::class.java.name).log(Level.SEVERE, null, ex)
                        val a = GeneralTagger()
                        a.textboxStackTrace(ex)
                        write0ToSingletonFileAndClose()
                    } catch (ex: InstantiationException) {
                        Logger.getLogger(Demo::class.java.name).log(Level.SEVERE, null, ex)
                        val a = GeneralTagger()
                        a.textboxStackTrace(ex)
                        write0ToSingletonFileAndClose()
                    } catch (ex: IllegalAccessException) {
                        Logger.getLogger(Demo::class.java.name).log(Level.SEVERE, null, ex)
                        val a = GeneralTagger()
                        a.textboxStackTrace(ex)
                        write0ToSingletonFileAndClose()
                    } catch (ex: UnsupportedLookAndFeelException) {
                        Logger.getLogger(Demo::class.java.name).log(Level.SEVERE, null, ex)
                        val a = GeneralTagger()
                        a.textboxStackTrace(ex)
                        write0ToSingletonFileAndClose()
                    }
                    break
                }
            }
        }
    }

    init  /*Singleton Pattern Constructor*/ {
        try {
            setLookAndFeelOfGUIToNimbusStyle()
            val result = allCurrentlyRunningProcesses
            if (result.contains("cmd.exe") /*<--- take this out and make sure to add a line in all of the versinos of tdpush and tdprocess that starts their dummy.exe, then create a static method which takes a dummy process anem as a parameter, then checks if result.contains("param") and inserts that proces into the message"_____ is currently running..."and then call the method for all of the dummies in this if statement */ || result.contains("AutoTaggerDummy.exe") || result.contains("DailyHalachaTaggerDummy.exe") || result.contains("TDPushDummy.exe") || result.contains("TDProcessDummy.exe")) /*if TD_PUSH or TD_Process is running*/ { //
                //TODO make tdpush,process,andautotagger all run their dummy programs as soon as they start
                val icon = ImageIcon("C:\\TD_Library\\Scripts\\Cmd_icon.png", "cmd.exe Icon")
                textboxError("Please close the window in the taskbar (bottom of screen) bearing the icon displayed on the left (i.e. Command Prompt), or wait for it to finish and close itself before continuing. If you do not see that the icon is displayed below, it is possible that a user from another account on this computer has opened Command Prompt and did not close it before logging off. Command Prompt is currently running and AutoTagger cannot run until it is closed. Please see an administrator if this problem does not resolve itself in the next few minutes or if it keeps occurring.", icon)
                System.exit(333)
            }
            val errorLog = File(System.getProperty("user.dir") + "\\SystemErrorLog.txt")
            val ps = PrintStream(errorLog)
            if (readBatchFile(ps, "C:\\PHPTest\\TDProccess.TDPush.txt").toInt() == 1) {
                val panel = JPanel()
                if (result.contains("javaw.exe")) {
                    JOptionPane.showMessageDialog(panel, "AutoTagger is currently be running in the background. Please wait for it to finish and then run again. If you think this message was displayed in error, see \"AutoTagger_is_Running Error.txt\" found in C:\\Users\\mglazer\\Desktop\\Consistent series (i.e. the parent folder) for further instructions.", "Error", JOptionPane.ERROR_MESSAGE)
                    System.exit(49)
                } else {
                    write0ToSingletonFileAndClose()
                }
            }
            if (readBatchFile(ps, "C:\\PHPTest\\TDProccess.TDPush.txt").toInt() == 0) {
                val fileWriter: Writer = FileWriter("C:\\PHPTest\\TDProccess.TDPush.txt", false)
                fileWriter.write("1 \n")
                fileWriter.close()
            }
        } catch (ex: Throwable) {
            textboxStackTrace(ex)
            write0ToSingletonFileAndClose()
        }
    }
}