
/**
Created by Peter Almgren
 *  Date: 2021-01-13
 *  Time: 09:43
 *  Project: KotlinTest
 *  Copyright: MIT
 */
class giraffe (var name:String)

class fish (name: String) {

    var f1 = fish("Rune")
        get() {
            return field
        }
        set(value){
            field=value
        }

}

fun main() {
    var g1 = giraffe("Dog")

    fun changeName(newName:String ): Unit{g1.name=newName}

    changeName("Hound")

    var rooms =3


    print(g1.name)

    var f =fish("fisk")




}