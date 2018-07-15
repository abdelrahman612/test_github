package com.example.abdelrahman.test_github

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun test()
    {
        Toast.makeText(this,"test test",Toast.LENGTH_LONG).show()
    }
}
