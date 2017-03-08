package Assignment1
import scala.io.StdIn
import scala.io.StdIn.readInt
import scala.util.control.Breaks
import scala.collection.mutable.ListBuffer
import scala.util.control
import scala.util.control.Breaks

/**
  * Created by Mmekut on 3/7/2017.
  */
object CheckOutSystem extends App {

  def sum(items: List[String]): Int = {
    //val apple:String="APPLE"
    // price of  mango ₦300
    val mangoPrice:Int= 300
    // price of oranges cost ₦150
    val orangePrice :Int =150
    // filter mango only into a new list
    val mangoFilter= items.filter( _.startsWith("APPLE"))
    // filter orange only into a new list
    val orangeFilter= items.filter(_.startsWith("ORANGE"))
    mangoFilter.size*mangoPrice + orangeFilter.size * orangePrice


  //  val (a,b) = items.partition(_ > items(1))
   // val (a,b) = items.partition(_ > items(1))
    //val (a,b) = items.partition(_ > items(5))
   // val (a,b) = items.partition(_ > 10)
   // a.size*2 + b.size
    // (a.reduceLeft(_+_)+ b.reduceLeft( _+_) )
  }
 // val x = List(15, 10, 5, 8, 20, 12)


  var fruits = new ListBuffer[String]()
  var Bool1: Boolean = true


  println(" How many fruits? ")

    var count: Int = Console.readInt()
    var a: Int = 0

    for (a <- 1 to count) {
      println("enter names of the fruits")

      val a1: String = Console.readLine().toUpperCase()
      // Checking if right fruit is enter
      /*if (a1=="APPLE"&&
        a1=="ORANGE"){println("Sorry we don't have that fruit in our list.")
        println("enter Key e to EXITS  Or Enter the name of your fruits correctly ")

        Breaks}*/
      /* if (a1!="ORANGE"){println("Sorry we don't have that fruit in our list.")
        println("enter Key e to EXITS  Or Enter the name of your fruits correctly ")
        Breaks}*/
      // var fruits = new ListBuffer[String]()
      fruits += a1


    }



 // convert it back to list
//val fruitsList = fruits.toList
 val fruitsList = fruits.toList
  var sum:Int= sum(fruitsList)
  println(s"The total cost for the fruit purchase is ₦ "+sum)

  // println(fruits)
 //  println("enter names of the fruits")
  // var a1: String= Console.readLine().toUpperCase()


}
