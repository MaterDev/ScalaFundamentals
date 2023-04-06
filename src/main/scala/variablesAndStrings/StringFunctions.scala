package variablesAndStrings

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
  // Trim only work with spaces at the start/end of strings.
  println("myText, without trim:" + myText)
  println("myText.trim = " + myText.trim)

  // Accessing a character at a specific position
  // Starts with position of 0
  println("Position of character 3, in \'Crocodile\': " + myPet(3))
  println("Position of character 5, in \'Crocodile\': " + myPet.charAt(5))

  // Getting part of a string
  println("Substring of \'Crocodile\': " + myPet.substring(3))
  println("Substring of \'Crocodile\': " + myPet.substring(3, 6))

  /*
    String methods don't transmute the original string. They create a new string.
  */
}