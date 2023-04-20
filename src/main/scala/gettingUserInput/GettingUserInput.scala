package gettingUserInput
import scala.io.StdIn
@main
def gettingUserInput(): Unit = {
  println("Type something:")
  // This will pause the execution until the user finishes their input.
  val input = StdIn.readLine()
  println(input)

  // Input is always read as a string.
  // Not all strings can be converted to numbers (only strings that are ALL number)
  val number = input.toInt
  println(number * 2)
}