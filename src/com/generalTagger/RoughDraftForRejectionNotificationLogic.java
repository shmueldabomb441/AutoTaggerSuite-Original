package com.generalTagger;


import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.io.PrintStream;

import static com.generalTagger.GeneralTaggerJava.setLookAndFeelOfGUIToNimbusStyle;
import static com.generalTagger.ForRandomCodeTests3.longmessage;

public class RoughDraftForRejectionNotificationLogic {
    static String title = "Files Rejected";
//    public static Button b = new Button("Show Rejected Files List");

    public static void main(String[] args) throws IOException {
        setLookAndFeelOfGUIToNimbusStyle();
        JTextArea textArea = new JTextArea(String.valueOf(longmessage));
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        scrollPane.setPreferredSize(new Dimension(500, 200));
//            int reply = JOptionPane.showConfirmDialog(null, scrollPane, title, JOptionPane.YES_NO_OPTION);
        ImageIcon icon = new ImageIcon("C:\\PHPTest\\listImage.png");
        String yes = "Yes";
        String no = "No";
//        Button b = new Button("Show Rejected Files List");
        PrintStream ps = null;

//        b.setOnAction(e -> readRejectedFile(ps,"title"));
        String[] buttons = {"Show Files",/*icon*/yes, no};
        String[] buttons1 = {"Don't Show Files",/*icon*/yes, no};
        int rc = 3;
        do {
            rc = JOptionPane.showOptionDialog(null, scrollPane, title, JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, buttons, null);
            if (rc == 0) {
                //TODO figuire this out so that the line below this one shows the reasons for rejection along with the associated rejected file(i already have a method for that)
              rc= JOptionPane.showOptionDialog(null, scrollPane, title, JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, buttons1, null);
            }
        } while (rc == 0) ;
       /* while(true){
//            int rc = JOptionPane.showOptionDialog(null, scrollPane, title, JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, buttons , buttons[2]);
            if (rc==0) {
                GeneralTaggerJava a = new GeneralTaggerJava();
                a.readRejectedFile(ps,"title");
                continue;//TODO make this work so that if the user selects "see files" it will go back to the right place. In hindsight, i don't think that a while loop would be the right thing. i think more of just doing a one time script and then an if condition...anyways...gotta go now
            }
            else System.exit(1);*/

//            System.out.println("rc: "+rc);
//        System.out.println("reply: "+reply);

//        String firstMessage = 4 + " files were rejected by the system for the following reason(s): \n\n" + a.readRejectedFile(ps, "no") + "\n\nDo you want to move the rejected files back to their original folder (" + "Amud Yomi" + ") so that they can be corrected and reprocessed? Feel free to delete the files which the system indicated were a duplicate of a file already uploaded (by prepending \"DUPLICATE\" to their filename).";
//        int reply = a.textbox(firstMessage, "Files Rejected");
        }
    }
