package jp.teckacademy.kouji.kishimoto.kotlinlog
import android.util.Log
class BigDog :Dog {

    constructor(name:String,age:Int,hobby:String):super(name,age,hobby){

    }
    override fun say(){
        super .say()
        Log.d("kotlintest","大きな犬です。")
    }


}