package com.code.play

class Sample(val firstName: String, val lastName: String) {
    init{
        println("init 1")
    }

    constructor() : this("Bruce", "Wayne") {
        println("Secondary Constructor")
    }
    init{
        println("init 2")
    }
}