import kotlin.random.Random

fun main(args:Array<String>){
    val names = listOf("jamie","bob","john","tom","mark")
//    names.forEach{ print("$it \t")}
//    println()
//    names.filter { it.length<4 }.forEach{ print("$it \t")}
//    val sizes = names.map { it.length }             // creates a list of corresponding length
//    println()
//    println(sizes :: class.java)
//    println(sizes)
//    val sorted = names.sortedBy { it.length }       // sorted by length
//    println(sorted ::class.java)
//    println(sorted)
//    val min = names.minByOrNull { it.length }
//    println(min)
//    val max = names.maxByOrNull { it.length }
//    println(max)
//    val sort = names.sortedBy { it[it.length-1] }       // sortedby the last letter
//    println(sort)
//
    val integers = hashSetOf(12,22,31,2,6,106,84,231)
//    val doubleDigits = integers.filter { it in 10..99 }
//    doubleDigits.forEach{ print("$it \t")}

//    val threeDigitNumbers = listOf(321,785,332,745,156,192)
//    val max2 = threeDigitNumbers.maxByOrNull { it.toString()[1] }
//    val max3 = threeDigitNumbers.maxByOrNull { (it/10)%10 }
//    println(max2)
//    println(max3)

    val number = integers.map{
        if (it%2==1){
            it*2
        }
        else
            it/2
    }.filter { it>25 }
    println(number)

}


