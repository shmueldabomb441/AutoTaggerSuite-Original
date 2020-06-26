package parshaTagger

fun main() {
    loop@while(true){
        print("Answer: ")
        val answer = readLine()
        println("You entered $answer")
        if(answer?.toInt()==5){
            val test = readLine()
            println("You entered $test")
            continue@loop
        }
    }
}