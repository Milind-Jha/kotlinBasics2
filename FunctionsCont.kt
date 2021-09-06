import kotlin.time.times

fun main(args: Array<String>){
//    sayHello("john","Davad","Washington")
//    println()
//
//    var map = hashMapOf<String,Double?>(Pair("Alice",142.0),Pair("Ted",1142.0),Pair("John",342.0))
//    Bank(map)
//    println()
    
    enterName()
}
//fun sayHello(vararg names:String){
//    for (name in names)
//    println("Hi $name")
//}
//fun Bank(users: HashMap<String,Double?>){
//    fun doubleamount(amount:Double?)=amount?.times(2)
//
//    for(user in users.keys){
//        users[user]=doubleamount(users[user])
//        println("$user : ${users[user]}")
//    }
//    for (user in users){
////        user.value = doubleamount(user.value)         Error value cannot be reassigned
//        println("${user.key} : ${user.value}")
//    }
//}

fun enterName(){
    fun local(name:String){
        println("Hi $name")
    }
    val names = arrayListOf<String>()
    while (true) {
        val name = readLine() ?: ""
        if (name=="") break
        names.add(name)
    }
    for (name in names){
        local(name)
    }
}
