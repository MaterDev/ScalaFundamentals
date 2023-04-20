package gettingUserInput
import scala.io.StdIn
import java.time.Year

@main
def userInputExercises(): Unit = {
  println("What is your name?:")
  val name = StdIn.readLine()
  println(s"Welcome, $name.")

  println
  println("What is your favorite number?")
  // StdIn input is always a string, so must be converted to a number
  val number = StdIn.readLine().toInt
  val result = number * 5
  println(s"Your magic number is: $result")

  /*
    Challenge:
      Create a program that asks a user’s birth year.
      Then prints out the user’s estimated age
  */
  println
  println("What is your birth year?")
  val birthYear = StdIn.readLine().toInt
  val currentYear = Year.now.getValue
  val userAge = currentYear - birthYear
  println(s"Your age is: $userAge")
}