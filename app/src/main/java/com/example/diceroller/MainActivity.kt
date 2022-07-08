package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollDice()
            rollSecondDice()
//            val toast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
//            toast.show()

//            Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()

        }


    }

    private fun rollSecondDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultSecondTextView: TextView = findViewById(R.id.textView3)
        resultSecondTextView.text = diceRoll.toString()
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
//        val resultSecondTextView: TextView = findViewById(R.id.textView3)
//        resultSecondTextView.text = deceRoll.toString()
    }


}


class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}