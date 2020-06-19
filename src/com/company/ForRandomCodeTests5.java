package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

import static com.company.GeneralTaggerJava.getAllCurrentlyRunningProcesses;

public class ForRandomCodeTests5 {
    public static void main(String[] args) throws IOException {
        PrintStream ps=null;
        try {
            String result = getAllCurrentlyRunningProcesses();
            System.out.println(result);        }
        catch(Throwable ex){
            GeneralTaggerJava a = new GeneralTaggerJava();
            a.textboxStackTrace(ex);
        }
        }
}
