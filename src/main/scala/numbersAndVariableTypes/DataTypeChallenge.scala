package numbersAndVariableTypes

import scala.io.StdIn

@main
def dataTypeChallenge(): Unit = {
  println("Enter a number:")
  val input = StdIn.readLine()
  val inputDouble = input.toInt

  val pi = 3.14159
  val result = inputDouble * pi
  println()
  println(s"Result: $result")
  println(s"Type: ${result.getClass}")
}
