package com.astashin.petandroid.coroutines

import android.os.Bundle
import com.astashin.petandroid.base.BaseActivity
import com.astashin.petandroid.R

class CoroutinesActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coroutines)

        log("start")
    }
}
