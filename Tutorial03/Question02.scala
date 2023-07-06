package Tutorial03

object Question02 {
  def main(args: Array[String]): Unit = {
    println("Enter a number : ")
    var num = scala.io.StdIn.readInt()
    var str = PatternMatching(num)
    println("The number you entered : "+ str)
  }

  def PatternMatching(n : Int): String = n match{
    case x if x <= 0 => "Negative/Zero"
    case x if x%2 == 0 => "Even Number"
    case x if x%2 != 0 => "Odd Number"
  }
}
