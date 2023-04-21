package numbersAndVariableTypes

@main
def typeConversion(): Unit = {
  val cats = 3
  println(cats.getClass)
  println()

  // The variable isn't converted.
    // `toLong` just returns a result, which can be assigned to a new variable.
  val longCats = cats.toLong
  println(longCats.getClass)
  println()

  // If you convert to a smaller type, some information might be lost or corrupted
  val people = 8_000_000_000L
  val fewPeople = people.toInt
  println(fewPeople)
  println(fewPeople.getClass)
  println()

  // Strings are a class: `class java.lang.String`
  val name = "John"
  println(name)
  println(name.getClass)
  println()

  // Any data type can be converted to a string
  val lizards = 3
  val lizardsString = lizards.toString
  println(lizardsString)
  println(lizardsString.getClass)
  println()

  // Not every String can be converted into a number
    /*
      In Scala, converting Strings to numbers has some limitations:
      If the String contains non-numeric characters or is malformed, the conversion will fail, throwing a NumberFormatException.
      For large numbers, there might be a loss of precision when converting to floating-point types (Float, Double).
      If the numeric value in the String exceeds the range of the target numeric type (e.g., Int, Long), an overflow/underflow can occur, leading to incorrect results.
    */
  val steps = "10000"
  println(steps)
  println(steps.toInt.getClass)
  println(steps.toDouble.getClass)
  println()
}
