 // Solutions for The Gauntlet - Week 1 (First 7 Questions)

fun main() {

    // Question 1: Personalized Greeting
    print("Hello! Enter your name: ")
    val name = readLine()!!
    print("What is your favorite color? ")
    val color = readLine()!!
    println("Hello $name , WOW , The $color is very nice ")

    // Question 2 and 3: Age in a Decade + Access Control
    // Combined
    print("Enter your age : ")
    val age = readLine()!!.toInt()
    val hasAccess: Boolean = age >= 18
    println("Access Granted: $hasAccess")
    val ageInAge = age + 10
    println("The age after 10 years = $ageInAge")

    // Question 4: Even or Odd
    println("Write a random number and we will find out if it is even or odd: ")
    val EorOnum = readLine()!!.toInt()
    if (EorOnum % 2 == 0) {
        println("The number $EorOnum is Even.")
    } else {
        println("The number $EorOnum is Odd.")
    }

    // Question 5: String Reverser
    print("Enter a word: ")
    val text = readLine()!!
    println("Reversed text: ${text.reversed()}")

    // Question 6: The Classic FizzBuzz
    for (num in 1..20) {
        if (num % 3 == 0 && num % 5 == 0) {
            println("FizzBuzz")
        } else if (num % 3 == 0) {
            println("Fizz")
        } else if (num % 5 == 0) {
            println("Buzz")
        } else {
            println(num)
        }
    }
    // Question 7: Sum of Numbers
    println("Enter the number : ")
    val n = readLine()!!.toInt()
    var sum = 0
    for (i in 1..n){
        sum += i
    }
    println("The sum of numbers from 1 to $n = $sum")
    }




