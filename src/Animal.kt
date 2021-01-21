import kotlin.random.Random

/**
Created by Peter Almgren
 *  Date: 2021-01-13
 *  Time: 10:54
 *  Project: KotlinTest
 *  Copyright: MIT
 */


data class Person (val name:String,var age:Int){


}

class Animal(sort:String, legs:Int) {
    var sort=""
        get(){
           return field
        }
        set(Value){
            field=Value
        }
    var legs= 0
        get(){
            return field
        }
        set(Value){
            field=Value
        }
    fun printInfo(){
        println("Djursorten är: $sort och har antal ben: $legs")
    }





}

fun main() {

    var a1 = Animal("Cat",4)
    var a2 = Animal("Dog",4)
    var a3 = Animal("Spider",8)
    var a4 = Animal("Human",2)
    var a5 = Animal("Bird",2)

    val constants = mapOf("Fish" to 5)

    for ((key,value)in constants){
        println("$key=$value")}



    a1.sort="Cat";a1.legs=4;a2.sort="Dog";a2.legs=4;a3.sort="Spider";a3.legs=8


    var list= mutableListOf(a1,a2,a3)

    println(list.size)

    list.forEach({e->e.printInfo()})

    var p1=Person("Kent",5)
    var p2=Person("Kent",5)
    var p3=Person("Kent",10)

    println(p1.equals(p2))
    println(p1.equals(p3))



}
