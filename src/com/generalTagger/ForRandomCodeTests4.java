package com.generalTagger;

import javax.swing.*;
import java.io.IOException;
import java.io.PrintStream;

import static com.generalTagger.GeneralTaggerJava.setLookAndFeelOfGUIToNimbusStyle;
import static com.generalTagger.ForRandomCodeTests3.readRejectedFile;

public class ForRandomCodeTests4 {
    public static void main(String[] args) throws IOException {
        PrintStream ps = null;
        setLookAndFeelOfGUIToNimbusStyle();
        JOptionPane.showMessageDialog(null,String.valueOf(readRejectedFile(ps,"title")),"List of files rejected",JOptionPane.ERROR_MESSAGE);
//                String.valueOf(readRejectedFile(ps,"title")),"List of files rejected");
    }
}
