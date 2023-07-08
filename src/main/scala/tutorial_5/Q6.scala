package tutorial_5

object Q6 {

  def fib(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fib(n-1) + fib(n-2)
  }

  def display(n:Int, i: Int = 0): Unit = {
    if(i<n) {
      print(fib(i) + " ")
      display(n, i+1)
    }
  }

  def main(args: Array[String]): Unit = {
    display(10)
  }
}
