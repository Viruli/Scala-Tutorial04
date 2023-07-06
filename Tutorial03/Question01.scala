package Tutorial03

object Question01 {
  def main(args: Array[String]): Unit = {
    println("Enter the amount you deposit : ")
    var amount = scala.io.StdIn.readDouble()
    var interestAmount = interest(amount)
    println("The interest you can get = " + interestAmount)
  }

  def interest(amount: Double): Double = amount match{
    case x if x < 0 => 0
    case x if x < 20000 => x*2/100
    case x if x < 200000 => x*4/100
    case x if x < 2000000 => x*3.5/100
    case x if x >= 2000000 => x*6.5/100
  }

}
