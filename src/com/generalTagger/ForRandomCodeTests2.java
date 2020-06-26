package com.generalTagger;

import javax.swing.*;
import java.io.IOException;

import static com.generalTagger.GeneralTaggerJava.setLookAndFeelOfGUIToNimbusStyle;

public class ForRandomCodeTests2 {
    public static void main(String[] args) throws IOException {
//        GeneralTaggerJava b = new GeneralTaggerJava();
//       int reply1 = b.textbox("There are no .mp3 files in the current folder. Would you like to run the upload script in case any files got stuck in the upload process the last time the script was run and have not yet been uploaded? You can also run it to simply to update the site after a change.", "No Files Found");
//        System.out.println(reply1);
        setLookAndFeelOfGUIToNimbusStyle();
        JOptionPane.showMessageDialog(null,"All rejected files will be left in the Rejected folder. You can find them later in the folder located at C:\\TD_Library\\validate_process\\Rejected .");

    }
}
