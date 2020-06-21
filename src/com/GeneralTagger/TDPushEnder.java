package com.GeneralTagger;

import java.io.*;

import static com.GeneralTagger.GeneralTaggerJava.getAllCurrentlyRunningProcesses;

public class TDPushEnder {

    public TDPushEnder() throws IOException {
    }

    public static boolean isRunning(String process) {
        boolean found = false;
        try {
            File file = File.createTempFile("realhowto",".vbs");
            file.deleteOnExit();
            FileWriter fw = new java.io.FileWriter(file);

            String vbs = "Set WshShell = WScript.CreateObject(\"WScript.Shell\")\n"
                    + "Set locator = CreateObject(\"WbemScripting.SWbemLocator\")\n"
                    + "Set service = locator.ConnectServer()\n"
                    + "Set processes = service.ExecQuery _\n"
                    + " (\"select * from Win32_Process where name='" + process +"'\")\n"
                    + "For Each process in processes\n"
                    + "wscript.echo process.Name \n"
                    + "Next\n"
                    + "Set WSHShell = Nothing\n";

            fw.write(vbs);
            fw.close();
            Process p = Runtime.getRuntime().exec("cscript //NoLogo " + file.getPath());
            BufferedReader input =
                    new BufferedReader
                            (new InputStreamReader(p.getInputStream()));
            String line;
            line = input.readLine();
            if (line != null) {
                if (line.equals(process)) {
                    found = true;
                }
            }
            input.close();

        }
        catch(Exception e){
            e.printStackTrace();
        }
        return found;
    }


    String result= getAllCurrentlyRunningProcesses();
    String tdPushImageName="cmd.exe";
    String myDataSync = "MyDataSync.exe";
    public boolean tdPushIsStillRunning = result.contains("cmd.exe");
    public boolean myDataSyncIsStillRunning = result.contains(myDataSync);
    public void killTDPush() throws IOException {
            Runtime.getRuntime().exec("TASKKILL /IM " + tdPushImageName + " /T /F");
        Runtime.getRuntime().exec("TASKKILL /IM aws.exe /T");
    }
    public void killMyDataSync() throws IOException {
           while(myDataSyncIsStillRunning){ Runtime.getRuntime().exec("TASKKILL /IM " + myDataSync + " /T /F");} ;
        }
}