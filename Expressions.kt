import java.util.*

fun main(args:Array<String>){
    val animals = arrayListOf("Cat","Dog")
    val addnew = "Horse"
    if (animals.add(addnew)){   // Returns TRUE
        println("Horse added")
    }

    val av = listOf("roti","Nan","Paratha")
    val item = "Butter Nan"
    if (item in av){
        println("available")
    }

    if (1 in 1..5){
        println(1 in 1..5)
    }

        println(10 in 1 until 10)
        println(10 !in 1 until 10)

    println("Enter the numbers of cats : ")
    val cats = Scanner(System.`in`)
    val cat = cats.nextInt()?:0
    if (cat in 1..3){
        println("few")
    }
    else if(cat in 4..6){
        println("several")
    }
    else if(cat in 7..9){
        println("many")
    }

}