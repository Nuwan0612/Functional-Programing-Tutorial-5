package tutorial_5

object Q3 {

  def sum(n:Int): Int = n match{
    case y if y>1 => y + sum(y-1)
    case _ => 1
  }

  def main(args: Array[String]): Unit = {
    print(sum(5))
  }
}
