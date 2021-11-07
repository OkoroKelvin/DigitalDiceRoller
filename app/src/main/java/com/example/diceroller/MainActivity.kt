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
            val cDice1 = rollDice1()
            val cDice2 = rollDice2()
            val sumDice = cDice1 + cDice2

            val resultTextView: TextView = findViewById(R.id.textView2)
            val resultTextView2: TextView = findViewById(R.id.textView3)
            val resultTextView3: TextView = findViewById(R.id.textView)

            resultTextView.text = cDice1.toString()
            resultTextView2.text = cDice2.toString()
            resultTextView3.text = sumDice.toString()

        }


    }


    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice1(): Int {
        // Create new Dice object with 6 sides and roll it
        val dice1 = Dice(6)
        return dice1.roll()

    }

    private fun rollDice2(): Int {
        // Create new Dice object with 6 sides and roll it
        val dice2 = Dice(6)
        return dice2.roll()

    }
}


class Dice(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}