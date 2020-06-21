package com.GeneralTagger;

import java.io.*;

import static com.GeneralTagger.GeneralTaggerJava.getAllCurrentlyRunningProcesses;
import static com.GeneralTagger.GeneralTaggerJava.readBatchFile;

public class InitialAttemptAtSingleton {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\PHPTest\\TDProccess.TDPush.txt");
        String result  = getAllCurrentlyRunningProcesses();
        PrintStream ps=null;
        System.out.println(Integer.parseInt(readBatchFile(ps,"C:\\PHPTest\\TDProccess.TDPush.txt"))+1);
        int i=fr.read();
        if ((String.valueOf(i).equals("49"))) {
//            final JPanel panel = new JPanel();
//            if (result.contains("javaw.exe")) {JOptionPane.showMessageDialog(panel, "AutoTagger may currently be running in the background. Please wait for it to finish and then run again. If you think this message was displayed in error, see \"AutoTagger_is_Running Error.txt\" found in C:\\Users\\mglazer\\Desktop\\Consistent series (i.e. the parent folder) for further instructions.", "Error", JOptionPane.ERROR_MESSAGE);
//            System.exit(49);}
//            System.exit(49);
            System.out.println("1");
        }
        else if ((String.valueOf(i).equals("48"))){
            System.out.println("0");
        }
    }
}
