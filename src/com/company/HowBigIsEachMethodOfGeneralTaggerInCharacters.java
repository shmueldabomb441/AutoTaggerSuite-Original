package com.company;


import java.util.Arrays;

public class HowBigIsEachMethodOfGeneralTaggerInCharacters {
    public static void main(String[] args) {
        String mis="Mississippi/";
        String Methods="~~public GeneralTaggerJava() throws IOException /*Singleton Pattern Constructor*/{\n" +
                "        try{\n" +
                "            setLookAndFeelOfGUIToNimbusStyle();\n" +
                "            String result = getAllCurrentlyRunningProcesses();\n" +
                "\n" +
                "            if (result.contains(\"cmd.exe\")/*<--- take this out and make sure to add a line in all of the versinos of tdpush and tdprocess that starts their dummy.exe, then create a static method which takes a dummy process anem as a parameter, then checks if result.contains(\"param\") and inserts that proces into the message\"_____ is currently running...\"and then call the method for all of the dummies in this if statement */||result.contains(\"AutoTaggerDummy.exe\")||result.contains(\"DailyHalachaTaggerDummy.exe\")||result.contains(\"TDPushDummy.exe\")||result.contains(\"TDProcessDummy.exe\")) /*if TD_PUSH or TD_Process is running*/ {//\n" +
                "                //TODO make tdpush,process,andautotagger all run their dummy programs as soon as they start\n" +
                "                final JPanel panel = new JPanel();\n" +
                "                ImageIcon icon = new ImageIcon(\"C:\\\\TD_Library\\\\Scripts\\\\Cmd_icon.png\",\n" +
                "                        \"cmd.exe Icon\");\n" +
                "                textboxError(\"Please close the window in the taskbar (bottom of screen) bearing the icon displayed on the left (i.e. Command Prompt), or wait for it to finish and close itself before continuing. If you do not see that the icon is displayed below, it is possible that a user from another account on this computer has opened Command Prompt and did not close it before logging off. Command Prompt is currently running and AutoTagger cannot run until it is closed. Please see an administrator if this problem does not resolve itself in the next few minutes or if it keeps occurring.\", icon);\n" +
                "                System.exit(333);\n" +
                "            }\n" +
                "            File errorLog = new File(System.getProperty(\"user.dir\") + \"\\\\SystemErrorLog.txt\");\n" +
                "            PrintStream ps = new PrintStream(errorLog);\n" +
                "            if (Integer.parseInt(readBatchFile(ps, \"C:\\\\PHPTest\\\\TDProccess.TDPush.txt\")) == 1) {\n" +
                "                final JPanel panel = new JPanel();\n" +
                "                if (result.contains(\"javaw.exe\")) {\n" +
                "                    JOptionPane.showMessageDialog(panel, \"AutoTagger is currently be running in the background. Please wait for it to finish and then run again. If you think this message was displayed in error, see \\\"AutoTagger_is_Running Error.txt\\\" found in C:\\\\Users\\\\mglazer\\\\Desktop\\\\Consistent series (i.e. the parent folder) for further instructions.\", \"Error\", JOptionPane.ERROR_MESSAGE);\n" +
                "                    System.exit(49);\n" +
                "                } else {\n" +
                "                    Writer fileWriter = new FileWriter(\"C:\\\\PHPTest\\\\TDProccess.TDPush.txt\", false);\n" +
                "                    fileWriter.write(\"0 \\n\");\n" +
                "                    fileWriter.close();\n" +
                "                }\n" +
                "            }\n" +
                "            if (Integer.parseInt(readBatchFile(ps, \"C:\\\\PHPTest\\\\TDProccess.TDPush.txt\")) == 0) {\n" +
                "                Writer fileWriter = new FileWriter(\"C:\\\\PHPTest\\\\TDProccess.TDPush.txt\", false);\n" +
                "                fileWriter.write(\"1 \\n\");\n" +
                "                fileWriter.close();\n" +
                "            }\n" +
                "        }catch(Throwable ex){\n" +
                "            textboxStackTrace(ex);\n" +
                "            Writer fileWriter = new FileWriter(\"C:\\\\PHPTest\\\\TDProccess.TDPush.txt\", false);\n" +
                "            fileWriter.write(\"0 \\n\");\n" +
                "            fileWriter.close();\n" +
                "        }\n" +
                "    }\n" +
                "    ~~public void Main() throws IOException {\n" +
                "        try {\n" +
                "            TDPushEnder tdPushEnder = new TDPushEnder();\n" +
                "            File errorLog = new File(System.getProperty(\"user.dir\") + \"\\\\SystemErrorLog.txt\");\n" +
                "            PrintStream ps = new PrintStream(errorLog);\n" +
                "\n" +
                "            String series = new String(Files.readAllBytes(get(System.getProperty(\"user.dir\") + \"\\\\Series.txt\")));\n" +
                "            String speaker = new String(Files.readAllBytes(get(System.getProperty(\"user.dir\") + \"\\\\Speaker.txt\")));\n" +
                "            String category = new String(Files.readAllBytes(get(System.getProperty(\"user.dir\") + \"\\\\Category.txt\")));\n" +
                "            File[] files = new File(System.getProperty(\"user.dir\")).listFiles();\n" +
                "            int mp3Counter = 0;\n" +
                "            long totalFilesizeToBeMoved = 0;\n" +
                "\n" +
                "            if (tdPushEnder.myDataSyncIsStillRunning) tdPushEnder.killMyDataSync();\n" +
                "            //check if there are any mp3 files:\n" +
                "            for (File file : files) {\n" +
                "                if (!file.isFile()) continue;\n" +
                "\n" +
                "                String[] bits = file.getName().split(\"\\\\.\");\n" +
                "                boolean endsInMp3 = bits[bits.length - 1].equalsIgnoreCase(\"mp3\");\n" +
                "                if (endsInMp3) {\n" +
                "                    mp3Counter += 1;\n" +
                "                    totalFilesizeToBeMoved += GetFileSize.MebiBytes(file);//replace with +=;add filesize of this .mp3 to total filesize of mp3s which need to be moved\n" +
                "                }\n" +
                "            }\n" +
                "            int reply1 = 1;\n" +
                "            if (mp3Counter > 0) {\n" +
                "                tagMp3s(mp3Counter, series, speaker, category, files, totalFilesizeToBeMoved);\n" +
                "            } else {\n" +
                "                //TODO add message box here letting the user know that there are no mp3s in the folder\n" +
                "                // and ask if they want to run TD_Process and then close.run process, run push, push\n" +
                "                // will run a Hanging prevention program right hefore it getsvto Sync Databades, wait\n" +
                "                // a few seconds for it to statt, the hang7nt or2vention oeogram will get the mp3Counter\n" +
                "                // and total filesoze and wait a cwrtain ratio (wnich i still need to determine using\n" +
                "                // test samoling,part of whicg will ddtermine if times are moee consixtently cslculated\n" +
                "                // usung mo3Counter r filesize) andcsee if it hung at tdLiveSync_A.mydsp by waitiing the\n" +
                "                // amouny and them checking to see if the next messabe was added to the TimeStamp file(meaning\n" +
                "                // the windows error message box popped up ssaying the initial connection to mySQL failed),\n" +
                "                // kill the process and its tree, start  the new .bat(which i still have to create)which\n" +
                "                // only has tdLiveSync_A.mydsp and B so it can pick up whee irt left off, check again.\n" +
                "                // 4his t7me it will probably get past tdLiveSync_A.mydsp, so obviously check again wnd\n" +
                "                // thixvtime it willvpribwgky getbup ro tbe place where uou cgeck if vtdLiveSync_B.mydsp\n" +
                "                // hangsthe upload script would get mp3Counter of validate_prrocess and their total filesize,\n" +
                "                // run td_push and\n" +
                "\n" +
                "                reply1 = textbox(\"There are no .mp3 files in the current folder. Would you like to run the upload script in case any files got stuck in the upload process the last time the script was run and have not yet been uploaded? You can also run it to simply to update the site after a change.\", \"No Files Found\");\n" +
                "                if (reply1 == 0) /*Yes*/{\n" +
                "                    double totalFilesizeToBeMovedinValidate_Process=0;//replace with +=;add filesize of this .mp3 to total filesize of mp3s which need to be moved\n" +
                "                    File[] validate_process = new File(\"C:\\\\TD_Library\\\\validate_process\").listFiles();\n" +
                "                    for (File file : validate_process) {\n" +
                "                        if (!file.isFile()) continue; //if folder skip\n" +
                "\n" +
                "                        String[] bits = file.getName().split(\"\\\\.\");\n" +
                "                        boolean endsInMp3 = bits[bits.length - 1].equalsIgnoreCase(\"mp3\");\n" +
                "                        if (endsInMp3) {\n" +
                "                            totalFilesizeToBeMovedinValidate_Process = GetFileSize.MebiBytes(file);//replace with +=;add filesize of this .mp3 to total filesize of mp3s which need to be moved\n" +
                "                        }\n" +
                "                    }\n" +
                "                    double timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds = 3 + totalFilesizeToBeMovedinValidate_Process / 32.93251667;\n" +
                "                    int amountofFilesInRejectedBeforeTDProcess = Objects.requireNonNull(rejected.list()).length;\n" +
                "                    File[] before = rejected.listFiles();\n" +
                "                    runTD_Process(ps, timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds);\n" +
                "                    //TODO update runTD_Procces() so that it doesnt automatically call td_PUSH\n" +
                "                    int amountofFilesInRejectedAfterTDProcess = Objects.requireNonNull(rejected.list()).length;\n" +
                "                    int amountofFilesRejected = amountofFilesInRejectedAfterTDProcess - amountofFilesInRejectedBeforeTDProcess;\n" +
                "                    File[] after = rejected.listFiles();\n" +
                "                    if (amountofFilesRejected > 0) {\n" +
                "                        final JPanel panel = new JPanel();\n" +
                "                        String firstMessageWithoutAssociatedFiles = amountofFilesRejected + \" files were rejected by the system for the following reason(s): \\n\\n\" + readRejectedFile(ps, \"no\") + \"\\n\\nTo see the files which were rejected along with their associated reason for rejection, press \\\"Show Files\\\", and the TextArea will be updated to show the associated files. Do you want to move the rejected files back to their original folder (\" + sourceFolder + \") so that they can be corrected and reprocessed? If you do so, feel free to delete the files which the system indicated were a duplicate of a file already uploaded (by prepending \\\"DUPLICATE-UPDATED\\\" to their filename). Files with \\\"DUPLICATE-DOUBLE-CATEGORY\\\" prepended to their title were rejected because they have two categories in their category tag, and those two categories are different than the categor[y](ies) of the version of the file which was previously uploaded. Click \\\"Yes\\\" to move the files back to their original folder, and \\\"No\\\" to leave them in the Rejected folder.\";\n" +
                "                        String firstMessageWithAssociatedFiles = amountofFilesRejected + \" files were rejected by the system for the following reason(s): \\n\\n\" + readRejectedFile(ps, \"yes\") + \"\\n\\nTo no longer see the files which were rejected, press \\\"Don't Show Files\\\",and the TextArea will be updated to only show the reason(s) for rejection. Do you want to move the rejected files back to their original folder (\" + sourceFolder + \") so that they can be corrected and reprocessed? If you do so, feel free to delete the files which the system indicated were a duplicate of a file already uploaded (by prepending \\\"DUPLICATE-UPDATED\\\" to their filename). Files with \\\"DUPLICATE-DOUBLE-CATEGORY\\\" prepended to their title were rejected because they have two categories in their category tag, and those two categories are different than the categor[y](ies) of the version of the file which was previously uploaded. Click \\\"Yes\\\" to move the files back to their original folder, and \\\"No\\\" to leave them in the Rejected folder.\";\n" +
                "                        int reply = textbox(before, after, firstMessageWithoutAssociatedFiles, firstMessageWithAssociatedFiles, \"Files Rejected\");\n" +
                "                        if(reply==1) moveRejectedFilesBackToOrigin(before, after);\n" +
                "                        if(reply==2){\n" +
                "                            setLookAndFeelOfGUIToNimbusStyle();\n" +
                "                            JOptionPane.showMessageDialog(null,\"All rejected files will be left in the Rejected folder. You can find them later in the folder located at C:\\\\TD_Library\\\\validate_process\\\\Rejected .\");\n" +
                "                        }\n" +
                "                    }\n" +
                "                    runTDPush();\n" +
                "                    System.exit(5);\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        catch(NullPointerException| TagException | ReadOnlyFileException | CannotReadException | InvalidAudioFrameException |IOException| CannotWriteException |InterruptedException ex){\n" +
                "            GeneralTaggerJava a= new GeneralTaggerJava();\n" +
                "            a.textboxStackTrace(ex);\n" +
                "            Writer fileWriter = new FileWriter(\"C:\\\\PHPTest\\\\TDProccess.TDPush.txt\", false);\n" +
                "            fileWriter.write(\"0 \\n\");\n" +
                "            fileWriter.close();}\n" +
                "    }\n" +
                "    ~~public void uploadThem(PrintStream ps,int mp3Counter, long totalFilesizeToBeMoved) throws IOException, InterruptedException {\n" +
                "        try {\n" +
                "            //this program takes place in validate_process and MoveToMaster\n" +
                "            TDPushEnder tdPushEnder = new TDPushEnder();\n" +
                "            if (GetFileSize.MebiBytes(moveToMaster) != 0) totalFilesizeToBeMoved += GetFileSize.MebiBytes(moveToMaster);\n" +
                "            if (moveToMaster.list().length != 0) mp3Counter += moveToMaster.list().length;\n" +
                "            int flatRateOfTimeItTakesToSyncDatabaseMeasuredInSeconds = 110;//but Thread.sleep() only accepts milliseconds, you when passing these numbers, multiply them by 1,000 to go from milliseconds to seconds\n" +
                "            double timeItTakesToMoveTheseToMasterMeasuredInSeconds = 10 + totalFilesizeToBeMoved / 100.0;\n" +
                "            double timeItTakesToUploadTheseToServerMeasuredInSeconds = 15 + totalFilesizeToBeMoved / 4.2/*1 divided by 4.2MBps--the lowest possible speed it could take--it could really do about 7MBps, just being conservative*/;\n" +
                "            double timeItTakesTD_PushToParseFilesMeasuredInSeconds = 5 + .6 * mp3Counter/*which is about 1.66 files parsed per second--it can actually parse of 2.4 files a second, but this is conservative*/;\n" +
                "            double timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds = 10 + totalFilesizeToBeMoved / 32.93251667;\n" +
                "            long timeItShouldTakeTD_PushToFinishMeasuredInSeconds = (long) (timeItTakesTD_PushToParseFilesMeasuredInSeconds + timeItTakesToUploadTheseToServerMeasuredInSeconds + timeItTakesToMoveTheseToMasterMeasuredInSeconds + flatRateOfTimeItTakesToSyncDatabaseMeasuredInSeconds);\n" +
                "            int amountofFilesInRejectedBeforeTDProcess = Objects.requireNonNull(rejected.list()).length;\n" +
                "            File[] before = rejected.listFiles();\n" +
                "            runTD_Process(ps, timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds);\n" +
                "            int amountofFilesInRejectedAfterTDProcess = Objects.requireNonNull(rejected.list()).length;\n" +
                "            int amountofFilesRejected = amountofFilesInRejectedAfterTDProcess - amountofFilesInRejectedBeforeTDProcess;\n" +
                "            File[] after = rejected.listFiles();\n" +
                "            if (amountofFilesRejected > 0) {\n" +
                "                final JPanel panel = new JPanel();\n" +
                "                if (amountofFilesRejected == mp3Counter) {\n" +
                "                    JOptionPane.showMessageDialog(panel, \"All files were rejected for the following reason(s): \\n\\n\" + readRejectedFile(ps, \"no\") + \"They will now be moved back to their original folder(\" + sourceFolder + \"). Please try reformatting them (adjusting the input files (e.g. Speaker.txt, etc.) ), and running AutoTagger again. If any files now contain \\\"DUPLICATE\\\" in their title, feel free to delete them, as they have previously been uploaded to the database.\", \"All Files Rejected\", JOptionPane.ERROR_MESSAGE);\n" +
                "                    moveRejectedFilesBackToOrigin(before, after);\n" +
                "                }\n" +
                "                String firstMessageWithoutAssociatedFiles = amountofFilesRejected + \" files were rejected by the system for the following reason(s): \\n\\n\" + readRejectedFile(ps, \"no\") + \"\\n\\nTo see the files which were rejected along with their associated reason for rejection, press \\\"Show Files\\\", and the TextArea will be updated to show the associated files. Do you want to move the rejected files back to their original folder (\" + sourceFolder + \") so that they can be corrected and reprocessed? If you do so, feel free to delete the files which the system indicated were a duplicate of a file already uploaded (by prepending \\\"DUPLICATE-UPDATED\\\" to their filename). Files with \\\"DUPLICATE-DOUBLE-CATEGORY\\\" prepended to their title were rejected because they have two categories in their category tag, and those two categories are different than the categor[y](ies) of the version of the file which was previously uploaded. Click \\\"Yes\\\" to move the files back to their original folder, and \\\"No\\\" to leave them in the Rejected folder.\";\n" +
                "                String firstMessageWithAssociatedFiles = amountofFilesRejected + \" files were rejected by the system for the following reason(s): \\n\\n\" + readRejectedFile(ps, \"yes\") + \"\\n\\nTo no longer see the files which were rejected, press \\\"Don't Show Files\\\",and the TextArea will be updated to only show the reason(s) for rejection. Do you want to move the rejected files back to their original folder (\" + sourceFolder + \") so that they can be corrected and reprocessed? If you do so, feel free to delete the files which the system indicated were a duplicate of a file already uploaded (by prepending \\\"DUPLICATE-UPDATED\\\" to their filename). Files with \\\"DUPLICATE-DOUBLE-CATEGORY\\\" prepended to their title were rejected because they have two categories in their category tag, and those two categories are different than the categor[y](ies) of the version of the file which was previously uploaded. Click \\\"Yes\\\" to move the files back to their original folder, and \\\"No\\\" to leave them in the Rejected folder.\";\n" +
                "                int reply = textbox(before, after, firstMessageWithoutAssociatedFiles, firstMessageWithAssociatedFiles, \"Files Rejected\");\n" +
                "                if(reply==1) moveRejectedFilesBackToOrigin(before, after);\n" +
                "                if(reply==2){\n" +
                "                    setLookAndFeelOfGUIToNimbusStyle();\n" +
                "                    JOptionPane.showMessageDialog(null,\"All rejected files will be left in the Rejected folder. You can find them later in the folder located at C:\\\\TD_Library\\\\validate_process\\\\Rejected .\");\n" +
                "                }\n" +
                "            }\n" +
                "            runTDPush();\n" +
                "\n" +
                "            int timesTDWasRan = 0;\n" +
                "            int amountOfFilesInMasterBefore = moveToMaster.list().length;\n" +
                "            do {\n" +
                "                boolean noFileHaveBeenMoved;\n" +
                "                if (tdPushEnder.tdPushIsStillRunning && moveToMaster.list().length == amountOfFilesInMasterBefore) {/*if by time it hangs there should be no more files in the folder, then check if the amount of files moved was zero(it never got off the ground), using this: \"&& numFilesInMoveToMasterBeforeTD_PushIsRun==numFilesNow\" so if none of them are moved, don't kill it. , */\n" +
                "                    tdPushEnder.killTDPush();\n" +
                "                } else if (tdPushEnder.tdPushIsStillRunning && moveToMaster.list().length > 0/*There are less files than when we started, but there are still files (i.e. files have been moved)*/) {\n" +
                "                    int x = moveToMaster.list().length;\n" +
                "                    java.util.concurrent.TimeUnit.SECONDS.sleep(20);\n" +
                "                    int y = moveToMaster.list().length;\n" +
                "                    if (x == y) /*if it is mamash stuck there, then*/ tdPushEnder.killTDPush();\n" +
                "                    else if (x - y > 0) /*if files moved since i last checked(i.e. if files are still moving)*/ {\n" +
                "                        while (moveToMaster.list().length > 0)\n" +
                "                            java.util.concurrent.TimeUnit.SECONDS.sleep(20);//so long as there are files in the folder, wait. That is, wait until there are no more files\n" +
                "                        waitForTDPush(flatRateOfTimeItTakesToSyncDatabaseMeasuredInSeconds + 8);//now you know for sure that all that TD_Push has to do is sync the databse, so wait that time and then check if it is still running,because all of the files are gon, so \"moving to master on local\" phase is done\n" +
                "                        continue;//recheck condition, namely, if it is still running after it should have finished\n" +
                "                    } else /*if after you waited 20 seconds, all of the files were gone:*/ {\n" +
                "                        waitForTDPush(flatRateOfTimeItTakesToSyncDatabaseMeasuredInSeconds + 8);\n" +
                "                        continue;\n" +
                "                    }//wait for it to sync databases, as is explained in the previous if statement's waitForTDPush comment(line 92 as of now)\n" +
                "\n" +
                "                } else if (tdPushEnder.tdPushIsStillRunning && moveToMaster.list().length == 0/*there are no more files in Master*/) {\n" +
                "                    tdPushEnder.killTDPush();\n" +
                "                }\n" +
                "\n" +
                "                if (timesTDWasRan == 4) {\n" +
                "                    PrintStream out = new PrintStream(new FileOutputStream(System.getProperty(\"user.dir\") + \"\\\\SystemErrorLog.txt\"));\n" +
                "                    Throwable t = new Throwable();\n" +
                "                    t.printStackTrace(out);\n" +
                "                    DateFormat dateFormat = new SimpleDateFormat(\"yyyy/MM/dd HH:mm:ss\");\n" +
                "                    Date date = new Date();\n" +
                "                    Writer dateWriter = new FileWriter(System.getProperty(\"user.dir\") + \"\\\\SystemErrorLog.txt\", true);\n" +
                "                    dateWriter.write(dateFormat.format(date) + \"     TD_PUSH had to restart too many times (4 times) because it failed to finish executing.\");\n" +
                "                    dateWriter.close();\n" +
                "                    Writer fileWriter = new FileWriter(\"C:\\\\PHPTest\\\\TDProccess.TDPush.txt\", false);\n" +
                "                    fileWriter.write(\"0 \\n\");\n" +
                "                    fileWriter.close();\n" +
                "                    System.exit(3);\n" +
                "                }\n" +
                "                runTDPush();\n" +
                "                timesTDWasRan += 1;\n" +
                "                waitForTDPush(timeItShouldTakeTD_PushToFinishMeasuredInSeconds);\n" +
                "            } while (tdPushEnder.tdPushIsStillRunning);//Run TD_Push and then wait. if TD_Push is still running after it should have finished: kill it, start a new one, and then wait for it again\n" +
                "            //TODO: move the following lines up to immidoately after runTDPush() once you figuire everything out\n" +
                "        }\n" +
                "        catch(IOException|InterruptedException ex) {\n" +
                "            GeneralTaggerJava a= new GeneralTaggerJava();\n" +
                "            a.textboxStackTrace(ex);\n" +
                "            Writer fileWriter = new FileWriter(\"C:\\\\PHPTest\\\\TDProccess.TDPush.txt\", false);\n" +
                "            fileWriter.write(\"0 \\n\");\n" +
                "            fileWriter.close();\n" +
                "        }\n" +
                "        Writer fileWriter = new FileWriter(\"C:\\\\PHPTest\\\\TDProccess.TDPush.txt\", false);\n" +
                "        fileWriter.write(\"0 \\n\");\n" +
                "        fileWriter.close();\n" +
                "    }\n" +
                "    ~~public void waitForTDPush(long timeItShouldTakeTD_PushToFinishMeasuredInSeconds) throws InterruptedException {\n" +
                "        java.util.concurrent.TimeUnit.SECONDS.sleep(timeItShouldTakeTD_PushToFinishMeasuredInSeconds);//it is already measured in milliseconds so i dont have to multiply it by 1,000\n" +
                "    }\n" +
                "    ~~public void waitForTD_Process(double timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds) throws InterruptedException {\n" +
                "        java.util.concurrent.TimeUnit.SECONDS.sleep(/*accepts milliseconds*/ (long) ceil(1+timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds)/*1,000 ms in 1 second*//*the 1+ is just in case timeItTakes... evaluates to zero(they are just using it to upload)*/);//0.03036512544770260 is 1 divided by the rate at which TD_Process to process shiurim. ((amount transfered)/rate of transfer)=time it will take to tranfer. Manipulating this equation provides the formula: multiply how many GBs need to be processed by TD_Process by 0.03036512544770260 to obtain how long it will take for TD_Process to go through them, and therefore how long to wait until it should be done by. Rates for processing time of TD_process, TD_Push's initial parsing of the files,(average time it takes to upload,) and MoveToMaster, were originially computed in an Excel spreadsheet titled \"Multipliers for GeneralTaggerJava\" located in C:\\Users\\mglazer\\Documents.\n" +
                "    }\n" +
                "    ~~public void runTD_Process(PrintStream ps, double timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds) throws IOException {\n" +
                "        //TD_Process:\n" +
                "\n" +
                "        try {\n" +
                "            Process process = Runtime.getRuntime().exec(\n" +
                "                    \"cmd /K tdsync - shmuly.bat\", null, new File(\"C:\\\\PHPTest\\\\\"));\n" +
                "            waitForTD_Process(1 + timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds);\n" +
                "\n" +
                "        } catch (IOException | InterruptedException ex) {\n" +
                "            GeneralTaggerJava a= new GeneralTaggerJava();\n" +
                "            a.textboxStackTrace(ex);\n" +
                "            Writer fileWriter = new FileWriter(\"C:\\\\PHPTest\\\\TDProccess.TDPush.txt\", false);\n" +
                "            fileWriter.write(\"0 \\n\");\n" +
                "            fileWriter.close();\n" +
                "        } //TD_Process\n" +
                "    }\n" +
                "    ~~public void tagMp3s ( int mp3Counter, String series, String speaker, String category, File[]files, long totalFilesizeToBeMoved) throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException, CannotWriteException, InterruptedException {\n" +
                "        File errorLog = new File(System.getProperty(\"user.dir\")+\"\\\\SystemErrorLog.txt\");\n" +
                "        PrintStream ps = new PrintStream(errorLog);\n" +
                "        for (File file : files) {\n" +
                "            if (!file.isFile()) continue;\n" +
                "            String[] bits = file.getName().split(\"\\\\.\");\n" +
                "            boolean endsInMp3 = bits[bits.length - 1].equalsIgnoreCase(\"mp3\");\n" +
                "            if (bits.length > 0 && endsInMp3) {\n" +
                "                MP3File f = (MP3File) AudioFileIO.read(file);\n" +
                "                Tag tag = f.getTag();\n" +
                "                if (tag.getFirst(FieldKey.TITLE) != null) {\n" +
                "                    tag.deleteField(FieldKey.TITLE);\n" +
                "                }\n" +
                "                tag.setField(FieldKey.TITLE, file.getName());\n" +
                "                //  if (tag.getFirst(FieldKey.TITLE).contains(\"\\\\.mp3\")) {\n" +
                "                //add code here which: stores the current title in a variable\n" +
                "                //add code here which: deletes the current .mp3 file's title(and then then the next line sets the stored title to the mp3 while replacing \".mp3\"\n" +
                "                //  tag.setField(FieldKey.TITLE,tag.getFirst(FieldKey.TITLE).replace(\"\\\\.mp3\",\"\"));}\n" +
                "                // else if(tag.getFirst(FieldKey.TITLE).contains(\"\\\\.MP3\")){\n" +
                "                // tag.setField(FieldKey.TITLE,tag.getFirst(FieldKey.TITLE).replace(\"\\\\.MP3\",\"\"));}\n" +
                "                if (tag.getFirst(FieldKey.ALBUM) != null) {\n" +
                "                    tag.deleteField(FieldKey.ALBUM);\n" +
                "                }\n" +
                "                tag.setField(FieldKey.ALBUM, /*\"Halacha;Chaye Adam\"*/category);\n" +
                "                if (tag.getFirst(FieldKey.ARTIST) != null) {\n" +
                "                    tag.deleteField(FieldKey.ARTIST);\n" +
                "                }\n" +
                "                tag.setField(FieldKey.ARTIST, /*\"Rabbi Eliyahu Reingold\"*/speaker);\n" +
                "                if (tag.getFirst(FieldKey.CONDUCTOR) != null) {\n" +
                "                    tag.deleteField(FieldKey.CONDUCTOR);\n" +
                "                }\n" +
                "                tag.setField(FieldKey.CONDUCTOR, /*\"Daily Halacha - \"+*/series);\n" +
                "\n" +
                "                if (tag.getFirst(FieldKey.TITLE).contains(\".mp3\")) {\n" +
                "                    String before = tag.getFirst(FieldKey.TITLE);\n" +
                "                    String after = before.replace(\".mp3\",\"\");\n" +
                "                    tag.deleteField(FieldKey.TITLE);\n" +
                "                    tag.setField(FieldKey.TITLE, after);\n" +
                "                }\n" +
                "                else if (tag.getFirst(FieldKey.TITLE).contains(\".MP3\")) {\n" +
                "                    String before = tag.getFirst(FieldKey.TITLE);\n" +
                "                    String after = before.replace(\".MP3\",\"\");\n" +
                "                    tag.deleteField(FieldKey.TITLE);\n" +
                "                    tag.setField(FieldKey.TITLE, after);\n" +
                "                }\n" +
                "                f.commit();\n" +
                "                Path temp = Files.move(Paths.get(String.valueOf(file)), Paths.get(\"C:\\\\TD_Library\\\\validate_process\\\\\" + file.getName()));\n" +
                "            }\n" +
                "        }\n" +
                "        uploadThem(ps,mp3Counter, totalFilesizeToBeMoved);\n" +
                "    }\n" +
                "    ~~public void runTDPush() throws IOException, InterruptedException {\n" +
                "        Runtime.getRuntime().exec(\"java -jar C:\\\\TD_Library\\\\Scripts\\\\runTDPUSH.jar\");\n" +
                "    }\n" +
                "    ~~public static List<String> listRunningProcesses() throws IOException {\n" +
                "        List<String> processes = new ArrayList<String>();\n" +
                "        try {\n" +
                "            String line;\n" +
                "            Process p = Runtime.getRuntime().exec(\"tasklist.exe /fo csv /nh\");\n" +
                "            BufferedReader input = new BufferedReader\n" +
                "                    (new InputStreamReader(p.getInputStream()));\n" +
                "            while ((line = input.readLine()) != null) {\n" +
                "                if (!line.trim().equals(\"\")) {\n" +
                "                    // keep only the process name\n" +
                "                    line = line.substring(1);\n" +
                "                    processes.add(line.substring(0, line.indexOf(\"\\\"\")));\n" +
                "                }\n" +
                "\n" +
                "            }\n" +
                "            input.close();\n" +
                "        }\n" +
                "        catch (Exception ex) {\n" +
                "            GeneralTaggerJava a= new GeneralTaggerJava();\n" +
                "            a.textboxStackTrace(ex);\n" +
                "            Writer fileWriter = new FileWriter(\"C:\\\\PHPTest\\\\TDProccess.TDPush.txt\", false);\n" +
                "            fileWriter.write(\"0 \\n\");\n" +
                "            fileWriter.close();\n" +
                "        }\n" +
                "        return processes;\n" +
                "    }\n" +
                "    ~~public static String getAllCurrentlyRunningProcesses() throws IOException {\n" +
                "        List<String> processes = listRunningProcesses();\n" +
                "        String result = \"\";\n" +
                "\n" +
                "        // display the result\n" +
                "        Iterator<String> it = processes.iterator();\n" +
                "        int x = 0;\n" +
                "        while (it.hasNext()) {\n" +
                "            result += it.next() + \",\";\n" +
                "            x++;\n" +
                "            if (x == 10) {\n" +
                "                result += \"\\n\";\n" +
                "                x = 0;\n" +
                "            }\n" +
                "        }\n" +
                "        return result;\n" +
                "    }\n" +
                "    ~~public int textbox(String message, String title) throws IOException {\n" +
                "        setLookAndFeelOfGUIToNimbusStyle();\n" +
                "        JTextArea textArea = new JTextArea(String.valueOf(message));\n" +
                "        JScrollPane scrollPane = new JScrollPane(textArea);\n" +
                "        textArea.setLineWrap(true);\n" +
                "        textArea.setWrapStyleWord(true);\n" +
                "        textArea.setEditable(false);\n" +
                "        scrollPane.setPreferredSize(new Dimension(500, 200));\n" +
                "        Font font = new Font(\"Calibri\", Font.BOLD, 18);\n" +
                "        textArea.setFont(font);\n" +
                "//        int reply = JOptionPane.showConfirmDialog(null, scrollPane, title, JOptionPane.YES_NO_OPTION);\n" +
                "        Object[] buttons =  {\"Yes\",\"No\"};\n" +
                "        int rc = JOptionPane.showOptionDialog(null, scrollPane, title, JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, buttons, null);\n" +
                "        return rc;\n" +
                "    }\n" +
                "    ~~public int textbox(File[] before,File[] after,String messageWithoutAssociatedFiles,String messageWithAssociatedFiles,String title) throws IOException {\n" +
                "        setLookAndFeelOfGUIToNimbusStyle();\n" +
                "        JTextArea textArea = new JTextArea(messageWithoutAssociatedFiles);\n" +
                "        JTextArea textArea1 = new JTextArea(messageWithAssociatedFiles);\n" +
                "        JScrollPane scrollPane = new JScrollPane(textArea);\n" +
                "        JScrollPane scrollPane1 = new JScrollPane(textArea1);\n" +
                "        textArea.setLineWrap(true);\n" +
                "        textArea.setWrapStyleWord(true);\n" +
                "        textArea.setEditable(false);\n" +
                "        Font font = new Font(\"Calibri\", Font.BOLD, 18);\n" +
                "        textArea.setFont(font);\n" +
                "        scrollPane.setPreferredSize(new Dimension(500, 200));\n" +
                "        textArea1.setLineWrap(true);\n" +
                "        textArea1.setWrapStyleWord(true);\n" +
                "        textArea1.setEditable(false);\n" +
                "        textArea.setFont(font);\n" +
                "        scrollPane1.setPreferredSize(new Dimension(500, 200));\n" +
                "\n" +
                "//        int reply = JOptionPane.showConfirmDialog(null, scrollPane, title, JOptionPane.YES_NO_OPTION);\n" +
                "        Object[] buttons =  {\"Show Files\",\"Yes\",\"No\"};\n" +
                "        Object[] buttons1 = {\"Don't Show Files\",\"Yes\",\"No\"};\n" +
                "        int rc = 3;\n" +
                "        do {\n" +
                "            rc = JOptionPane.showOptionDialog(null, scrollPane, title, JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, buttons, null);\n" +
                "            if (rc == 0) {\n" +
                "                //TODO figuire this out so that the line below this one shows the reasons for rejection along with the associated rejected file(i already have a method for that)\n" +
                "                rc= JOptionPane.showOptionDialog(null, scrollPane1, title, JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, buttons1, null);\n" +
                "            }\n" +
                "            if(rc==1) moveRejectedFilesBackToOrigin(before, after);\n" +
                "            if(rc==2){\n" +
                "                String areYouSure = \"Are you sure you do not want to move the rejected files back to their original folder (\" + sourceFolder + \")? Click \\\"Yes\\\" to leave them where they are or click \\\"No\\\" to move them back to their original folder. If you decide to leave them where they are, you can always find them in the folder located at C:\\\\TD_Library\\\\validate_process\\\\Rejected and deal with them later. This folder can be accessed by either copying and pasting its location as it is found in the previous sentence into the search bar in Windows Explorer(the built-in program the Windows user uses for navigating through folders on the computer), by typing in the address into the Windows Explorer search bar exactly as it is found in the previous sentence, or by manually following the file path, starting from the C:\\\\ drive and continuing through the folder titled \\\"TD_Library\\\", etc. \\n\\nClick \\\"Yes\\\" to leave the files where they are, or click \\\"No\\\" to move the files back to their original folder.\\n\";\n" +
                "                //  int reply1 = JOptionPane.showConfirmDialog(null, \"Are you sure you do not want to move the rejected files back to their original folder (\"+ sourceFolder+\")?\\n Click \\\"Yes\\\" to leave them where they are or click \\\"No\\\" to move them to their original folder. If you decide to leave them where they are, you can always find them in the folder located at \"+rejectedFolderLocation+\" and dealt with later. This folder can be accessed by either typing its location exactly as found in the previous sentence into the search bar in Windows Explorer(the built-in program Windows uses for navigating through folders on the computer) or by manually following the path starting from the C:\\\\ drive and continuing to the ______________ folder. Click \\\"No\\\" to move the shiurim back to their original folder.\", \"title\", JOptionPane.YES_NO_OPTION);\n" +
                "                JOptionPane.showOptionDialog(null,areYouSure,title,JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE,null,null,null);\n" +
                "//                JOptionPane.showMessageDialog(null, \"GOODBYE\");\n" +
                "                if (textbox(areYouSure,\"Files Rejected\") == JOptionPane.YES_OPTION) moveRejectedFilesBackToOrigin(before, after);\n" +
                "//                textbox(amountofFilesRejected + \" shiurim have been rejected by the system. This either means that they have already been uploaded or that they were improperly formatted. You can find the shiurim in question at the top of the folder C:\\\\TD_Library\\\\validate_process\\\\Rejected. The reason for their rejection will be appended to their title in the form of one or two question marks, or \\\"DUPLICATE-UPDATED-(ShiurID# already in database)\\\". You can also contact ssternbach@torahdownloads.com or nmond@torahdownloads.com for help.\", \"Error\");\n" +
                "\n" +
                "\n" +
                "                //if(numberOfRejectedShiurim==mp3Counter/*i.e. if all of the shiurim were rejected*/) /*then: move them back to the origin folder, and make a window saying that all of the shiurim were rejected, please try again.*/\n" +
                "//TODO add code to tell why the shiurim were rejected(whether the new shiurim added to REJECTED have one question mark in their title(what does that mean?), 2 question marks(what does that mean), or whether rejectedShiurTitle.contains(\"DUPLICATE\")), i.e. whether it was rejected because the category was not written correctly, the speaker name was not written correctly, or the shiur was already uploaded\n" +
                "//TODO and add code to move those shiurim^^^^^ back to the origin folder(where they came from/where AutoTagger.jar finds itself) and say\"Try formatting them again again.\"\n" +
                "            }\n" +
                "        } while (rc == 0);\n" +
                "//        return reply;\n" +
                "        return rc;\n" +
                "    }\n" +
                "    ~~public void textboxError(String message) throws IOException {\n" +
                "        setLookAndFeelOfGUIToNimbusStyle();\n" +
                "        JTextArea textArea = new JTextArea(message);\n" +
                "        JScrollPane scrollPane = new JScrollPane(textArea);\n" +
                "        textArea.setLineWrap(true);\n" +
                "        textArea.setWrapStyleWord(true);\n" +
                "        textArea.setEditable(false);\n" +
                "        scrollPane.setPreferredSize(new Dimension(500, 200));\n" +
                "        Font font = new Font(\"Calibri\", Font.BOLD, 18);\n" +
                "        textArea.setFont(font);\n" +
                "//        int reply = JOptionPane.showConfirmDialog(null, scrollPane, title, JOptionPane.YES_NO_OPTION);\n" +
                "        JOptionPane.showMessageDialog(null,scrollPane,\"Error\",JOptionPane.ERROR_MESSAGE);\n" +
                "    }\n" +
                "    ~~public void textboxError(String message,Icon icon) throws IOException {\n" +
                "        setLookAndFeelOfGUIToNimbusStyle();\n" +
                "        JTextArea textArea = new JTextArea(message);\n" +
                "        JScrollPane scrollPane = new JScrollPane(textArea);\n" +
                "        textArea.setLineWrap(true);\n" +
                "        textArea.setWrapStyleWord(true);\n" +
                "        textArea.setEditable(false);\n" +
                "        scrollPane.setPreferredSize(new Dimension(500, 200));\n" +
                "        Font font = new Font(\"Calibri\", Font.BOLD, 18);\n" +
                "        textArea.setFont(font);\n" +
                "//        int reply = JOptionPane.showConfirmDialog(null, scrollPane, title, JOptionPane.YES_NO_OPTION);\n" +
                "        JOptionPane.showMessageDialog(null,scrollPane,\"Error\",JOptionPane.ERROR_MESSAGE,icon);\n" +
                "    }\n" +
                "    ~~public void textboxStackTrace(Throwable ex) throws IOException {\n" +
                "        setLookAndFeelOfGUIToNimbusStyle();\n" +
                "        String fullExceptionType=ex.toString();\n" +
                "        String exceptionType = fullExceptionType.substring(fullExceptionType.lastIndexOf(\".\")+1);\n" +
                "        String aVsAn;\n" +
                "        char ch=exceptionType.charAt(0);\n" +
                "        if(ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U') {aVsAn=\"An\";} else {aVsAn=\"A\";}\n" +
                "        StringWriter stackTraceWriter = new StringWriter();\n" +
                "        ex.printStackTrace(new PrintWriter(stackTraceWriter));\n" +
                "        JTextArea textArea = new JTextArea(aVsAn+\" \"+exceptionType+\" error has occured. Please see an administrator about the following error message:\\n\\n\"+ stackTraceWriter.toString());\n" +
                "        JScrollPane scrollPane = new JScrollPane(textArea);\n" +
                "        textArea.setLineWrap(false);\n" +
                "        textArea.setWrapStyleWord(true);\n" +
                "        textArea.setEditable(false);\n" +
                "        scrollPane.setPreferredSize(new Dimension(500, 200));\n" +
                "        Font font = new Font(\"Calibri\", Font.BOLD, 18);\n" +
                "        textArea.setFont(font);\n" +
                "        JOptionPane.showMessageDialog(null,scrollPane,\"Error\",JOptionPane.ERROR_MESSAGE);\n" +
                "    }\n" +
                "    ~~public static String readBatchFile(PrintStream ps, String fileName) throws IOException {\n" +
                "        String line = null;\n" +
                "        StringBuilder message = new StringBuilder();\n" +
                "        try {\n" +
                "// FileReader reads text files in the default encoding.\n" +
                "            FileReader fileReader =\n" +
                "                    new FileReader(fileName);\n" +
                "\n" +
                "// Always wrap FileReader in BufferedReader.\n" +
                "            BufferedReader bufferedReader =\n" +
                "                    new BufferedReader(fileReader);\n" +
                "\n" +
                "            while((line = bufferedReader.readLine()) != null) {\n" +
                "                message.append(line);\n" +
                "            }\n" +
                "\n" +
                "// Always close files.\n" +
                "            bufferedReader.close();\n" +
                "        }\n" +
                "        catch(IOException ex) {\n" +
                "            GeneralTaggerJava a= new GeneralTaggerJava();\n" +
                "            a.textboxStackTrace(ex);\n" +
                "            Writer fileWriter = new FileWriter(\"C:\\\\PHPTest\\\\TDProccess.TDPush.txt\", false);\n" +
                "            fileWriter.write(\"0 \\n\");\n" +
                "            fileWriter.close();\n" +
                "        }\n" +
                "        message.setLength(message.length()-1);\n" +
                "        return message.toString();\n" +
                "    }\n" +
                "    ~~public StringBuilder readRejectedFile(PrintStream ps,String titleOrNo) throws IOException {\n" +
                "        String fileName=\"\";\n" +
                "        if(titleOrNo.equalsIgnoreCase(\"title\")||titleOrNo.equalsIgnoreCase(\"yes\")) fileName=\"C:\\\\PHPTest\\\\rejectionReasonWithTitle.txt\";\n" +
                "        else if(titleOrNo.equalsIgnoreCase(\"no\")) fileName=\"C:\\\\PHPTest\\\\rejectionReason.txt\";\n" +
                "        String line = null;\n" +
                "        StringBuilder message = new StringBuilder();\n" +
                "        try {\n" +
                "            // FileReader reads text files in the default encoding.\n" +
                "            FileReader fileReader = new FileReader(fileName);\n" +
                "            // Always wrap FileReader in BufferedReader.\n" +
                "            BufferedReader bufferedReader = new BufferedReader(fileReader);\n" +
                "            while((line = bufferedReader.readLine()) != null) message.append(line).append(\"\\n\");\n" +
                "            bufferedReader.close();\n" +
                "        }\n" +
                "        catch(IOException ex) {\n" +
                "            GeneralTaggerJava a= new GeneralTaggerJava();\n" +
                "            a.textboxStackTrace(ex);\n" +
                "            Writer fileWriter = new FileWriter(\"C:\\\\PHPTest\\\\TDProccess.TDPush.txt\", false);\n" +
                "            fileWriter.write(\"0 \\n\");\n" +
                "            fileWriter.close();\n" +
                "        }\n" +
                "        return message;\n" +
                "    }\n" +
                "    ~~public void moveRejectedFilesBackToOrigin (File[]before, File[]after) throws IOException {\n" +
                "        //code to move all files in the after array that were not in the before array back to their folder of origin:\n" +
                "        ArrayList<File> rejected = new ArrayList<>();\n" +
                "\n" +
                "\n" +
                "        for (File value : after) {\n" +
                "            boolean found = false;\n" +
                "            for (File s : before) {\n" +
                "                if (value.equals(s)) {\n" +
                "                    found = true;\n" +
                "                    break;\n" +
                "                }\n" +
                "            }\n" +
                "            if (!found) rejected.add(value);\n" +
                "        }\n" +
                "        File[] rejected1 = new File[rejected.size()];\n" +
                "        rejected.toArray(rejected1);\n" +
                "        for (File file : rejected1) {\n" +
                "            if (!file.isFile()) continue;\n" +
                "            Path temp = Files.move(Paths.get(String.valueOf(file)),Paths.get(System.getProperty(\"user.dir\") + file.getName()));\n" +
                "        }\n" +
                "    }\n" +
                "    ~~public static void setLookAndFeelOfGUIToNimbusStyle() throws IOException {\n" +
                "        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {\n" +
                "            if (\"Nimbus\".equals(info.getName())) {\n" +
                "                try {\n" +
                "                    UIManager.setLookAndFeel(info.getClassName());\n" +
                "                } catch (ClassNotFoundException ex) {\n" +
                "                    Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);\n" +
                "                    GeneralTaggerJava a= new GeneralTaggerJava();\n" +
                "                    a.textboxStackTrace(ex);\n" +
                "                    Writer fileWriter = new FileWriter(\"C:\\\\PHPTest\\\\TDProccess.TDPush.txt\", false);\n" +
                "                    fileWriter.write(\"0 \\n\");\n" +
                "                    fileWriter.close();\n" +
                "                } catch (InstantiationException ex) {\n" +
                "                    Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);\n" +
                "                    GeneralTaggerJava a= new GeneralTaggerJava();\n" +
                "                    a.textboxStackTrace(ex);\n" +
                "                    Writer fileWriter = new FileWriter(\"C:\\\\PHPTest\\\\TDProccess.TDPush.txt\", false);\n" +
                "                    fileWriter.write(\"0 \\n\");\n" +
                "                    fileWriter.close();\n" +
                "                } catch (IllegalAccessException ex) {\n" +
                "                    Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);\n" +
                "                    GeneralTaggerJava a= new GeneralTaggerJava();\n" +
                "                    a.textboxStackTrace(ex);\n" +
                "                    Writer fileWriter = new FileWriter(\"C:\\\\PHPTest\\\\TDProccess.TDPush.txt\", false);\n" +
                "                    fileWriter.write(\"0 \\n\");\n" +
                "                    fileWriter.close();\n" +
                "                } catch (UnsupportedLookAndFeelException ex) {\n" +
                "                    Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);\n" +
                "                    GeneralTaggerJava a= new GeneralTaggerJava();\n" +
                "                    a.textboxStackTrace(ex);\n" +
                "                    Writer fileWriter = new FileWriter(\"C:\\\\PHPTest\\\\TDProccess.TDPush.txt\", false);\n" +
                "                    fileWriter.write(\"0 \\n\");\n" +
                "                    fileWriter.close();\n" +
                "                }\n" +
                "                break;\n" +
                "            }\n" +
                "        }\n" +
                "    }";
//        System.out.println(mis.charAt(0));
    int x=0;
    int IntArrayCounter=-1;
    Integer[] x1 =new Integer[19];
        while(x<Methods.length()){
            if(Methods.charAt(x)=='~'&& Methods.charAt(x+1)=='~')
                {
                    IntArrayCounter++;
                    x1[IntArrayCounter]=x+1;
                }
            x++;
        }
        System.out.println(Arrays.toString(x1));
    Integer[] cx= new Integer[]{4, 3348, 11782, 21652, 21957, 23025, 23760, 26891, 27057, 28095, 28586, 29418, 34893, 35583, 36288, 37445, 38482, 39663, 40542};
        Integer[] cx1= new Integer[18];
      int x123=0;
        while(x123<cx.length){
            if(x123==18)break;
            cx1[x123]=cx[x123+1]-cx[x123];
            x123++;
        }
        System.out.println(Arrays.toString(cx1));
    }
    }

