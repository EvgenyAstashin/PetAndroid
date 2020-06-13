package com.astashin.petandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.astashin.petandroid.coroutines.CoroutinesActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.coroutines_btn).setOnClickListener {
            startActivity(Intent(this, CoroutinesActivity::class.java))
        }
    }
}
