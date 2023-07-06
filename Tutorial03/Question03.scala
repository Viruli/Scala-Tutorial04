package Tutorial03

object Question03 {
  def main(args: Array[String]): Unit = {
    println("Enter a String : ")
    var str1 = scala.io.StdIn.readLine()
    println(toUpper(str1))
    println(toLower(str1))

    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    println(formatNames(names(0), toUpper))
    println(formatNames(names(1), capitalize))
    println(formatNames(names(2), toLower))
    println(formatNames(names(3), s => s.init + s.last.toUpper))
  }

  def toUpper(str: String): String = {
    str.toUpperCase()
  }
  def toLower(str: String): String ={
    str.toLowerCase()
  }

  def formatNames(name: String, formatFunction: String => String): String ={
    formatFunction(name)
  }

  def capitalize(str: String):String ={
    str.map { c =>
      if (c.toLower == 'i') c.toUpper
      else c
    }
  }


}
