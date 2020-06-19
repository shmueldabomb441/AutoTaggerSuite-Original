package com.company;

import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.CannotWriteException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static java.lang.Math.ceil;
import static java.nio.file.Paths.get;



public class GeneralTaggerVersion1025 {
    File moveToMaster = new File("C:\\TD_Library\\validate_process\\MoveToMaster");

    public void abcde() throws TagException, ReadOnlyFileException, CannotReadException, InvalidAudioFrameException, IOException, CannotWriteException, InterruptedException {
        TDPushEnder tdPushEnder = new TDPushEnder();















        File errorLog = new File(System.getProperty("user.dir")+"\\SystemErrorLog.txt");
        PrintStream ps = new PrintStream(errorLog);
        FileReader fr = new FileReader("C:\\PHPTest\\TDProccess.TDPush.txt");
        int i=fr.read();
        if ((String.valueOf(i).equals("49"))) {
            System.exit(49);
        }



        else if ((String.valueOf(i).equals("48"))){
            Writer fileWriter = new FileWriter("C:\\PHPTest\\TDProccess.TDPush.txt", false);
            fileWriter.write("1");
            fileWriter.close();
        }
        String series = new String(Files.readAllBytes(get(System.getProperty("user.dir")+"\\Series.txt")));
        String speaker = new String(Files.readAllBytes(get(System.getProperty("user.dir") + "\\Speaker.txt")));
        String category = new String(Files.readAllBytes(get(System.getProperty("user.dir") + "\\Category.txt")));
        File[] files = new File(System.getProperty("user.dir")).listFiles();
        int mp3Counter = 0;
        long totalFilesizeToBeMoved=0;

        if(tdPushEnder.myDataSyncIsStillRunning) {
            while (tdPushEnder.myDataSyncIsStillRunning) tdPushEnder.killMyDataSync();
        }
        //check if there are any mp3 files:
        for (File file : files) {
            if (!file.isFile()) continue;

            String[] bits = file.getName().split("\\.");
            boolean endsInMp3 = bits[bits.length - 1].equalsIgnoreCase("mp3");
            if (endsInMp3) {
                mp3Counter+= 1;
                totalFilesizeToBeMoved+= GetFileSize.MebiBytes(file);//replace with +=;add filesize of this .mp3 to total filesize of mp3s which need to be moved
            }
        }

        if (mp3Counter > 0) {
            tagMp3s(mp3Counter, series, speaker, category, files, totalFilesizeToBeMoved);
        } else uploadThem2(ps,mp3Counter, totalFilesizeToBeMoved);//meaning to say, if there are no mp3s, the user can run mp3Tagger again to automattically upload the shiurim for them
    }
    public void uploadThem(PrintStream ps,int mp3Counter, long totalFilesizeToBeMoved) throws IOException, InterruptedException {
        //this program takes place in validate_process and MoveToMaster
        TDPushEnder tdPushEnder = new TDPushEnder();



        int flatRateOfTimeItTakesToSyncDatabaseMeasuredInSeconds = 110;//but Thread.sleep() only accepts milliseconds, you when passing these numbers, multiply them by 1,000 to go from milliseconds to seconds
        double timeItTakesToMoveTheseToMasterMeasuredInSeconds = 10 + totalFilesizeToBeMoved/100.0;
        double timeItTakesToUploadTheseToServerMeasuredInSeconds=15+totalFilesizeToBeMoved/4.2/*1 divided by 4.2MBps--the lowest possible speed it could take--it could really do about 7MBps, just being conservative*/;
        double timeItTakesTD_PushToParseFilesMeasuredInSeconds=5+.6*mp3Counter/*which is about 1.66 files parsed per second--it can actually parse of 2.4 files a second, but this is conservative*/;
        double timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds=10+totalFilesizeToBeMoved/32.93251667;
        long timeItShouldTakeTD_PushToFinishMeasuredInSeconds = (long) (timeItTakesTD_PushToParseFilesMeasuredInSeconds+timeItTakesToUploadTheseToServerMeasuredInSeconds+timeItTakesToMoveTheseToMasterMeasuredInSeconds+flatRateOfTimeItTakesToSyncDatabaseMeasuredInSeconds);


        runTD_Process(ps,timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds);

























        int timesTDWasRan=0;
        int amountOfFilesInMasterBefore=moveToMaster.list().length;
        do {
            boolean noFileHaveBeenMoved;
            if(tdPushEnder.tdPushIsStillRunning && moveToMaster.list().length==amountOfFilesInMasterBefore){/*if by time it hangs there should be no more files in the folder, then check if the amount of files moved was zero(it never got off the ground), using this: "&& numFilesInMoveToMasterBeforeTD_PushIsRun==numFilesNow" so if none of them are moved, don't kill it. , */
                tdPushEnder.killTDPush();}
            else if(tdPushEnder.tdPushIsStillRunning && moveToMaster.list().length>0/*There are less files than when we started, but there are still files (i.e. files have been moved)*/){
                int x = moveToMaster.list().length;
                java.util.concurrent.TimeUnit.SECONDS.sleep(20);
                int y =moveToMaster.list().length;
                if (x==y) /*if it is mamash stuck there, then*/ tdPushEnder.killTDPush();
                else if (x-y>0) /*if files moved since i last checked(i.e. if files are still moving)*/ {
                    while(moveToMaster.list().length>0) java.util.concurrent.TimeUnit.SECONDS.sleep(20);//so long as there are files in the folder, wait. That is, wait until there are no more files
                    waitForTDPush(flatRateOfTimeItTakesToSyncDatabaseMeasuredInSeconds+8);//now you know for sure that all that TD_Push has to do is sync the databse, so wait that time and then check if it is still running,because all of the files are gon, so "moving to master on local" phase is done
                    continue;//recheck condition, namely, if it is still running after it should have finished
                } else /*if after you waited 20 seconds, all of the files were gone:*/{
                    waitForTDPush(flatRateOfTimeItTakesToSyncDatabaseMeasuredInSeconds+8);
                    continue;
                }//wait for it to sync databases, as is explained in the previous if statement's waitForTDPush comment(line 92 as of now)

            } else if (tdPushEnder.tdPushIsStillRunning && moveToMaster.list().length==0/*there are no more files in Master*/){tdPushEnder.killTDPush();
            }

            if(timesTDWasRan==4){
                PrintStream out = new PrintStream(new FileOutputStream(System.getProperty("user.dir")+"\\SystemErrorLog.txt"));
                Throwable t = new Throwable();
                t.printStackTrace(out);
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                Writer dateWriter = new FileWriter(System.getProperty("user.dir")+"\\SystemErrorLog.txt",true);
                dateWriter.write(dateFormat.format(date)+"     TD_PUSH had to restart too many times (4 times) because it failed to finish executing.");
                dateWriter.close();
                Writer fileWriter = new FileWriter("C:\\PHPTest\\TDProccess.TDPush.txt", false);
                fileWriter.write("0");
                fileWriter.close();
                System.exit(3);
            }
            runTDPush(ps, timeItShouldTakeTD_PushToFinishMeasuredInSeconds);
            timesTDWasRan+=1;
        } while(tdPushEnder.tdPushIsStillRunning);//Run TD_Push and then wait. if TD_Push is still running after it should have finished: kill it, start a new one, and then wait for it again
        Writer fileWriter = new FileWriter("C:\\PHPTest\\TDProccess.TDPush.txt", false);
        fileWriter.write("0");
        fileWriter.close();
    }
    public void uploadThem2(PrintStream ps,int mp3Counter, long totalFilesizeToBeMoved) throws IOException, InterruptedException {
        //this program takes place in validate_procces and MoveToMaster
        TDPushEnder tdPushEnder = new TDPushEnder();
        int flatRateOfTimeItTakesToSyncDatabaseMeasuredInSeconds = 200;//but Thread.sleep() only accepts milliseconds, you when passing these numbers, multiply them by 1,000 to go from milliseconds to seconds
        double timeItTakesToMoveTheseToMasterMeasuredInSeconds=10+totalFilesizeToBeMoved/100.0;
        double timeItTakesToUploadTheseToServerMeasuredInSeconds=15+totalFilesizeToBeMoved/4.2/*1 divided by 4.2MBps--the lowest possible speed it could take--it could really do about 7MBps, just being conservative*/;
        double timeItTakesTD_PushToParseFilesMeasuredInSeconds=5+.6*mp3Counter/*which is about 1.66 files parsed per second--it can actually parse of 2.4 files a second, but this is conservative*/;
        double timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds=10+totalFilesizeToBeMoved/32.93251667;
        long timeItShouldTakeTD_PushToFinishMeasuredInSeconds = (long) (timeItTakesTD_PushToParseFilesMeasuredInSeconds+timeItTakesToUploadTheseToServerMeasuredInSeconds+timeItTakesToMoveTheseToMasterMeasuredInSeconds+flatRateOfTimeItTakesToSyncDatabaseMeasuredInSeconds);

        runTD_Process(ps,timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds);
        int timesTDWasRan=0;
        int amountOfFilesInMasterBefore=moveToMaster.list().length;
        do {
            boolean noFileHaveBeenMoved;
            if(tdPushEnder.tdPushIsStillRunning && moveToMaster.list().length==amountOfFilesInMasterBefore){/*if by time it hangs there should be no more files in the folder, then check if the amount of files moved was zero(it never got off the ground), using this: "&& numFilesInMoveToMasterBeforeTD_PushIsRun==numFilesNow" so if none of them are moved, don't kill it. , */
                tdPushEnder.killTDPush();}
            else if(tdPushEnder.tdPushIsStillRunning && moveToMaster.list().length>0/*There are less files than when we started, but there are still files (i.e. files have been moved)*/){
                int x = moveToMaster.list().length;
                java.util.concurrent.TimeUnit.SECONDS.sleep(20);
                int y =moveToMaster.list().length;
                if (x==y) /*if it is mamash stuck there, then*/ tdPushEnder.killTDPush();
                else if (x-y>0) /*if files moved since i last checked(i.e. if files are still moving)*/
                {
                    while(moveToMaster.list().length>0) java.util.concurrent.TimeUnit.SECONDS.sleep(20);//so long as there are files in the folder, wait. That is, wait until there are no more files
                    waitForTDPush(flatRateOfTimeItTakesToSyncDatabaseMeasuredInSeconds+8);//now you know for sure that all that TD_Push has to do is sync the databse, so wait that time and then check if it is still running,because all of the files are gon, so "moving to master on local" phase is done
                    continue;//recheck condition, namely, if it is still running after it should have finished
                }

                else /*if after you waited 20 seconds, all of the files were gone:*/{waitForTDPush(flatRateOfTimeItTakesToSyncDatabaseMeasuredInSeconds+8);continue;}//wait for it to sync databases, as is explained in the previous if statement's waitForTDPush comment(line 92 as of now)

            }
            else if(tdPushEnder.tdPushIsStillRunning && moveToMaster.list().length==0/*there are no more files in Master*/){tdPushEnder.killTDPush();}

            if(timesTDWasRan==4){
                PrintStream out = new PrintStream(new FileOutputStream(System.getProperty("user.dir")+"\\SystemErrorLog.txt"));
                Throwable t = new Throwable();
                t.printStackTrace(out);
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                Writer dateWriter = new FileWriter(System.getProperty("user.dir")+"\\SystemErrorLog.txt", true);
                dateWriter.write(dateFormat.format(date)+"     TD_PUSH had to restart too many times (4 times) because it failed to finish executing.");
                dateWriter.close();
                Writer fileWriter = new FileWriter("C:\\PHPTest\\TDProccess.TDPush.txt", false);
                fileWriter.write("0");
                fileWriter.close();
                System.exit(3);
            }
            runTDPush(ps,timeItShouldTakeTD_PushToFinishMeasuredInSeconds);
            timesTDWasRan+=1;
        } while(tdPushEnder.tdPushIsStillRunning);//Run TD_Push and then wait. if TD_Push is still running after it should have finished: kill it, start a new one, and then wait for it again
        Writer fileWriter = new FileWriter("C:\\PHPTest\\TDProccess.TDPush.txt", false);
        fileWriter.write("0");
        fileWriter.close();
    }
    // TODO: add rulebook of GeneralTaggerJava to every new folder which uses it, which includes the funcitonality of there being a spell checker, the program simply doubling as an automatic uploader, AND THAT IT SHOULD NOT BE RUNNING WHILE SOMETHING ELSE IS BEING UPLOADED, BECAUSE IT WILL DELETE ANY MySyncData.exe(PROGRAM WHICH SYNCS LOCAL DATABASE TO WEBSITE(I.E PUSHES SHIUR LIVE TO WEBSITE)) INSTANCES WHICH ARE OPEN AT THE TIME OF THE PROGRAM'S EXECUTION
    // TODO: Update ReingoldTagger with all of the features of GeneralTaggerJava
    // TODO  Get in order: the method for replacing ".MP3" or ".mp3" in the title with an empty string/deleting it
    //TODO: add taskkill for aws.exe, also, for some reason, something is not working when all of the files are .MP3
    //TODO: something is severely wrong since i finished up the final draft(including the while loops)
    //TODO: talk to Mr. Hyatt about protocol for dealing with the scenario in which the flat rate/time it takes to sync the database has become significantly longer than 100 seconds, such that my program is always shutting TD_Push down.


    //     Runnable checker = () ->
    /*        RFileReader fr = new FileReader("C:\\PHPTest\\TDProccess.TDPush.txt");
            int i=fr.read();

            if ((String.valueOf(i).equals("49"))) {}unnable checker = () ->
    {
        try {
            FileReader fr = new FileReader("C:\\PHPTest\\TDProccess.TDPush.txt");
            int i=fr.read();

            if ((String.valueOf(i).equals("49"))) {}
            else if ((String.valueOf(i).equals("48")))
            {

                //Run TD_Push
                try {
                    // Command to create an external process
                    String command = "C:\\TD_Library\\Scripts\\TD_PUSHALL.bat";

                    // Running the above command
                    Runtime run = Runtime.getRuntime();
                    Process proc = run.exec(command);
                    Writer fileWriter = new FileWriter("C:\\PHPTest\\TDProccess.TDPush.txt", false);
                } catch (IOException e) {
                    e.printStackTrace(ps);
                    ps.close();
                }
            }
            else if ((String.valueOf(i).equals("50"))) {
                Writer fileWriter = new FileWriter("C:\\PHPTest\\TDProccess.TDPush.txt", false);
                fileWriter.write("1");
                fileWriter.close();
                System.exit(0);
            }else{}
        } catch (IOException e) {
            e.printStackTrace(ps);
            ps.close();
        }

    };
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(checker, 0, 3, TimeUnit.SECONDS);
    */

    public void waitForTDPush(long timeItShouldTakeTD_PushToFinishMeasuredInSeconds) throws InterruptedException {
        java.util.concurrent.TimeUnit.SECONDS.sleep(timeItShouldTakeTD_PushToFinishMeasuredInSeconds);//it is already measured in milliseconds so i dont have to multiply it by 1,000
    }

    public void waitForTD_Process(double timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds) throws InterruptedException {
        java.util.concurrent.TimeUnit.SECONDS.sleep(/*accepts milliseconds*/ (long) ceil(1+timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds)/*1,000 ms in 1 second*//*the 1+ is just in case timeItTakes... evaluates to zero(they are just using it to upload)*/);//0.03036512544770260 is 1 divided by the rate at which TD_Process to process shiurim. ((amount transfered)/rate of transfer)=time it will take to tranfer. Manipulating this equation provides the formula: multiply how many GBs need to be processed by TD_Process by 0.03036512544770260 to obtain how long it will take for TD_Process to go through them, and therefore how long to wait until it should be done by. Rates for processing time of TD_process, TD_Push's initial parsing of the files,(average time it takes to upload,) and MoveToMaster, were originially computed in an Excel spreadsheet titled "Multipliers for GeneralTaggerJava" located in C:\Users\mglazer\Documents.
    }

    public void runTD_Process(PrintStream ps, double timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds) throws IOException {
        //TD_Process:

        try {
            Process process = Runtime.getRuntime().exec(
                    "cmd /c tdsync - shmuly.bat", null, new File("C:\\PHPTest\\"));
            waitForTD_Process(1+timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace(ps);
            ps.close();
            Writer fileWriter = new FileWriter("C:\\PHPTest\\TDProccess.TDPush.txt", false);
            fileWriter.write("0");
            fileWriter.close();
        } //TD_Process
    }



    public void tagMp3s ( int mp3Counter, String series, String speaker, String category, File[]files, long totalFilesizeToBeMoved) throws
            CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException, CannotWriteException, InterruptedException {
        File errorLog = new File(System.getProperty("user.dir")+"\\SystemErrorLog.txt");
        PrintStream ps = new PrintStream(errorLog);
        for (File file : files) {
            if (!file.isFile()) continue;
            String[] bits = file.getName().split("\\.");
            boolean endsInMp3 = bits[bits.length - 1].equalsIgnoreCase("mp3");
            if (bits.length > 0 && endsInMp3) {
                MP3File f = (MP3File) AudioFileIO.read(file);
                Tag tag = f.getTag();
                if (tag.getFirst(FieldKey.TITLE) != null) {
                    tag.deleteField(FieldKey.TITLE);
                }
                tag.setField(FieldKey.TITLE, file.getName());
                //  if (tag.getFirst(FieldKey.TITLE).contains("\\.mp3")) {
                //add code here which: stores the current title in a variable
                //add code here which: deletes the current .mp3 file's title(and then then the next line sets the stored title to the mp3 while replacing ".mp3"
                //  tag.setField(FieldKey.TITLE,tag.getFirst(FieldKey.TITLE).replace("\\.mp3",""));}
                // else if(tag.getFirst(FieldKey.TITLE).contains("\\.MP3")){
                // tag.setField(FieldKey.TITLE,tag.getFirst(FieldKey.TITLE).replace("\\.MP3",""));}
                if (tag.getFirst(FieldKey.ALBUM) != null) {
                    tag.deleteField(FieldKey.ALBUM);
                }
                tag.setField(FieldKey.ALBUM, category);
                if (tag.getFirst(FieldKey.ARTIST) != null) {
                    tag.deleteField(FieldKey.ARTIST);
                }
                tag.setField(FieldKey.ARTIST, speaker);
                if (tag.getFirst(FieldKey.CONDUCTOR) != null) {
                    tag.deleteField(FieldKey.CONDUCTOR);
                }
                tag.setField(FieldKey.CONDUCTOR, series);
                f.commit();
                Path temp = Files.move(Paths.get(String.valueOf(file)), Paths.get("C:\\TD_Library\\validate_process\\" + file.getName()));
            }
        }
        uploadThem(ps,mp3Counter, totalFilesizeToBeMoved);
    }


    public void runTDPush(PrintStream ps, long waittime) throws IOException, InterruptedException {
        Runtime.getRuntime().exec("cmd.exe /K start \"ShmulyTD_PUSHALL\" \"C:\\TD_Library\\Scripts\\ShmulyTD_PUSHALL.bat\"");
        java.util.concurrent.TimeUnit.SECONDS.sleep(waittime);//it is already measured in milliseconds so i dont have to multiply it by 1,000

    }
}