import java.util.*

fun main(args:Array<String>){
    val customers = hashSetOf("Micky","Rudolph","Jones")
    val scanner = Scanner(System.`in`)
    val newcust = scanner.nextLine()
    customers.add(newcust)
    println(customers)

    val prime = setOf(2,3,5,7,11,13)
    println(prime.contains(21))
    println(prime.contains(13))

    val mydrinks = hashSetOf("Beer","Scotch","whiskey","Gin")
    val friendsdrinks = hashSetOf("Brandy","Beer","Scotch","Vodka")

    mydrinks.retainAll(friendsdrinks)
    println(mydrinks)

    val acceptedColors = hashSetOf("white", "black", "grey")
    val myColors = hashSetOf("blue", "red", "black", "green")

    acceptedColors.retainAll(myColors)
    println(acceptedColors)
    acceptedColors.add("red")
    acceptedColors.retainAll(myColors)
    println(acceptedColors)
    acceptedColors.addAll(myColors)
    println(acceptedColors)
}