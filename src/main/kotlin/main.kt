fun main() {

    val seconds: Int = 10000


}

fun agoToText(time: Int): String {
    when (time) {
        in 0..60 -> "Только что"
        in 61..60 * 60 -> minutes(time/60)
    }
    return "hi"
}

fun minutes(minutes: Int): String {
    val minutesToString: String = minutes.toString()
    val lastChar: Char = minutesToString[minutesToString.length - 2]
    val lastByOneChar: Char = minutesToString[minutesToString.length - 2]
    val lastInt: Int = lastChar.digitToInt()
    val lastByOneInt: Int = lastByOneChar.digitToInt()
    if (lastInt == 1 && lastByOneInt != 1) {
        return " минуту"
    } else if (lastInt in 2..4 && lastByOneInt != 1) {
        return " минуты"
    } else {
        return " минут"
    }

}

fun hours(hours: Int): String {
    val hoursToString: String = hours.toString()
    val lastChar: Char = hoursToString[hoursToString.length - 1]
    val lastByOneChar: Char = hoursToString[hoursToString.length - 2]
    val lastInt: Int = lastChar.digitToInt()
    val lastByOneInt: Int = lastByOneChar.digitToInt()
    if (lastInt == 1 && lastByOneInt != 1) {
        return " час"
    } else if (lastInt in 2..4 && lastByOneInt != 1) {
        return " часа"
    } else {
        return " часов"
    }

}