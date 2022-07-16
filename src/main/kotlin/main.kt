fun main() {

    val seconds: Int = 61
 print(agoToText(seconds))


}

fun agoToText(time: Int): String {
    return when (time) {
        in 0..60 -> "Только что"
        in 61..60 * 60 -> minutes((time / 60).toInt())
        else -> "hi"
    }

}

fun minutes(minutes: Int): String {
    var lastByOneChar: Char
    val minutesToString: String = minutes.toString()
    val lastChar: Char = minutesToString[minutesToString.length - 1]
    if (minutesToString.length > 2) {
         lastByOneChar = minutesToString[minutesToString.length - 2]
    }
    else
        lastByOneChar = '0'
    val lastInt: Int = lastChar.digitToInt()
    val lastByOneInt: Int = lastByOneChar.digitToInt()
    if (lastInt == 1 && lastByOneInt != 1) {
        return "$minutes минуту"
    } else if (lastInt in 2..4 && lastByOneInt != 1) {
        return "$minutes минуты"
    } else {
        return "$minutes минут"
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