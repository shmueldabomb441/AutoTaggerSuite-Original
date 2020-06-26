@file:Suppress("SpellCheckingInspection")
/*
*
* This is the REAL PARSHA tagger!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! It fulfills all of the requirements and specifications(except the one about a GUI)
*
* */
package parshaTagger

import java.io.File
import org.jaudiotagger.audio.AudioFileIO
import org.jaudiotagger.audio.mp3.MP3File
import org.jaudiotagger.tag.FieldKey
import java.util.regex.Pattern
import kotlin.system.exitProcess


//Local Knowledge: Map<PossibleSpellings, ActualSpelling>

//Input: shiurim: possessing title, lacking album, series, and year; Speaker; Year (if ubiquitous across all input-ed shiurim)

//Output: shiurim: possessing album (e.g. "Ki Setzei") and series (e.g. "Parsha 5772") and Year (e.g. "5772")

//Specifications:
//TAKENCAREOFIf two occurrences of 4-digit numbers {"(57|19|20)\d\d".toRegex()---(##e.g.5775),(##e.g.1994)(##e.g.2017)} or two parsha names are found in the title, add said title to list of shiurim which ParshaTagger was unable to determine proper series for and print the list of said shiurim upon completion and state reason
//TAKENCAREOFIf no parsha is found, add it to ^ list and state reason
//TAKENCAREOFIf 4-digit number found in title is different than year supplied as input, add to ^ list and state reason
//If rejection reasons contain "No recognized spelling of any parsha name in title", when the popupp at the end displays, add button to display list of recognized spellings of parsha names


//TODO add yeshivish spelling for all parshiyos
//TODO add chassidish spelling for all parshiyos?
//TODO add "q" in place of koof


var rejects: MutableMap<String, String> = mutableMapOf("Rejected shiur" to "Rejection Reason")


@Suppress("MemberVisibilityCanBePrivate")


fun main() {

    println()
    var year = File("${System.getProperty("user.dir")}\\Year.txt").readText()//Throughout the code I assume that this var is initialized with the year in file when checking for a date in the title and handling assignment based on what is found
    val speaker = File("${System.getProperty("user.dir")}\\Speaker.txt").readText()
    val listOfMp3s: MutableList<File> = mutableListOf()
    val files = File(System.getProperty("user.dir")).listFiles() ?: arrayOf(File(""))
    var thereWereNoFilesInDirectory = false
    thereWereNoFilesInDirectory = findMP3sAndAddThemToListOfMp3s(files, thereWereNoFilesInDirectory, listOfMp3s)
    if (thereWereNoFilesInDirectory) {
        println("There were no files in directory. Please try again...")
        exitProcess(666)
    }
    if (speaker == "") {
        println("There was no speaker provided. Please try again...")
        exitProcess(666)
    }
    processShiurim@ for (file in listOfMp3s) {


        val f = AudioFileIO.read(file) as MP3File
        val tag = f.tag
        val title = tag.getFirst(FieldKey.TITLE)

        //Set album to correct parsha or add to rejects
        val getParshaDontPrint = getParsha(title, dontPrintToConsole = true)
        if (getParshaDontPrint != null && getParshaDontPrint != ""/*<- I think this means that there was a recognized parsha but there was a problem (e.g. two parshiyos)*/)
            tag.setField(FieldKey.ALBUM, getParsha(title, dontPrintToConsole = false))
        else {
            if (title !in rejects) rejects[title] = "No Recognized Parsha Found."
            continue@processShiurim
        }

        checkForDate@ while (true) {
            val yearGivenInFile = year != ""
            //Don't know if this finds the amount of matches of regex in title: "(57|19|20)\\d\\d".toRegex().findAll(title).toList().size>1
            val regexForYear = "(57|19|20)\\d\\d".toRegex()
            val numberOfMatchesInTitle = regexForYear.findAll(title).toList().size

            if (numberOfMatchesInTitle == 0 && yearGivenInFile) break@checkForDate
            else if (numberOfMatchesInTitle == 0 && !yearGivenInFile) {
                rejects[title] = "Parsha Found In Title But No Date Given In File Nor In Title.";continue@processShiurim
            } else {
                val yearInTitle = regexForYear.find(title)!!.value
                if (numberOfMatchesInTitle == 1 && !yearGivenInFile) year = yearInTitle
                else if (numberOfMatchesInTitle == 1 && yearGivenInFile && yearInTitle == year/*if year in title and file are the same*/) break@checkForDate/*because year was already read from file*/
                else if (numberOfMatchesInTitle == 1 && yearGivenInFile && yearInTitle != year) {
                    rejects[title] = "Parsha Found In Title But Also Found Different Year In Title($yearInTitle) Than In File($year). Unable To Determine Correct Year."
                    continue@processShiurim
                } else if (numberOfMatchesInTitle > 1) {
                    /*there are 2+ dates in title*/
                    val datesFound = mutableListOf<String>()
                    regexForYear.findAll(title).forEach { datesFound += it.value }
                    rejects[title] = "Parsha Found In Title But Also Found Two Or More Years In Title: $datesFound. Unable To Determine Correct Year."
                    continue@processShiurim
                }
            }
            break@checkForDate
        }

        //If I am not mistaken, it would have only reached here if date was some number which "fit the bill" for being a date, so I took out check for if(year != "") before setting the tags to year, etc., and consequetently thereby deleting the tags which were presetn before the write.
        tag.setField(FieldKey.CONDUCTOR, "Parsha $year")
        tag.setField(FieldKey.YEAR, year)
        tag.setField(FieldKey.ARTIST, speaker)
        f.commit()
    }
    println()
    var counter = 0

    println()
    println()
    println("List Of Rejected Shiurim And Reasons For Rejection:")
    println()
    rejects.forEach {
        if(counter==1) {println();println()}
        println("${counter}a. ${it.key}")
        println("${counter}b. ${it.value}")
        println()
        counter++
    }
    println()
    println()
//    var properlyFormattedRejectsList = rejects.values.minus(rejects.values.elementAt(0)).minus(rejects.values.elementAt(1))
//    properlyFormattedRejectsList.forEach{it}
    println()
    println()
    println("Rejection Reasons List:")
    println()
    var counter1 = 1
     printReasons@for(it in rejects) {
         if(it.value=="Rejection Reason") continue@printReasons
         println("$counter1. ${it.value}")
         counter1++
    }
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

fun getParsha(givenShiurTitle: String, dontPrintToConsole: Boolean = false, mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpelling1: Map<List<String>, Map<String, String>> = mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpelling): String? {
    val lowerCaseShiurTitle = givenShiurTitle.toLowerCase()
    if (!dontPrintToConsole) {
        println(givenShiurTitle)
        println()
    }
    var properParshaName = ""//this is what the album should correctly be
    var matchFound = false

    outerLoop@
    for ((listOfPossibleSpellings, mapOfPossibleSpellingToCorrectSpelling) in mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpelling1) {
        for (spelling in listOfPossibleSpellings) {
            if (lowerCaseShiurTitle.contains("\\b$spelling\\b".toRegex())/*if there is a recognized parsha name in the title*/) {
                matchFound = true
                val actualSpelling = mapOfPossibleSpellingToCorrectSpelling.values.toList()[0]

                //Determine if there is a second parsha(and if both the first and second are double-parshiyos), and tag accordingly. Otherwise, it has two random parshiyos and add it to the rejects
                val secondParshaOrNull = containsSecondParsha(lowerCaseShiurTitle, listOfPossibleSpellings)
                if (secondParshaOrNull != null/*there is a second parsha*/) {
                    if (actualSpelling in doubleParshiyosList && secondParshaOrNull in doubleParshiyosList) {
                        properParshaName = doubleParshiyosMappedToDoubleParshiyosAsStringWithSemiColon()[actualSpelling].toString()
                    } else {
                        rejects[givenShiurTitle] = "Two Parshiyos In Title ($actualSpelling and $secondParshaOrNull). Unable To Determine Proper Category."
                        break@outerLoop
                    }


                } else properParshaName = actualSpelling

//                properParshaName = mapOfPossibleSpellingToCorrectSpelling[spelling].toString()
                if (!dontPrintToConsole) {
                    println("Proper spelling is: $properParshaName")
                    println()
                }
                break@outerLoop
            }
        }
    }
    return if (!matchFound) null else properParshaName
}

fun containsSecondParsha(capitalizedShiurTitle: String, listOfPossibleSpellings: List<String>): String? {
    //Returns null if does not contain second parsha and returns actual name of parsha if contains parsha
    val mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpellingMinusTheAlreadyFoundParsha = mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpelling.toMutableMap()
    mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpellingMinusTheAlreadyFoundParsha.remove(listOfPossibleSpellings)

    return if
                   (
            getParshaSimple_WithoutDoubles(
                    capitalizedShiurTitle,
                    true,
                    mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpellingMinusTheAlreadyFoundParsha
            )
            == null
    ) null
    else getParshaSimple_WithoutDoubles(
            capitalizedShiurTitle,
            true,
            mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpellingMinusTheAlreadyFoundParsha
    )
}

private fun getParshaSimple_WithoutDoubles(givenShiurTitle: String, dontPrintToConsole: Boolean, mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpelling1: Map<List<String>, Map<String, String>> = mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpelling): String? {
    val lowerCaseShiurTitle = givenShiurTitle.toLowerCase()
    if (!dontPrintToConsole) {
        println(givenShiurTitle)
        println()
    }
    var properParshaName = ""//this is what the album should correctly be
    var matchFound = false

    outerLoop@
    for ((listOfPossibleSpellings, mapOfPossibleSpellingToCorrectSpelling) in mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpelling1) {
        for (spelling in listOfPossibleSpellings) {
            if (lowerCaseShiurTitle.contains("\\b$spelling\\b".toRegex())/*if there is a recognized parsha name in the title*/) {
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
