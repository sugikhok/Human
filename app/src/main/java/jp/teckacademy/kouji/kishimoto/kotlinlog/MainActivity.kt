package jp.teckacademy.kouji.kishimoto.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("太郎", 16)

        human.say()


        val hobby = Human.Hobby("読書")

        hobby.think()


        val str1 = "Hello"
        val str2 = "World"
        val str3 = "Hello"

        if (str1.equals(str2)) {
            Log.d("kotlintest", "str1とstr2は一緒です")
        } else {
            Log.d("kotlintest", "str1とstr2は異なります")
        }


        if (str1.equals(str3)) {
            Log.d("kotlintest", "str1とstr3は一緒です")
        } else {
            Log.d("kotlintest", "str1とstr3は異なります")
        }

        val i = 100
        val str = i.toString() + "*100=${i * 100}"
        Log.d("kotlintest", str)


    }


}

