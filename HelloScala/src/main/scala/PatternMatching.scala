object PatternMatching extends App {
  val anInteger = 55
  val check = anInteger match {
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
    case 4 => "Four"
    case _ => anInteger + " th"
  }
  print(check)
  println()
  case class Person(name : String, age: Int)
  val myPerson = Person("Bob", 55)
  val greetings = myPerson match {
    case Person(n ,a) => s"greetings $n, your age is $a"
    case _ => "Sorry you are not allowed"
  }
  print(greetings)
  val myTuples = ("Shyam", 55 , "Kam Pachis Hein")
  val checkTuples = myTuples match {
    case (i,d,k) => "Yes Tuples Match"
    case _ => "Sorry Tuples do not Match"
  }
  println()
  println(checkTuples)


}
