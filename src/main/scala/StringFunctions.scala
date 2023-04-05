@main
def stringFunctions(): Unit = {
  val myPet = "Crocodile"
  println("myPet.length = " + myPet.length)

  val myName = "johnathan"
  // Only makes the first letter capitalized
  println("myName.capitalize = " + myName.capitalize)

  val myAnimal = "GiraFFe"
  // Makes all letters lowercase
  println("myAnimal.toLowercase = " + myAnimal.toLowerCase)
  // Makes all letters uppercase
  println("myAnimal.toUppercase = " + myAnimal.toUpperCase)

  val myText = "         There are too many spaces           "
  println("myText, without trim:" + myText)
  println("myText.trim = " + myText.trim)
}