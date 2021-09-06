fun main(args:Array<String>){
//    val leapYear = mapOf(Pair("Jan",31),Pair("Feb",29),Pair("March",31),Pair("April",30),Pair("May",31),Pair("June",30),
//        Pair("July",31),Pair("Aug",31),Pair("Sept",30),Pair("Oct",31),Pair("Nov",30),Pair("Dec",31))
//    val nonLeapYear = mapOf(Pair("Jan",31),Pair("Feb",28),Pair("March",31),Pair("April",30),Pair("May",31),Pair("June",30),
//        Pair("July",31),Pair("Aug",31),Pair("Sept",30),Pair("Oct",31),Pair("Nov",30),Pair("Dec",31))
//    print("Enter the year : ")
//    val year = readLine()?.toInt()

//    for (i in 10 downTo  0){
//        when(i){
//            9 ->println("start your engines")
//            6 ->println("On your marks")
//            3 ->println("Get Set")
//            0 ->println("Go")
//            else -> println(i)
//        }
//    }
//    for (i in 0 .. 9){
//        for (j in 0 .. 9){
//            if (i>=j){
//                print("\uD83D\uDE00")
//            }
//        }
//        println()
//    }
//    val arr = Array(3){IntArray(5)}
//    for (i in 0..2){
//        for (j in 0..4){
//            print(arr[i][j])
//        }
//        println()
//    }
//    val arr2 = Array(4){1}
//    for (i in 0..3){
//        print(arr2[i])
//    }

    val n = readLine()?:""
    val number = n.toInt()
    for (i in 0 until number){
        for (j in 0 until number){
            if(i*j%3==0) print(" \uD83D\uDE00 ")
            else if (i*j%3==1) print("\uD83E\uDD28 ")
            else print(" \uD83D\uDE31 ")
        }
        println()
    }
}