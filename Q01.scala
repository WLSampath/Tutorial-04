import scala.io.StdIn.readDouble

object Q01{

  def interest(deposit_amount :Double) : Double = deposit_amount match { // function for calculate interest for given value
    case x if x<= 20000 => x* 0.02; // match the value and if condition is satisfy return the calculated interest
    case x if x<= 200000 => x * 0.04;
    case x if x<= 2000000 => x* 0.035;
    case x => x * 0.065;
  }

  // println("Enter deposit amount: ")
  // val num= readDouble() // input value
  // println(interest(num))

  def main(args: Array[String]): Unit = {
    println("Enter deposit amount: ")
    val num= readDouble() // input value
    println(interest(num))
  }

}
