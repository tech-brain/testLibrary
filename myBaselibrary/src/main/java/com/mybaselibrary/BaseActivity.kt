package com.mybaselibrary

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }


    //navigate another activity with finish activity
    public fun navigateWithFinish(destination: Class<*>) {

        val intent = Intent(this@BaseActivity, destination)
        startActivity(intent)
        finish()

    }

    //display toast
    public fun displayToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }


}