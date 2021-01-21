/**
Created by Peter Almgren
 *  Date: 2020-12-21
 *  Time: 13:51
 *  Project: KotlinTest
 *  Copyright: MIT
 */
var num =10
val num1 =1
//fun sayHello(itemToGreet:String){
//    var msg = "Peter $itemToGreet"
//    println(msg)

//}
fun peterMetod(argument1:String, vararg argument2:String){
    argument2.forEach { argument2 -> print("$argument1 $argument2") }
}

fun sayHello2(firstWord:String,secondWord:String)=println ("$firstWord $secondWord")

//fun getNumber1(): Unit = println(num1)
//fun getNumber1() = println(num1)




fun main() {

    val array= arrayOf(" hej", " på", " dig")

   peterMetod("Peter", *array)



    //sayHello2("Kotlin","Java")

    //array.forEach { number ->
      //  println(number)
    //}

    //array.forEachIndexed{index,number -> println("$number is at index $index")}


    //fun getNumber() = num
    //println(getNumber())

    //getNumber1()

   // for (num1:num){



}