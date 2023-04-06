package variablesAndStrings

@main
def StringInterpolation(): Unit = {

  // String interpolators: 's', 'f', and 'raw'

  // 's' Interpolator
  val myCatName = "Cluesefine"
  // Variables
  println(s"My cat's name is $myCatName, and she is soo hungry!")
  // Expressions
  println(s"1 + 1 = ${1 + 1}")

  // 'raw' Interpolator, will ignore escape characters
  println("This is a \n new \\line")
  println(raw"This is a \n new \\line")
}
