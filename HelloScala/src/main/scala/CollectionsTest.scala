object CollectionsTest extends App {
  val myList = List(1,2,3,4,5);
  val listHead = myList.head
  val listTail = myList.tail
  println(listHead)
  println(listTail)

  val prependedList = 1 :: listTail
  println(prependedList)

  val appendedList = 1 +: listTail :+ 6
  println(appendedList)

  //Sequence is a List for random access

  val mySequence = Seq(1,2,3,4,5)
  println(mySequence)
  println("Sequence at a particular index " + mySequence(0) + "  " + mySequence(1))

  val myVector = Vector(1,2,3,4,5,6,6)
  println(myVector)

  val mySet = Set(1,1,1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5)
  println(mySet)
  println("Does mySet Contain 1? " + mySet.contains(1))

  val myRange = 5 to 100
  val customList = myRange.map(number => number * 2)
  println(customList)

  val SetDuplicatesRemoved = myVector.toSet
  println(SetDuplicatesRemoved)

  val myTuple = ("Bob","Plumber", 5)
  println(myTuple)

  val mymap : Map[String, Int] = Map(
    ("Solomon", 1),
    ("Jane", 2),
    ("Cristiano" -> 327285)
  )
  print(mymap)

}
