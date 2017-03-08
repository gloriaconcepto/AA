package Assignment1
import jdk.nashorn.internal.ir.WhileNode

import scala.io.StdIn
import scala.io.StdIn.readInt
import Unit._
import scala.util.control.Breaks
/**
  * Created by Mmekut on 3/6/2017.
  */
object TemperatureConversion {
" Function to convert from Centigrade to Fahrenheit"
  def centigradeToFahrenheit(tem:Float):Float=
  {
    val Cal:Float=((tem * 9.0f))/(5.0f) + 32.0f
    return Cal

  }
  "Function to convert from Fahrenheit to Centigrade"
  def fahrenheitToCentigrade(tem:Float):Float=
  {
    val Cal:Float=(((tem - 32.0f))*5.0f)/9.0f
    return Cal

  }
  // entry point
  def main(args: Array[String]) = {
    var Count :Int=0;
 var  Bool: Boolean=true
    println(" Hello Welcome to Temperature App   " )
    while (Bool) {
      print("Please  enter key  1 for Centigrade to Fahrenheit  or  enter key 2 for Fahrenheit to Centigrade or E To exit  : ")

      while (Count==0) {
        val line = Console.readLine().toString().toUpperCase()
        if (line == "1") {
          println("Conversion from Centigrade to Fahrenheit function   ")
          println("enter Centigrade temperature")
          val num = Console.readInt()

          println(f" Thanks, the results in fahrenheit is ${TemperatureConversion.centigradeToFahrenheit(num)}%.2f  F")
          println("Please  enter key  1 for Centigrade to Fahrenheit  or  enter key 2 for Fahrenheit to Centigrade or   E To exit : ")


          Breaks
        }
        // perform tail recursive factorial function

        else if (line == "2") {
          println("Conversion from Fahrenheit to Centigrade function ")
          println("enter Fahrenheit temperature")
          val num = Console.readInt()

          println(f" Thanks, the results in centigrade is ${TemperatureConversion.fahrenheitToCentigrade(num)}%.2f C")
          println("Please  enter key  1 for Centigrade to Fahrenheit  or  enter key 2 for Fahrenheit to Centigrade or   E To exit : ")

          Breaks
        }
         //this is for exit of the app
        else if (line=="E"){System.exit(0)}
          //this to handle smaller case
       // else if (line=="e"){System.exit(0)}


        else {
          println("please enter the right key  ")
          println("Please  enter key  1 for Centigrade to Fahrenheit  or  enter key 2 for Fahrenheit to Centigrade or   E To exit : ")
          Breaks

        }
      }
    }
  }

}
