import java.util.*

fun main(args:Array<String>){
//    val scan = readLine()?:"true"
//    val night = scan.toBoolean()
//    if (night){
//        println("Sleep")
//    }
//    else{
//        println("Wake up and work")
//    }

//    val keys = readLine()?:""
//    val hasKeys: Boolean
//    if (keys=="yes") hasKeys=true
//    else hasKeys=false
//    if (hasKeys){
//        println("Car can be started")
//    }
//    else{
//        println("Cannot start the car")
//    }

//    println("Enter the time in 24 hr format :")
//    val timeSt = readLine()?:"0"
//    val timeIn24hrFormat = timeSt.toInt()
//    if (timeIn24hrFormat>12){
//        println("Time is : ${timeIn24hrFormat-12} pm")
//    }
//    else{
//        println("Time is : ${timeIn24hrFormat} am")
//    }

//    print("Enter a number : ")
//    println()
//    val number = readLine()?:"0"
//    val no = number.toInt()
//    val message = if (no<10) "number is less than 10" else "number is more than 10"
//    println(message)

    println("Enter message")
    val status = readLine()?:"0"
    val st = (status.toInt())/100
    var msg : String =""

    if (st==1){
        msg =  "Info response"
    }
    else if (st ==2) {
        msg = "success"
    }
    else if (st==3){
        msg = "redirect"
    }
    else if(st==4){
        msg = "Client error"
    }
    else if (st==5){
        msg = "Server Error"
    }

    println(msg)
}