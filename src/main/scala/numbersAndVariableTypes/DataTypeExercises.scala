package numbersAndVariableTypes

import scala.io.StdIn

@main
def dataTypeExercises(): Unit = {
  // Prompt the user to enter a number
  println("Please enter a number:")
  // Read the user's input as a string
  val input = StdIn.readLine()
  println()

  // Convert the input string to a Byte and store it in myByte
  val myByte = input.toByte
  println(myByte)
  println(myByte.getClass)

  // Convert the input string to a Short and store it in myShort
  val myShort = input.toShort
  println(myShort)
  println(myShort.getClass)

  // Convert the input string to an Int and store it in myInt
  val myInt = input.toInt
  println(myInt)
  println(myInt.getClass)

  // Convert the input string to a Long and store it in myLong
  val myLong = input.toLong
  println(myLong)
  println(myLong.getClass)

  // Convert the input string to a Float and store it in myFloat
  val myFloat = input.toFloat
  println(myFloat)
  println(myFloat.getClass)

  // Convert the input string to a Double and store it in myDouble
  val myDouble = input.toDouble
  println(myDouble)
  println(myDouble.getClass)

  // Declare a constant value pi with a Double value
  val pi = 3.14159
  println(pi)
  println(pi.getClass)
  println()

  // Convert the value of pi to a Float and print the result
  println(pi.toFloat)
  println(pi.toFloat.getClass)
  println()

  // Convert the value of pi to an Int and print the result
  println(pi.toInt)
  println(pi.toInt.getClass)
  println()

  // Convert the value of pi to a String and print the result
  println(pi.toString)
  println(pi.toString.getClass)
  println()

}
