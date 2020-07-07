package com.generalTagger;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.CannotWriteException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.FieldKey;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;
public class SimpleAutoTagger {


 public static void main(String[] args) throws IOException {
            try {
                String series = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "\\Series.txt")));
                String speaker = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "\\Speaker.txt")));
                String category = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir") + "\\Category.txt")));
                File[] files = (new File(System.getProperty("user.dir"))).listFiles();
                findMp3CounterAndMp3FileSizeOfFileList(files);
                if (mp3Counter > 0) {
                    tagMp3s(series, speaker, category, files);
                } else {
                    textBoxError("No Shiurim In Folder.");
                }
            } catch (Exception e) {
                textboxStackTrace(e);
            }
        }

        static int mp3Counter = 0;

        static long totalFilesizeToBeMoved = 0L;

        public static void tagMp3s(String series, String speaker, String category, File[] files) throws CannotReadException, IOException, TagException, ReadOnlyFileException, InvalidAudioFrameException, CannotWriteException {
            for (File file : files) {
                if (file.isFile()) {
                    String[] bits = file.getName().split("\\.");
                    boolean endsInMp3 = bits[bits.length - 1].equalsIgnoreCase("mp3");
                    if (endsInMp3) {
                        MP3File f = (MP3File)AudioFileIO.read(file);
                        Tag tag = f.getTag();
                        if (tag.getFirst(FieldKey.TITLE) != null)
                            tag.deleteField(FieldKey.TITLE);
                        tag.setField(FieldKey.TITLE, file.getName());
                        if (tag.getFirst(FieldKey.ALBUM) != null)
                            tag.deleteField(FieldKey.ALBUM);
                        tag.setField(FieldKey.ALBUM, category);
                        if (tag.getFirst(FieldKey.ARTIST) != null)
                            tag.deleteField(FieldKey.ARTIST);
                        tag.setField(FieldKey.ARTIST, speaker);
                        if (tag.getFirst(FieldKey.CONDUCTOR) != null)
                            tag.deleteField(FieldKey.CONDUCTOR);
                        tag.setField(FieldKey.CONDUCTOR, series);
                        if (tag.getFirst(FieldKey.TITLE).contains(".mp3")) {
                            String before = tag.getFirst(FieldKey.TITLE);
                            String after = before.replace(".mp3", "");
                            tag.deleteField(FieldKey.TITLE);
                            tag.setField(FieldKey.TITLE, after);
                        } else if (tag.getFirst(FieldKey.TITLE).contains(".MP3")) {
                            String before = tag.getFirst(FieldKey.TITLE);
                            String after = before.replace(".MP3", "");
                            tag.deleteField(FieldKey.TITLE);
                            tag.setField(FieldKey.TITLE, after);
                        }
                        f.commit();
                    }
                }
            }
        }

        public static void textBoxError(String message) throws IOException {
            JScrollPane scrollPane = formatJScrollPane_SizeAndFont_Etc(message);
            JOptionPane.showMessageDialog(null, scrollPane, "Error", JOptionPane.ERROR_MESSAGE);
        }

        public static JScrollPane formatJScrollPane_SizeAndFont_Etc(String message) throws IOException {
            setLookAndFeelOfGUIToNimbusStyle();
            JTextArea textArea = new JTextArea(message);
            JScrollPane scrollPane = new JScrollPane(textArea);
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            textArea.setEditable(false);
            scrollPane.setPreferredSize(new Dimension(500, 200));
            Font font = new Font("Calibri", Font.BOLD, 18);
            textArea.setFont(font);
            return scrollPane;
        }

        public static void findMp3CounterAndMp3FileSizeOfFileList(File[] files) {
            for (File file : files) {
                if (file.isFile()) {
                    String[] bits = file.getName().split("\\.");
                    boolean endsInMp3 = bits[bits.length - 1].equalsIgnoreCase("mp3");
                    if (endsInMp3) {
                        mp3Counter++;
                        totalFilesizeToBeMoved += MebiBytes(file);
                    }
                }
            }
        }

        public static long MebiBytes(File file) {
            return file.length() / 1048576L;
        }

        public static void setLookAndFeelOfGUIToNimbusStyle() throws IOException {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    try {
                        UIManager.setLookAndFeel(info.getClassName());
                    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(Demo.class.getName()).log(Level.SEVERE, null, ex);
                        textboxStackTrace(ex);
                    }
                    break;
                }
            }
        }

        public static void textboxStackTrace(Throwable ex) throws IOException {
            String aVsAn;
            setLookAndFeelOfGUIToNimbusStyle();
            String fullExceptionType = ex.toString();
            String exceptionType = fullExceptionType.substring(fullExceptionType.lastIndexOf(".") + 1);
            char ch = exceptionType.charAt(0);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                aVsAn = "An";
            } else {
                aVsAn = "A";
            }
            StringWriter stackTraceWriter = new StringWriter();
            ex.printStackTrace(new PrintWriter(stackTraceWriter));
            JTextArea textArea = new JTextArea(aVsAn + " " + aVsAn + " error has occurred. Please see an administrator about the following error message:\n\n" + exceptionType);
            JScrollPane scrollPane = new JScrollPane(textArea);
            textArea.setLineWrap(false);
            textArea.setWrapStyleWord(true);
            textArea.setEditable(false);
            scrollPane.setPreferredSize(new Dimension(500, 200));
            Font font = new Font("Calibri", Font.BOLD, 18);
            textArea.setFont(font);
            JOptionPane.showMessageDialog(null, scrollPane, "Error", JOptionPane.ERROR_MESSAGE);
        }

}
