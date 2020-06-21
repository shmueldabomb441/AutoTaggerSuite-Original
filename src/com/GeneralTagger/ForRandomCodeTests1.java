package com.GeneralTagger;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class ForRandomCodeTests1 {
    public static void main(String[] args) throws IOException {
        //This code works in the following capacities:the show/don't show files works;Yes option-untested;no option-untested
        GeneralTaggerJava a = new GeneralTaggerJava();
        File[] after = new File[0];
        File[] before = new File[0];
        PrintStream ps=null;
        String firstMessageWithoutAssociatedFiles = /*amountofFilesRejected*/4 + " files were rejected by the system for the following reason(s): \n\n" + a.readRejectedFile("no") + "\n\nDo you want to move the rejected files back to their original folder (" + "sourceFolder" + ") so that they can be corrected and reprocessed? If you do so, feel free to delete the files which the system indicated were a duplicate of a file already uploaded (by prepending \"DUPLICATE-UPDATED\" to their filename). Files with \"DUPLICATE-DOUBLE-CATEGORY\" prepended to their title were rejected because they have two categories in their category tag, and those two categories are different than the categor[y](ies) of the version of the file which was previously uploaded. Click \"Yes\" to move the files back to their original folder, and \"No\" to leave them in the Rejected folder.";
        String firstMessageWithAssociatedFiles = /*amountofFilesRejected */4+ " files were rejected by the system for the following reason(s): \n\n" + a.readRejectedFile("yes") + "\n\nDo you want to move the rejected files back to their original folder (" + "sourceFolder" + ") so that they can be corrected and reprocessed? If you do so, feel free to delete the files which the system indicated were a duplicate of a file already uploaded (by prepending \"DUPLICATE-UPDATED\" to their filename). Files with \"DUPLICATE-DOUBLE-CATEGORY\" prepended to their title were rejected because they have two categories in their category tag, and those two categories are different than the categor[y](ies) of the version of the file which was previously uploaded. Click \"Yes\" to move the files back to their original folder, and \"No\" to leave them in the Rejected folder.";
        a.textbox(before,after,firstMessageWithoutAssociatedFiles,firstMessageWithAssociatedFiles,"Files Rejected");
    }
}
