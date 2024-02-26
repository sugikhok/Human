package jp.teckacademy.kouji.kishimoto.kotlinlog

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("太郎", 16,"散歩")


        human.say()
        human.think()

        val human2 = Human("次郎",20,"読書")

        human2.say()
        human2.think()

    }



}

