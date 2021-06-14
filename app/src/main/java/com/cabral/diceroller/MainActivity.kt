package com.cabral.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDiceOne() }

    }

    private fun rollDiceOne() {
        val myDice = Dice(6)
        val diceRoll:Int =myDice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView1)

        val imageToDisplay= when(diceRoll){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            6-> R.drawable.dice_6
            else -> R.drawable.dice_1
        }
        diceImage.setImageDrawable(getDrawable(imageToDisplay))
        diceImage.contentDescription=diceRoll.toString()

        rollDiceTwo()
    }


    private fun rollDiceTwo() {
        val myDice = Dice(6)
        val diceRoll:Int =myDice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView2)

        val imageToDisplay= when(diceRoll){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            6-> R.drawable.dice_6
            else -> R.drawable.dice_1
        }
        diceImage.setImageDrawable(getDrawable(imageToDisplay))
        diceImage.contentDescription=diceRoll.toString()

    }
}

