fun main() {
    val likes = 21
    val textPeople = if (likes == 1 || (likes % 10 == 1 && likes != 11)) "человеку" else "людям"

    println("Понравилось $likes $textPeople")
}