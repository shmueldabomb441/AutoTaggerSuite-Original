package parshaTagger


const val actualSpeling1 = "Bereishis"
val listOfPossibleSpelings1 = listOf(
        "bereishis",

        "bereshis", "bereshit",
        "bereshith", "bereshees",
        "beresheet", "beresheeth",

        "biraishis", "bireishis",
        "beraishis", "bereishis",

        "biraishit", "bireishit",
        "beraishit", "bereishit",

        "biraishees", "bireishees",
        "beraishees", "bereishees",
        "biraisheet", "bireisheet",
        "beraisheet", "bereisheet",
        "buraishis", "bureishis",
        "buraishit", "bureishit",

        "buraishees", "bureishees",
        "buraisheet", "bureisheet",


        "boraishis", "boreishis",

        "boraishit", "boreishit",

        "boraishees", "boreishees",
        "boraisheet", "boreisheet",


        "baraishis", "bareishis",

        "baraishit", "bareishit",

        "baraishees", "bareishees",
        "baraisheet", "bareisheet",

        "biraishith",
        "bireishith",
        "beraishith",
        "bereishith",
        "biraisheeth",
        "bireisheeth",
        "beraisheeth",
        "bereisheeth",
        "buraishith",
        "bureishith",
        "buraishith",
        "bureishith",
        "buraisheeth",
        "bureisheeth",
        "buraisheeth",
        "bureisheeth",
        "boraishith",
        "boreishith",
        "boraishith",
        "boreishith",
        "boraisheeth",
        "boreisheeth",
        "boraisheeth",
        "boreisheeth",
        "baraishith",
        "bareishith",
        "baraishith",
        "bareishith",
        "baraisheeth",
        "bareisheeth",
        "baraisheeth",
        "bareisheeth",


        "b'raishis",
        "b'reishis",
        "b'raishit",
        "b'reishit",
        "b'raishees",
        "b'reishees",
        "b'raisheet",
        "b'reisheet",
        "b'raishith",
        "b'reishith",
        "b'raisheeth",
        "b'reisheeth",

        "breishis",
        "braishis",
        "breishees",
        "braishees",

        "breishit",
        "braishit",
        "breisheet",
        "braisheet",

        "breishith",
        "braishith",
        "breisheeth",
        "braisheeth"
        )
val mapOfPossibleSpelingToCorrectSpeling1: Map<String, String> = listOfPossibleSpelings1.associateWith { actualSpeling1 }


const val actualSpeling2 = "Noach"
val listOfPossibleSpelings2 = listOf(
        "noach",
        "no'ach", "now'ach",
        "noach", "nowach",
        "noah", "nowah",
        "noakh", "nowakh", "now'ach",

        "no'ach", "noh'ach",
        "noach", "nohach",
        "noah", "nohah",
        "noakh", "nohakh"
)
val mapOfPossibleSpelingToCorrectSpeling2: Map<String, String> = listOfPossibleSpelings2.associateWith { actualSpeling2 }


const val actualSpeling3a = "Lech Lecha"
val listOfPossibleSpelings3a = listOf(
        "lech lecha",
        "leich licha",
        "lech licha",
        "laich licha",
        "leich lecha",
        "laich lecha",
        "lekh lekha",
        "lekh lekhah",

        "leikh likha",
        "lekh likha",
        "laikh likha",
        "leikh lekha",
        "laikh lekha",

        "leich lichah",
        "lech lichah",
        "laich lichah",
        "leich lechah",
        "laich lechah",

        "leikh likhah",
        "lekh likhah",
        "laikh likhah",
        "leikh lekhah",
        "laikh lekhah",

        "leich licho",
        "lech licho",
        "laich licho",
        "leich lecho",
        "laich lecho",

        "leikh likho",
        "lekh likho",
        "laikh likho",
        "leikh lekho",
        "laikh lekho",


        "leich lichoh",
        "lech lichoh",
        "laich lichoh",
        "leich lechoh",
        "laich lechoh",

        "leikh likhoh",
        "lekh likhoh",
        "laikh likhoh",
        "leikh lekhoh",
        "laikh lekhoh",


        "leich lucha",
        "lech lucha",
        "laich lucha",
        "leich lucha",
        "laich lucha",

        "leikh lukha",
        "lekh lukha",
        "laikh lukha",
        "leikh lukha",
        "laikh lukha",

        "leich luchah",
        "lech luchah",
        "laich luchah",
        "leich luchah",
        "laich luchah",

        "leikh lukhah",
        "lekh lukhah",
        "laikh lukhah",
        "leikh lukhah",
        "laikh lukhah",

        "leich lucho",
        "lech lucho",
        "laich lucho",
        "leich lucho",
        "laich lucho",

        "leikh lukho",
        "lekh lukho",
        "laikh lukho",
        "leikh lukho",
        "laikh lukho",


        "leich luchoh",
        "lech luchoh",
        "laich luchoh",
        "leich luchoh",
        "laich luchoh",

        "leikh lukhoh",
        "lekh lukhoh",
        "laikh lukhoh",
        "leikh lukhoh",
        "laikh lukhoh",


        "leich locha",
        "lech locha",
        "laich locha",
        "leich locha",
        "laich locha",

        "leikh lokha",
        "lekh lokha",
        "laikh lokha",
        "leikh lokha",
        "laikh lokha",

        "leich lochah",
        "lech lochah",
        "laich lochah",
        "leich lochah",
        "laich lochah",

        "leikh lokhah",
        "lekh lokhah",
        "laikh lokhah",
        "leikh lokhah",
        "laikh lokhah",

        "leich locho",
        "lech locho",
        "laich locho",
        "leich locho",
        "laich locho",

        "leikh lokho",
        "lekh lokho",
        "laikh lokho",
        "leikh lokho",
        "laikh lokho",


        "leich lochoh",
        "lech lochoh",
        "laich lochoh",
        "leich lochoh",
        "laich lochoh",

        "leikh lokhoh",
        "lekh lokhoh",
        "laikh lokhoh",
        "leikh lokhoh",
        "laikh lokhoh",


        "leih liha",
        "leh liha",
        "laih liha",
        "leih leha",
        "laih leha",

        "leih liha",
        "leh liha",
        "laih liha",
        "leih leha",
        "laih leha",

        "leih lihah",
        "leh lihah",
        "laih lihah",
        "leih lehah",
        "laih lehah",

        "leih lihah",
        "leh lihah",
        "laih lihah",
        "leih lehah",
        "laih lehah",

        "leih liho",
        "leh liho",
        "laih liho",
        "leih leho",
        "laih leho",

        "leih liho",
        "leh liho",
        "laih liho",
        "leih leho",
        "laih leho",


        "leih lihoh",
        "leh lihoh",
        "laih lihoh",
        "leih lehoh",
        "laih lehoh",

        "leih lihoh",
        "leh lihoh",
        "laih lihoh",
        "leih lehoh",
        "laih lehoh",


        "leih luha",
        "leh luha",
        "laih luha",
        "leih luha",
        "laih luha",

        "leih luha",
        "leh luha",
        "laih luha",
        "leih luha",
        "laih luha",

        "leih luhah",
        "leh luhah",
        "laih luhah",
        "leih luhah",
        "laih luhah",

        "leih luhah",
        "leh luhah",
        "laih luhah",
        "leih luhah",
        "laih luhah",

        "leih luho",
        "leh luho",
        "laih luho",
        "leih luho",
        "laih luho",

        "leih luho",
        "leh luho",
        "laih luho",
        "leih luho",
        "laih luho",


        "leih luhoh",
        "leh luhoh",
        "laih luhoh",
        "leih luhoh",
        "laih luhoh",

        "leih luhoh",
        "leh luhoh",
        "laih luhoh",
        "leih luhoh",
        "laih luhoh",


        "leih loha",
        "leh loha",
        "laih loha",
        "leih loha",
        "laih loha",

        "leih loha",
        "leh loha",
        "laih loha",
        "leih loha",
        "laih loha",

        "leih lohah",
        "leh lohah",
        "laih lohah",
        "leih lohah",
        "laih lohah",

        "leih lohah",
        "leh lohah",
        "laih lohah",
        "leih lohah",
        "laih lohah",

        "leih loho",
        "leh loho",
        "laih loho",
        "leih loho",
        "laih loho",

        "leih loho",
        "leh loho",
        "laih loho",
        "leih loho",
        "laih loho",


        "leih lohoh",
        "leh lohoh",
        "laih lohoh",
        "leih lohoh",
        "laih lohoh",

        "leih lohoh",
        "leh lohoh",
        "laih lohoh",
        "leih lohoh",
        "laih lohoh",


        "leich l'cha",
        "lech l'cha",
        "laich l'cha",
        "leikh l'kha",
        "lekh l'kha",
        "laikh l'kha",
        "leich l'chah",
        "lech l'chah",
        "laich l'chah",
        "leikh l'khah",
        "lekh l'khah",
        "laikh l'khah",
        "leich l'cho",
        "lech l'cho",
        "laich l'cho",
        "leikh l'kho",
        "lekh l'kho",
        "laikh l'kho",
        "leich l'choh",
        "lech l'choh",
        "laich l'choh",
        "leikh l'khoh",
        "lekh l'khoh",
        "laikh l'khoh",
        "leih l'ha",
        "leh l'ha",
        "laih l'ha",
        "leih l'ha",
        "leh l'ha",
        "laih l'ha",
        "leih l'hah",
        "leh l'hah",
        "laih l'hah",
        "leih l'hah",
        "leh l'hah",
        "laih l'hah",
        "leih l'ho",
        "leh l'ho",
        "laih l'ho",
        "leih l'ho",
        "leh l'ho",
        "laih l'ho",
        "leih l'hoh",
        "leh l'hoh",
        "laih l'hoh",
        "leih l'hoh",
        "leh l'hoh",
        "laih l'hoh"
)
val mapOfPossibleSpelingToCorrectSpeling3a: Map<String, String> = listOfPossibleSpelings3a.associateWith { actualSpeling3a }


const val actualSpeling4 = "Vayeira"
val listOfPossibleSpelings4 = listOf(
        "vayeira",
        "vayeirah",
        "vayera",
        "vayaira",
        "vayerah",
        "vayairah",
        "vayeiruh",
        "vayeru",
        "vayairu",
        "vayeruh",
        "vayairuh",


        "vahyeirah",
        "vahyera",
        "vahyaira",
        "vahyerah",
        "vahyairah",
        "vahyeiruh",
        "vahyeru",
        "vahyairu",
        "vahyeruh",
        "vahyairuh",


        "vuyeirah",
        "vuyera",
        "vuyaira",
        "vuyerah",
        "vuyairah",
        "vuyeiruh",
        "vuyeru",
        "vuyairu",
        "vuyeruh",
        "vuyairuh",


        "vuhyeirah",
        "vuhyera",
        "vuhyaira",
        "vuhyerah",
        "vuhyairah",
        "vuhyeiruh",
        "vuhyeru",
        "vuhyairu",
        "vuhyeruh",
        "vuhyairuh"
)
val mapOfPossibleSpelingToCorrectSpeling4: Map<String, String> = listOfPossibleSpelings4.associateWith { actualSpeling4 }


const val actualSpeling5a = "Chayei Sara"
val listOfPossibleSpelings5a = listOf(
        "chayei sara",
        "chayai sara",
        "chayei sarah",
        "chayai sarah",
        "chayei soro",
        "chayei soroh",
        "chayai soro",
        "chayai soroh",

        "chayai sura",
        "chayei surah",
        "chayai surah",
        "chayei suro",
        "chayei suroh",
        "chayai suro",
        "chayai suroh",


        "chayai saru",
        "chayei saruh",
        "chayai saruh",
        "chayei soru",
        "chayei soruh",
        "chayai soru",
        "chayai soruh",
        "chayyei sarah",

        "hayai suru",
        "hayei suruh",
        "hayai suruh",
        "hayei suru",
        "hayei suruh",
        "hayai suru",
        "hayai suruh",


        "hayai sara",
        "hayei sarah",
        "hayai sarah",
        "hayei soro",
        "hayei soroh",
        "hayai soro",
        "hayai soroh",

        "hayai sura",
        "hayei surah",
        "hayai surah",
        "hayei suro",
        "hayei suroh",
        "hayai suro",
        "hayai suroh",


        "hayai saru",
        "hayei saruh",
        "hayai saruh",
        "hayei soru",
        "hayei soruh",
        "hayai soru",
        "hayai soruh",

        "hayai suru",
        "hayei suruh",
        "hayai suruh",
        "hayei suru",
        "hayei suruh",
        "hayai suru",
        "hayai suruh",
        "hayyei sarah"

)
val mapOfPossibleSpelingToCorrectSpeling5a: Map<String, String> = listOfPossibleSpelings5a.associateWith { actualSpeling5a }


const val actualSpeling6 = "Toldos"
val listOfPossibleSpelings6 = listOf(
        "toldos",
        "tolidos",
        "tolidot",
        "toledos",
        "toledot",
        "toledoth",
        "toldos",
        "toldot",
        "tolidoth",
        "toldoth",


        "tol'dos",
        "tol'dot",
        "tol'doth"
)
val mapOfPossibleSpelingToCorrectSpeling6: Map<String, String> = listOfPossibleSpelings6.associateWith { actualSpeling6 }


const val actualSpeling7 = "Vayeitzei"
val listOfPossibleSpelings7 = listOf(
        "vayeitzei",
        "vayetzei",
        "vayetzai",
        "vayeitzai",

        "vayetsei",
        "vayetsai",
        "vayeisai",
        "vayeisei",
        "vayeissai",
        "vayeissei",


        "vayezei",
        "vayezai",
        "vayeizai",
        "vayeizei",


        "vayetze",
        "vayetse",
        "vayeise",
        "vayeisse",


        "vayeze",
        "vayeize"
)
val mapOfPossibleSpelingToCorrectSpeling7: Map<String, String> = listOfPossibleSpelings7.associateWith { actualSpeling7 }


const val actualSpeling8 = "Vayishlach"
val listOfPossibleSpelings8 = listOf(
        "vayishlach",
        "vayishlah",
        "vayeeshlach",
        "vayeeshlah",

        "vayishlakh",
        "vayeeshlakh",


        "vayishlah",
        "vayeeshlahch",
        "vayeeshlah",

        "vayishlahkh",
        "vayeeshlahkh"
)
val mapOfPossibleSpelingToCorrectSpeling8: Map<String, String> = listOfPossibleSpelings8.associateWith { actualSpeling8 }


const val actualSpeling9 = "Vayeshev"
val listOfPossibleSpelings9 = listOf(
        "vayeshev",
        "vayeishev",
        "vayaishev"
)
val mapOfPossibleSpelingToCorrectSpeling9: Map<String, String> = listOfPossibleSpelings9.associateWith { actualSpeling9 }


const val actualSpeling10 = "Mikeitz"
val listOfPossibleSpelings10 = listOf(
        "mikeitz",
        "meekaitz",
        "meekais",
        "meekaiz",
        "meekeitz",
        "meekeis",
        "meekeiz",
        "mikais",
        "mikaiz",
        "mikeis",
        "mikeiz",
        "meekaiss",
        "meekeiss",
        "mikaiss",
        "mikeiss",


        "miqeitz",
        "meeqaitz",
        "meeqais",
        "meeqaiz",
        "meeqeitz",
        "meeqeis",
        "meeqeiz",
        "miqais",
        "miqaiz",
        "miqeis",
        "miqeiz",
        "meeqaiss",
        "meeqeiss",
        "miqaiss",
        "miqeiss",


        "meekkaitz",
        "meekkais",
        "meekkaiz",
        "meekkeitz",
        "meekkeis",
        "meekkeiz",
        "mikkais",
        "mikkaiz",
        "mikkeis",
        "mikkeiz",
        "meekkaiss",
        "meekkeiss",
        "mikkaiss",
        "mikkeiss"
)
val mapOfPossibleSpelingToCorrectSpeling10: Map<String, String> = listOfPossibleSpelings10.associateWith { actualSpeling10 }


const val actualSpeling11 = "Vayigash"
val listOfPossibleSpelings11 = listOf(
        "vayigash",
        "vayeegash",
        "vayeegahsh",
        "vayigahsh"
)
val mapOfPossibleSpelingToCorrectSpeling11: Map<String, String> = listOfPossibleSpelings11.associateWith { actualSpeling11 }


const val actualSpeling12 = "Vayechi"
val listOfPossibleSpelings12 = listOf(
        "vayechi",
        "vayechee",
        "vayichi",
        "vayichee",
        "vay'chi",
        "vay'chee",
        "vayehee",
        "vayihi",
        "vayihee",
        "vay'hi",
        "vay'hee",
        "vayehi"
)
val mapOfPossibleSpelingToCorrectSpeling12: Map<String, String> = listOfPossibleSpelings12.associateWith { actualSpeling12 }


const val actualSpeling13 = "Shemos"
val listOfPossibleSpelings13 = listOf(
        "shemos",
        "shimos",
        "shimoth",
        "shemot",
        "shemoth",
        "sh'mot",
        "sh'mos",
        "sh'moth"
)
val mapOfPossibleSpelingToCorrectSpeling13: Map<String, String> = listOfPossibleSpelings13.associateWith { actualSpeling13 }


const val actualSpeling14 = "Va'eira"
val listOfPossibleSpelings14 = listOf(
        "va'eira",
        "vaeira",
        "vaaira",
        "v'aira",
        "v'eira",
        "vaeirah",
        "vaairah",
        "v'airah",
        "v'eirah",
        "va'era",
        "va'erah",

        "vaeiru",
        "vaairu",
        "v'airu",
        "v'eiru",
        "vaeiruh",
        "vaairuh",
        "v'airuh",
        "v'eiruh",

        "vaeiro",
        "vaairo",
        "v'airo",
        "v'eiro",
        "vaeiroh",
        "vaairoh",
        "v'airoh",
        "v'eiroh",

        "waeira",
        "waaira",
        "w'aira",
        "w'eira",
        "waeirah",
        "waairah",
        "w'airah",
        "w'eirah",


        "waeiru",
        "waairu",
        "w'airu",
        "w'eiru",
        "waeiruh",
        "waairuh",
        "w'airuh",
        "w'eiruh",

        "waeiro",
        "waairo",
        "w'airo",
        "w'eiro",
        "waeiroh",
        "waairoh",
        "w'airoh",
        "w'eiroh"

)
val mapOfPossibleSpelingToCorrectSpeling14: Map<String, String> = listOfPossibleSpelings14.associateWith { actualSpeling14 }


const val actualSpeling15 = "Bo"
val listOfPossibleSpelings15 = listOf(
        "bo",
        "boh",
        "bow"
)
val mapOfPossibleSpelingToCorrectSpeling15: Map<String, String> = listOfPossibleSpelings15.associateWith { actualSpeling15 }


const val actualSpeling16 = "Beshalach"
val listOfPossibleSpelings16 = listOf(
        "beshalach",
        "bishalach",
        "b'shalach",
        "beshalah",
        "bishalah",
        "b'shalah",
        "bishahlahch",
        "b'shahlahch",
        "beshahlah",
        "bishahlah",
        "b'ishahlah",
        "beshalach",
        "bishalach",
        "bishalach",


        "beshalah",
        "bishalah",
        "bishalah",


        "beshahlah",
        "bishahlah",
        "bishahlah"

)
val mapOfPossibleSpelingToCorrectSpeling16: Map<String, String> = listOfPossibleSpelings16.associateWith { actualSpeling16 }


const val actualSpeling17 = "Yisro"
val listOfPossibleSpelings17 = listOf(
        "yisro",
        "yithro",
        "yeesro",
        "yeethro",
        "yisroh",
        "yithroh",
        "yeethroh",
        "yeesroh",
        "yitro",
        "yitroh",
        "yeetro",
        "yeetroh",


        "yithrow",
        "yeesrow",
        "yeethrow",
        "yisrow",
        "yithrow",
        "yeethrow",
        "yeesrow",
        "yitrow",
        "yitrow",
        "yeetrow",
        "yeetrow"
)
val mapOfPossibleSpelingToCorrectSpeling17: Map<String, String> = listOfPossibleSpelings17.associateWith { actualSpeling17 }


const val actualSpeling18 = "Mishpatim"
val listOfPossibleSpelings18 = listOf(
        "mishpatim",
        "meeshpattim",
        "meeshpatim",
        "meeshputeem",
        "meeshpatteem",
        "meeshpateem",
        "mishputtim",
        "mishputim",
        "mishpateem",
        "mishpatteem",
        "mishputteem",
        "mishputeem",


        "m'shputtim",
        "m'shputim",
        "m'shpateem",
        "m'shpatteem",
        "m'shputteem",
        "m'shputeem"
)
val mapOfPossibleSpelingToCorrectSpeling18: Map<String, String> = listOfPossibleSpelings18.associateWith { actualSpeling18 }


const val actualSpeling19 = "Terumah"
val listOfPossibleSpelings19 = listOf(
        "terumah",
        "tirumah",
        "tiruma",
        "teruma",
        "tirooma",
        "tiroomah",

        "tirumuh",
        "tirumu",
        "terumu",
        "tiroomu",
        "tiroomuh",
        "terooma",
        "teroomah",
        "teroomuh",
        "teroomu",
        "truma",
        "trooma",
        "trumah",
        "troomah",
        "troomu",
        "troomuh",
        "trumuh",
        "t'ruma",
        "t'rumuh",
        "t'rumah",
        "t'rumu",
        "t'roomu",
        "t'rooma",
        "t'roomuh",
        "t'roomah"
)
val mapOfPossibleSpelingToCorrectSpeling19: Map<String, String> = listOfPossibleSpelings19.associateWith { actualSpeling19 }


const val actualSpeling20 = "Tetzaveh"
val listOfPossibleSpelings20 = listOf(
        "tetzaveh",
        "titzaveh",
        "tisaveh",
        "tizaveh",
        "tissaveh",
        "t'tzaveh",
        "t'saveh",
        "t'zaveh",
        "t'ssaveh",

        "titzave",
        "tisave",
        "tizave",
        "tissave",
        "t'tzave",
        "t'save",
        "t'zave",
        "t'ssave",

        "titzaweh",
        "tisaweh",
        "tizaweh",
        "tissaweh",
        "t'tzaweh",
        "t'saweh",
        "t'zaweh",
        "t'ssaweh",

        "titzawe",
        "tisawe",
        "tizawe",
        "tissawe",
        "t'tzawe",
        "t'sawe",
        "t'zawe",
        "t'ssawe"
)
val mapOfPossibleSpelingToCorrectSpeling20: Map<String, String> = listOfPossibleSpelings20.associateWith { actualSpeling20 }


const val actualSpeling21a = "Ki Sisa"
val listOfPossibleSpelings21a = listOf(
        "ki sisa",
        "kee seesa",
        "kee seesah",
        "ki seesa",
        "ki seesah",
        "ki sisah",
        "key sisa",
        "key seesa",
        "key seesah",

        "kee teesa",
        "kee teesah",
        "ki teesa",
        "ki teesah",
        "ki tisah",
        "key tisa",
        "key teesa",
        "key teesah",

        "kee theesa",
        "kee theesah",
        "ki theesa",
        "ki theesah",
        "ki thisah",
        "key thisa",
        "key theesa",
        "key theesah",


        "kee seessa",
        "kee seessah",
        "ki seessa",
        "ki seessah",
        "ki sissah",
        "key sissa",
        "key seessa",
        "key seessah",

        "kee teessa",
        "kee teessah",
        "ki teessa",
        "ki teessah",
        "ki tissah",
        "key tissa",
        "key teessa",
        "key teessah",

        "kee theessa",
        "kee theessah",
        "ki theessa",
        "ki theessah",
        "ki thissah",
        "key thissa",
        "key theessa",
        "key theessah",


        "kee seesu",
        "kee seesuh",
        "ki seesu",
        "ki seesuh",
        "ki sisuh",
        "key sisu",
        "key seesu",
        "key seesuh",

        "kee teesu",
        "kee teesuh",
        "ki teesu",
        "ki teesuh",
        "ki tisuh",
        "key tisu",
        "key teesu",
        "key teesuh",

        "kee theesu",
        "kee theesuh",
        "ki theesu",
        "ki theesuh",
        "ki thisuh",
        "key thisu",
        "key theesu",
        "key theesuh",


        "kee seessu",
        "kee seessuh",
        "ki seessu",
        "ki seessuh",
        "ki sissuh",
        "key sissu",
        "key seessu",
        "key seessuh",

        "kee teessu",
        "kee teessuh",
        "ki teessu",
        "ki teessuh",
        "ki tissuh",
        "key tissu",
        "key teessu",
        "key teessuh",

        "kee theessu",
        "kee theessuh",
        "ki theessu",
        "ki theessuh",
        "ki thissuh",
        "key thissu",
        "key theessu",
        "key theessuh"
)
val mapOfPossibleSpelingToCorrectSpeling21a: Map<String, String> = listOfPossibleSpelings21a.associateWith { actualSpeling21a }


const val actualSpeling22 = "Vayakhail"
val listOfPossibleSpelings22 = listOf(
        "vayakhail",
        "vayakail",
        "vayakeil",
        "vayakheil",
        "vayakhel",
        "vayakel",

        "wayakail",
        "wayakeil",
        "wayakheil",
        "wayakhel",
        "wayakel"
)
val mapOfPossibleSpelingToCorrectSpeling22: Map<String, String> = listOfPossibleSpelings22.associateWith { actualSpeling22 }


const val actualSpeling23 = "Pekudei"
val listOfPossibleSpelings23 = listOf(
        "pekudei",
        "pekudai",
        "pikudai",
        "pikudei",
        "p'kudei",
        "p'kudai",

        "pekoodai",
        "pikoodai",
        "pikoodei",
        "p'koodei",
        "p'koodai",

        "pekuday",
        "pikuday",
        "p'kuday",
        "pekooday",
        "pikooday",
        "p'kooday"
)
val mapOfPossibleSpelingToCorrectSpeling23: Map<String, String> = listOfPossibleSpelings23.associateWith { actualSpeling23 }


const val actualSpeling25 = "Vayikra"
val listOfPossibleSpelings25 = listOf(
        "vayikra",
        "vayikrah",
        "vayeekrah",
        "vayeekra",
        "vayikruh",
        "vayeekruh",
        "vayeekru",
        "vayikru",

        "wayikrah",
        "wayeekrah",
        "wayeekra",
        "wayikruh",
        "wayeekruh",
        "wayeekru",
        "wayikru"
)
val mapOfPossibleSpelingToCorrectSpeling25: Map<String, String> = listOfPossibleSpelings25.associateWith { actualSpeling25 }


const val actualSpeling26 = "Tzav"
val listOfPossibleSpelings26 = listOf(
        "tzav",
        "sav",
        "zav",
        "saw",
        "zaw",
        "tsav",
        "tsaw"
)
val mapOfPossibleSpelingToCorrectSpeling26: Map<String, String> = listOfPossibleSpelings26.associateWith { actualSpeling26 }


const val actualSpeling27 = "Shemini"
val listOfPossibleSpelings27 = listOf(
        "shemini",
        "shmini",
        "shminee",
        "shmeeni",
        "sh'mini",
        "sh'minee",
        "shmeenee",
        "shemeenee",
        "sheminee",
        "shemeeni"
)
val mapOfPossibleSpelingToCorrectSpeling27: Map<String, String> = listOfPossibleSpelings27.associateWith { actualSpeling27 }


const val actualSpeling28 = "Tazria"
val listOfPossibleSpelings28 = listOf(
        "tazria",
        "tasria",
        "tassria"
)
val mapOfPossibleSpelingToCorrectSpeling28: Map<String, String> = listOfPossibleSpelings28.associateWith { actualSpeling28 }


const val actualSpeling29 = "Metzora"
val listOfPossibleSpelings29 = listOf(
        "metzora",
        "metzorah",
        "mitzora",
        "mitzorah",
        "m'tzora",
        "m'tzorah",

        "metzoruh",
        "mitzoru",
        "mitzoruh",
        "m'tzoru",
        "m'tzoruh",


        "mezorah",
        "mizora",
        "mizorah",
        "m'zora",
        "m'zorah",

        "mezoruh",
        "mizoru",
        "mizoruh",
        "m'zoru",
        "m'zoruh"

)
val mapOfPossibleSpelingToCorrectSpeling29: Map<String, String> = listOfPossibleSpelings29.associateWith { actualSpeling29 }


const val actualSpeling30a = "Acharei Mos"
val listOfPossibleSpelings30a = listOf(
        "acharei mos",
        "achrei mos",
        "achrei mose",
        "acharei mose",
        "achrai mos",
        "acharai mos",
        "acharai mose",
        "achrai mose",


        "achrei mot",
        "achrei mote",
        "acharei mote",
        "achrai mot",
        "acharai mot",
        "acharai mote",
        "achrai mote",


        "achrei moth",
        "acharei moth",
        "achrai moth",
        "acharai moth",


        "ach'rei mos",
        "ach'rei mose",
        "ach'rai mos",
        "ach'rai mose",
        "ach'rei mot",
        "ach'rei mote",
        "ach'rai mot",
        "ach'rai mote",
        "ach'rei moth",
        "ach'rai moth"
)
val mapOfPossibleSpelingToCorrectSpeling30a: Map<String, String> = listOfPossibleSpelings30a.associateWith { actualSpeling30a }


const val actualSpeling31 = "Kedoshim"
val listOfPossibleSpelings31 = listOf(
        "kedoshim",
        "kedosheem",
        "kidoshim",
        "kidosheem",
        "kadoshim",
        "kadosheem",
        "k'doshim",
        "k'dosheem"
)
val mapOfPossibleSpelingToCorrectSpeling31: Map<String, String> = listOfPossibleSpelings31.associateWith { actualSpeling31 }


const val actualSpeling32 = "Emor"
val listOfPossibleSpelings32 = listOf(
        "emor",
        "emore",
        "ehmohre",
        "ehmore"
)
val mapOfPossibleSpelingToCorrectSpeling32: Map<String, String> = listOfPossibleSpelings32.associateWith { actualSpeling32 }


const val actualSpeling33 = "Behar"
val listOfPossibleSpelings33 = listOf(
        "behar",
        "bihar")
val mapOfPossibleSpelingToCorrectSpeling33: Map<String, String> = listOfPossibleSpelings33.associateWith { actualSpeling33 }


const val actualSpeling34 = "Bechukosai"
val listOfPossibleSpelings34 = listOf(
        "bechukosai",
        "bechukosei",
        "bichukosai",
        "bichukosei",
        "behukosei",
        "bihukosai",
        "bihukosei",
        "bechukkosei",
        "bichukkosai",
        "bichukkosei",
        "behukkosei",
        "bihukkosai",
        "bihukkosei",


        "b'chukosai",
        "b'chukosei",
        "b'hukosai",
        "b'hukosei",
        "b'chukkosai",
        "b'chukkosei",
        "b'hukkosai",
        "b'hukkosei",

        "bchukosai",
        "bchukosei",
        "bhukosai",
        "bhukosei",
        "bchukkosai",
        "bchukkosei",
        "bhukkosai",
        "bhukkosei",
        "bechukosi",
        "bchukosi",
        "bichukosi"
)
val mapOfPossibleSpelingToCorrectSpeling34: Map<String, String> = listOfPossibleSpelings34.associateWith { actualSpeling34 }


const val actualSpeling35 = "Bamidbar"
val listOfPossibleSpelings35 = listOf(
        "bamidbar",
        "bameedbar",
        "bamidbur",
        "bamidbuhr",
        "bameedbur",
        "bameedbuhr")
val mapOfPossibleSpelingToCorrectSpeling35: Map<String, String> = listOfPossibleSpelings35.associateWith { actualSpeling35 }


const val actualSpeling36 = "Naso"
val listOfPossibleSpelings36 = listOf(
        "naso",
        "nasso",
        "nusso",
        "nuso",
        "nuhsso",
        "nassoh",
        "nussoh",
        "nusoh",
        "nuhssoh",

        "nassow",
        "nussow",
        "nusow",
        "nuhssow"
)
val mapOfPossibleSpelingToCorrectSpeling36: Map<String, String> = listOfPossibleSpelings36.associateWith { actualSpeling36 }


const val actualSpeling37 = "Beha'aloscha"
val listOfPossibleSpelings37 = listOf(
        "beha'aloscha",
        "bihaaloscha", "behaaloscha",
        "biha'aloscha", "beha'aloscha",
        "bihaalos'cha", "behaalos'cha",
        "biha'alos'cha", "beha'alos'cha",
        "bihaloscha", "behaloscha",
        "biha'loscha", "beha'loscha",
        "bihalos'cha", "behalos'cha",
        "biha'los'cha", "beha'los'cha",
        "bihaaloschah", "behaaloschah",
        "biha'aloschah", "beha'aloschah",
        "bihaalos'chah", "behaalos'chah",
        "biha'alos'chah", "beha'alos'chah",
        "bihaloschah", "behaloschah",
        "biha'loschah", "beha'loschah",
        "bihalos'chah", "behalos'chah",
        "biha'los'chah", "beha'los'chah",
        "bihaalowscha", "behaalowscha",
        "biha'alowscha", "beha'alowscha",
        "bihaalows'cha", "behaalows'cha",
        "biha'alows'cha", "beha'alows'cha",
        "bihalowscha", "behalowscha",
        "biha'lowscha", "beha'lowscha",
        "bihalows'cha", "behalows'cha",
        "biha'lows'cha", "beha'lows'cha",
        "bihaalowschah", "behaalowschah",
        "biha'alowschah", "beha'alowschah",
        "bihaalows'chah", "behaalows'chah",
        "biha'alows'chah", "beha'alows'chah",
        "bihalowschah", "behalowschah",
        "biha'lowschah", "beha'lowschah",
        "bihalows'chah", "behalows'chah",
        "biha'lows'chah", "beha'lows'chah",
        "bihaalohscha", "behaalohscha",
        "biha'alohscha", "beha'alohscha",
        "bihaalohs'cha", "behaalohs'cha",
        "biha'alohs'cha", "beha'alohs'cha",
        "bihalohscha", "behalohscha",
        "biha'lohscha", "beha'lohscha",
        "bihalohs'cha", "behalohs'cha",
        "biha'lohs'cha", "beha'lohs'cha",
        "bihaalohschah", "behaalohschah",
        "biha'alohschah", "beha'alohschah",
        "bihaalohs'chah", "behaalohs'chah",
        "biha'alohs'chah", "beha'alohs'chah",
        "bihalohschah", "behalohschah",
        "biha'lohschah", "beha'lohschah",
        "bihalohs'chah", "behalohs'chah",
        "biha'lohs'chah", "beha'lohs'chah",
        "bihaalosicha", "biha'alosicha",
        "behaalosicha", "beha'alosicha",
        "bihalosicha", "behalosicha",
        "biha'losicha", "beha'losicha",
        "bihaalosichah", "biha'alosichah",
        "behaalosichah", "beha'alosichah",
        "bihalosichah", "behalosichah",
        "biha'losichah", "beha'losichah",
        "bihaalowsicha", "behaalowsicha",
        "biha'alowsicha", "beha'alowsicha",
        "bihalowsicha", "behalowsicha",
        "biha'lowsicha", "beha'lowsicha",
        "bihaalowsichah", "behaalowsichah",
        "biha'alowsichah", "beha'alowsichah",

        "bihalowsichah", "behalowsichah", "biha'lowsichah", "beha'lowsichah",
        "bihaalohsicha", "behaalohsicha", "biha'alohsicha", "beha'alohsicha",
        "bihalohsicha", "behalohsicha", "biha'lohsicha", "beha'lohsicha", "bihaalohsichah", "biha'alohsichah", "behaalohsichah", "beha'alohsichah",
        "bihalohsichah", "behalohsichah", "biha'lohsichah", "beha'lohsichah",
        "bihaalotcha", "behaalotcha", "biha'alotcha", "beha'alotcha", "bihaalot'cha", "behaalot'cha", "biha'alot'cha", "beha'alot'cha",
        "bihalotcha", "behalotcha", "biha'lotcha", "beha'lotcha", "bihalot'cha", "behalot'cha", "biha'lot'cha", "beha'lot'cha",
        "bihaalotchah", "behaalotchah", "biha'alotchah", "beha'alotchah", "bihaalot'chah", "behaalot'chah", "biha'alot'chah", "beha'alot'chah",
        "bihalotchah", "behalotchah", "biha'lotchah", "beha'lotchah", "bihalot'chah", "behalot'chah", "biha'lot'chah", "beha'lot'chah",
        "bihaalowtcha", "behaalowtcha", "biha'alowtcha", "beha'alowtcha", "bihaalowt'cha", "behaalowt'cha", "biha'alowt'cha", "beha'alowt'cha",
        "bihalowtcha", "behalowtcha", "biha'lowtcha", "beha'lowtcha", "bihalowt'cha", "behalowt'cha", "biha'lowt'cha", "beha'lowt'cha",
        "bihaalowtchah", "behaalowtchah", "biha'alowtchah", "beha'alowtchah", "bihaalowt'chah", "behaalowt'chah", "biha'alowt'chah", "beha'alowt'chah",
        "bihalowtchah", "behalowtchah", "biha'lowtchah", "beha'lowtchah", "bihalowt'chah", "behalowt'chah", "biha'lowt'chah", "beha'lowt'chah",
        "bihaalohtcha", "behaalohtcha", "biha'alohtcha", "beha'alohtcha", "bihaaloht'cha", "behaaloht'cha", "biha'aloht'cha", "beha'aloht'cha",
        "bihalohtcha", "behalohtcha", "biha'lohtcha", "beha'lohtcha", "bihaloht'cha", "behaloht'cha", "biha'loht'cha", "beha'loht'cha",
        "bihaalohtchah", "behaalohtchah", "biha'alohtchah", "beha'alohtchah", "bihaaloht'chah", "behaaloht'chah", "biha'aloht'chah", "beha'aloht'chah",
        "bihalohtchah", "behalohtchah", "biha'lohtchah", "beha'lohtchah", "bihaloht'chah", "behaloht'chah", "biha'loht'chah", "beha'loht'chah",
        "bihaaloticha", "behaaloticha", "biha'aloticha", "beha'aloticha",
        "bihaloticha", "behaloticha", "biha'loticha", "beha'loticha",
        "bihaalotichah", "behaalotichah", "biha'alotichah", "beha'alotichah",
        "bihalotichah", "behalotichah", "biha'lotichah", "beha'lotichah",
        "bihaalowticha", "behaalowticha", "biha'alowticha", "beha'alowticha",
        "bihalowticha", "behalowticha", "biha'lowticha", "beha'lowticha",
        "bihaalowtichah", "behaalowtichah", "biha'alowtichah", "beha'alowtichah",
        "bihalowtichah", "behalowtichah", "biha'lowtichah", "beha'lowtichah", "bihaalohticha", "biha'alohticha", "behaalohticha", "beha'alohticha",
        "bihalohticha", "behalohticha", "biha'lohticha", "beha'lohticha", "bihaalohtichah", "biha'alohtichah", "behaalohtichah", "beha'alohtichah",
        "bihalohtichah", "behalohtichah", "biha'lohtichah", "beha'lohtichah"
)
val mapOfPossibleSpelingToCorrectSpeling37: Map<String, String> = listOfPossibleSpelings37.associateWith { actualSpeling37 }


const val actualSpeling38 = "Shelach"
val listOfPossibleSpelings38 = listOf(
        "shelach",
        "sh'lach",
        "shilach"
)
val mapOfPossibleSpelingToCorrectSpeling38: Map<String, String> = listOfPossibleSpelings38.associateWith { actualSpeling38 }


const val actualSpeling39 = "Korach"
val listOfPossibleSpelings39 = listOf(
        "korach",
        "korah"
)
val mapOfPossibleSpelingToCorrectSpeling39: Map<String, String> = listOfPossibleSpelings39.associateWith { actualSpeling39 }


const val actualSpeling40 = "Chukas"
val listOfPossibleSpelings40 = listOf(
        "chukas",
        "hukas",
        "hookas",
        "chookas"
)
val mapOfPossibleSpelingToCorrectSpeling40: Map<String, String> = listOfPossibleSpelings40.associateWith { actualSpeling40 }


const val actualSpeling41 = "Balak"
val listOfPossibleSpelings41 = listOf(
        "balak",
        "buluk"
)
val mapOfPossibleSpelingToCorrectSpeling41: Map<String, String> = listOfPossibleSpelings41.associateWith { actualSpeling41 }


const val actualSpeling42 = "Pinchas"
val listOfPossibleSpelings42 = listOf(
        "pinchas",
        "pinchos",
        "peenchos",
        "peenchas",
        "peen'chos",
        "pin'chos",
        "pin'chas"
)
val mapOfPossibleSpelingToCorrectSpeling42: Map<String, String> = listOfPossibleSpelings42.associateWith { actualSpeling42 }


const val actualSpeling43 = "Mattos"
val listOfPossibleSpelings43 = listOf(
        "mattos",
        "matose",
        "matote",
        "matot",
        "mattose",
        "mattote",
        "mattot",

        "matoth",
        "matothe",
        "mattoth",
        "mattothe"
)
val mapOfPossibleSpelingToCorrectSpeling43: Map<String, String> = listOfPossibleSpelings43.associateWith { actualSpeling43 }


const val actualSpeling44 = "Massai"
val listOfPossibleSpelings44 = listOf(
        "massai",
        "massei",
        "masei",
        "mass'ai",
        "mass'ei",
        "mas'ei",
        "mas'ai"
)
val mapOfPossibleSpelingToCorrectSpeling44: Map<String, String> = listOfPossibleSpelings44.associateWith { actualSpeling44 }


const val actualSpeling45 = "Devarim"
val listOfPossibleSpelings45 = listOf(
        "devarim",
        "divarim",
        "devareem",
        "divareem",
        "d'varim",
        "d'vareem",

        "divurim",
        "devureem",
        "divureem",
        "d'vurim",
        "d'vureem",
        "devurim"
)
val mapOfPossibleSpelingToCorrectSpeling45: Map<String, String> = listOfPossibleSpelings45.associateWith { actualSpeling45 }


const val actualSpeling46 = "Va'eschanan"
val listOfPossibleSpelings46 = listOf(
        "va'eschanan",
        "va'etchanan",
        "vaetchanan",
        "vaeschanan",
        "va'ethanan",
        "vaethanan")
val mapOfPossibleSpelingToCorrectSpeling46: Map<String, String> = listOfPossibleSpelings46.associateWith { actualSpeling46 }


const val actualSpeling47 = "Eikev"
val listOfPossibleSpelings47 = listOf(
        "eikev",
        "ekev",
        "aikev",
        "akev"
)
val mapOfPossibleSpelingToCorrectSpeling47: Map<String, String> = listOfPossibleSpelings47.associateWith { actualSpeling47 }


const val actualSpeling48 = "Re'eh"
val listOfPossibleSpelings48 = listOf(
        "re'eh",
        "r'ei",
        "riei",
        "ri'ei",
        "r'ai",
        "riai",
        "ri'ai",
        "re'ai",
        "re'ei")
val mapOfPossibleSpelingToCorrectSpeling48: Map<String, String> = listOfPossibleSpelings48.associateWith { actualSpeling48 }


const val actualSpeling49 = "Shoftim"
val listOfPossibleSpelings49 = listOf(
        "shoftim",
        "shof'tim",
        "shof'teem",
        "shofteem"
)
val mapOfPossibleSpelingToCorrectSpeling49: Map<String, String> = listOfPossibleSpelings49.associateWith { actualSpeling49 }


const val actualSpeling50a = "Ki Setzei"
val listOfPossibleSpelings50a = listOf(
        "ki setzei",
        "ki seitzei",
        "kee seitzei",
        "ki seitzai",
        "kee seitzai",

        "ki saitzei",
        "kee saitzei",
        "ki saitzai",
        "kee saitzai",


        "ki seizei",
        "kee seizei",
        "ki seizai",
        "kee seizai",

        "ki saizei",
        "kee saizei",
        "ki saizai",
        "kee saizai",


        "ki seisei",
        "kee seisei",
        "ki seisai",
        "kee seisai",

        "ki saisei",
        "kee saisei",
        "ki saisai",
        "kee saisai",


        "ki seissei",
        "kee seissei",
        "ki seissai",
        "kee seissai",

        "ki saissei",
        "kee saissei",
        "ki saissai",
        "kee saissai"
)
val mapOfPossibleSpelingToCorrectSpeling50a: Map<String, String> = listOfPossibleSpelings50a.associateWith { actualSpeling50a }


const val actualSpeling51a = "Ki Savo"
val listOfPossibleSpelings51a = listOf(
        "ki savo",
        "ki savow",
        "kee savo",
        "kee savow",
        "ki tavo",
        "kee tavo",
        "kee thavo",
        "ki thavo",

        "ki tavow",
        "kee tavow",
        "kee thavow",
        "ki thavow"
)
val mapOfPossibleSpelingToCorrectSpeling51a: Map<String, String> = listOfPossibleSpelings51a.associateWith { actualSpeling51a }


const val actualSpeling52 = "Nitzavim"
val listOfPossibleSpelings52 = listOf(
        "neetzavim",
        "neetzaveem",
        "nitzavim",

        "neetzuvim",
        "neetzuveem",
        "nitzuvim",


        "neezavim",
        "neezaveem",
        "nizavim",

        "neezuvim",
        "neezuveem",
        "nizuvim",


        "neesavim",
        "neesaveem",
        "nisavim",

        "neesuvim",
        "neesuveem",
        "nisuvim",


        "neessavim",
        "neessaveem",
        "nissavim",

        "neessuvim",
        "neessuveem",
        "nissuvim"
)
val mapOfPossibleSpelingToCorrectSpeling52: Map<String, String> = listOfPossibleSpelings52.associateWith { actualSpeling52 }


const val actualSpeling53 = "Vayelech"
val listOfPossibleSpelings53 = listOf(
        "vayeilech",
        "vayelech",
        "vayailech"
)
val mapOfPossibleSpelingToCorrectSpeling53: Map<String, String> = listOfPossibleSpelings53.associateWith { actualSpeling53 }


const val actualSpeling54 = "Ha'azinu"
val listOfPossibleSpelings54 = listOf(
        "haazinu",
        "haazinoo",
        "ha'azinoo",
        "haazeenoo",
        "ha'azeenu",
        "ha'azinu"
)
val mapOfPossibleSpelingToCorrectSpeling54: Map<String, String> = listOfPossibleSpelings54.associateWith { actualSpeling54 }


const val actualSpeling55a = "V'Zos HaBracha"
val listOfPossibleSpelings55a = listOf(
        "v'zos habracha",
        "vizos habracha",
        "v'zos habracha",
        "vizos habracha",
        "vezos habracha",

        "v'zos haberacha",
        "vizos haberacha",
        "v'zos haberacha",
        "vizos haberacha",
        "vezos haberacha"
)
val mapOfPossibleSpelingToCorrectSpeling55a: Map<String, String> = listOfPossibleSpelings55a.associateWith { actualSpeling55a }


val mapOfPossibleSpellingsListToMapOfPossibleSpellingToCorrectSpelling = mapOf(
        listOfPossibleSpelings1 to mapOfPossibleSpelingToCorrectSpeling1,
        listOfPossibleSpelings2 to mapOfPossibleSpelingToCorrectSpeling2,
        listOfPossibleSpelings4 to mapOfPossibleSpelingToCorrectSpeling4,
        listOfPossibleSpelings6 to mapOfPossibleSpelingToCorrectSpeling6,
        listOfPossibleSpelings7 to mapOfPossibleSpelingToCorrectSpeling7,
        listOfPossibleSpelings8 to mapOfPossibleSpelingToCorrectSpeling8,
        listOfPossibleSpelings9 to mapOfPossibleSpelingToCorrectSpeling9,
        listOfPossibleSpelings10 to mapOfPossibleSpelingToCorrectSpeling10,
        listOfPossibleSpelings11 to mapOfPossibleSpelingToCorrectSpeling11,
        listOfPossibleSpelings12 to mapOfPossibleSpelingToCorrectSpeling12,
        listOfPossibleSpelings13 to mapOfPossibleSpelingToCorrectSpeling13,
        listOfPossibleSpelings14 to mapOfPossibleSpelingToCorrectSpeling14,
        listOfPossibleSpelings15 to mapOfPossibleSpelingToCorrectSpeling15,
        listOfPossibleSpelings16 to mapOfPossibleSpelingToCorrectSpeling16,
        listOfPossibleSpelings17 to mapOfPossibleSpelingToCorrectSpeling17,
        listOfPossibleSpelings18 to mapOfPossibleSpelingToCorrectSpeling18,
        listOfPossibleSpelings19 to mapOfPossibleSpelingToCorrectSpeling19,
        listOfPossibleSpelings20 to mapOfPossibleSpelingToCorrectSpeling20,
        listOfPossibleSpelings22 to mapOfPossibleSpelingToCorrectSpeling22,
        listOfPossibleSpelings23 to mapOfPossibleSpelingToCorrectSpeling23,
//"Sefer Vayikra" by accident
        listOfPossibleSpelings25 to mapOfPossibleSpelingToCorrectSpeling25,
        listOfPossibleSpelings26 to mapOfPossibleSpelingToCorrectSpeling26,
        listOfPossibleSpelings27 to mapOfPossibleSpelingToCorrectSpeling27,
        listOfPossibleSpelings28 to mapOfPossibleSpelingToCorrectSpeling28,
        listOfPossibleSpelings29 to mapOfPossibleSpelingToCorrectSpeling29,
        listOfPossibleSpelings31 to mapOfPossibleSpelingToCorrectSpeling31,
        listOfPossibleSpelings32 to mapOfPossibleSpelingToCorrectSpeling32,
        listOfPossibleSpelings33 to mapOfPossibleSpelingToCorrectSpeling33,
        listOfPossibleSpelings34 to mapOfPossibleSpelingToCorrectSpeling34,
        listOfPossibleSpelings35 to mapOfPossibleSpelingToCorrectSpeling35,
        listOfPossibleSpelings36 to mapOfPossibleSpelingToCorrectSpeling36,
        listOfPossibleSpelings37 to mapOfPossibleSpelingToCorrectSpeling37,
        listOfPossibleSpelings38 to mapOfPossibleSpelingToCorrectSpeling38,
        listOfPossibleSpelings39 to mapOfPossibleSpelingToCorrectSpeling39,
        listOfPossibleSpelings40 to mapOfPossibleSpelingToCorrectSpeling40,
        listOfPossibleSpelings41 to mapOfPossibleSpelingToCorrectSpeling41,
        listOfPossibleSpelings42 to mapOfPossibleSpelingToCorrectSpeling42,
        listOfPossibleSpelings43 to mapOfPossibleSpelingToCorrectSpeling43,
        listOfPossibleSpelings44 to mapOfPossibleSpelingToCorrectSpeling44,
        listOfPossibleSpelings45 to mapOfPossibleSpelingToCorrectSpeling45,
        listOfPossibleSpelings46 to mapOfPossibleSpelingToCorrectSpeling46,
        listOfPossibleSpelings47 to mapOfPossibleSpelingToCorrectSpeling47,
        listOfPossibleSpelings48 to mapOfPossibleSpelingToCorrectSpeling48,
        listOfPossibleSpelings49 to mapOfPossibleSpelingToCorrectSpeling49,
        listOfPossibleSpelings52 to mapOfPossibleSpelingToCorrectSpeling52,
        listOfPossibleSpelings53 to mapOfPossibleSpelingToCorrectSpeling53,
        listOfPossibleSpelings54 to mapOfPossibleSpelingToCorrectSpeling54,


        listOfPossibleSpelings3a to mapOfPossibleSpelingToCorrectSpeling3a,
        listOfPossibleSpelings5a to mapOfPossibleSpelingToCorrectSpeling5a,
        listOfPossibleSpelings21a to mapOfPossibleSpelingToCorrectSpeling21a,
        listOfPossibleSpelings30a to mapOfPossibleSpelingToCorrectSpeling30a,
        listOfPossibleSpelings50a to mapOfPossibleSpelingToCorrectSpeling50a,
        listOfPossibleSpelings51a to mapOfPossibleSpelingToCorrectSpeling51a,
        listOfPossibleSpelings55a to mapOfPossibleSpelingToCorrectSpeling55a
)
val doubleParshiyosList = listOf(
        actualSpeling22, actualSpeling23,
        actualSpeling28, actualSpeling29,
        actualSpeling30a, actualSpeling31,
        actualSpeling33, actualSpeling34,
        actualSpeling40, actualSpeling41,
        actualSpeling43, actualSpeling44,
        actualSpeling52, actualSpeling53
)
val doubleParshiyosAsStringWithSemiColonInBetween = listOf(
        "$actualSpeling22;$actualSpeling23",
        "$actualSpeling28;$actualSpeling29",
        "$actualSpeling30a;$actualSpeling31",
        "$actualSpeling33;$actualSpeling34",
        "$actualSpeling40;$actualSpeling41",
        "$actualSpeling43;$actualSpeling44",
        "$actualSpeling52;$actualSpeling53"
)

fun doubleParshiyosMappedToDoubleParshiyosAsStringWithSemiColon(): MutableMap<String, String> {
    var indexOfDoubleParshiyosAsStringWithSemiColonInBetween = 0
    val doubleParshiyosMappedToDoubleParshiyosAsStringWithSemiColon: MutableMap<String, String> = mutableMapOf()
    for (doubleParshaActualSpeling in doubleParshiyosList) {
        if (doubleParshiyosList.indexOf(doubleParshaActualSpeling) % 2 == 0) indexOfDoubleParshiyosAsStringWithSemiColonInBetween++
        doubleParshiyosMappedToDoubleParshiyosAsStringWithSemiColon[doubleParshaActualSpeling] = doubleParshiyosAsStringWithSemiColonInBetween.elementAt(indexOfDoubleParshiyosAsStringWithSemiColonInBetween - 1)
    }
    return doubleParshiyosMappedToDoubleParshiyosAsStringWithSemiColon
}
