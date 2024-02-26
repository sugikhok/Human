package jp.teckacademy.kouji.kishimoto.kotlinlog

import android.util.Log


open class Human : Animal, Thinkable {

    var hobby:String

    constructor(name:String, age:Int,hobby:String) : super(name,age) {
        this.name = name
        this.age = age
        this.hobby=hobby
    }


    override fun say() {

        Log.d("kotlintest", "私の名前は" + name + "です。")
        Log.d("kotlintest", "年は" + age + "歳です。")
    }



        override fun think() {
            Log.d("kotlintest", "私は" + this.hobby + "について考える。")

        }
    }












