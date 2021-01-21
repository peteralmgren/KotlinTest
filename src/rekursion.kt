/**
Created by Peter Almgren
 *  Date: 2021-01-14
 *  Time: 09:55
 *  Project: KotlinTest
 *  Copyright: MIT
 */
class rekursion {

     tailrec fun factorialAccumulating(amount:Double,years:Int,interest:Double) {
         if (years == 1) amount
         else factorialAccumulating(amount + amount * interest / 100, years - 1, interest)

     }


}

fun main() {

}