fun main(args: Array<String>){
//    getdouble(5,"5*2 = ")
//    getdouble(5)
//    getdouble()

//    val people = listOf("Anna", "Bob", "Charlie")
//    for (person in people){
//        val message = greeting(person)
//        println(message)
//    }
//    val ans = area(7)
//    println(ans)
//    area2(7)

//    val products = hashMapOf(Pair("shoes",29.99),Pair("socks",5.99),Pair("jeans",39.99))
//    for (product in products.keys){
//        val finalPrice = add20PercentTax(products[product])
//        println("Price of ${product} is $finalPrice")
//    }
val animal = readLine()?:""
val age = expectedLifeSpan(animal)
    println(age)

}
fun getdouble(number: Int=2, heading:String="double of ${number} is"){ //"double of ${number} is" is default value

    println("$heading ${number*2}")

}
fun greeting(person: String):String{
    val message = when(person[0]){
        'A' -> "Hello $person"
        'B' ->  "Hi $person"
        else -> "Hey how are you $person"
    }
    return message
}
fun area(radius:Int) = 3.1415 * radius * radius
fun area2(radius: Int)= println(3.1415 * radius * radius)

fun add20PercentTax(price:Double?) = price?.times(1.2)

fun expectedLifeSpan(animal:String) : Int{
    when(animal){

        "Cat" -> return 15
        "Dog" -> return 12
        "rabbit"-> return 10
        else ->return 20
    }

}