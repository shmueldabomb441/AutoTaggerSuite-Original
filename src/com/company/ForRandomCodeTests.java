package com.company;

import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.CannotWriteException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.tag.TagException;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.lang.Math.ceil;
import static java.nio.file.Paths.get;

public class ForRandomCodeTests {
    int filesMoved = 0;

    public static void main(String[] args) throws IOException, InterruptedException {
        long totalFilesizeToBeMoved=0;
        int mp3Counter=0;
        int flatRateOfTimeItTakesToSyncDatabaseMeasuredInSeconds = 100;//but Thread.sleep() only accepts milliseconds, you when passing these numbers, multiply them by 1,000 to go from milliseconds to seconds
        double timeItTakesToMoveTheseToMasterMeasuredInSeconds=ceil(totalFilesizeToBeMoved*0.00303651254477026);
        double timeItTakesToUploadTheseToServerMeasuredInSeconds=ceil(totalFilesizeToBeMoved*0.2380952380952381/*1 divided by 4.2MBps--the lowest possible speed it could take--it could really do about 7MBps, just being conservative*/);
        double timeItTakesTD_PushToParseFilesMeasuredInSeconds=ceil(.6*mp3Counter/*which is about 1.66 files parsed per second--it can actually parse of 2.4 files a second, but this is conservative*/);
        double timeItTakesTD_ProcessToProcessFilesMeasuredInSeconds=ceil(totalFilesizeToBeMoved*0.03036512544770260);
        long timeItShouldTakeTD_PushToFinishMeasuredInMilliseconds= (long) ceil(timeItTakesTD_PushToParseFilesMeasuredInSeconds+timeItTakesToUploadTheseToServerMeasuredInSeconds+timeItTakesToMoveTheseToMasterMeasuredInSeconds+flatRateOfTimeItTakesToSyncDatabaseMeasuredInSeconds*1000);

        TDPushEnder tdPushEnder = new TDPushEnder();
        File errorLog = new File(System.getProperty("user.dir")+"\\SystemErrorLog.txt");
        PrintStream ps = new PrintStream(errorLog);
        File[] files = new File(System.getProperty("user.dir")).listFiles();
        while(tdPushEnder.tdPushIsStillRunning) {//if TD_Push is still running after it should have finished:
            tdPushEnder.killTDPush(); //kill it:
            runTDPush(ps);//Start a new one
            waitForTDPush(timeItShouldTakeTD_PushToFinishMeasuredInMilliseconds);}
    }
    private static void waitForTDPush(long timeItShouldTakeTD_PushToFinishMeasuredInMilliseconds) throws InterruptedException {
        Thread.sleep(timeItShouldTakeTD_PushToFinishMeasuredInMilliseconds);//it is already measured in milliseconds so i dont have to multiply it by 1,000
    }
    public static void runTDPush(PrintStream ps) {
        try {
            String command = "C:\\TD_Library\\Scripts\\ShmulyTD_PUSHALL.bat";
            Runtime run = Runtime.getRuntime();
            Process proc = run.exec(command);
        } catch (IOException e) {
            e.printStackTrace(ps);
            ps.close();
        }
    }
    public void abcde() throws TagException, ReadOnlyFileException, CannotReadException, InvalidAudioFrameException, IOException, CannotWriteException {
        File errorLog = new File(System.getProperty("user.dir") + "\\SystemErrorLog.txt");
        PrintStream ps = new PrintStream(errorLog);

        String series = new String(Files.readAllBytes(get(System.getProperty("user.dir") + "\\Series.txt")));
        String speaker = new String(Files.readAllBytes(get(System.getProperty("user.dir") + "\\Speaker.txt")));
        String category = new String(Files.readAllBytes(get(System.getProperty("user.dir") + "\\Category.txt")));
        File[] files = new File(System.getProperty("user.dir")).listFiles();
        int mp3Counter = 0;

        for (File file : files) {
            if (!file.isFile()) continue;
            String[] bits = file.getName().split("\\.");
            boolean endsInMp3 = bits[bits.length - 1].equalsIgnoreCase("mp3");
            if (endsInMp3) {
                mp3Counter += 1;
            }
        }

        if (mp3Counter > 0) {
            // tagMp3s(mp3Counter, series, speaker, category, files);
        }
    }
}

        //TD_Proccess and TD_Push
//        public void uploader() throws FileNotFoundException {
////            File errorLog = new File(System.getProperty("user.dir") + "\\SystemErrorLog.txt");
////            PrintStream ps = new PrintStream(errorLog);
//           /* try
//          //  TDProcces Block
//           {
//
//                String command = "C:\\PHPTest\\tdsync - shmuly.bat";
//
//                // Running TDProccess
//                Runtime run = Runtime.getRuntime();
//                Process proc = run.exec(command);
//            } catch (IOException e) {
//                e.printStackTrace(ps);
//                ps.close();
//            }*/
////            ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
////            Runnable checker = () ->
////            {
////                try {
////                    FileReader fr = new FileReader("C:\\Users\\mglazer\\IdeaProjects\\JAudioTagger\\TDPush.txt");
////                    int i;
////                    System.out.println(fr.read());
///*                    if (i == 49) {
//                    } else if ((i == 48)) {
//                        try {
//                            // Command to create an external process
//                            String command = "C:\\TD_Library\\Scripts\\ShmulyTD_PUSHALL.bat";
//
//                            // Running the above command
//                            Runtime run = Runtime.getRuntime();
//                            Process proc = run.exec(command);
//                            Writer fileWriter = new FileWriter("C:\\PHPTest\\TDProccess.TDPush.txt", false);
//                            Writer tdPushSuccess = new FileWriter(System.getProperty("user.dir") + "\\TDPUSH Success.txt", false);
//                            fileWriter.write("1");
//                            fileWriter.close();
//                            tdPushSuccess.write("Successfully Executed TD_Push");
//                            tdPushSuccess.close();
//                        }
//                        catch (IOException e) {
//                            e.printStackTrace(ps);
//                            ps.close();
//                        }
//                    }
//                    else if (i == 50) {
//                        Writer fileWriter = new FileWriter("C:\\PHPTest\\TDProccess.TDPush.txt", false);
//                        fileWriter.write("1");
//                        fileWriter.close();
//                        System.exit(0);
//                    }*/
////                } catch (IOException e) {
////                    e.printStackTrace(ps);
////                    ps.close();
////                }
////            };
//            // executor.scheduleAtFixedRate(checker, 0, 3, TimeUnit.SECONDS);
//        }
//        public void pizza(int x){for(int i = 0; i>10; i++){super.x+=10;}System.out.println(x);}
//}