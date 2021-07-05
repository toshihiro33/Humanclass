package jp.techacademy.toshihiro.ishikawa.humanclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var human1=Human("石川",24,"剣道")
        var human2=Human("山田",30,"サイクリング")

        human1.say()
        human2.say()
        human1.think()
        human2.think()
    }
}