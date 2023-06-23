fun main() {
    val likes = 3011
    val textPeople = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"

    println("Понравилось $likes $textPeople")
}