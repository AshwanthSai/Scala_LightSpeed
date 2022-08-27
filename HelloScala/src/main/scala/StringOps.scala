object StringOps extends  App {
  val myString = "Hello I am teaching Java"
  println("this is the car at 4 idx, o \n" + myString.charAt(4))
  println("this will print everything excluding first four char" + myString.substring(4))
  val stringSplit = myString.split(" ")
  println(stringSplit.toList)
  println("check if string starts with " + myString.startsWith("Hello"))
  println(myString.replace(" ", " x "))
  println(myString.length)

  val mynumberString = "55"
  val convertedtoInt = mynumberString.toInt
  println(convertedtoInt + 0)
  //55
  //z 2 a
  val stringForward = "a 2 z"
  println(stringForward.reverse)
  println("fetchig first 6 characters, including white space " + stringForward.take(6))

  val myName = "Sai"
  val myAge = 19
  val greeting = s"My name is $myName, I am  ${5 * 2 * 2 + 1} years old "
  println(greeting)

  val speed = 1.255f
  val checkString = f"Sai eats at a speed of $speed%2.1f"
  println(checkString)
  // Sai eats at a speed of 1.3
  val escape = "\n escape now"
  println(raw"\n wont escape to next $escape line \n")
}
