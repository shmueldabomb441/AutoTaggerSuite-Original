package parshaTagger

import java.io.File

fun main() {
//    val x = mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpelling.toMutableMap()
//    println(containsSecondParsha1("RAL Mikeitz 5780 The First Rashi; The Nature of Being M'Zarez (From a Q & A on Corona for YGW Girls Division)", listOfPossibleSpellings10))
//    val y = mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpelling-

    val year = "5780"
    val title = "Behar"
    //Don't know if this finds the amount of matches of regex in title: "(57|19|20)\\d\\d".toRegex().findAll(title).toList().size>1
    println("(57|19|20)\\d\\d".toRegex().findAll(title).toList().size>1)
    val regexForYear = "(57|19|20)\\d\\d".toRegex()
    val numberOfMatchesInTitle = regexForYear.findAll(title).toList().size
    println(regexForYear.find(title)?.value)
    println(numberOfMatchesInTitle)
}

fun containsSecondParsha1(capitalizedShiurTitle: String, listOfPossibleSpellings: List<String>): String? {
    //Returns null if does not contain second parsha and returns actual name of parsha if contains parsha
    val mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpellingMinusTheAlreadyFoundParsha = mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpelling.toMutableMap()
    mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpellingMinusTheAlreadyFoundParsha.remove(listOfPossibleSpellings)

    return if
                   (
            getParsha(
                    capitalizedShiurTitle,
                    true,
                    mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpellingMinusTheAlreadyFoundParsha)
            == null
    ) null
    else getParsha(
            capitalizedShiurTitle,
            true,
            mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpellingMinusTheAlreadyFoundParsha)
}

fun versionOfGetParshaFromPreviouslyWorkingVersion1() {
    val givenShiurTitle = "parshas leich l'chah 5780-finding your Potential In A Chaotic World"
    var capitalizedShiurTitle = ""
    givenShiurTitle.split(" ", ",", "-", "_", ";").forEach { capitalizedShiurTitle += it.capitalize() + " " }
    println(capitalizedShiurTitle)
    var properParshaName = ""//this is what the album should correctly be
    var matchFound = false

    outerLoop@
    for ((listOfPossibleSpellings, correctSpelling) in mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpelling) {
        for (spelling in listOfPossibleSpellings) {
            if (capitalizedShiurTitle.contains(spelling)) {
                matchFound = true
                properParshaName = correctSpelling[spelling].toString()
                println("Proper spelling is: ${correctSpelling[spelling]}")
                break@outerLoop
            }
        }
    }
    if (!matchFound) println("Match not found.")
    println(properParshaName)
}