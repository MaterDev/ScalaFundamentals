package gettingUserInput
import scala.util.Random

@main
def random(): Unit = {
  println(Random.nextInt())
  println(Random.nextInt(100))
  println(Random.nextString(20))
  println(Random.nextPrintableChar())
  println(Iterator.continually(Random.nextPrintableChar()).take(20).mkString)
}
