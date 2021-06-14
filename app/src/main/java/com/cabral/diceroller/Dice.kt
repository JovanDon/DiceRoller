package com.cabral.diceroller

class Dice(private val numSildes : Int) {
    fun roll() : Int{
        return (1..numSildes).random()
    }
}