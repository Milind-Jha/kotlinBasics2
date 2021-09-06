import java.util.*

fun main(args: Array<String>){
//    println("Enter the number: ")
//    val scanner = Scanner(System.`in`)
//    var x = scanner.nextInt()
//    while (x<100 && x>-100){
//        println("Please enter a number 3 digit number")
//        x = scanner.nextInt()
//    }
    val username = hashSetOf("Bob","Dylan","Sam")
    var name =""
    var exit = false
    do {
        println("Enter username : ")
        name = readLine()?:""
        if (username.contains(name)){
            println("User name taken")
        }

        else{
            println("$name is your username")
            exit=true
            username.add(name)
        }

    }while (!exit)

    username.forEach{
        print("${it} ")
    }
}