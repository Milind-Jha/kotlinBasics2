import java.util.*

fun main(args : Array<String>){

        val scanner = Scanner(System.`in`)
        var a : Int? = scanner.nextInt()
        var b : Double? = a?.toDouble()
        b = b?.times(7)
        var q :String? = b?.toString()
        println(q)
        println(q?.length)
        println(q!! ::class.java)

    var x : Double? = 5.0
    x = x?.times(6)
    var f : Float? = x?.toFloat()
    println(f!! :: class.java)
//    println(x+3)  ERROR
//    println(x?.plus(3))
//    println(x?.minus(3))
//    println(x?.times(3))
//    println(x?.div(3))
//    println(x?.rem(3))
//    var s : String? = x.toString()
//    var q : String  = x.toString()
//    println(s + q)
}