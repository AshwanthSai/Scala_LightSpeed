object FunctionalProgramming extends App {
  class Person {
    def apply(name : String): Unit = {
      print(name)
    }
  }
  val mynewPerson = new Person();
  mynewPerson.apply("Bob \n")
  mynewPerson("Bob Applied")
  // Scala Programmers Created Something Called Function X. Every Function is an Instance of a Trait Function.
  val myFunctionalFunction = new Function1[Int, Int] {
    override def apply(v1: Int): Int = v1 + 1
  }
  print(myFunctionalFunction(5))

  val StringConcatenationFunction = new Function2[String, String, String] {
    override def apply(v1: String, v2: String): String = v1 + v2
  }
  val syntaxSugarFunctionX : Function[Int,Int]  = (x:Int) => x * 2
  val extRemeSugarFunction : Int => Int = (x:Int) => x * 3
  val superExtreme = (x:Int) => x * 6;
  println(syntaxSugarFunctionX(5))
  println(extRemeSugarFunction(5))
  println(superExtreme(5))

  // Remember that we are dealing with Immutable Objects
  // Build a new Function by Applying a Function to each of the elements of the collection.
  val aMappedList: List[Int] = List(1,2,3).map(number => number + 1)
  println(aMappedList) //Prints List(2,3,4)
  // Alternative Syntax to .map(x => List(x, x * 2)
  val FlatMappedList: List[Int] = List(1,2,3).flatMap { x =>
    List(x,2 * x)
  }
  println(FlatMappedList) //Prints List(1, 2, 2, 4, 3, 6)
  val aFilteredList: List[Int] = List(1,2,3,4,5,6).filter(_ >= 3) // Equivalent to x => x >= 3)
  println(aFilteredList)

  val alternativePairs = for {
    number <- List(1,2,3)
    letter <- List('a','b','c')
  } yield s"$number -$letter"
  // Equivalent to the map/flatMap Chain Above.
  print(alternativePairs)
}
