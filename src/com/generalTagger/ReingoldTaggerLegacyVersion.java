package com.generalTagger;

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
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.nio.file.Paths.get;
public class ReingoldTaggerLegacyVersion {
    public void abcde() throws TagException, ReadOnlyFileException, CannotReadException, InvalidAudioFrameException, IOException, CannotWriteException, InterruptedException {
        File errorLog = new File(System.getProperty("user.dir")+"\\SystemErrorLog.txt");
        PrintStream ps = new PrintStream(errorLog);

        String series = new String(Files.readAllBytes(get(System.getProperty("user.dir")+"\\Series.txt")));


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
            tagMp3s(mp3Counter, series, files);
        } else uploadThem(ps);
    }

    private void uploadThem(PrintStream ps) throws IOException, InterruptedException {
        try {
            // Command to create an external process
            String command = "C:\\PHPTest\\tdsync - shmuly.bat";

            // Running the above command
            Runtime run = Runtime.getRuntime();
            Process proc = run.exec(command);
        } catch (IOException e) {
            e.printStackTrace(ps);
            ps.close();
        }
Thread.sleep(30000);
            Runnable checker = () ->
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
                    String command = "C:\\TD_Library\\Scripts\\ShmulyTD_PUSHALL.bat";

                    // Running the above command
                    Runtime run = Runtime.getRuntime();
                    Process proc = run.exec(command);
                    Writer fileWriter = new FileWriter("C:\\PHPTest\\TDProccess.TDPush.txt", false);
                    fileWriter.write("1");
                    fileWriter.close();
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
    }

    private void tagMp3s ( int mp3Counter, String series, File[]files) throws
        CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException, CannotWriteException, InterruptedException     {
            for (File file : files) {
                if (!file.isFile()) continue;
                String[] bits = file.getName().split("\\.");
                boolean endsInMp3 = bits[bits.length - 1].equalsIgnoreCase("mp3");
                if (mp3Counter > 0 && bits.length > 0 && endsInMp3) {
                    MP3File f = (MP3File) AudioFileIO.read(file);
                    Tag tag = f.getTag();
                    if (tag.getFirst(FieldKey.TITLE) != null) {
                        tag.deleteField(FieldKey.TITLE);
                    }
                    tag.setField(FieldKey.TITLE, file.getName());
if (tag.getFirst(FieldKey.TITLE).contains(".mp3")||tag.getFirst(FieldKey.TITLE).contains(".MP3"))
{
                    tag.getFirst(FieldKey.TITLE).replace(".mp3","");
                    tag.getFirst(FieldKey.TITLE).replace(".MP3","");
}
                    if (tag.getFirst(FieldKey.ALBUM) != null) {
                        tag.deleteField(FieldKey.ALBUM);
                    }
                    tag.setField(FieldKey.ALBUM, "Chaye Adam;Halacha");
                    if (tag.getFirst(FieldKey.ARTIST) != null) {
                        tag.deleteField(FieldKey.ARTIST);
                    }
                    tag.setField(FieldKey.ARTIST, "Rabbi Eliyahu Reingold");
                    if (tag.getFirst(FieldKey.CONDUCTOR) != null) {
                        tag.deleteField(FieldKey.CONDUCTOR);
                    }
                    tag.setField(FieldKey.CONDUCTOR, "Daily Halacha - "+series);
                    f.commit();
                    Path temp = Files.move(Paths.get(String.valueOf(file)), Paths.get("C:\\TD_Library\\validate_process\\" + file.getName()));
                }
            }
            File errorLog = new File(System.getProperty("user.dir")+"\\SystemErrorLog.txt");
            PrintStream ps = new PrintStream(errorLog);
            uploadThem(ps);
        }
    }