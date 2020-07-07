package coverArtTagger;

import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.audio.exceptions.InvalidAudioFrameException;
import org.jaudiotagger.audio.exceptions.ReadOnlyFileException;
import org.jaudiotagger.audio.mp3.MP3File;
import org.jaudiotagger.tag.Tag;
import org.jaudiotagger.tag.TagException;
import org.jaudiotagger.tag.images.Artwork;
import org.jaudiotagger.tag.images.ArtworkFactory;

import javax.swing.*;
import java.awt.*;
import java.io.*;


public class WriteSpeakerImageWithoutHardcodedFilePaths {
    public static void main(String[] args) throws Exception {
        //program is going to have to overwrite a file called fileToBeEdditted and a file name speakerID with their respective values for each iteration of a file
        setLookAndFeelOfGUIToNimbusStyle();
        JTextArea textArea = new JTextArea();
        textArea.setText("");
        JTextField textField1 = new JTextField();
        JTextField textField2 = new JTextField();
        JTextField textField3 = new JTextField();
        Object[] inputFields = {"Speaker ID?(e.g. \"5\")", textField1, "Exact file path of file to be edited? (e.g. \"C:\\main1.mp3\")", textField2, "Exact file path of folder with pictures? (e.g. \"C:\\Speaker Images\")", textField3};
        JOptionPane.showConfirmDialog(null, inputFields, "Cover Art Tagger", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
        System.out.println(textField1.getText());

        String speakerID = textField1.getText();
        File file=new File(textField2.getText());
        File picFolder=new File(textField3.getText());
//       findMp3CounterAndMp3FileSizeOfFileList(files);
//        may have to put a line of code in php script to output the name of the desired file to a text file and have this code read that file for the filename and parse it into a file. I will need to do this because lets say there are shiurim from mutliple speakers in validate proccess; I will have to know which file the associated speaker ID number i was given is associated with. The program would run once very every file, and every time the php script needed to call my function, it would do it again( i am very tired but you know what i mean)
        File picture;
        if(new File(picFolder+"/" + speakerID + ".jpg").exists()){
            picture= new File(picFolder+"/" + speakerID + ".jpg");
        }
        else picture= new File(picFolder+"/td-image.jpg");
        setMp3AlbumArt(picture,file);

    }
    public static String readFile(String fileName) throws IOException {
        String line;
        StringBuilder message = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) message.append(line);
            bufferedReader.close();
        } catch (IOException ex) {
            textboxStackTrace(ex);
//            write0ToSingletonFileAndClose();
        }
        return message.toString();
    }
    public static void setLookAndFeelOfGUIToNimbusStyle() throws IOException {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    UIManager.setLookAndFeel(info.getClassName());
                } catch (ClassNotFoundException | IllegalAccessException | UnsupportedLookAndFeelException | InstantiationException ex) {
                    textboxStackTrace(ex);
                }
                break;
            }
        }
    }
    public static void textboxStackTrace(Throwable ex) throws IOException {
        setLookAndFeelOfGUIToNimbusStyle();
        String fullExceptionType=ex.toString();
        String exceptionType = fullExceptionType.substring(fullExceptionType.lastIndexOf(".")+1);
        String aVsAn;
        char ch=exceptionType.charAt(0);
        if(ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U') {aVsAn="An";} else {aVsAn="A";}
        StringWriter stackTraceWriter = new StringWriter();
        ex.printStackTrace(new PrintWriter(stackTraceWriter));
        JTextArea textArea = new JTextArea(aVsAn+" "+exceptionType+" error has occured. Please see an administrator about the following error message:\n\n"+ stackTraceWriter.toString());
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        scrollPane.setPreferredSize(new Dimension(500, 200));
        Font font = new Font("Calibri", Font.BOLD, 18);
        textArea.setFont(font);
        JOptionPane.showMessageDialog(null,scrollPane,"Error", JOptionPane.ERROR_MESSAGE);
    }
    public static void setMp3AlbumArt(File SourceFile, File file) throws Exception {
        try {
                MP3File musicFile = (MP3File) AudioFileIO.read(file);
                Tag tag = musicFile.getTag();
                if (tag != null) {
                    Artwork artwork = null;
                    try {
                        artwork = ArtworkFactory.createArtworkFromFile(SourceFile);
                    } catch (IOException e) {
                        textboxStackTrace(e);
                    }
                    if (artwork != null) {
                        tag.deleteArtworkField();
                        tag.setField(artwork);
                        musicFile.setTag(tag);
                        musicFile.commit();
                    } else {
                        tag.addField(artwork);
                        tag.setField(artwork);
                        musicFile.setTag(tag);
                        musicFile.commit();
                    }
                    musicFile.commit();
                }
        } catch (CannotReadException | IOException | TagException
                | ReadOnlyFileException | InvalidAudioFrameException e) {
            textboxStackTrace(e);
        }
    }
}
