package parshaTagger


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
//TODO add yeshivish spelling for all parshiyos

//Solution to two-word parshiyos problem:
//Loop through list of lists of possible spellings(returns list of possible spelling): Loop through list of possible spellings(returns spelling): if givenShiurTitle contains it (i.e. spelling), shiurTitleDelimited =givenShiurTitle.split(it, " ", "-", "_")
//TODO DOES NOT WORK FOR TWO WORD PARSHIYOS, e.g. "Lech Lecha"




object Spellings{


    const val actualSpelling1 = "Bereishis"
    val listOfPossibleSpellings1 = listOf(actualSpelling1,


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
    val correctSpelling1: Map<String, String> = listOfPossibleSpellings1.associateWith {actualSpelling1}


    const val actualSpelling2 = "Noach"
    val listOfPossibleSpellings2 = listOf(actualSpelling2,
            "No'ach", "Now'ach",
            "Noach", "Nowach",
            "Noah", "Nowah",
            "Noakh", "Nowakh", "Now'ach",

            "No'ach", "Noh'ach",
            "Noach", "Nohach",
            "Noah", "Nohah",
            "Noakh", "Nohakh"
    )
    val correctSpelling2: Map<String, String> = listOfPossibleSpellings2.associateWith {actualSpelling2}


    const val actualSpelling3 = "Lech Lecha"
    val listOfPossibleSpellings3 = listOf(actualSpelling3,
            "Leich Licha",
            "Lech Licha",
            "Laich Licha",
            "Leich Lecha",
            "Laich Lecha",

            "Leikh Likha",
            "Lekh Likha",
            "Laikh Likha",
            "Leikh Lekha",
            "Laikh Lekha",

            "Leich Lichah",
            "Lech Lichah",
            "Laich Lichah",
            "Leich Lechah",
            "Laich Lechah",

            "Leikh Likhah",
            "Lekh Likhah",
            "Laikh Likhah",
            "Leikh Lekhah",
            "Laikh Lekhah",

            "Leich Licho",
            "Lech Licho",
            "Laich Licho",
            "Leich Lecho",
            "Laich Lecho",

            "Leikh Likho",
            "Lekh Likho",
            "Laikh Likho",
            "Leikh Lekho",
            "Laikh Lekho",


            "Leich Lichoh",
            "Lech Lichoh",
            "Laich Lichoh",
            "Leich Lechoh",
            "Laich Lechoh",

            "Leikh Likhoh",
            "Lekh Likhoh",
            "Laikh Likhoh",
            "Leikh Lekhoh",
            "Laikh Lekhoh",




            "Leich Lucha",
            "Lech Lucha",
            "Laich Lucha",
            "Leich Lucha",
            "Laich Lucha",

            "Leikh Lukha",
            "Lekh Lukha",
            "Laikh Lukha",
            "Leikh Lukha",
            "Laikh Lukha",

            "Leich Luchah",
            "Lech Luchah",
            "Laich Luchah",
            "Leich Luchah",
            "Laich Luchah",

            "Leikh Lukhah",
            "Lekh Lukhah",
            "Laikh Lukhah",
            "Leikh Lukhah",
            "Laikh Lukhah",

            "Leich Lucho",
            "Lech Lucho",
            "Laich Lucho",
            "Leich Lucho",
            "Laich Lucho",

            "Leikh Lukho",
            "Lekh Lukho",
            "Laikh Lukho",
            "Leikh Lukho",
            "Laikh Lukho",


            "Leich Luchoh",
            "Lech Luchoh",
            "Laich Luchoh",
            "Leich Luchoh",
            "Laich Luchoh",

            "Leikh Lukhoh",
            "Lekh Lukhoh",
            "Laikh Lukhoh",
            "Leikh Lukhoh",
            "Laikh Lukhoh",



            "Leich Locha",
            "Lech Locha",
            "Laich Locha",
            "Leich Locha",
            "Laich Locha",

            "Leikh Lokha",
            "Lekh Lokha",
            "Laikh Lokha",
            "Leikh Lokha",
            "Laikh Lokha",

            "Leich Lochah",
            "Lech Lochah",
            "Laich Lochah",
            "Leich Lochah",
            "Laich Lochah",

            "Leikh Lokhah",
            "Lekh Lokhah",
            "Laikh Lokhah",
            "Leikh Lokhah",
            "Laikh Lokhah",

            "Leich Locho",
            "Lech Locho",
            "Laich Locho",
            "Leich Locho",
            "Laich Locho",

            "Leikh Lokho",
            "Lekh Lokho",
            "Laikh Lokho",
            "Leikh Lokho",
            "Laikh Lokho",


            "Leich Lochoh",
            "Lech Lochoh",
            "Laich Lochoh",
            "Leich Lochoh",
            "Laich Lochoh",

            "Leikh Lokhoh",
            "Lekh Lokhoh",
            "Laikh Lokhoh",
            "Leikh Lokhoh",
            "Laikh Lokhoh",




            "Leih Liha",
            "Leh Liha",
            "Laih Liha",
            "Leih Leha",
            "Laih Leha",

            "Leih Liha",
            "Leh Liha",
            "Laih Liha",
            "Leih Leha",
            "Laih Leha",

            "Leih Lihah",
            "Leh Lihah",
            "Laih Lihah",
            "Leih Lehah",
            "Laih Lehah",

            "Leih Lihah",
            "Leh Lihah",
            "Laih Lihah",
            "Leih Lehah",
            "Laih Lehah",

            "Leih Liho",
            "Leh Liho",
            "Laih Liho",
            "Leih Leho",
            "Laih Leho",

            "Leih Liho",
            "Leh Liho",
            "Laih Liho",
            "Leih Leho",
            "Laih Leho",


            "Leih Lihoh",
            "Leh Lihoh",
            "Laih Lihoh",
            "Leih Lehoh",
            "Laih Lehoh",

            "Leih Lihoh",
            "Leh Lihoh",
            "Laih Lihoh",
            "Leih Lehoh",
            "Laih Lehoh",




            "Leih Luha",
            "Leh Luha",
            "Laih Luha",
            "Leih Luha",
            "Laih Luha",

            "Leih Luha",
            "Leh Luha",
            "Laih Luha",
            "Leih Luha",
            "Laih Luha",

            "Leih Luhah",
            "Leh Luhah",
            "Laih Luhah",
            "Leih Luhah",
            "Laih Luhah",

            "Leih Luhah",
            "Leh Luhah",
            "Laih Luhah",
            "Leih Luhah",
            "Laih Luhah",

            "Leih Luho",
            "Leh Luho",
            "Laih Luho",
            "Leih Luho",
            "Laih Luho",

            "Leih Luho",
            "Leh Luho",
            "Laih Luho",
            "Leih Luho",
            "Laih Luho",


            "Leih Luhoh",
            "Leh Luhoh",
            "Laih Luhoh",
            "Leih Luhoh",
            "Laih Luhoh",

            "Leih Luhoh",
            "Leh Luhoh",
            "Laih Luhoh",
            "Leih Luhoh",
            "Laih Luhoh",



            "Leih Loha",
            "Leh Loha",
            "Laih Loha",
            "Leih Loha",
            "Laih Loha",

            "Leih Loha",
            "Leh Loha",
            "Laih Loha",
            "Leih Loha",
            "Laih Loha",

            "Leih Lohah",
            "Leh Lohah",
            "Laih Lohah",
            "Leih Lohah",
            "Laih Lohah",

            "Leih Lohah",
            "Leh Lohah",
            "Laih Lohah",
            "Leih Lohah",
            "Laih Lohah",

            "Leih Loho",
            "Leh Loho",
            "Laih Loho",
            "Leih Loho",
            "Laih Loho",

            "Leih Loho",
            "Leh Loho",
            "Laih Loho",
            "Leih Loho",
            "Laih Loho",


            "Leih Lohoh",
            "Leh Lohoh",
            "Laih Lohoh",
            "Leih Lohoh",
            "Laih Lohoh",

            "Leih Lohoh",
            "Leh Lohoh",
            "Laih Lohoh",
            "Leih Lohoh",
            "Laih Lohoh"
            )
    val correctSpelling3: Map<String, String> = listOfPossibleSpellings3.associateWith {actualSpelling3}


    const val actualSpelling4 = "Vayeira"
    val listOfPossibleSpellings4 = listOf(actualSpelling4,
            "Vayeirah",
            "Vayera",
            "Vayaira",
            "Vayerah",
            "Vayairah",
            "Vayeiruh",
            "Vayeru",
            "Vayairu",
            "Vayeruh",
            "Vayairuh",


            "Vahyeirah",
            "Vahyera",
            "Vahyaira",
            "Vahyerah",
            "Vahyairah",
            "Vahyeiruh",
            "Vahyeru",
            "Vahyairu",
            "Vahyeruh",
            "Vahyairuh",




            "Vuyeirah",
            "Vuyera",
            "Vuyaira",
            "Vuyerah",
            "Vuyairah",
            "Vuyeiruh",
            "Vuyeru",
            "Vuyairu",
            "Vuyeruh",
            "Vuyairuh",


            "Vuhyeirah",
            "Vuhyera",
            "Vuhyaira",
            "Vuhyerah",
            "Vuhyairah",
            "Vuhyeiruh",
            "Vuhyeru",
            "Vuhyairu",
            "Vuhyeruh",
            "Vuhyairuh"
    )
    val correctSpelling4: Map<String, String> = listOfPossibleSpellings4.associateWith {actualSpelling4}


    const val actualSpelling5 = "Chayei Sara"
    val listOfPossibleSpellings5 = listOf(actualSpelling5,
            "Chayai Sara",
            "Chayei Sarah",
            "Chayai Sarah",
            "Chayei Soro",
            "Chayei Soroh",
            "Chayai Soro",
            "Chayai Soroh",

            "Chayai Sura",
            "Chayei Surah",
            "Chayai Surah",
            "Chayei Suro",
            "Chayei Suroh",
            "Chayai Suro",
            "Chayai Suroh",


            "Chayai Saru",
            "Chayei Saruh",
            "Chayai Saruh",
            "Chayei Soru",
            "Chayei Soruh",
            "Chayai Soru",
            "Chayai Soruh",

            "Hayai Suru",
            "Hayei Suruh",
            "Hayai Suruh",
            "Hayei Suru",
            "Hayei Suruh",
            "Hayai Suru",
            "Hayai Suruh",




            "Hayai Sara",
            "Hayei Sarah",
            "Hayai Sarah",
            "Hayei Soro",
            "Hayei Soroh",
            "Hayai Soro",
            "Hayai Soroh",

            "Hayai Sura",
            "Hayei Surah",
            "Hayai Surah",
            "Hayei Suro",
            "Hayei Suroh",
            "Hayai Suro",
            "Hayai Suroh",


            "Hayai Saru",
            "Hayei Saruh",
            "Hayai Saruh",
            "Hayei Soru",
            "Hayei Soruh",
            "Hayai Soru",
            "Hayai Soruh",

            "Hayai Suru",
            "Hayei Suruh",
            "Hayai Suruh",
            "Hayei Suru",
            "Hayei Suruh",
            "Hayai Suru",
            "Hayai Suruh"

    )
    val correctSpelling5: Map<String, String> = listOfPossibleSpellings5.associateWith {actualSpelling5}


    const val actualSpelling6 = "Toldos"
    val listOfPossibleSpellings6=listOf(actualSpelling6,
            "Tolidos",
            "Tolidot",
            "Toldot"
    )
    val correctSpelling6: Map<String, String> = listOfPossibleSpellings6.associateWith {actualSpelling6}


    const val actualSpelling7 = "Vayeitzei"
    val listOfPossibleSpellings7=listOf(actualSpelling7,
            "Vayetzei",
            "Vayetzai",
            "Vayeitzai",

            "Vayetsei",
            "Vayetsai",
            "Vayeisai",
            "Vayeisei",
            "Vayeissai",
            "Vayeissei",


            "Vayezei",
            "Vayezai",
            "Vayeizai",
            "Vayeizei",


            "Vayetze",
            "Vayetse",
            "Vayeise",
            "Vayeisse",


            "Vayeze",
            "Vayeize"
            )
    val correctSpelling7: Map<String, String> = listOfPossibleSpellings7.associateWith {actualSpelling7}


    const val actualSpelling8 = "Vayishlach"
    val listOfPossibleSpellings8=listOf(actualSpelling8,
            "Vayishlah",
            "Vayeeshlach",
            "Vayeeshlah",

            "Vayishlakh",
            "Vayeeshlakh",
            "Vayeeshlakh",


            "Vayishlah",
            "Vayeeshlahch",
            "Vayeeshlah",

            "Vayishlahkh",
            "Vayeeshlahkh",
            "Vayeeshlahkh"
    )
    val correctSpelling8: Map<String, String> = listOfPossibleSpellings8.associateWith {actualSpelling8}


    const val actualSpelling9 = "Vayeshev"
    val listOfPossibleSpellings9=listOf(actualSpelling9,
            "Vayeishev",
            "Vayaishev"
    )
    val correctSpelling9: Map<String, String> = listOfPossibleSpellings9.associateWith {actualSpelling9}


    const val actualSpelling10 = "Mikeitz"
    val listOfPossibleSpellings10=listOf(actualSpelling10,
            "Meekaitz",
            "Meekais",
            "Meekaiz",
            "Meekeitz",
            "Meekeis",
            "Meekeiz",
            "Mikais",
            "Mikaiz",
            "Mikeis",
            "Mikeiz",
            "Meekaiss",
            "Meekeiss",
            "Mikaiss",
            "Mikeiss",


            "Miqeitz",
            "Meeqaitz",
            "Meeqais",
            "Meeqaiz",
            "Meeqeitz",
            "Meeqeis",
            "Meeqeiz",
            "Miqais",
            "Miqaiz",
            "Miqeis",
            "Miqeiz",
            "Meeqaiss",
            "Meeqeiss",
            "Miqaiss",
            "Miqeiss",


            "Meekkaitz",
            "Meekkais",
            "Meekkaiz",
            "Meekkeitz",
            "Meekkeis",
            "Meekkeiz",
            "Mikkais",
            "Mikkaiz",
            "Mikkeis",
            "Mikkeiz",
            "Meekkaiss",
            "Meekkeiss",
            "Mikkaiss",
            "Mikkeiss"
    )
    val correctSpelling10: Map<String, String> = listOfPossibleSpellings10.associateWith {actualSpelling10}


    const val actualSpelling11 = "Vayigash"
    val listOfPossibleSpellings11=listOf("")
    val correctSpelling11: Map<String, String> = listOfPossibleSpellings11.associateWith {actualSpelling11}


    const val actualSpelling12 = "Vayechi"
    val listOfPossibleSpellings12=listOf("")
    val correctSpelling12: Map<String, String> = listOfPossibleSpellings12.associateWith {actualSpelling12}


    const val actualSpelling13 = "Shemos"
    val listOfPossibleSpellings13=listOf("")
    val correctSpelling13: Map<String, String> = listOfPossibleSpellings13.associateWith {actualSpelling13}


    const val actualSpelling14 = "Va'eira"
    val listOfPossibleSpellings14=listOf("")
    val correctSpelling14: Map<String, String> = listOfPossibleSpellings14.associateWith {actualSpelling14}


    const val actualSpelling15 = "Bo"
    val listOfPossibleSpellings15=listOf("")
    val correctSpelling15: Map<String, String> = listOfPossibleSpellings15.associateWith {actualSpelling15}


    const val actualSpelling16 = "Beshalach"
    val listOfPossibleSpellings16=listOf("")
    val correctSpelling16: Map<String, String> = listOfPossibleSpellings16.associateWith {actualSpelling16}


    const val actualSpelling17 = "Yisro"
    val listOfPossibleSpellings17=listOf("")
    val correctSpelling17: Map<String, String> = listOfPossibleSpellings17.associateWith {actualSpelling17}


    const val actualSpelling18 = "Mishpatim"
    val listOfPossibleSpellings18=listOf("")
    val correctSpelling18: Map<String, String> = listOfPossibleSpellings18.associateWith {actualSpelling18}


    const val actualSpelling19 = "Terumah"
    val listOfPossibleSpellings19=listOf("")
    val correctSpelling19: Map<String, String> = listOfPossibleSpellings19.associateWith {actualSpelling19}


    const val actualSpelling20 = "Tetzaveh"
    val listOfPossibleSpellings20=listOf("")
    val correctSpelling20: Map<String, String> = listOfPossibleSpellings20.associateWith {actualSpelling20}


    const val actualSpelling21 = "Ki Sisa"
    val listOfPossibleSpellings21=listOf("")
    val correctSpelling21: Map<String, String> = listOfPossibleSpellings21.associateWith {actualSpelling21}


    const val actualSpelling22 = "Vayakhail"
    val listOfPossibleSpellings22=listOf("")
    val correctSpelling22: Map<String, String> = listOfPossibleSpellings22.associateWith {actualSpelling22}


    const val actualSpelling23 = "Pekudei"
    val listOfPossibleSpellings23=listOf("")
    val correctSpelling23: Map<String, String> = listOfPossibleSpellings23.associateWith {actualSpelling23}





    const val actualSpelling25 = "Vayikra"
    val listOfPossibleSpellings25=listOf("")
    val correctSpelling25: Map<String, String> = listOfPossibleSpellings25.associateWith {actualSpelling25}


    const val actualSpelling26 = "Tzav"
    val listOfPossibleSpellings26=listOf("")
    val correctSpelling26: Map<String, String> = listOfPossibleSpellings26.associateWith {actualSpelling26}


    const val actualSpelling27 = "Shemini"
    val listOfPossibleSpellings27=listOf("")
    val correctSpelling27: Map<String, String> = listOfPossibleSpellings27.associateWith {actualSpelling27}


    const val actualSpelling28 = "Tazria"
    val listOfPossibleSpellings28=listOf("")
    val correctSpelling28: Map<String, String> = listOfPossibleSpellings28.associateWith {actualSpelling28}


    const val actualSpelling29 = "Metzora"
    val listOfPossibleSpellings29=listOf("")
    val correctSpelling29: Map<String, String> = listOfPossibleSpellings29.associateWith {actualSpelling29}


    const val actualSpelling30 = "Acharei Mos"
    val listOfPossibleSpellings30=listOf("")
    val correctSpelling30: Map<String, String> = listOfPossibleSpellings30.associateWith {actualSpelling30}


    const val actualSpelling31 = "Kedoshim"
    val listOfPossibleSpellings31=listOf("")
    val correctSpelling31: Map<String, String> = listOfPossibleSpellings31.associateWith {actualSpelling31}


    const val actualSpelling32 = "Emor"
    val listOfPossibleSpellings32=listOf("")
    val correctSpelling32: Map<String, String> = listOfPossibleSpellings32.associateWith {actualSpelling32}


    const val actualSpelling33 = "Behar"
    val listOfPossibleSpellings33=listOf("")
    val correctSpelling33: Map<String, String> = listOfPossibleSpellings33.associateWith {actualSpelling33}


    const val actualSpelling34 = "Bechukosai"
    val listOfPossibleSpellings34=listOf("")
    val correctSpelling34: Map<String, String> = listOfPossibleSpellings34.associateWith {actualSpelling34}


    const val actualSpelling35 = "Bamidbar"
    val listOfPossibleSpellings35=listOf("")
    val correctSpelling35: Map<String, String> = listOfPossibleSpellings35.associateWith {actualSpelling35}


    const val actualSpelling36 = "Naso"
    val listOfPossibleSpellings36=listOf("")
    val correctSpelling36: Map<String, String> = listOfPossibleSpellings36.associateWith {actualSpelling36}


    const val actualSpelling37 = "Beha'aloscha"
    val listOfPossibleSpellings37 = listOf(
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
    val correctSpelling37: Map<String, String> = listOfPossibleSpellings37.associateWith {actualSpelling37}


    const val actualSpelling38 = "Shelach"
    val listOfPossibleSpellings38=listOf("")
    val correctSpelling38: Map<String, String> = listOfPossibleSpellings38.associateWith {actualSpelling38}


    const val actualSpelling39 = "Korach"
    val listOfPossibleSpellings39=listOf("")
    val correctSpelling39: Map<String, String> = listOfPossibleSpellings39.associateWith {actualSpelling39}


    const val actualSpelling40 = "Chukas"
    val listOfPossibleSpellings40=listOf("")
    val correctSpelling40: Map<String, String> = listOfPossibleSpellings40.associateWith {actualSpelling40}


    const val actualSpelling41 = "Balak"
    val listOfPossibleSpellings41=listOf("")
    val correctSpelling41: Map<String, String> = listOfPossibleSpellings41.associateWith {actualSpelling41}


    const val actualSpelling42 = "Pinchas"
    val listOfPossibleSpellings42=listOf("")
    val correctSpelling42: Map<String, String> = listOfPossibleSpellings42.associateWith {actualSpelling42}


    const val actualSpelling43 = "Mattos"
    val listOfPossibleSpellings43=listOf("")
    val correctSpelling43: Map<String, String> = listOfPossibleSpellings43.associateWith {actualSpelling43}


    const val actualSpelling44 = "Massai"
    val listOfPossibleSpellings44=listOf("")
    val correctSpelling44: Map<String, String> = listOfPossibleSpellings44.associateWith {actualSpelling44}


    const val actualSpelling45 = "Devarim"
    val listOfPossibleSpellings45=listOf("")
    val correctSpelling45: Map<String, String> = listOfPossibleSpellings45.associateWith {actualSpelling45}


    const val actualSpelling46 = "Va'eschanan"
    val listOfPossibleSpellings46=listOf("")
    val correctSpelling46: Map<String, String> = listOfPossibleSpellings46.associateWith {actualSpelling46}


    const val actualSpelling47 = "Eikev"
    val listOfPossibleSpellings47=listOf("")
    val correctSpelling47: Map<String, String> = listOfPossibleSpellings47.associateWith {actualSpelling47}


    const val actualSpelling48 = "Re'eh"
    val listOfPossibleSpellings48=listOf("")
    val correctSpelling48: Map<String, String> = listOfPossibleSpellings48.associateWith {actualSpelling48}


    const val actualSpelling49 = "Shoftim"
    val listOfPossibleSpellings49=listOf("")
    val correctSpelling49: Map<String, String> = listOfPossibleSpellings49.associateWith {actualSpelling49}


    const val actualSpelling50 = "Ki Setzei"
    val listOfPossibleSpellings50=listOf("")
    val correctSpelling50: Map<String, String> = listOfPossibleSpellings50.associateWith {actualSpelling50}


    const val actualSpelling51 = "Ki Savo"
    val listOfPossibleSpellings51=listOf("")
    val correctSpelling51: Map<String, String> = listOfPossibleSpellings51.associateWith {actualSpelling51}


    const val actualSpelling52 = "Nitzavim"
    val listOfPossibleSpellings52=listOf("")
    val correctSpelling52: Map<String, String> = listOfPossibleSpellings52.associateWith {actualSpelling52}


    const val actualSpelling53 = "Vayelech"
    val listOfPossibleSpellings53=listOf("")
    val correctSpelling53: Map<String, String> = listOfPossibleSpellings53.associateWith {actualSpelling53}


    const val actualSpelling54 = "Ha'azinu"
    val listOfPossibleSpellings54=listOf("")
    val correctSpelling54: Map<String, String> = listOfPossibleSpellings54.associateWith {actualSpelling54}


    const val actualSpelling55 = "V'Zos HaBracha"
    val listOfPossibleSpellings55=listOf("")
    val correctSpelling55: Map<String, String> = listOfPossibleSpellings55.associateWith {actualSpelling55}




    val listOfListsOfPossibleSpellings = listOf(

            listOfPossibleSpellings1,
            listOfPossibleSpellings2,
            listOfPossibleSpellings3,
            listOfPossibleSpellings4,
            listOfPossibleSpellings5,
            listOfPossibleSpellings6,
            listOfPossibleSpellings7,
            listOfPossibleSpellings8,
            listOfPossibleSpellings9,
            listOfPossibleSpellings10,
            listOfPossibleSpellings11,
            listOfPossibleSpellings12,
            listOfPossibleSpellings13,
            listOfPossibleSpellings14,
            listOfPossibleSpellings15,
            listOfPossibleSpellings16,
            listOfPossibleSpellings17,
            listOfPossibleSpellings18,
            listOfPossibleSpellings19,
            listOfPossibleSpellings20,
            listOfPossibleSpellings21,
            listOfPossibleSpellings22,
            listOfPossibleSpellings23,
//"Sefer Vayikra" by accident
            listOfPossibleSpellings25,
            listOfPossibleSpellings26,
            listOfPossibleSpellings27,
            listOfPossibleSpellings28,
            listOfPossibleSpellings29,
            listOfPossibleSpellings30,
            listOfPossibleSpellings31,
            listOfPossibleSpellings32,
            listOfPossibleSpellings33,
            listOfPossibleSpellings34,
            listOfPossibleSpellings35,
            listOfPossibleSpellings36,
            listOfPossibleSpellings37,
            listOfPossibleSpellings38,
            listOfPossibleSpellings39,
            listOfPossibleSpellings40,
            listOfPossibleSpellings41,
            listOfPossibleSpellings42,
            listOfPossibleSpellings43,
            listOfPossibleSpellings44,
            listOfPossibleSpellings45,
            listOfPossibleSpellings46,
            listOfPossibleSpellings47,
            listOfPossibleSpellings48,
            listOfPossibleSpellings49,
            listOfPossibleSpellings50,
            listOfPossibleSpellings51,
            listOfPossibleSpellings52,
            listOfPossibleSpellings53,
            listOfPossibleSpellings54,
            listOfPossibleSpellings55
    )

    val mapOfPossibleSpellingListToCorrectSpellingMap = mapOf(
            listOfPossibleSpellings1 to correctSpelling1,
            listOfPossibleSpellings2 to correctSpelling2,
            listOfPossibleSpellings3 to correctSpelling3,
            listOfPossibleSpellings4 to correctSpelling4,
            listOfPossibleSpellings5 to correctSpelling5,
            listOfPossibleSpellings6 to correctSpelling6,
            listOfPossibleSpellings7 to correctSpelling7,
            listOfPossibleSpellings8 to correctSpelling8,
            listOfPossibleSpellings9 to correctSpelling9,
            listOfPossibleSpellings10 to correctSpelling10,
            listOfPossibleSpellings11 to correctSpelling11,
            listOfPossibleSpellings12 to correctSpelling12,
            listOfPossibleSpellings13 to correctSpelling13,
            listOfPossibleSpellings14 to correctSpelling14,
            listOfPossibleSpellings15 to correctSpelling15,
            listOfPossibleSpellings16 to correctSpelling16,
            listOfPossibleSpellings17 to correctSpelling17,
            listOfPossibleSpellings18 to correctSpelling18,
            listOfPossibleSpellings19 to correctSpelling19,
            listOfPossibleSpellings20 to correctSpelling20,
            listOfPossibleSpellings21 to correctSpelling21,
            listOfPossibleSpellings22 to correctSpelling22,
            listOfPossibleSpellings23 to correctSpelling23,
//"Sefer Vayikra" by accident
            listOfPossibleSpellings25 to correctSpelling25,
            listOfPossibleSpellings26 to correctSpelling26,
            listOfPossibleSpellings27 to correctSpelling27,
            listOfPossibleSpellings28 to correctSpelling28,
            listOfPossibleSpellings29 to correctSpelling29,
            listOfPossibleSpellings30 to correctSpelling30,
            listOfPossibleSpellings31 to correctSpelling31,
            listOfPossibleSpellings32 to correctSpelling32,
            listOfPossibleSpellings33 to correctSpelling33,
            listOfPossibleSpellings34 to correctSpelling34,
            listOfPossibleSpellings35 to correctSpelling35,
            listOfPossibleSpellings36 to correctSpelling36,
            listOfPossibleSpellings37 to correctSpelling37,
            listOfPossibleSpellings38 to correctSpelling38,
            listOfPossibleSpellings39 to correctSpelling39,
            listOfPossibleSpellings40 to correctSpelling40,
            listOfPossibleSpellings41 to correctSpelling41,
            listOfPossibleSpellings42 to correctSpelling42,
            listOfPossibleSpellings43 to correctSpelling43,
            listOfPossibleSpellings44 to correctSpelling44,
            listOfPossibleSpellings45 to correctSpelling45,
            listOfPossibleSpellings46 to correctSpelling46,
            listOfPossibleSpellings47 to correctSpelling47,
            listOfPossibleSpellings48 to correctSpelling48,
            listOfPossibleSpellings49 to correctSpelling49,
            listOfPossibleSpellings50 to correctSpelling50,
            listOfPossibleSpellings51 to correctSpelling51,
            listOfPossibleSpellings52 to correctSpelling52,
            listOfPossibleSpellings53 to correctSpelling53,
            listOfPossibleSpellings54 to correctSpelling54,
            listOfPossibleSpellings55 to correctSpelling55
    )
}


fun main() {

    val givenShiurTitle = "Parshas  5780- Meekais Finding Your Potential In A Chaotic World"
    var properParshaName = ""//this is what the album should correctly be
    Spellings.mapOfPossibleSpellingListToCorrectSpellingMap.forEach { (listOfPossibleSpellings, correctSpelling) ->
        for (word in givenShiurTitle.split(" ", "-", "_")) {
            if (listOfPossibleSpellings.indexOf(word) != -1) {
                properParshaName = correctSpelling[word].toString()
            }
        }
    }
    println(properParshaName)

}

