package variablesAndStrings

@main
def variables(): Unit = {
  // "var" variables are mutable
  var tvShows = "many"
  println(tvShows)
  tvShows = "too many"
  println(tvShows)
  // The type of the variable cannot be changed (can only mutate within the same type)

  // "val" variables are immutable
  val color = "blue"
//  color = "red" // Will throw error
  println(color)
}