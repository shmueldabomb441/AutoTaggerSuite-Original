package parshaTagger

//experimental and currenly non-functional attempt at using list of lists of possible spellings
fun main() {
    //Local Knowledge: Map<PossibleSpellings, Actual Spelling>//use listOfPossibleSpellings.associateWith{actualSpellings}
    val shiurTitle = "Parshas  5780-Beha'alotcha Finding Your Potential In A Chaotic World "
    val actualSpellings = listOf("Beha'alosicha","Bereishis")
    val flattenedListOfPossibleSpellings = listOf(listOf("Beha'alotcha", "Biha'alotcha", "Biha'aloticha"),listOf("Bireishis","Bereishis","Baraishis","Biraishis")).flatten()
    val listOfPossibleSpellings = listOf(listOf("Beha'alotcha", "Biha'alotcha", "Biha'aloticha"),listOf("Bireishis","Bereishis","Baraishis","Biraishis"))
    val correctSpelling = listOfPossibleSpellings.associateWith {
        actualSpellings
    }
    var parshaName = ""
    for (word in shiurTitle.split(" ", "-","_")) if (/*correctSpelling.containsKey(word)*//*<--not tested yet; tested version-->*/ flattenedListOfPossibleSpellings.indexOf(word) != -1) {
        if (parshaName != null) {
//            parshaName = correctSpelling[/*this needs to be a two-dimensional index request. Consider the possibility of inseting a function in the first index request(which gets the list of parsha spellings) which will calculate which list to find the word in(i.e. which list to start the second index request in to search for the word) */0][word]
        }
    }
    println(parshaName)
    println(timesInvoked)
    //Input: shiurim: possessing title, lacking album, series, and year; Speaker; Year (if ubiquitous across all input-ed shiurim)
    //Output: shiurim: possessing album (e.g. "Ki Setzei") and series (e.g. "Parsha 5772") and Year (e.g. "5772")

    //Specifications:
    //If two occurrences of 4-digit numbers {"(57|19|20)\d\d".toRegex()---(##e.g.5775),(##e.g.1994)(##e.g.2017)} or two parsha names are found in the title, add said title to list of shiurim which ParshaTagger was unable to determine proper series for and print the list of said shiurim upon completion and state reason
    //If no parsha is found, add it to ^ list and state reason
    //If 4-digit number found in title is different than year supplied as input, add to ^ list and state reason
    //Figure out what to do about double parshiyos
    //If rejection reasons contain "No recognized spelling of any parsha name in title", when the popupp at the end displays, add button to display list of recognized spellings of parsha names

//    Order of Operations:
//    1. Walk the current folder for shiurim
//    2. analyzeShiur@For every shiur, read the title
//    3. Determine if the shiur contains the name of a parsha:
//          a. if yes,
//                i. determine if the shiur contains a second name of a parsha
//                       a.
//               ii. set the album to the correct spelling of the current parsha
//              iii. search the title for "(57|19|20)\d\d"
//               iv. determine if year was given in the file:
//                       1. if yes,
//                          a. determine if match was found for ii.
//                              i. if yes,
//                                  1. add shiur to list of rejects with the reason, "date in title and date in file"
//                                  2. move on to next shiur(i.e. break@analyzeShiur)
//                          a. set conductor to "Parsha $year"
//                          b. set year to year
//                       2. if no,
//                          a.
//                              i. if match was found,
//                                  1. set conductor to "Parsha $match"
//                                  2. set year to match
}

fun getNumbers(): List<Int> {
    timesInvoked++
    return listOf(1, 7, 19, 21, 45)

}

private fun String.split1(s: String): List<String> {
    timesInvoked++
    return this.split(s)

}
