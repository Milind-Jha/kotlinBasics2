fun main(args:Array<String>){

    val numbers = arrayListOf(23,22,44,32,28,78,88,68,75,73)
    println(numbers)
    val mylambda = {number:Int -> number/10}
    val ans1 = higherOrderFunction(numbers,mylambda)
//    val ans2 = higherOrderFunction(numbers){number -> number/10}
    println(numbers)
    println(ans1)
//    println(ans2)

}
fun higherOrderFunction(numbers:ArrayList<Int>,uselambda: (Int)->Int): ArrayList<Int> {
    for (i in 0..numbers.size-1){
        if (numbers[i]%2==0)
            numbers[i]=uselambda(numbers[i])

    }
    return numbers
}