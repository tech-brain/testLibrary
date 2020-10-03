package com.mylibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mybaselibrary.BaseActivity

class MainActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayToast(this, "Hello")
    }


}