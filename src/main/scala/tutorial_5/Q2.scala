package tutorial_5

object Q2 {
  def prime(n: Int, i: Int = 2): Boolean = i match {
    case y if y == n => true
    case y if n % y == 0 => false
    case y if y < n => prime(n, y + 1)
  }

  def primeSeq(n: Int, i: Int = 2): Unit = {
    if(i<n) {
      if(prime(i)) {
        println(i)
      }
      primeSeq(n, i+1)
    }
  }

  def main(args: Array[String]): Unit = {
    primeSeq(10)
  }
}
