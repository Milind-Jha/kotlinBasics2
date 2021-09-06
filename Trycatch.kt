import java.util.*

fun main(args : Array<String>){
    val scan = Scanner(System.`in`)
    val num :Double?
    try {
        num = scan?.nextDouble()?:4.0
        println(num?.times(9.99))
    }
    catch (e:Exception){
        println("${e.localizedMessage}")
    }
}