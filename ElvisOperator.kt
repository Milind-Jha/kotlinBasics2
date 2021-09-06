import java.util.*

fun main(args :Array<String>){
//    var name: String? = null
//    println(name?:"This cat has no name")
//    println(name?.length?:"Fluffy".length)
//    name = "Flufy"
//    println(name?:"This cat has no name")
//    println(name?.length?:"Fluffy".length)

//    var catname : String? = null
//    println(catname?.length)    // null output
//    println(catname!!.length) // NULL POINTER EXCEPTION


    val input = Scanner(System.`in`)
    val x : Int? = input.nextInt()
    println(x?.times(29.99)?:61)
}