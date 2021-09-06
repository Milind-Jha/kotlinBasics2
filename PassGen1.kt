import java.util.*
import kotlin.random.Random

fun main(args: Array<String>){
    val size = Random.nextInt(10,15)
    val scan = Scanner(System.`in`)
    var password: String? = ""
    println("Do you want to enter special charecters: 1 Yes 2 No?")

    val opt : Int = scan.nextInt()
    when(opt) {
        1 -> password = "Milind"

        2 -> {
            password = withoutspecialCharecters(size)
        }

        else -> return
    }
    println(password)
}


fun withoutspecialCharecters(size:Int): String{
    var password :String = ""
    for (i in 1..size){
        val smallorCapital = Random.nextInt(0,2)
        if (smallorCapital==0){//small
            val char = Random.nextInt(65,65+25).toChar()
            password += char
        }
        else if(smallorCapital==1){ // Capital
            val char = Random.nextInt(97,122).toChar()
            password += char
        }
        else {                      // numeric
            val char = Random.nextInt(49,59).toChar()
            password += char
        }
    }
    return password
}