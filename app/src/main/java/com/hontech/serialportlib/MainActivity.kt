package com.hontech.serialportlib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.hontech.serialportlib.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    /**
     * A native method that is implemented by the 'serialportlib' native library,
     * which is packaged with this application.
     */

<<<<<<< HEAD
    companion object {
        // Used to load the 'serialportlib' library on application startup.
        init {
            System.loadLibrary("serialportlib")
        }
    }
=======

>>>>>>> 修改bug
}