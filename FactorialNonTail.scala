package Assignment1

import scala.io.StdIn
import scala.io.StdIn.readInt
import scala.util.control.Breaks
/**
  * Created by Mmekut on 3/5/2017.
  */
//  class FactorialTest extends FreeSpec with Matchers {


object Factorial{
"this fuction is a non tail recursive method for factorial"
  "it should failed with this special function annotation (@tailrec) "

  def nonTailRecursiveFactorial(n: BigInt): BigInt = {
    if (n == 0) 1
    //return 1 when n is 0
    else
      n * (n - 1) //this performed the mathematical calculation
  }
  "this fuction is a  tail recursive method for factorial"
  "it should not failed with this special function annotation (@tailrec) "

  def tailRecursiveFactorial(num: BigInt): BigInt =
  {
    @scala.annotation.tailrec
  def TailRecursiveFactorialHelper(number: BigInt, acc: BigInt): BigInt = {
    if (number == 0) acc
    else
      TailRecursiveFactorialHelper(number - 1, acc * number)
  }
    TailRecursiveFactorialHelper(num, 1)
  }







  //by entry point
  def main(args: Array[String]) {
    var Count: Int = 0;
    var Bool: Boolean = true
    println("Please select which factorial method    ")
    while (Bool) {

      print("Please  enter key  1 for nonTailRecursiveFactorial function or enter key 2 for TailRecursiveFactorial function or E To exit : ")
      while (Count == 0) {
        val line = Console.readLine().toString().toUpperCase()
        if (line == "1") {
          println("welcome to nonTailRecursiveFactorial function   ")
          println("enter your number")
          val num = Console.readInt()
          println("Thanks, the results is: " + Factorial.nonTailRecursiveFactorial(num))
          print("Please  enter key  1 for nonTailRecursiveFactorial function or enter key 2 for TailRecursiveFactorial function or   E To exit  : ")
         Breaks
        }


        //this is for exit of the app
        else if (line=="E"){System.exit(0)}
        //this to handle smaller case
       // else if (line=="e"){System.exit(0)}

        // perform tail recursive factorial function
        else if (line == "2") {
          println("welcome to TailRecursiveFactorial function   ")
          println("enter your number")
          val num1 = Console.readInt()
          println("Thanks, you just recursive typed: " + Factorial.tailRecursiveFactorial(num1))
          print("Please  enter key  1 for nonTailRecursiveFactorial function or enter key 2 for TailRecursiveFactorial function or   E To exit  : ")
          Breaks


        }

        else {
          println("please enter the right key  ")
          print("Please  enter key  1 for nonTailRecursiveFactorial function or enter key 2 for TailRecursiveFactorial function or   E To exit  : ")
         Breaks
        }

        //println("Thanks, you just typed: " + line)
        //  println("Thanks, you just recursive typed: " + Factorial.nonTailRecursiveFactorial(3))
      }
    }
  }
}
