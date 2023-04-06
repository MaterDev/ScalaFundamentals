package variablesAndStrings

@main
def stringExercises(): Unit = {
  // Get length of string
  val catName = "My cat's name is \"Clusefine\""
  println(catName.length)

  // Extract the string "car" from this variable and print
  val myCar = "My car will start"
  println(myCar.substring(3, 6))

  // Print a customized customer message
  val clientName = "John"
  println(s"Dear $clientName, thank you for shopping.")

  // Print to console the amount of fruit available
  val apples = 6
  val oranges = 14
  println(s"Total fruit is: ${apples + oranges}")

  /*
   A client has purchased a number of products that have a certain price.
  Print out the total amount the client needs to pay.
  */
  val client = "Mary"
  val products = 3
  val price = 30
  println(s"$client's total: " + "$" + s"${products * price}")
}