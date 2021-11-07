package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton: Button = findViewById(R.id.button2)
        rollButton.setOnClickListener {
            rollDice1()
            rollDice2()
        }


    }


    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice1() {
        // Create new Dice object with 6 sides and roll it
        val dice1 = Dice(6)
        val diceRoll = dice1.roll()

        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView2)
        resultTextView.text = diceRoll.toString()
    }

    private fun rollDice2() {
        // Create new Dice object with 6 sides and roll it
        val dice2 = Dice(6)
        val diceRoll = dice2.roll()

        // Update the screen with the dice roll
        val resultTextView2: TextView = findViewById(R.id.textView3)
        resultTextView2.text = diceRoll.toString()
    }
}


class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}