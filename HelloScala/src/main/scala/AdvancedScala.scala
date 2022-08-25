import scala.util.{Failure, Success, Try}

object AdvancedScala extends App {
  val thisisNotLazyEvaluation = {
    print("I will run")
    3
  }
  println()
  lazy val thisisLazyEvaluation = {
    print("I will not run unless you initialize me")
    3
  }
  val initializeLazy = thisisLazyEvaluation
  def methodThatCanReturnNull(): String = "Could be null"
  val safeValue = Option(methodThatCanReturnNull) // This has Just one Value, either a value or None

  val check = safeValue match {
    case Some(string) => s"$string"
    case None => "Null Returned"
  }
  println()
  println(check)
  def methodWhichThrowsException() : String = throw new RuntimeException

  def safeValueTwo: Try[String] = Try(methodWhichThrowsException())

  val checkTwo = safeValueTwo match {
    case Success(value) => "Does not Throw Value"
    case Failure(exception: Exception) => "Exception Thrown"
  }
  println(checkTwo)

}
