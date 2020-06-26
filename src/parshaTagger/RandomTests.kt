package parshaTagger

import java.util.regex.Matcher
import java.util.regex.Pattern

fun main() {

    val year = "5780"
    val title = "Behar 5780 1927"
    //Don't know if this finds the amount of matches of regex in title: "(57|19|20)\\d\\d".toRegex().findAll(title).toList().size>1
    println("(57|19|20)\\d\\d".toRegex().findAll(title).toList().size>1)
    val regexForYear = "(57|19|20)\\d\\d".toRegex()
    val numberOfMatchesInTitle = regexForYear.findAll(title).toList().size
    val indexOfMatchesInTitle = indexOf(Pattern.compile(regexForYear.toString()), title)
    println(regexForYear.find(title)?.value)
    println(indexOfMatchesInTitle)
    println(numberOfMatchesInTitle)
    println()
    regexForYear.findAll(title).forEach{println(it.value)}
    val datesFound= mutableListOf<String>()
    regexForYear.findAll(title).forEach{datesFound+=it.value}
    println("Two Or More Years In Title: $datesFound. Unable To Determine Correct Year.")
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
fun indexOf(pattern: Pattern, s: String?): Int {
    val matcher: Matcher = pattern.matcher(s)
    return if (matcher.find()) matcher.start() else -1
}