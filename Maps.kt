fun  main(args: Array<String>){
    val attendance = hashMapOf(Pair("23rd Sept",2837), Pair("24th Sept",3726),Pair("25th Sept",6253))
    attendance.put("26th Sept", 3213)
    println(attendance["25th Sept"])
    println(attendance.get("26th Sept"))
    println(attendance.containsKey("22nd Sept"))
    val attOn25th = attendance.get("25th Sept")?:0 // CANNOT ADD WITHOUT ELVIS BECAUSE VALUE MIGHT BE NULL
    val attOn26th = attendance.get("26th Sept")?:0 // CANNOT ADD WITHOUT ELVIS BECAUSE VALUE MIGHT BE NULL
    println("25th + 26th is ${(attendance.get("25th Sept")?:0)+(attendance.get("26th Sept")?:0) }")
    println("25th + 26th is ${attOn25th+attOn26th}")
}