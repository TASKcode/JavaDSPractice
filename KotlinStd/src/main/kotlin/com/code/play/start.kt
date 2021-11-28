package com.code.play

fun main() {
    val interestingThings = listOf("Kotlin", "Programming", "Comic Books", 123)
    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    println(interestingThings[1])
    sayHello("Hello", interestingThings)
    println(interestingThings.size)

    for (interest in interestingThings) {
        println(interest)
    }
    println("\n")

    interestingThings.forEach { interest ->
        println(interest)
    }
    println("\n")
    map.put(4, "d")
    map.forEach { key, value -> println("$key = $value") }

}

fun sayHello(greeting: String, itemToGreet: List<Any>) {

    itemToGreet.forEach { action -> println("$greeting to $action") }
    println()

    val person = Sample("Abhishek","Singh")
    print("Hello $person.firstName ")
}