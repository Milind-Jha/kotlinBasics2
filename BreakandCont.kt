fun main(args:Array<String>){
//    val animals = arrayListOf<String>()
//    var animalCount = 0
//    while (animalCount<5){
//        val animal = readLine()?:""
//        if (animal!="snake"){
//            animals.add(animal)
//            animalCount++
//        }
//        else{
//            println("Snake not allowed")
//            break
//        }
//
//    }
//    animals.forEach{
//        print(" $it")
//    }

    val people = arrayListOf<String>()
    println("Enter the age : ")
    var Age = readLine()?:""

    while (Age!="stop"){
        var age = Age.toInt()
        if (age>=18){
            println("Hello user")
            Age = readLine()?:""
            if (Age=="stop") break
            age = Age.toInt()
        }

        else {
            println("User not allowed")
            Age = readLine()?:""
            if (Age=="stop") break
            age = Age.toInt()
        }
    }


}