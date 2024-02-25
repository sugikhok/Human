package jp.teckacademy.kouji.kishimoto.kotlinlog

import android.util.Log


open class Human : Animal {

    constructor(name: String, age: Int) : super(name, age)

    init {

    }

    override fun say() {

        Log.d("kotlintest", "私の名前は" + name + "です。")
        Log.d("kotlintest", "年は" + age + "歳です。")
    }

    open class Hobby : Thinkable {

        var hobby: String = ""

        constructor(hobby: String){
            this.hobby= hobby

        }


        override fun think() {
            Log.d("kotlintest", "私は" + hobby + "について考える。")

        }
    }
}




