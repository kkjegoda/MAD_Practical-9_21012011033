package com.example.mad_practical_9_21012011033

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashActivity2 : AppCompatActivity(), Animation.AnimationListener {
    lateinit var gunilogoanimation: AnimationDrawable
    lateinit var image3:ImageView
    lateinit var logoanimation:Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash2)

        image3 = findViewById<ImageView>(R.id.logo)
        image3.setBackgroundResource(R.drawable.uvpce_animation_list)
        gunilogoanimation= image3.background as AnimationDrawable

        logoanimation = AnimationUtils.loadAnimation(this , R.anim.twin_animation)
        logoanimation.setAnimationListener(this)
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {

        if (hasFocus){
            image3.startAnimation(logoanimation)
            gunilogoanimation.start()

        }
        else{
            gunilogoanimation.stop()

        }
        super.onWindowFocusChanged(hasFocus)
    }

    override fun onAnimationStart(p0: Animation?) {

    }

    override fun onAnimationEnd(p0: Animation?) {
        Intent(this , MainActivity::class.java).apply { startActivity(this) }
    }

    override fun onAnimationRepeat(p0: Animation?) {
    }
}

