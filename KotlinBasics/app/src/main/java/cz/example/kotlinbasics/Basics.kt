package cz.example.kotlinbasics



fun main() {

    //Immutable list - cannot add items after the initialization
    //val shoppingList = listOf("Procesor", "RAM", "Graphics card")

    // you can add items after and change
    val shoppingList = mutableListOf("Procesor", "RAM", "Graphics card")

    for (index in 0 until shoppingList.size){
        println("item ${shoppingList[index]} is at index $index")
    }
   // println(shoppingList)

}










/*

val coffeeForKamil = CoffeeDetails(0,"Esspreso", "XL", 0)

data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
){

}
fun add(num1: Int, num2: Int): Int{

    val result = num1 + num2
    return result
}
//"The result of [num1] + [num2] is: [result]".
fun askCoffeeDetails(){
    println("Who is this coffee?")
    val name = readln()
    println("How many pieces of sugar do you want?")
    val sugarCount = readln()
    val sugarCountInt = sugarCount.toInt()


}

fun makeCoffee(coffeeDetails: CoffeeDetails) {


    if (coffeeDetails.sugarCount == 1) {
        println("Coffee with $coffeeDetails.sugarCount spoon of sugar for $coffeeDetails.name")
    } else if (coffeeDetails.sugarCount >=2) {
        println("Coffee with $coffeeDetails.sugarCount spoons of sugar for $coffeeDetails.name")
    } else {
        println("Without sugar? OK")
    }
}

 */