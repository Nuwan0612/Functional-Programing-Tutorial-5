package tutorial_5

object Q1 {
  def prime(n: Int, i: Int = 2): Boolean = i match{
    case y if y == n => true
    case y if n%y == 0 => false
    case y if y<n => prime(n,y+1)
  }

  def main(args: Array[String]): Unit = {
    print(prime(7))
  }
}
