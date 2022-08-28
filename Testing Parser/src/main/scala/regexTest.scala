object regexTest extends App {
  val pat = "(\\+|-)?[0-9]+".r
  print(pat + "\n")
  val string = "_53"
  print(string.substring(1).toDouble)
}
