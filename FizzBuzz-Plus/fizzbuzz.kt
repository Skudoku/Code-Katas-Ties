/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun main() {
    fizzBuzz()
}

fun maybeFizzBuzz(number: Int): String {
    when {
        ((number % 3 == 0) && (number % 5 == 0)) || ((number.toString().contains("3")) && (number.toString().contains("5"))) -> return "FizzBuzz"
        (number % 3 == 0) || (number.toString().contains("3")) -> return "Fizz"
        (number % 5 == 0) || (number.toString().contains("5")) -> return "Buzz"
        else -> return number.toString()
    }
}

fun fizzBuzz() {
    for (i in 1..100) {
        println(maybeFizzBuzz(i))
    }
}
