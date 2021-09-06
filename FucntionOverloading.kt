import java.net.FileNameMap

fun main(args:Array<String>){
    val name = "David"
    val names = listOf("john"," david","washington")
    val names2 = setOf("john", "Arthur","Jin")
    val names3 = mapOf(
        Pair("Arthur", "Morgan"),Pair("Jin", "Sakai"),Pair("peter", "Parker"))
    sayHello(name)
    sayHello(names)
    sayHello(names2)
    sayHello(names3)
}
fun sayHello(name :String){
    println("Hi $name")
}
fun sayHello(names: Collection<String>){
    for(person in names){
        println(" hi $person")
    }
}
fun sayHello(nameMap: Map<String,String>){
    for (name in nameMap){
        println("  hi ${name.key} ${name.value}")
    }
}