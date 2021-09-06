fun main(){

    val names = arrayListOf("BOB","JOHN","ALICE")
    val mylamda = {name: String -> "HELLO $name"}
    val ans =higherOrderFunction(names,mylamda)
    println(names)
    println(ans)
    val ans2 = higherOrderFunction(names){name:String -> "Hello $name"}
    println(names)
    println(ans2)
    println(ans)
}
fun higherOrderFunction(names :ArrayList<String>,uselamda: (String)-> String):ArrayList<String>{
    val messages = arrayListOf<String>()
    for(name in names){
        messages.add(uselamda(name))
    }
    return messages
}