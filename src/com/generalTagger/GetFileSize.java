package com.generalTagger;

import java.io.File;

public class GetFileSize {
    static final String FILE_NAME = "/Users/pankaj/Downloads/file.pdf";

    public static void main(String[] args) {
      //  File file = new File(FILE_NAME);
       /// if (!file.exists() || !file.isFile()) return;

    }

    public static long MebiBytes(File file) {
        return file.length() / 1048576;
    }
//public static long SizeOfRandomShiur(File file){return file.length()/(1024*1024)}
    public static long KiloBytes(File file) {
        return file.length() / 1024;
    }

    public static long Bytes(File file) {
        return file.length();
    }
}
/*         File[] files = new File(System.getProperty("user.dir")).listFiles();
        int mp3Counter = 0;
for (File file : files) {
                if (!file.isFile()) continue;
                String[] bits = file.getName().split("\\.");
                boolean endsInMp3 = bits[bits.length - 1].equalsIgnoreCase("mp3");
                if (mp3Counter > 0 && bits.length > 0 && endsInMp3) {*/
