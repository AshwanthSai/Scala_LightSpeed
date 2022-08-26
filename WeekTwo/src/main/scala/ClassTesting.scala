object ClassTesting extends App {
  // There are Arrays in Int
  // Indexing is done using () brackets, types are specified using square brackets.
  // Focus on Expressions oriented, not instruction oriented, Functions and Recursion.
  // Advantage of using Terinary Operator in Scala is that you can nest conditions, unlike in Java.
  // We typically deal with immutable objects,i.e. any kind of operation on a list, returns a new list.
  // Val is immutable containter, var is mutable container.

  val a = Array(1, 2, 3, 4, 5)
  for (i <- a) print(i)
  println()
  for (i <- 0 to 2) print(a(i))
  println()
  //Printing using Higher Order Function
  a.foreach(println)
  val romanNumeral = Map((1, "I"), 2 -> "II", 3 -> "III", 4 -> "IV")
  println(romanNumeral)

  val range = 1 to 10
  val vector = for {
    number <- range
  } yield (2 * number + 3)

  val vectorTwo = for (x <- 1 to 5) yield (2 * x + 3)
  println()
  println(vectorTwo)

  val smallScaleClasses = (1, 2, 3, 4, 5, "Shyam", "Ram", "Sathya", "Geetha")
  println(smallScaleClasses)
  println(smallScaleClasses._1)

  class Person(name: String, age: Int) {
    def isTeenager(age: Int): Boolean = if (age < 18) false else true
  }

  class Employee(name: String, age: Int, company: String) extends Person(name, age)

  def avg(a: Array[Int]): Option[Int] = if (a.size == 0) None else Some((a reduce (_ + _)) / a.size)

  val w = avg(Array[Int]())
  val c = avg(Array[Int](1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
  println(w)
  println()
  w match {
    case None => print("There was a problem calculating the Average")
    case Some(value) => print(s"The average is  $value")
  }
  println()
  c match {
    case None => print("There was a problem calculating the Average")
    case Some(value) => print(s"The average is  $value")
  }
  println()
  //Tesing Referenential Transparency
  // val y = { val x = 10; x * 2 }
  // print(y)
  println()
  val z = {
    print("hi "); 10
  }
  println()
  print("Next Line Printing Z " + z)
  println()
  print("Next Line Printing Z +  Z " + (z + z))
  // hi
  // Next Line Printing Z 10
  // Next Line Printing Z + Z 20
  //////////////
  var x = 1 {
    x = x + 1; x
  }
  x {
    x = x + 1; x
  } + {
    x = x * 2; x
  }
  println(x)






}
