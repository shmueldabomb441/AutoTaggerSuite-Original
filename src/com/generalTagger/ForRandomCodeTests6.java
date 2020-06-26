package com.generalTagger;

import javax.swing.*;
import java.awt.*;
import java.io.*;

import static com.generalTagger.GeneralTaggerJava.*;
import static com.generalTagger.ForRandomCodeTests3.readRejectedFile;

public class ForRandomCodeTests6 {
    public static <e> void main(String[] args) throws IOException {
        File[] c = new File[0];
        File[] d = new File[0];
//textbox("MessageWith","title");
File[] before = new File[0];
        File[] after= new File[0];

        PrintStream ps=null;
        String firstMessageWithoutAssociatedFiles = 4 + " files were rejected by the system for the following reason(s): \n\n" + readRejectedFile(ps, "no") + "\n\nDo you want to move the rejected files back to their original folder (" + "sourceFolder" + ") so that they can be corrected and reprocessed? If you do so, feel free to delete the files which the system indicated were a duplicate of a file already uploaded (by prepending \"DUPLICATE-UPDATED\" to their filename). Files with \"DUPLICATE-DOUBLE-CATEGORY\" prepended to their title were rejected because they have two categories in their category tag, and those two categories are different than the categor[y](ies) of the version of the file which was previously uploaded. Click \"Yes\" to move the files back to their original folder, and \"No\" to leave them in the Rejected folder.";
        String firstMessageWithAssociatedFiles = 4 + " files were rejected by the system for the following reason(s): \n\n" + readRejectedFile(ps, "yes") + "\n\nDo you want to move the rejected files back to their original folder (" + "sourceFolder "+ ") so that they can be corrected and reprocessed? If you do so, feel free to delete the files which the system indicated were a duplicate of a file already uploaded (by prepending \"DUPLICATE-UPDATED\" to their filename). Files with \"DUPLICATE-DOUBLE-CATEGORY\" prepended to their title were rejected because they have two categories in their category tag, and those two categories are different than the categor[y](ies) of the version of the file which was previously uploaded. Click \"Yes\" to move the files back to their original folder, and \"No\" to leave them in the Rejected folder.";
        final JPanel panel = new JPanel();
        setLookAndFeelOfGUIToNimbusStyle();
        JTextArea textArea = new JTextArea("All files were rejected for the following reason(s): \n\n" + readRejectedFile(ps, "no") + "They will now be moved back to their original folder(" + "sourceFolder" + "). Please try reformatting them (adjusting the input files (e.g. Speaker.txt, etc., and running AutoTagger again. If any files now contain \"DUPLICATE\" in their title, feel free to delete them, as they have previously been uploaded to the database.");
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        Font font = new Font("Calibri", Font.BOLD, 18);
        textArea.setFont(font);
        scrollPane.setPreferredSize(new Dimension(500, 200));
//        JOptionPane.showMessageDialog(panel, scrollPane, "All Files Rejected", JOptionPane.ERROR_MESSAGE);
        GeneralTaggerJava a=new GeneralTaggerJava();
//        a.textbox("There are no .mp3 files in the current folder. Would you like to run the upload script in case any files got stuck in the upload process and have not yet been uploaded, or simply to update the site after a change? ","No Files Found");
        IOException ex = new IOException();
        try{throw ex;}
        catch(IOException ea){
        a.textboxStackTrace(ea);}
       }
    public static int textbox(String message, String title) throws IOException {
        setLookAndFeelOfGUIToNimbusStyle();
        JTextArea textArea = new JTextArea(String.valueOf(message));
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        Font font = new Font("Calibri", Font.PLAIN, 18);
        textArea.setFont(font);
        scrollPane.setPreferredSize(new Dimension(500, 200));
//        int reply = JOptionPane.showConfirmDialog(null, scrollPane, title, JOptionPane.YES_NO_OPTION);
        Object[] buttons =  {"Yes","No"};
        int rc = JOptionPane.showOptionDialog(null, scrollPane, title, JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, buttons, null);
        return rc;
    }


    public static int textbox(File[] before, File[] after, String messageWithoutAssociatedFiles, String messageWithAssociatedFiles, String title) throws IOException {
        setLookAndFeelOfGUIToNimbusStyle();
        JTextArea textArea = new JTextArea(String.valueOf(messageWithoutAssociatedFiles));
        JTextArea textArea1 = new JTextArea(String.valueOf(messageWithAssociatedFiles));
        JScrollPane scrollPane = new JScrollPane(textArea);
        JScrollPane scrollPane1 = new JScrollPane(textArea1);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        Font font = new Font("Calibri", Font.BOLD, 17);
        textArea.setFont(font);
        scrollPane.setPreferredSize(new Dimension(500, 200));
        textArea1.setLineWrap(true);
        textArea1.setWrapStyleWord(true);
        textArea1.setEditable(false);
        textArea1.setFont(font);
        scrollPane1.setPreferredSize(new Dimension(500, 200));
//        int reply = JOptionPane.showConfirmDialog(null, scrollPane, title, JOptionPane.YES_NO_OPTION);
        Object[] buttons =  {"Show Files","Yes","No"};
        Object[] buttons1 = {"Don't Show Files","Yes","No"};
        int rc = 3;
        do {
            rc = JOptionPane.showOptionDialog(null, scrollPane, title, JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, buttons, null);
            if (rc == 0) {
                //TODO figuire this out so that the line below this one shows the reasons for rejection along with the associated rejected file(i already have a method for that)
                rc= JOptionPane.showOptionDialog(null, scrollPane1, title, JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, null, buttons1, null);
            }
            GeneralTaggerJava a = new GeneralTaggerJava();
            if(rc==1) a.moveRejectedFilesBackToOrigin(before, after);
            if(rc==2){
                String areYouSure = "Are you sure you do not want to move the rejected files back to their original folder (" + "sourceFolder" + ")? Click \"Yes\" to leave them where they are or click \"No\" to move them back to their original folder. If you decide to leave them where they are, you can always find them in the folder located at C:\\TD_Library\\validate_process\\Rejected and deal with them later. This folder can be accessed by either copying and pasting its location as it is found in the previous sentence into the search bar in Windows Explorer(the built-in program the Windows user uses for navigating through folders on the computer), by typing in the address into the Windows Explorer search bar exactly as it is found in the previous sentence, or by manually following the file path, starting from the C:\\ drive and continuing through the folder titled \"TD_Library\", etc. \n\nClick \"Yes\" to leave the files where they are, or click \"No\" to move the files back to their original folder.\n";
                //  int reply1 = JOptionPane.showConfirmDialog(null, "Are you sure you do not want to move the rejected files back to their original folder ("+ sourceFolder+")?\n Click \"Yes\" to leave them where they are or click \"No\" to move them to their original folder. If you decide to leave them where they are, you can always find them in the folder located at "+rejectedFolderLocation+" and dealt with later. This folder can be accessed by either typing its location exactly as found in the previous sentence into the search bar in Windows Explorer(the built-in program Windows uses for navigating through folders on the computer) or by manually following the path starting from the C:\\ drive and continuing to the ______________ folder. Click \"No\" to move the shiurim back to their original folder.", "title", JOptionPane.YES_NO_OPTION);
                JOptionPane.showOptionDialog(null,areYouSure,title,JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE,null,null,null);
//                JOptionPane.showMessageDialog(null, "GOODBYE");
                if (textbox(areYouSure,"Files Rejected") == JOptionPane.YES_OPTION) a.moveRejectedFilesBackToOrigin(before, after);
//                textbox(amountofFilesRejected + " shiurim have been rejected by the system. This either means that they have already been uploaded or that they were improperly formatted. You can find the shiurim in question at the top of the folder C:\\TD_Library\\validate_process\\Rejected. The reason for their rejection will be appended to their title in the form of one or two question marks, or \"DUPLICATE-UPDATED-(ShiurID# already in database)\". You can also contact ssternbach@torahdownloads.com or nmond@torahdownloads.com for help.", "Error");


                //if(numberOfRejectedShiurim==mp3Counter/*i.e. if all of the shiurim were rejected*/) /*then: move them back to the origin folder, and make a window saying that all of the shiurim were rejected, please try again.*/
//TODO add code to tell why the shiurim were rejected(whether the new shiurim added to REJECTED have one question mark in their title(what does that mean?), 2 question marks(what does that mean), or whether rejectedShiurTitle.contains("DUPLICATE")), i.e. whether it was rejected because the category was not written correctly, the speaker name was not written correctly, or the shiur was already uploaded
//TODO and add code to move those shiurim^^^^^ back to the origin folder(where they came from/where AutoTagger.jar finds itself) and say"Try formatting them again again."
            }
        } while (rc == 0);
//        return reply;
        return rc;
    }
}
