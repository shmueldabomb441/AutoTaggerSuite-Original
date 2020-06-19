package parshaTagger

fun main() {
    //Local Knowledge: Map<PossibleSpellings, Actual Spelling>//use listOfPossibleSpellings.associateWith{actualSpellings}

    //Input: shiurim: possessing title, lacking album, series, and year; Speaker; Year (if ubiquitous across all input-ed shiurim)

    //Output: shiurim: possessing album (e.g. "Ki Setzei") and series (e.g. "Parsha 5772") and Year (e.g. "5772")

    //Specifications:
    //If two occurrences of 4-digit numbers {"(57|19|20)\d\d".toRegex()---(##e.g.5775),(##e.g.1994)(##e.g.2017)} or two parsha names are found in the title, add said title to list of shiurim which ParshaTagger was unable to determine proper series for and print the list of said shiurim upon completion and state reason
    //If no parsha is found, add it to ^ list and state reason
    //If 4-digit number found in title is different than year supplied as input, add to ^ list and state reason
    //Figure out what to do about double parshiyos
    //If rejection reasons contain "No recognized spelling of any parsha name in title", when the popupp at the end displays, add button to display list of recognized spellings of parsha names

    //TODO listOfPossibleSpellings must contain the correct spelling/actualSpelling. Instead of inserting the actual spelling in the list as a string, put the variable name in the list so that if you need to change the actual spelling(e.g. they change the spelling on the website in the future) it will accomodate accordingly and the person will not need to know to add the spelling

    val givenShiurTitle = "Parshas  5780-Now'ach Finding Your Potential In A Chaotic World"
    var properParshaName = ""//this is what the album should correctly be


    val actualSpelling1 = "Bereishis"
    val listOfPossibleSpellings1 = listOf(


            "Biraishis", "Bireishis",
            "Beraishis", "Bereishis",

            "Biraishit", "Bireishit",
            "Beraishit", "Bereishit",

            "Biraishees", "Bireishees",
            "Beraishees", "Bereishees",
            "Biraisheet", "Bireisheet",
            "Beraisheet", "Bereisheet",


            "Buraishis", "Bureishis",
            "Buraishis", "Bureishis",

            "Buraishit", "Bureishit",
            "Buraishit", "Bureishit",

            "Buraishees", "Bureishees",
            "Buraishees", "Bureishees",
            "Buraisheet", "Bureisheet",
            "Buraisheet", "Bureisheet",


            "Boraishis", "Boreishis",
            "Boraishis", "Boreishis",

            "Boraishit", "Boreishit",
            "Boraishit", "Boreishit",

            "Boraishees", "Boreishees",
            "Boraishees", "Boreishees",
            "Boraisheet", "Boreisheet",
            "Boraisheet", "Boreisheet",


            "Baraishis", "Bareishis",
            "Baraishis", "Bareishis",

            "Baraishit", "Bareishit",
            "Baraishit", "Bareishit",

            "Baraishees", "Bareishees",
            "Baraishees", "Bareishees",
            "Baraisheet", "Bareisheet",
            "Baraisheet", "Bareisheet"
    )
    val correctSpelling1: Map<String, String> = listOfPossibleSpellings1.associateWith {
        actualSpelling1
    }
    val actualSpelling2 = "Noach"
    val listOfPossibleSpellings2 = listOf(
            "No'ach", "Now'ach",
            "Noach", "Nowach",
            "Noah", "Nowah",
            "Noakh", "Nowakh","Now'ach",

            "No'ach", "Noh'ach",
            "Noach", "Nohach",
            "Noah", "Nohah",
            "Noakh", "Nohakh"
    )
    val correctSpelling2: Map<String, String> = listOfPossibleSpellings2.associateWith {
        actualSpelling2
    }
    val actualSpelling3 = "Lech Lecha"
    val listOfPossibleSpellings3=listOf(
            "Leich Licha",
            "Lecha Licha",
            "Laich Licha",
            "Leich Lecha",
            "Laich Lecha",

            "Leikh Likha",
            "Lekha Likha",
            "Laikh Likha",
            "Leikh Lekha",
            "Laikh Lekha"
    )
    val correctSpelling3: Map<String, String> = listOfPossibleSpellings3.associateWith {
        actualSpelling3
    }

    val actualSpelling4="Vayeira"
    val listOfPossibleSpellings4=listOf(
            "Vayeirah",
            "Vayera",
            "Vayaira",
            "Vayerah",
            "Vayairah",
            "Vayeiruh",
            "Vayeru",
            "Vayairu",
            "Vayeruh",
            "Vayairuh"
    )
    val correctSpelling4: Map<String, String> = listOfPossibleSpellings4.associateWith {
        actualSpelling4
    }
    val actualSpelling5= "Chayei Sara"
    val listOfPossibleSpellings5 = listOf("")







    val actualSpelling36 = "Beha'aloscha"
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
        actualSpelling36
    }

    val listOfListsOfPossibleSpellings= listOf(

            listOfPossibleSpellings1,
            listOfPossibleSpellings2,
            listOfPossibleSpellings3,
            listOfPossibleSpellings4,
            listOfPossibleSpellings5,

            listOfPossibleSpellings36
    )

  val mapOfPossibleSpellingListToCorrectSpellingMap=mapOf(
          listOfPossibleSpellings1 to correctSpelling1,
          listOfPossibleSpellings2 to correctSpelling2,
          listOfPossibleSpellings3 to correctSpelling3,
          listOfPossibleSpellings4 to correctSpelling4,
          listOfPossibleSpellings36 to correctSpelling36)



mapOfPossibleSpellingListToCorrectSpellingMap.forEach { (listOfPossibleSpellings, correctSpelling) ->
    val shiurTitleDelimited =givenShiurTitle.split(" ", "-", "_")
    //Solution to two-word parshiyos problem:
    //Loop through lists of possible spellings(returns list): Loop through List(returns spelling): if givenShiurTitle contains it (i.e. spelling), shiurTitleDelimited =givenShiurTitle.split(it, " ", "-", "_")


    for (word in shiurTitleDelimited
    //TODO DOES NOT WORD FOR TWO WORD PARSHIYOS, e.g. "Lech Lecha"
    )
        if (listOfPossibleSpellings.indexOf(word) != -1) {
            properParshaName = correctSpelling[word].toString()
        }
}
    println(properParshaName)
}