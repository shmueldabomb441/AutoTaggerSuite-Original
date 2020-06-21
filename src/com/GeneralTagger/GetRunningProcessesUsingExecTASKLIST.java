package com.GeneralTagger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetRunningProcessesUsingExecTASKLIST {
    public static void main(String[] args) throws IOException {
//        if(getRunningFiles().contains("cmd.exe")){
//            System.out.println("CMD is running");
//        }
// else{
//            System.out.println("CMD is NOT running");
        getRunningFiles();
        System.out.println(getRunningFiles(""));
//        }
//        Runtime.getRuntime().exec("taskkill /F /IM taskmgr.exe");
    }

    public static void getRunningFiles() throws IOException {
        Process p = Runtime.getRuntime().exec("TASKLIST");
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        StringBuilder processes = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            System.out.println((line));
        }

    }

    public static String getRunningFiles(String x) throws IOException {
        Process p = Runtime.getRuntime().exec("TASKLIST");
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        StringBuilder processes = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            processes.append(line);
        }
        return processes.toString();
    }
}
