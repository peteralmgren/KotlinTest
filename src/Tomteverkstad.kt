import java.util.stream.Collector
import java.util.stream.Collectors.toList
import kotlin.system.exitProcess

/**
Created by Peter Almgren
 *  Date: 2021-01-14
 *  Time: 21:50
 *  Project: KotlinTest
 *  Copyright: MIT
 */

fun rekursionBosses(tMap: Map<String, Any>, nisse: String): List<String> {

    tailrec fun getList(list: List<Pair<String, Any>>,nisse: String, bossList: MutableList<String>): MutableList<String> {

        var nisse2 = nisse

        for (x in 0..list.size - 1) {
            if (list[x].second.toString().contains(nisse2, true)) { bossList.add(list[x].first)
                nisse2 = list[x].first
                break
            }
        }
        return if (nisse2 == list[0].first) bossList else getList(list, nisse2, bossList)
    }
    return getList(tMap.toList(), nisse, mutableListOf(String())).reversed()
    
}


fun main() {

    val tommteMap = mapOf("Tomten" to listOf("Glader", "Butter"), 
        "Glader" to listOf("Tröger", "Trötter", "Blyger"),
        "Butter" to listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven"), "Trötter" to "Skumtomten",
        "Skumtomten" to "Dammråttan", "Räven" to listOf("Gråsuggan", "Myran"), "Myran" to "Bladlusen")

    fun tomteName(): String {
        val list = tommteMap.toList()

        var name: String
        do {
            println("Skriv in vilken nisse?")
            name = readLine().toString()
            if (!list.toString().contains(name,ignoreCase = true))
                println("Nisse med det namnet finns inte.")
        }while (!list.toString().contains(name,true))

        if (name.equals(list[0].first,ignoreCase = true)){
            println("Tomten är högsta chefen!")
            exitProcess(0)
        }

        return name
    }
    val name = tomteName()
    val chefLista = rekursionBosses(tommteMap,name).joinToString(" <-- ","", "")
    println("Cheferna till $name är:\n$chefLista")

}