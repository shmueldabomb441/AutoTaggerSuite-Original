package parshaTagger

fun main() {
    //Local Knowledge: Map<PossibleSpellings, Actual Spelling>//use listOfPossibleSpellings.associateWith{actualSpellings}
    //listOfPossibleSpellings must contain the correct spelling/actualSpelling. Instead of inserting the actual spelling in the list as a string, put the variable name in the list so that if you need to change the actual spelling(e.g. they change the spelling on the website in the future) it will accomodate accordingly and the person will not need to know to add the spelling
    val shiurTitle = "Parshas  5780-Beha'alotcha Finding Your Potential In A Chaotic World"

    val actualSpellings36 = "Beha'aloscha"
    val listOfPossibleSpellings36 = listOf(
            "Bihaaloscha", "Behaaloscha",
            "Biha'aloscha", "Beha'aloscha",
            "Bihaalos'cha", "Behaalos'cha",
            "Biha'alos'cha", "Beha'alos'cha",
            "Bihaloscha", "Behaloscha",
            "Biha'loscha", "Beha'loscha",
            "Bihalos'cha", "Behalos'cha",
            "Biha'los'cha", "Beha'los'cha",
            "Bihaaloschah", "Behaaloschah",
            "Biha'aloschah", "Beha'aloschah",
            "Bihaalos'chah", "Behaalos'chah",
            "Biha'alos'chah", "Beha'alos'chah",
            "Bihaloschah", "Behaloschah",
            "Biha'loschah", "Beha'loschah",
            "Bihalos'chah", "Behalos'chah",
            "Biha'los'chah", "Beha'los'chah",
            "Bihaalowscha", "Behaalowscha",
            "Biha'alowscha", "Beha'alowscha",
            "Bihaalows'cha", "Behaalows'cha",
            "Biha'alows'cha", "Beha'alows'cha",
            "Bihalowscha", "Behalowscha",
            "Biha'lowscha", "Beha'lowscha",
            "Bihalows'cha", "Behalows'cha",
            "Biha'lows'cha", "Beha'lows'cha",
            "Bihaalowschah", "Behaalowschah",
            "Biha'alowschah", "Beha'alowschah",
            "Bihaalows'chah", "Behaalows'chah",
            "Biha'alows'chah", "Beha'alows'chah",
            "Bihalowschah", "Behalowschah",
            "Biha'lowschah", "Beha'lowschah",
            "Bihalows'chah", "Behalows'chah",
            "Biha'lows'chah", "Beha'lows'chah",
            "Bihaalohscha", "Behaalohscha",
            "Biha'alohscha", "Beha'alohscha",
            "Bihaalohs'cha", "Behaalohs'cha",
            "Biha'alohs'cha", "Beha'alohs'cha",
            "Bihalohscha", "Behalohscha",
            "Biha'lohscha", "Beha'lohscha",
            "Bihalohs'cha", "Behalohs'cha",
            "Biha'lohs'cha", "Beha'lohs'cha",
            "Bihaalohschah", "Behaalohschah",
            "Biha'alohschah", "Beha'alohschah",
            "Bihaalohs'chah", "Behaalohs'chah", "Biha'alohs'chah", "Beha'alohs'chah", "Bihalohschah", "Behalohschah", "Biha'lohschah", "Beha'lohschah", "Bihalohs'chah", "Behalohs'chah", "Biha'lohs'chah", "Beha'lohs'chah", "Bihaalosicha", "Biha'alosicha", "Behaalosicha", "Beha'alosicha", "Bihalosicha", "Behalosicha", "Biha'losicha", "Beha'losicha", "Bihaalosichah", "Biha'alosichah", "Behaalosichah", "Beha'alosichah", "Bihalosichah", "Behalosichah", "Biha'losichah", "Beha'losichah", "Bihaalowsicha", "Behaalowsicha", "Biha'alowsicha", "Beha'alowsicha", "Bihalowsicha", "Behalowsicha", "Biha'lowsicha", "Beha'lowsicha", "Bihaalowsichah", "Behaalowsichah", "Biha'alowsichah", "Beha'alowsichah", "Bihalowsichah", "Behalowsichah", "Biha'lowsichah", "Beha'lowsichah", "Bihaalohsicha", "Behaalohsicha", "Biha'alohsicha", "Beha'alohsicha", "Bihalohsicha", "Behalohsicha", "Biha'lohsicha", "Beha'lohsicha", "Bihaalohsichah", "Biha'alohsichah", "Behaalohsichah", "Beha'alohsichah", "Bihalohsichah", "Behalohsichah", "Biha'lohsichah", "Beha'lohsichah", "Bihaalotcha", "Behaalotcha", "Biha'alotcha", "Beha'alotcha", "Bihaalot'cha", "Behaalot'cha", "Biha'alot'cha", "Beha'alot'cha", "Bihalotcha", "Behalotcha", "Biha'lotcha", "Beha'lotcha", "Bihalot'cha", "Behalot'cha", "Biha'lot'cha", "Beha'lot'cha", "Bihaalotchah", "Behaalotchah", "Biha'alotchah", "Beha'alotchah", "Bihaalot'chah", "Behaalot'chah", "Biha'alot'chah", "Beha'alot'chah", "Bihalotchah", "Behalotchah", "Biha'lotchah", "Beha'lotchah", "Bihalot'chah", "Behalot'chah", "Biha'lot'chah", "Beha'lot'chah", "Bihaalowtcha", "Behaalowtcha", "Biha'alowtcha", "Beha'alowtcha", "Bihaalowt'cha", "Behaalowt'cha", "Biha'alowt'cha", "Beha'alowt'cha", "Bihalowtcha", "Behalowtcha", "Biha'lowtcha", "Beha'lowtcha", "Bihalowt'cha", "Behalowt'cha", "Biha'lowt'cha", "Beha'lowt'cha", "Bihaalowtchah", "Behaalowtchah", "Biha'alowtchah", "Beha'alowtchah", "Bihaalowt'chah", "Behaalowt'chah", "Biha'alowt'chah", "Beha'alowt'chah", "Bihalowtchah", "Behalowtchah", "Biha'lowtchah", "Beha'lowtchah", "Bihalowt'chah", "Behalowt'chah", "Biha'lowt'chah", "Beha'lowt'chah", "Bihaalohtcha", "Behaalohtcha", "Biha'alohtcha", "Beha'alohtcha", "Bihaaloht'cha", "Behaaloht'cha", "Biha'aloht'cha", "Beha'aloht'cha", "Bihalohtcha", "Behalohtcha", "Biha'lohtcha", "Beha'lohtcha", "Bihaloht'cha", "Behaloht'cha", "Biha'loht'cha", "Beha'loht'cha", "Bihaalohtchah", "Behaalohtchah", "Biha'alohtchah", "Beha'alohtchah", "Bihaaloht'chah", "Behaaloht'chah", "Biha'aloht'chah", "Beha'aloht'chah", "Bihalohtchah", "Behalohtchah", "Biha'lohtchah", "Beha'lohtchah", "Bihaloht'chah", "Behaloht'chah", "Biha'loht'chah", "Beha'loht'chah", "Bihaaloticha", "Behaaloticha", "Biha'aloticha", "Beha'aloticha", "Bihaloticha", "Behaloticha", "Biha'loticha", "Beha'loticha", "Bihaalotichah", "Behaalotichah", "Biha'alotichah", "Beha'alotichah", "Bihalotichah", "Behalotichah", "Biha'lotichah", "Beha'lotichah", "Bihaalowticha", "Behaalowticha", "Biha'alowticha", "Beha'alowticha", "Bihalowticha", "Behalowticha", "Biha'lowticha", "Beha'lowticha", "Bihaalowtichah", "Behaalowtichah", "Biha'alowtichah", "Beha'alowtichah", "Bihalowtichah", "Behalowtichah", "Biha'lowtichah", "Beha'lowtichah", "Bihaalohticha", "Biha'alohticha", "Behaalohticha", "Beha'alohticha", "Bihalohticha", "Behalohticha", "Biha'lohticha", "Beha'lohticha", "Bihaalohtichah", "Biha'alohtichah", "Behaalohtichah", "Beha'alohtichah", "Bihalohtichah", "Behalohtichah", "Biha'lohtichah", "Beha'lohtichah")
    val correctSpelling36: Map<String, String> = listOfPossibleSpellings36.associateWith {
        actualSpellings36
    }

    var parshaName = ""
    for (word in shiurTitle.split(" ", "-", "_")) if (listOfPossibleSpellings36.indexOf(word) != -1) {
        parshaName = correctSpelling36[word].toString()
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

fun getNumbers1(): List<Int> {
    timesInvoked++
    return listOf(1, 7, 19, 21, 45)

}

fun String.split12(s: String): List<String> {
    timesInvoked++
    return this.split(s)

}