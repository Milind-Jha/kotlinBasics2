fun main(args:Array<String>){
    val names = arrayListOf("BOB","ALICE","JOHN")
    val lambda = {name:String -> println("Hi $name")}   //A Function with no name is lambda function
    sayHello(names,lambda)
    println()
    sayHello(arrayListOf("BOB","ALICE","JOHN")){name:String -> println("Hi $name")} //FORMAT OF USING A LAMBDA FUNCTION
}
fun sayHello(names:ArrayList<String>,uselambda: (String)->Unit){ //A function that uses a lambda
                                                                  // function is a higher order function
    for (name in names){
        uselambda(name)
    }
}