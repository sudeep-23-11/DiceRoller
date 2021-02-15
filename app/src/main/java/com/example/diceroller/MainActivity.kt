package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val diceImage = findViewById<ImageView>(R.id.dice_image)
        diceImage.setImageResource(R.drawable.dice_1)
        val rollButton = findViewById<Button>(R.id.roll_button)
        rollButton.setOnClickListener {
            val randomNumber = Random().nextInt(6)
            when (randomNumber)
            {
                0 -> diceImage.setImageResource(R.drawable.dice_1)
                1 -> diceImage.setImageResource(R.drawable.dice_2)
                2 -> diceImage.setImageResource(R.drawable.dice_3)
                3 -> diceImage.setImageResource(R.drawable.dice_4)
                4 -> diceImage.setImageResource(R.drawable.dice_5)
                5 -> diceImage.setImageResource(R.drawable.dice_6)
            }
        }
    }
}