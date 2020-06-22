package parshaTagger

fun main() {

    for (i in 7..55) {
        println(
        "val listOfPossibleSpellings$i=listOf(\"\")\n" +
        "val correctSpelling$i: Map<String, String> = listOfPossibleSpellings$i.associateWith {actualSpelling$i}"
        )
    }
}