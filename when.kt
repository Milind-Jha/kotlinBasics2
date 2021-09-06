fun main(args:Array<String>){
//    val meals = readLine()?:""
//
//    val recommendation = when(meals.toInt()){
//        in 1..2 -> "Increase the number of meals"
//
//        3 ->  "OK"
//
//        else -> "Decrease the number of meals"
//    }
//    println(recommendation)

//    val num = readLine()?:""
//    val number = num.toInt()
//    println(factorial(number))

    val nm = readLine()?:""
    val largenumber = nm.toLong()
    val x = 0L
    divisible_By_7(largenumber,x)

}
fun divisible_By_7(largenumber: Long,x:Long){
    if (x>largenumber){
        return
    }
    if (x%7==0L){
        println(x)
    }
    divisible_By_7(largenumber,x+1)
}

fun factorial(number:Int):Long{
    if (number<=1){
        return 1
    }
    var x = factorial(number-1)
    x *= number
    return x
}