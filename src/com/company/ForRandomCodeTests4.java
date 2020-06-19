package com.company;

import javax.swing.*;
import java.io.IOException;
import java.io.PrintStream;

import static com.company.GeneralTaggerJava.setLookAndFeelOfGUIToNimbusStyle;
import static com.company.ForRandomCodeTests3.readRejectedFile;

public class ForRandomCodeTests4 {
    public static void main(String[] args) throws IOException {
        PrintStream ps = null;
        setLookAndFeelOfGUIToNimbusStyle();
        JOptionPane.showMessageDialog(null,String.valueOf(readRejectedFile(ps,"title")),"List of files rejected",JOptionPane.ERROR_MESSAGE);
//                String.valueOf(readRejectedFile(ps,"title")),"List of files rejected");
    }
}
