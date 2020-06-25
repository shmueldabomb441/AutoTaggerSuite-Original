package parshaTagger



    val actualSpelling1 = "Bereishis"
    val listOfPossibleSpellings1 = listOf(actualSpelling1,

            "Bereshis", "Bereshit",
            "Bereshith", "Bereshees",
            "Beresheet", "Beresheeth",

            "Biraishis", "Bireishis",
            "Beraishis", "Bereishis",

            "Biraishit", "Bireishit",
            "Beraishit", "Bereishit",

            "Biraishees", "Bireishees",
            "Beraishees", "Bereishees",
            "Biraisheet", "Bireisheet",
            "Beraisheet", "Bereisheet",
            "Buraishis", "Bureishis",
            "Buraishit", "Bureishit",

            "Buraishees", "Bureishees",
            "Buraisheet", "Bureisheet",


            "Boraishis", "Boreishis",

            "Boraishit", "Boreishit",

            "Boraishees", "Boreishees",
            "Boraisheet", "Boreisheet",


            "Baraishis", "Bareishis",

            "Baraishit", "Bareishit",

            "Baraishees", "Bareishees",
            "Baraisheet", "Bareisheet",

            "Biraishith",
            "Bireishith",
            "Beraishith",
            "Bereishith",
            "Biraisheeth",
            "Bireisheeth",
            "Beraisheeth",
            "Bereisheeth",
            "Buraishith",
            "Bureishith",
            "Buraishith",
            "Bureishith",
            "Buraisheeth",
            "Bureisheeth",
            "Buraisheeth",
            "Bureisheeth",
            "Boraishith",
            "Boreishith",
            "Boraishith",
            "Boreishith",
            "Boraisheeth",
            "Boreisheeth",
            "Boraisheeth",
            "Boreisheeth",
            "Baraishith",
            "Bareishith",
            "Baraishith",
            "Bareishith",
            "Baraisheeth",
            "Bareisheeth",
            "Baraisheeth",
            "Bareisheeth",


            "B'raishis",
            "B'reishis",
            "B'raishit",
            "B'reishit",
            "B'raishees",
            "B'reishees",
            "B'raisheet",
            "B'reisheet",
            "B'raishith",
            "B'reishith",
            "B'raisheeth",
            "B'reisheeth"
    )
    val mapOfPossibleSpellingToCorrectSpelling1: Map<String, String> = listOfPossibleSpellings1.associateWith { actualSpelling1 }


    val actualSpelling2 = "Noach"
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
    val mapOfPossibleSpellingToCorrectSpelling2: Map<String, String> = listOfPossibleSpellings2.associateWith { actualSpelling2 }


    val actualSpelling3a = "Lech Lecha"
    val listOfPossibleSpellings3a = listOf(actualSpelling3a,
            "Leich Licha",
            "Lech Licha",
            "Laich Licha",
            "Leich Lecha",
            "Laich Lecha",
            "Lekh Lekha",
            "Lekh Lekhah",

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
            "Laih Lohoh",


            "Leich L'cha",
            "Lech L'cha",
            "Laich L'cha",
            "Leikh L'kha",
            "Lekh L'kha",
            "Laikh L'kha",
            "Leich L'chah",
            "Lech L'chah",
            "Laich L'chah",
            "Leikh L'khah",
            "Lekh L'khah",
            "Laikh L'khah",
            "Leich L'cho",
            "Lech L'cho",
            "Laich L'cho",
            "Leikh L'kho",
            "Lekh L'kho",
            "Laikh L'kho",
            "Leich L'choh",
            "Lech L'choh",
            "Laich L'choh",
            "Leikh L'khoh",
            "Lekh L'khoh",
            "Laikh L'khoh",
            "Leih L'ha",
            "Leh L'ha",
            "Laih L'ha",
            "Leih L'ha",
            "Leh L'ha",
            "Laih L'ha",
            "Leih L'hah",
            "Leh L'hah",
            "Laih L'hah",
            "Leih L'hah",
            "Leh L'hah",
            "Laih L'hah",
            "Leih L'ho",
            "Leh L'ho",
            "Laih L'ho",
            "Leih L'ho",
            "Leh L'ho",
            "Laih L'ho",
            "Leih L'hoh",
            "Leh L'hoh",
            "Laih L'hoh",
            "Leih L'hoh",
            "Leh L'hoh",
            "Laih L'hoh"
    )
    val mapOfPossibleSpellingToCorrectSpelling3a: Map<String, String> = listOfPossibleSpellings3a.associateWith { actualSpelling3a }


    val actualSpelling4 = "Vayeira"
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
    val mapOfPossibleSpellingToCorrectSpelling4: Map<String, String> = listOfPossibleSpellings4.associateWith { actualSpelling4 }


    val actualSpelling5a = "Chayei Sara"
    val listOfPossibleSpellings5a = listOf(actualSpelling5a,
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
            "Chayyei Sarah",

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
            "Hayai Suruh",
            "Hayyei Sarah"

    )
    val mapOfPossibleSpellingToCorrectSpelling5a: Map<String, String> = listOfPossibleSpellings5a.associateWith { actualSpelling5a }


    val actualSpelling6 = "Toldos"
    val listOfPossibleSpellings6 = listOf(actualSpelling6,
            "Tolidos",
            "Tolidot",
            "Toledos",
            "Toledot",
            "Toledoth",
            "Toldos",
            "Toldot",
            "Tolidoth",
            "Toldoth",


            "Tol'dos",
            "Tol'dot",
            "Tol'doth"
    )
    val mapOfPossibleSpellingToCorrectSpelling6: Map<String, String> = listOfPossibleSpellings6.associateWith { actualSpelling6 }


    val actualSpelling7 = "Vayeitzei"
    val listOfPossibleSpellings7 = listOf(actualSpelling7,
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
    val mapOfPossibleSpellingToCorrectSpelling7: Map<String, String> = listOfPossibleSpellings7.associateWith { actualSpelling7 }


    val actualSpelling8 = "Vayishlach"
    val listOfPossibleSpellings8 = listOf(actualSpelling8,
            "Vayishlah",
            "Vayeeshlach",
            "Vayeeshlah",

            "Vayishlakh",
            "Vayeeshlakh",


            "Vayishlah",
            "Vayeeshlahch",
            "Vayeeshlah",

            "Vayishlahkh",
            "Vayeeshlahkh"
    )
    val mapOfPossibleSpellingToCorrectSpelling8: Map<String, String> = listOfPossibleSpellings8.associateWith { actualSpelling8 }


    val actualSpelling9 = "Vayeshev"
    val listOfPossibleSpellings9 = listOf(actualSpelling9,
            "Vayeishev",
            "Vayaishev"
    )
    val mapOfPossibleSpellingToCorrectSpelling9: Map<String, String> = listOfPossibleSpellings9.associateWith { actualSpelling9 }


    val actualSpelling10 = "Mikeitz"
    val listOfPossibleSpellings10 = listOf(actualSpelling10,
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
    val mapOfPossibleSpellingToCorrectSpelling10: Map<String, String> = listOfPossibleSpellings10.associateWith { actualSpelling10 }


    val actualSpelling11 = "Vayigash"
    val listOfPossibleSpellings11 = listOf(actualSpelling11,
            "Vayeegash",
            "Vayeegahsh",
            "Vayigahsh"
    )
    val mapOfPossibleSpellingToCorrectSpelling11: Map<String, String> = listOfPossibleSpellings11.associateWith { actualSpelling11 }


    val actualSpelling12 = "Vayechi"
    val listOfPossibleSpellings12 = listOf(actualSpelling12,
            "Vayechee",
            "Vayichi",
            "Vayichee",
            "Vay'chi",
            "Vay'chee",
            "Vayehee",
            "Vayihi",
            "Vayihee",
            "Vay'hi",
            "Vay'hee",
            "Vayehi"
    )
    val mapOfPossibleSpellingToCorrectSpelling12: Map<String, String> = listOfPossibleSpellings12.associateWith { actualSpelling12 }


    val actualSpelling13 = "Shemos"
    val listOfPossibleSpellings13 = listOf(actualSpelling13,
            "Shimos",
            "Shimoth",
            "Shemot",
            "Shemoth",
            "Sh'mot",
            "Sh'mos",
            "Sh'moth"
    )
    val mapOfPossibleSpellingToCorrectSpelling13: Map<String, String> = listOfPossibleSpellings13.associateWith { actualSpelling13 }


    val actualSpelling14 = "Va'eira"
    val listOfPossibleSpellings14 = listOf(actualSpelling14,
            "Vaeira",
            "Vaaira",
            "V'aira",
            "V'eira",
            "Vaeirah",
            "Vaairah",
            "V'airah",
            "V'eirah",
            "Va'era",
            "Va'erah",

            "Vaeiru",
            "Vaairu",
            "V'airu",
            "V'eiru",
            "Vaeiruh",
            "Vaairuh",
            "V'airuh",
            "V'eiruh",

            "Vaeiro",
            "Vaairo",
            "V'airo",
            "V'eiro",
            "Vaeiroh",
            "Vaairoh",
            "V'airoh",
            "V'eiroh",


            "Waeira",
            "Waaira",
            "W'aira",
            "W'eira",
            "Waeirah",
            "Waairah",
            "W'airah",
            "W'eirah",


            "Waeiru",
            "Waairu",
            "W'airu",
            "W'eiru",
            "Waeiruh",
            "Waairuh",
            "W'airuh",
            "W'eiruh",

            "Waeiro",
            "Waairo",
            "W'airo",
            "W'eiro",
            "Waeiroh",
            "Waairoh",
            "W'airoh",
            "W'eiroh"

    )
    val mapOfPossibleSpellingToCorrectSpelling14: Map<String, String> = listOfPossibleSpellings14.associateWith { actualSpelling14 }


    val actualSpelling15 = "Bo"
    val listOfPossibleSpellings15 = listOf(actualSpelling15,
            "Boh",
            "Bow"
    )
    val mapOfPossibleSpellingToCorrectSpelling15: Map<String, String> = listOfPossibleSpellings15.associateWith { actualSpelling15 }


    val actualSpelling16 = "Beshalach"
    val listOfPossibleSpellings16 = listOf(actualSpelling16,
            "Bishalach",
            "B'shalach",
            "Beshalah",
            "Bishalah",
            "B'shalah",
            "Bishahlahch",
            "B'shahlahch",
            "Beshahlah",
            "Bishahlah",
            "B'ishahlah",
            "Beshallach",
            "Bishallach",
            "Bishallach",


            "Beshallah",
            "Bishallah",
            "Bishallah",


            "Beshahllah",
            "Bishahllah",
            "Bishahllah"
    )
    val mapOfPossibleSpellingToCorrectSpelling16: Map<String, String> = listOfPossibleSpellings16.associateWith { actualSpelling16 }


    val actualSpelling17 = "Yisro"
    val listOfPossibleSpellings17 = listOf(actualSpelling17,
            "Yithro",
            "Yeesro",
            "Yeethro",
            "Yisroh",
            "Yithroh",
            "Yeethroh",
            "Yeesroh",
            "Yitro",
            "Yitroh",
            "Yeetro",
            "Yeetroh",


            "Yithrow",
            "Yeesrow",
            "Yeethrow",
            "Yisrow",
            "Yithrow",
            "Yeethrow",
            "Yeesrow",
            "Yitrow",
            "Yitrow",
            "Yeetrow",
            "Yeetrow"
    )
    val mapOfPossibleSpellingToCorrectSpelling17: Map<String, String> = listOfPossibleSpellings17.associateWith { actualSpelling17 }


    val actualSpelling18 = "Mishpatim"
    val listOfPossibleSpellings18 = listOf(actualSpelling18,
            "Meeshpattim",
            "Meeshpatim",
            "Meeshputeem",
            "Meeshpatteem",
            "Meeshpateem",
            "Mishputtim",
            "Mishputim",
            "Mishpateem",
            "Mishpatteem",
            "Mishputteem",
            "Mishputeem",


            "M'shputtim",
            "M'shputim",
            "M'shpateem",
            "M'shpatteem",
            "M'shputteem",
            "M'shputeem"
    )
    val mapOfPossibleSpellingToCorrectSpelling18: Map<String, String> = listOfPossibleSpellings18.associateWith { actualSpelling18 }


    val actualSpelling19 = "Terumah"
    val listOfPossibleSpellings19 = listOf(actualSpelling19,
            "Tirumah",
            "Tiruma",
            "Teruma",
            "Tirooma",
            "Tiroomah",

            "Tirumuh",
            "Tirumu",
            "Terumu",
            "Tiroomu",
            "Tiroomuh",
            "Terooma",
            "Teroomah",
            "Teroomuh",
            "Teroomu",
            "Truma",
            "Trooma",
            "Trumah",
            "Troomah",
            "Troomu",
            "Troomuh",
            "Trumuh",
            "T'ruma",
            "T'rumuh",
            "T'rumah",
            "T'rumu",
            "T'roomu",
            "T'rooma",
            "T'roomuh",
            "T'roomah"
    )
    val mapOfPossibleSpellingToCorrectSpelling19: Map<String, String> = listOfPossibleSpellings19.associateWith { actualSpelling19 }


    val actualSpelling20 = "Tetzaveh"
    val listOfPossibleSpellings20 = listOf(actualSpelling20,
            "Titzaveh",
            "Tisaveh",
            "Tizaveh",
            "Tissaveh",
            "T'tzaveh",
            "T'saveh",
            "T'zaveh",
            "T'ssaveh",

            "Titzave",
            "Tisave",
            "Tizave",
            "Tissave",
            "T'tzave",
            "T'save",
            "T'zave",
            "T'ssave",

            "Titzaweh",
            "Tisaweh",
            "Tizaweh",
            "Tissaweh",
            "T'tzaweh",
            "T'saweh",
            "T'zaweh",
            "T'ssaweh",

            "Titzawe",
            "Tisawe",
            "Tizawe",
            "Tissawe",
            "T'tzawe",
            "T'sawe",
            "T'zawe",
            "T'ssawe"
    )
    val mapOfPossibleSpellingToCorrectSpelling20: Map<String, String> = listOfPossibleSpellings20.associateWith { actualSpelling20 }


    val actualSpelling21a = "Ki Sisa"
    val listOfPossibleSpellings21a = listOf(actualSpelling21a,
            "Kee Seesa",
            "Kee Seesah",
            "Ki Seesa",
            "Ki Seesah",
            "Ki Sisah",
            "Key Sisa",
            "Key Seesa",
            "Key Seesah",

            "Kee Teesa",
            "Kee Teesah",
            "Ki Teesa",
            "Ki Teesah",
            "Ki Tisah",
            "Key Tisa",
            "Key Teesa",
            "Key Teesah",

            "Kee Theesa",
            "Kee Theesah",
            "Ki Theesa",
            "Ki Theesah",
            "Ki Thisah",
            "Key Thisa",
            "Key Theesa",
            "Key Theesah",


            "Kee Seessa",
            "Kee Seessah",
            "Ki Seessa",
            "Ki Seessah",
            "Ki Sissah",
            "Key Sissa",
            "Key Seessa",
            "Key Seessah",

            "Kee Teessa",
            "Kee Teessah",
            "Ki Teessa",
            "Ki Teessah",
            "Ki Tissah",
            "Key Tissa",
            "Key Teessa",
            "Key Teessah",

            "Kee Theessa",
            "Kee Theessah",
            "Ki Theessa",
            "Ki Theessah",
            "Ki Thissah",
            "Key Thissa",
            "Key Theessa",
            "Key Theessah",


            "Kee Seesu",
            "Kee Seesuh",
            "Ki Seesu",
            "Ki Seesuh",
            "Ki Sisuh",
            "Key Sisu",
            "Key Seesu",
            "Key Seesuh",

            "Kee Teesu",
            "Kee Teesuh",
            "Ki Teesu",
            "Ki Teesuh",
            "Ki Tisuh",
            "Key Tisu",
            "Key Teesu",
            "Key Teesuh",

            "Kee Theesu",
            "Kee Theesuh",
            "Ki Theesu",
            "Ki Theesuh",
            "Ki Thisuh",
            "Key Thisu",
            "Key Theesu",
            "Key Theesuh",


            "Kee Seessu",
            "Kee Seessuh",
            "Ki Seessu",
            "Ki Seessuh",
            "Ki Sissuh",
            "Key Sissu",
            "Key Seessu",
            "Key Seessuh",

            "Kee Teessu",
            "Kee Teessuh",
            "Ki Teessu",
            "Ki Teessuh",
            "Ki Tissuh",
            "Key Tissu",
            "Key Teessu",
            "Key Teessuh",

            "Kee Theessu",
            "Kee Theessuh",
            "Ki Theessu",
            "Ki Theessuh",
            "Ki Thissuh",
            "Key Thissu",
            "Key Theessu",
            "Key Theessuh"
    )
    val mapOfPossibleSpellingToCorrectSpelling21a: Map<String, String> = listOfPossibleSpellings21a.associateWith { actualSpelling21a }


    val actualSpelling22 = "Vayakhail"
    val listOfPossibleSpellings22 = listOf(actualSpelling22,
            "Vayakail",
            "Vayakeil",
            "Vayakheil",
            "Vayakhel",
            "Vayakel",

            "Wayakail",
            "Wayakeil",
            "Wayakheil",
            "Wayakhel",
            "Wayakel"
    )
    val mapOfPossibleSpellingToCorrectSpelling22: Map<String, String> = listOfPossibleSpellings22.associateWith { actualSpelling22 }


    val actualSpelling23 = "Pekudei"
    val listOfPossibleSpellings23 = listOf(actualSpelling23,
            "Pekudai",
            "Pikudai",
            "Pikudei",
            "P'kudei",
            "P'kudai",

            "Pekoodai",
            "Pikoodai",
            "Pikoodei",
            "P'koodei",
            "P'koodai",

            "Pekuday",
            "Pikuday",
            "P'kuday",
            "Pekooday",
            "Pikooday",
            "P'kooday"
    )
    val mapOfPossibleSpellingToCorrectSpelling23: Map<String, String> = listOfPossibleSpellings23.associateWith { actualSpelling23 }


    val actualSpelling25 = "Vayikra"
    val listOfPossibleSpellings25 = listOf(actualSpelling25,
            "Vayikrah",
            "Vayeekrah",
            "Vayeekra",
            "Vayikruh",
            "Vayeekruh",
            "Vayeekru",
            "Vayikru",

            "Wayikrah",
            "Wayeekrah",
            "Wayeekra",
            "Wayikruh",
            "Wayeekruh",
            "Wayeekru",
            "Wayikru"
    )
    val mapOfPossibleSpellingToCorrectSpelling25: Map<String, String> = listOfPossibleSpellings25.associateWith { actualSpelling25 }


    val actualSpelling26 = "Tzav"
    val listOfPossibleSpellings26 = listOf(actualSpelling26,
            "Saz",
            "Zav",
            "Saw",
            "Zaw",
            "Tsav",
            "Tsaw"
    )
    val mapOfPossibleSpellingToCorrectSpelling26: Map<String, String> = listOfPossibleSpellings26.associateWith { actualSpelling26 }


    val actualSpelling27 = "Shemini"
    val listOfPossibleSpellings27 = listOf(actualSpelling27,
            "Shmini",
            "Shminee",
            "Shmeeni",
            "Sh'mini",
            "Sh'minee",
            "Shmeenee",
            "Shemeenee",
            "Sheminee",
            "Shemeeni"
    )
    val mapOfPossibleSpellingToCorrectSpelling27: Map<String, String> = listOfPossibleSpellings27.associateWith { actualSpelling27 }


    val actualSpelling28 = "Tazria"
    val listOfPossibleSpellings28 = listOf(actualSpelling28,
            "Tasria"
    )
    val mapOfPossibleSpellingToCorrectSpelling28: Map<String, String> = listOfPossibleSpellings28.associateWith { actualSpelling28 }


    val actualSpelling29 = "Metzora"
    val listOfPossibleSpellings29 = listOf(actualSpelling29,
            "Metzorah",
            "Mitzora",
            "Mitzorah",
            "M'tzora",
            "M'tzorah",

            "Metzoruh",
            "Mitzoru",
            "Mitzoruh",
            "M'tzoru",
            "M'tzoruh",


            "Mezorah",
            "Mizora",
            "Mizorah",
            "M'zora",
            "M'zorah",

            "Mezoruh",
            "Mizoru",
            "Mizoruh",
            "M'zoru",
            "M'zoruh"

    )
    val mapOfPossibleSpellingToCorrectSpelling29: Map<String, String> = listOfPossibleSpellings29.associateWith { actualSpelling29 }


    val actualSpelling30a = "Acharei Mos"
    val listOfPossibleSpellings30a = listOf(actualSpelling30a,
            "Achrei Mos",
            "Achrei Mose",
            "Acharei Mose",
            "Achrai Mos",
            "Acharai Mos",
            "Acharai Mose",
            "Achrai Mose",


            "Achrei Mot",
            "Achrei Mote",
            "Acharei Mote",
            "Achrai Mot",
            "Acharai Mot",
            "Acharai Mote",
            "Achrai Mote",


            "Achrei Moth",
            "Acharei Moth",
            "Achrai Moth",
            "Acharai Moth",


            "Ach'rei Mos",
            "Ach'rei Mose",
            "Ach'rai Mos",
            "Ach'rai Mose",
            "Ach'rei Mot",
            "Ach'rei Mote",
            "Ach'rai Mot",
            "Ach'rai Mote",
            "Ach'rei Moth",
            "Ach'rai Moth"
    )
    val mapOfPossibleSpellingToCorrectSpelling30a: Map<String, String> = listOfPossibleSpellings30a.associateWith { actualSpelling30a }


    val actualSpelling31 = "Kedoshim"
    val listOfPossibleSpellings31 = listOf(actualSpelling31,
            "Kedosheem",
            "Kidoshim",
            "Kidosheem"
    )
    val mapOfPossibleSpellingToCorrectSpelling31: Map<String, String> = listOfPossibleSpellings31.associateWith { actualSpelling31 }


    val actualSpelling32 = "Emor"
    val listOfPossibleSpellings32 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling32: Map<String, String> = listOfPossibleSpellings32.associateWith { actualSpelling32 }


    val actualSpelling33 = "Behar"
    val listOfPossibleSpellings33 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling33: Map<String, String> = listOfPossibleSpellings33.associateWith { actualSpelling33 }


    val actualSpelling34 = "Bechukosai"
    val listOfPossibleSpellings34 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling34: Map<String, String> = listOfPossibleSpellings34.associateWith { actualSpelling34 }


    val actualSpelling35 = "Bamidbar"
    val listOfPossibleSpellings35 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling35: Map<String, String> = listOfPossibleSpellings35.associateWith { actualSpelling35 }


    val actualSpelling36 = "Naso"
    val listOfPossibleSpellings36 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling36: Map<String, String> = listOfPossibleSpellings36.associateWith { actualSpelling36 }


    val actualSpelling37 = "Beha'aloscha"
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
    val mapOfPossibleSpellingToCorrectSpelling37: Map<String, String> = listOfPossibleSpellings37.associateWith { actualSpelling37 }


    val actualSpelling38 = "Shelach"
    val listOfPossibleSpellings38 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling38: Map<String, String> = listOfPossibleSpellings38.associateWith { actualSpelling38 }


    val actualSpelling39 = "Korach"
    val listOfPossibleSpellings39 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling39: Map<String, String> = listOfPossibleSpellings39.associateWith { actualSpelling39 }


    val actualSpelling40 = "Chukas"
    val listOfPossibleSpellings40 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling40: Map<String, String> = listOfPossibleSpellings40.associateWith { actualSpelling40 }


    val actualSpelling41 = "Balak"
    val listOfPossibleSpellings41 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling41: Map<String, String> = listOfPossibleSpellings41.associateWith { actualSpelling41 }


    val actualSpelling42 = "Pinchas"
    val listOfPossibleSpellings42 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling42: Map<String, String> = listOfPossibleSpellings42.associateWith { actualSpelling42 }


    val actualSpelling43 = "Mattos"
    val listOfPossibleSpellings43 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling43: Map<String, String> = listOfPossibleSpellings43.associateWith { actualSpelling43 }


    val actualSpelling44 = "Massai"
    val listOfPossibleSpellings44 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling44: Map<String, String> = listOfPossibleSpellings44.associateWith { actualSpelling44 }


    val actualSpelling45 = "Devarim"
    val listOfPossibleSpellings45 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling45: Map<String, String> = listOfPossibleSpellings45.associateWith { actualSpelling45 }


    val actualSpelling46 = "Va'eschanan"
    val listOfPossibleSpellings46 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling46: Map<String, String> = listOfPossibleSpellings46.associateWith { actualSpelling46 }


    val actualSpelling47 = "Eikev"
    val listOfPossibleSpellings47 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling47: Map<String, String> = listOfPossibleSpellings47.associateWith { actualSpelling47 }


    val actualSpelling48 = "Re'eh"
    val listOfPossibleSpellings48 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling48: Map<String, String> = listOfPossibleSpellings48.associateWith { actualSpelling48 }


    val actualSpelling49 = "Shoftim"
    val listOfPossibleSpellings49 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling49: Map<String, String> = listOfPossibleSpellings49.associateWith { actualSpelling49 }


    val actualSpelling50a = "Ki Setzei"
    val listOfPossibleSpellings50a = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling50a: Map<String, String> = listOfPossibleSpellings50a.associateWith { actualSpelling50a }


    val actualSpelling51a = "Ki Savo"
    val listOfPossibleSpellings51a = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling51a: Map<String, String> = listOfPossibleSpellings51a.associateWith { actualSpelling51a }


    val actualSpelling52 = "Nitzavim"
    val listOfPossibleSpellings52 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling52: Map<String, String> = listOfPossibleSpellings52.associateWith { actualSpelling52 }


    val actualSpelling53 = "Vayelech"
    val listOfPossibleSpellings53 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling53: Map<String, String> = listOfPossibleSpellings53.associateWith { actualSpelling53 }


    val actualSpelling54 = "Ha'azinu"
    val listOfPossibleSpellings54 = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling54: Map<String, String> = listOfPossibleSpellings54.associateWith { actualSpelling54 }


    val actualSpelling55a = "V'Zos HaBracha"
    val listOfPossibleSpellings55a = listOf("asasasasasasasefesfe")
    val mapOfPossibleSpellingToCorrectSpelling55a: Map<String, String> = listOfPossibleSpellings55a.associateWith { actualSpelling55a }


    val mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpelling = mapOf(
            listOfPossibleSpellings1 to mapOfPossibleSpellingToCorrectSpelling1,
            listOfPossibleSpellings2 to mapOfPossibleSpellingToCorrectSpelling2,
            listOfPossibleSpellings4 to mapOfPossibleSpellingToCorrectSpelling4,
            listOfPossibleSpellings6 to mapOfPossibleSpellingToCorrectSpelling6,
            listOfPossibleSpellings7 to mapOfPossibleSpellingToCorrectSpelling7,
            listOfPossibleSpellings8 to mapOfPossibleSpellingToCorrectSpelling8,
            listOfPossibleSpellings9 to mapOfPossibleSpellingToCorrectSpelling9,
            listOfPossibleSpellings10 to mapOfPossibleSpellingToCorrectSpelling10,
            listOfPossibleSpellings11 to mapOfPossibleSpellingToCorrectSpelling11,
            listOfPossibleSpellings12 to mapOfPossibleSpellingToCorrectSpelling12,
            listOfPossibleSpellings13 to mapOfPossibleSpellingToCorrectSpelling13,
            listOfPossibleSpellings14 to mapOfPossibleSpellingToCorrectSpelling14,
            listOfPossibleSpellings15 to mapOfPossibleSpellingToCorrectSpelling15,
            listOfPossibleSpellings16 to mapOfPossibleSpellingToCorrectSpelling16,
            listOfPossibleSpellings17 to mapOfPossibleSpellingToCorrectSpelling17,
            listOfPossibleSpellings18 to mapOfPossibleSpellingToCorrectSpelling18,
            listOfPossibleSpellings19 to mapOfPossibleSpellingToCorrectSpelling19,
            listOfPossibleSpellings20 to mapOfPossibleSpellingToCorrectSpelling20,
            listOfPossibleSpellings22 to mapOfPossibleSpellingToCorrectSpelling22,
            listOfPossibleSpellings23 to mapOfPossibleSpellingToCorrectSpelling23,
//"Sefer Vayikra" by accident
            listOfPossibleSpellings25 to mapOfPossibleSpellingToCorrectSpelling25,
            listOfPossibleSpellings26 to mapOfPossibleSpellingToCorrectSpelling26,
            listOfPossibleSpellings27 to mapOfPossibleSpellingToCorrectSpelling27,
            listOfPossibleSpellings28 to mapOfPossibleSpellingToCorrectSpelling28,
            listOfPossibleSpellings29 to mapOfPossibleSpellingToCorrectSpelling29,
            listOfPossibleSpellings31 to mapOfPossibleSpellingToCorrectSpelling31,
            listOfPossibleSpellings32 to mapOfPossibleSpellingToCorrectSpelling32,
            listOfPossibleSpellings33 to mapOfPossibleSpellingToCorrectSpelling33,
            listOfPossibleSpellings34 to mapOfPossibleSpellingToCorrectSpelling34,
            listOfPossibleSpellings35 to mapOfPossibleSpellingToCorrectSpelling35,
            listOfPossibleSpellings36 to mapOfPossibleSpellingToCorrectSpelling36,
            listOfPossibleSpellings37 to mapOfPossibleSpellingToCorrectSpelling37,
            listOfPossibleSpellings38 to mapOfPossibleSpellingToCorrectSpelling38,
            listOfPossibleSpellings39 to mapOfPossibleSpellingToCorrectSpelling39,
            listOfPossibleSpellings40 to mapOfPossibleSpellingToCorrectSpelling40,
            listOfPossibleSpellings41 to mapOfPossibleSpellingToCorrectSpelling41,
            listOfPossibleSpellings42 to mapOfPossibleSpellingToCorrectSpelling42,
            listOfPossibleSpellings43 to mapOfPossibleSpellingToCorrectSpelling43,
            listOfPossibleSpellings44 to mapOfPossibleSpellingToCorrectSpelling44,
            listOfPossibleSpellings45 to mapOfPossibleSpellingToCorrectSpelling45,
            listOfPossibleSpellings46 to mapOfPossibleSpellingToCorrectSpelling46,
            listOfPossibleSpellings47 to mapOfPossibleSpellingToCorrectSpelling47,
            listOfPossibleSpellings48 to mapOfPossibleSpellingToCorrectSpelling48,
            listOfPossibleSpellings49 to mapOfPossibleSpellingToCorrectSpelling49,
            listOfPossibleSpellings52 to mapOfPossibleSpellingToCorrectSpelling52,
            listOfPossibleSpellings53 to mapOfPossibleSpellingToCorrectSpelling53,
            listOfPossibleSpellings54 to mapOfPossibleSpellingToCorrectSpelling54,


            listOfPossibleSpellings3a to mapOfPossibleSpellingToCorrectSpelling3a,
            listOfPossibleSpellings5a to mapOfPossibleSpellingToCorrectSpelling5a,
            listOfPossibleSpellings21a to mapOfPossibleSpellingToCorrectSpelling21a,
            listOfPossibleSpellings30a to mapOfPossibleSpellingToCorrectSpelling30a,
            listOfPossibleSpellings50a to mapOfPossibleSpellingToCorrectSpelling50a,
            listOfPossibleSpellings51a to mapOfPossibleSpellingToCorrectSpelling51a,
            listOfPossibleSpellings55a to mapOfPossibleSpellingToCorrectSpelling55a
    )
    val doubleParshiyosList = listOf(
            actualSpelling22, actualSpelling23,
            actualSpelling28, actualSpelling29,
            actualSpelling30a, actualSpelling31,
            actualSpelling33, actualSpelling34,
            actualSpelling40, actualSpelling41,
            actualSpelling43, actualSpelling44,
            actualSpelling52, actualSpelling53
    )
val doubleParshiyosMap = mapOf(
        actualSpelling22 to actualSpelling23,
        actualSpelling28 to actualSpelling29,
        actualSpelling30a to actualSpelling31,
        actualSpelling33 to actualSpelling34,
        actualSpelling40 to actualSpelling41,
        actualSpelling43 to actualSpelling44,
        actualSpelling52 to actualSpelling53
)
val doubleParshiyosAsStringWithSemiColonInBetween = listOf(
        "$actualSpelling22;$actualSpelling23",
        "$actualSpelling28;$actualSpelling29",
        "$actualSpelling30a;$actualSpelling31",
        "$actualSpelling33;$actualSpelling34",
        "$actualSpelling40;$actualSpelling41",
        "$actualSpelling43;$actualSpelling44",
        "$actualSpelling52;$actualSpelling53"
)
fun doubleParshiyosMappedToDoubleParshiyosAsStringWithSemiColon(): MutableMap<String, String> {
    var indexOfDoubleParshiyosAsStringWithSemiColonInBetween=0
    val doubleParshiyosMappedToDoubleParshiyosAsStringWithSemiColon:MutableMap<String,String> = mutableMapOf()
    for(doubleParshaActualSpelling in doubleParshiyosList){
        if(doubleParshiyosList.indexOf(doubleParshaActualSpelling) % 2 == 0) indexOfDoubleParshiyosAsStringWithSemiColonInBetween++
        doubleParshiyosMappedToDoubleParshiyosAsStringWithSemiColon[doubleParshaActualSpelling] = doubleParshiyosAsStringWithSemiColonInBetween.elementAt(indexOfDoubleParshiyosAsStringWithSemiColonInBetween-1)
    }
    return doubleParshiyosMappedToDoubleParshiyosAsStringWithSemiColon
}
