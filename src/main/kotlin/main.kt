const val NAME_1 = "человеку"
const val NAME_2 = "людям"
fun main() {
    println("Сколько у нас лайков, капитан?")
    val likes = readLine()!!.toInt()
    val names = if ((likes % 10 == 1) && likes != 11)  NAME_1 else NAME_2
    println("Понравилось $likes $names")
}