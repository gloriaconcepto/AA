package Assignment1
import scala.io.StdIn
import scala.io.StdIn.readInt
import scala.util.control.Breaks
/**
  * Created by Mmekut on 3/5/2017.
  */
object Fibonacci {
" function for a non TailRecursive fibonacci"

  def nonTailRecursiveFibonacci (n:BigInt):BigInt =  {
    if (n==0) return 0
      if(n==1)1
      else {nonTailRecursiveFibonacci(n - 1) + nonTailRecursiveFibonacci(n - 2)}
    //case 0 => 0
    //case 1 => 1
   // case _ => fib(n - 1) + fib(n - 2)
  }

  " function for a  TailRecursive fibonacci"
  def tailRecursiveFibonacci(n:BigInt):BigInt={

     @scala.annotation.tailrec
        def tailHelper(num:BigInt,acc1:BigInt,acc2:BigInt):BigInt=
     {
       if (num==0)acc1
       else tailHelper(num-1,acc2,acc1+acc2)
     }
    return  tailHelper(n,0,1)
  }

  // entry point
  def main (args: Array[String] ) {
    var Count: Int = 0;
    var Bool: Boolean = true
    println("Please select which fibonacci method    ")
    while (Bool) {
      println("Please  enter key  1 for nonTailRecursiveFibonacci function or enter key 2 for TailRecursiveFibonacci function or E To exit  : ")
      while (Count == 0) {
        val line = Console.readLine().toString().toUpperCase()
        // perform non tail recursive fibonacci function
        if (line == "1") {
          println("welcome to NonTailRecursiveFibonacci function   ")
          println("enter your number")
          val num = Console.readInt()
          println("Thanks, the results is: " + Fibonacci.nonTailRecursiveFibonacci(num))
          println("Please  enter key  1 for nonTailRecursiveFibonacci function or enter key 2 for TailRecursiveFibonacci function or E To exit  : ")
          Breaks

        }
        //this is for exit of the app
        else if (line=="E"){System.exit(0)}
        //this to handle smaller case
        //else if (line=="e"){System.exit(0)}

        // perform tail recursive fibonacci function

        else if (line == "2") {
          println("welcome to TailRecursiveFibonacci function   ")
          println("enter your number")
          val num1 = Console.readInt()
          println("Thanks, your Tail Recursive Fibonacci result: " + Fibonacci.tailRecursiveFibonacci(num1))
          println("Please  enter key  1 for nonTailRecursiveFibonacci function or enter key 2 for TailRecursiveFibonacci function or E To exit  : ")
          Breaks

        }

        else {
          println("please enter the right key  ")
          println("Please  enter key  1 for nonTailRecursiveFibonacci function or enter key 2 for TailRecursiveFibonacci function or E To exit  : ")
          Breaks
        }

      }
    }


  }

}

