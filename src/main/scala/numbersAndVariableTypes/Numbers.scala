package numbersAndVariableTypes

@main
def numbers(): Unit = {
  // Integers (whole numbers)
  val price = 34
  val items = 3
  val totalPrice = price * items
  println(s"Total Price: $totalPrice")

  // Different types are stored in memory in different ways
  // Number types have limits

  // Some default types are determined when a variable is created
//  var things = 5 //int
//  var account = 2000000 //int
//  var nbOfPeople = 8000000000 // error, out of range for int (number too large)
//  var cost = 29.99 // Double
//  var pi = 3.1415926535 // Double

  val someItems = 5
  // getClass() gets the type of variable
  println("someItems => " + someItems.getClass)

  val account = 2000000
  println("account => " + account.getClass)

  // Int values can also be formatted with "_" to for readability
    // They will be ignored when the program runs
  val account2 = 2_000_000
  println("account2 => " + account2.getClass)

  val nbOfPeople = 8000000000L // "L" tells the system this is a "Long" (Instead of Int)
  println("nbOfPeople => " + nbOfPeople.getClass)

  val pi = 3.1415926535F // "F" tells the system this is a "Float" (instead of Double)
  println("pi => " + pi.getClass)

}
