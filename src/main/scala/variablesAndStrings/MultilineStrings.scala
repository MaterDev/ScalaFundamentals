package variablesAndStrings

@main
def multilineStrings(): Unit = {
  // using the \n separator
  println("This is a \nmultiline\n string")

  // using the """ operator
  val someString =
    """Some
      multiline
      string."""
  println(someString)
  println

  // using stripMargin
  val anotherString =
    """Another
      |multiline
      |string.""".stripMargin
  println(anotherString)
  println

  // using stripMargin, with custom character
  val otherString =
    """Other
      %multiline
      %string.""".stripMargin('%')
  println(otherString)
}