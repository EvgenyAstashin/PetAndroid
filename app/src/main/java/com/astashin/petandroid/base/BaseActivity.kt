package com.astashin.petandroid.base

import android.annotation.SuppressLint
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {

    fun log(message: String) {
        Log.e(localClassName, message)
    }
}