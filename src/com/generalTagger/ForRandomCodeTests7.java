package com.generalTagger;

//import com.sun.javafx.image.impl.General;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.MissingFormatWidthException;

public class ForRandomCodeTests7 {
    public static void main(String[] args) throws IOException {
        MissingFormatWidthException e = new MissingFormatWidthException("s");
        FileNotFoundException ex = new FileNotFoundException();
        String fullExceptionType=e.toString();
        String exceptionType = fullExceptionType.substring(fullExceptionType.lastIndexOf(".")+1);
        System.out.println(fullExceptionType+" "+fullExceptionType.lastIndexOf("."));
        System.out.println(exceptionType);
        System.out.println(exceptionType.charAt(0));
        GeneralTaggerJava a= new GeneralTaggerJava();
        a.textboxStackTrace(e);
        a.textboxStackTrace(ex);
        /*try{
            throw e;
        } catch (IOException ex) {
            ex.printStackTrace();
        }*/
    }
}
