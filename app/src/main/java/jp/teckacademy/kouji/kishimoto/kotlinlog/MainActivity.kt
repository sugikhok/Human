package jp.teckacademy.kouji.kishimoto.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human = Human("太郎", 16,"読書")

        human.say()
        Log.d("kotlintest", "私の名前は" + human.name + "です。")
        Log.d("kotlintest", "年は" + human.age + "歳です。")



        human.think()


    }
}


