package parshaTagger

import org.jaudiotagger.audio.AudioFileIO
import org.jaudiotagger.audio.mp3.MP3File
import org.jaudiotagger.tag.FieldKey
import java.io.File

//This version was the fully working one from 6/23/2020 ~10:00 PM
fun main() {
    println(rejects)
    println()
    val listOfMp3s: MutableList<File> = mutableListOf()
    val files = File(System.getProperty("user.dir")).listFiles() ?: arrayOf(File(""))
    var thereWereNoFilesInDirectory = false
    thereWereNoFilesInDirectory = findMP3sAndAddThemToListOfMp3s(files, thereWereNoFilesInDirectory, listOfMp3s)
    if (thereWereNoFilesInDirectory) TODO("There were no files in directory. Make sure to implement a message saying so.")

    processShiurim@ for (file in listOfMp3s) {


        val f = AudioFileIO.read(file) as MP3File
        val tag = f.tag
        val title = tag.getFirst(FieldKey.TITLE)

        //Set album to correct parsha or add to rejects
        if (getParshaSimple_WithoutDoubles(title, dontPrintToConsole = true) != null) tag.setField(FieldKey.ALBUM, getParsha(title))
        else rejects[title] = "No Recognized Parsha Found"
        getParshaSimple_WithoutDoubles(title, dontPrintToConsole = false/*just to satisfy Intellij from telling me "Value always true"*/)
//        TODO("Insert here: code to look for year, and set Fieldkey.CONDUCTOR to 'Parsha \$year' and FieldKey.YEAR to year")
        f.commit()
    }
    println()
    println(rejects)
}

private fun findMP3sAndAddThemToListOfMp3s(files: Array<File>, thereWereNoFilesInDirectory: Boolean, listOfMp3s: MutableList<File>): Boolean {
    /*
    @returns a side effect of adding files to listOfMp3s, and explicitly returns true if there were no files and false if there were files
    */
    var thereWereNoFilesInDirectory1 = thereWereNoFilesInDirectory
    for (file in files) {
        if (file.path == "") {
            thereWereNoFilesInDirectory1 = true
            println("Empty")
            break
        }
        if (!file.isFile) continue
        val bits = file.name.split("\\.".toRegex()).toTypedArray()
        val endsInMp3 = bits[bits.size - 1].equals("mp3", ignoreCase = true)
        if (endsInMp3) listOfMp3s.add(file)
    }
    return thereWereNoFilesInDirectory1
}

private fun getParshaSimple_WithoutDoubles(givenShiurTitle: String, dontPrintToConsole: Boolean): String? {
    var capitalizedShiurTitle = ""
    givenShiurTitle.split(" ", ",", "-", "_", ";").forEach { capitalizedShiurTitle += it.capitalize() + " " }
    if (!dontPrintToConsole) {
        println(capitalizedShiurTitle)
        println()
    }
    var properParshaName = ""//this is what the album should correctly be
    var matchFound = false

    outerLoop@
    for ((listOfPossibleSpellings, mapOfPossibleSpellingToCorrectSpelling) in mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpelling) {
        for (spelling in listOfPossibleSpellings) {
            if (capitalizedShiurTitle.contains(spelling)/*if there is a recognized parsha name in the title*/) {
                matchFound = true
                properParshaName = mapOfPossibleSpellingToCorrectSpelling[spelling].toString()
                if (!dontPrintToConsole) {
                    println("Proper spelling is: ${mapOfPossibleSpellingToCorrectSpelling[spelling]}")
                    println()
                }
                break@outerLoop
            }
        }
    }
    return if (!matchFound) null else properParshaName
}

private fun getParsha(givenShiurTitle: String): String? {
    var capitalizedShiurTitle = ""
    givenShiurTitle.split(" ", ",", "-", "_", ";").forEach { capitalizedShiurTitle += it.capitalize() + " " }
    var properParshaName = ""//this is what the album should correctly be
    var matchFound = false

    outerLoop@
    for ((listOfPossibleSpellings, mapOfPossibleSpellingToCorrectSpelling) in mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpelling) {
        for (spelling in listOfPossibleSpellings) {
            if (capitalizedShiurTitle.contains(spelling)/*if there is a recognized parsha name in the title*/) {
                matchFound = true
                properParshaName = mapOfPossibleSpellingToCorrectSpelling[spelling].toString()
                break@outerLoop
            }
        }
    }
    return if (!matchFound) null else properParshaName
}