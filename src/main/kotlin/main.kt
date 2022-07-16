fun main() {
    val seconds: Int = 10000
    fun agoToText(time: Int): String {
        when (time) {

        }
        return "hi"
    }

    fun minutes(minutes: Int): String {
        val minutesToString: String = minutes.toString()
        val lastChar: Char = minutesToString.get(minutesToString.length - 1)
        val lastByOneChar: Char = minutesToString.get(minutesToString.length - 2)
        val lastInt: Int = lastChar.digitToInt()
        val lastByOneInt: Int = lastByOneChar.digitToInt()
        if (lastInt == 1 && lastByOneInt != 1) {
            return " минуту"
        } else if (lastInt > 1 && lastInt < 5 && lastByOneInt != 1)
            return " минуты"
        else return " минут"

    }

    fun hours(hours: Int): String {
        val hoursToString: String = hours.toString()
        val lastChar: Char = hoursToString.get(hoursToString.length - 1)
        val lastByOneChar: Char = hoursToString.get(hoursToString.length - 2)
        val lastInt: Int = lastChar.digitToInt()
        val lastByOneInt: Int = lastByOneChar.digitToInt()
        if (lastInt == 1 && lastByOneInt != 1) {
            return " час"
        } else return " часов"

    }
}