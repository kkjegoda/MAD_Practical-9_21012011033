package com.example.mad_practical_9_21012011033

import android.annotation.SuppressLint
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.mad_practical_9_21012011033.R.drawable.uvpce_logo

class Splash_Activity : AppCompatActivity() {
    lateinit var logonanimation:AnimationDrawable
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash2)
        val image=findViewById<ImageView>(R.drawable.uvpce_logo)
        image.setBackgroundResource(R.drawable.uvpce_animation_list)
        logonanimation=image.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if(hasFocus){
            logonanimation.start()
        }
        else{
            logonanimation.stop()
        }
    }
}