package numbersAndVariableTypes

@main
def numbers2(): Unit = {
  // Implicit Type
  val cats = 3
  println(s"cats: ($cats) Type => " + cats.getClass)

  // Explicit type declaration
  val meals: Int = 3
  println(s"meals: ($meals) Type => " + meals.getClass)

  val dogs: Byte = 7
  println(s"dogs: ($dogs) Type => " + dogs.getClass)

  val days: Short = 30_000
  println(s"days: ($days) Type => " + days.getClass)

  // Without explicit typing, this would be an int
  val life: Long = 130
  println(s"life: ($life) Type => " + life.getClass)

}
