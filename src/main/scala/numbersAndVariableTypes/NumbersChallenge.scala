package numbersAndVariableTypes

import scala.io.StdIn

@main
def numbersChallenge(): Unit = {
  /*
    Ask the user to input a number and read it into a variable.
      Convert it to an integer.
      Multiply that value with a double variable that you created.
      What is the type of the new variable?
      Print it to the console.
  */

  println("Please input a number...")
  val input = StdIn.readLine().toInt
  val double = 23.583D
  val result = input * double
  println(s"Result: $result")
  println(s"Result Type: ${result.getClass}")

  // Int multiplied by a double will result in a double
}
