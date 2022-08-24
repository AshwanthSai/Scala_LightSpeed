
object ObjectOrientedLanguage extends  App {
  class Animal {
    val age : Int = 21
    def bark() = {
      print("Barkk")
    }
  }
  class Dog extends Animal {
    val dogs = 559;
  }
  val mypetAnimal = new Dog();
  mypetAnimal.bark()

  abstract class walkingAnimal {
    val value = 5
    def walk(): Unit
  }

  class newAnimal extends walkingAnimal{
    def walk(): Unit  = {
      print("Animal Walks")
    }
  }

  val mynewAnimal = new newAnimal();
  mynewAnimal.walk()

  trait basicallyInterfaces {
    def someFunctionWhichNeedstoBeImplement() : Unit
  }

  object dinosour {
    def cry(cryString : String) : Unit = {
      print(cryString)
    }
  }

  dinosour cry "\nzzzzHard"

  trait singleDinosour {
    def happy(happyCry : String) : Unit
  }

  val mySingleDinosour = new singleDinosour {
    def happy(happyCry : String) : Unit = {
      print("\nHappy Cry")
    }
  }
  mySingleDinosour.happy("Cry")

  object Animal{
    val animalName = "\nSay My Name: Heisenberg"
  }
  print(Animal.animalName)

  case class Person (val name : String,val Age : Int)
  val mynewCaseClass = Person("Bob", 21)

  print("\n" + mynewCaseClass.name + " " + mynewCaseClass.Age)
  try {
    val myString : String = null
    print(myString.length)
  } catch {
    case e: Exception => "Some Faulty Error Message"
  } finally {
    print("Releasing Memory, Clearing Items")
  }

  abstract class myList[T] {
    def head: T
    def tail : List[T]
  }
  val aList: List[Int] = List(1,2,3)
  val first = aList.head
  print("List aaaa Type" + first)
  val rest = aList.tail
  val aStringList : List[String] = List("Hello", "Bye", "Hi");
  print("\nString Type \n" + first)
  val afirst = aStringList.head
  val arest = aStringList.tail
}
