package com.company

import java.io.FileWriter
import java.io.Writer

class Main {

    fun main(){
        try {
            val a = GeneralTagger()
            a.main()
        } catch (ex: Throwable) {
            val a = GeneralTagger()
            a.textboxStackTrace(ex)
            val fileWriter: Writer = FileWriter("C:\\PHPTest\\TDProccess.TDPush.txt", false)
            fileWriter.write("0 \n")
            fileWriter.close()
        }
    }
}