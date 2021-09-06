fun main(args : Array<String>){
//    val l = listOf("red","blue","yellow")
//    println(l.get(1))
//    println(l[0])
//    println(l)
//    val q = listOf<String>() //Empty List
//    println(q)
//    val w = listOf("blue",null,"green",null,"blue")
//    println(w)
//    println(w.size)

//    var colours = arrayListOf("red",null,"blue","green",null)
//    colours.set(1,"pink")
//    colours.add("yellow")
//    colours.remove(null)
//    println(colours) //1
//
//    val items = arrayListOf<String>("laptop", "mouse", "pen", "paper","mug","phone")
//    val removed = listOf<String>("pen","phone","mug","paper")
//    items.removeAll(removed)
//    println(items)

    val race = arrayListOf("usian","john","Micheal","robert","jake")
    println("pos of micheal : ${race.indexOf("Micheal")+1}")

    val requiredcolors = listOf("Red","Green","Blue")
    val availablecolors = arrayListOf("Red","Blue")
    println(availablecolors.containsAll(requiredcolors))// False
    println(requiredcolors.containsAll(availablecolors))// True

    val ingridients = arrayListOf("Mozirella","Cheese","Egg")
    val rep = "Blue cheese"
    ingridients[ingridients.indexOf("Egg")]= "Bread"
    ingridients.set(ingridients.indexOf("Cheese"),rep)
    println(ingridients)

    val animals = arrayListOf("lion", "zebra", "chimp" , "elephant")
    animals.add("panda bear cub")
    println(animals)
    animals.removeAt(0)
    println(animals)


}