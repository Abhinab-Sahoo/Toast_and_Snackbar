package com.example.toastandsnackbar

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.toastandsnackbar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.showMessageButton.setOnClickListener {
            Toast.makeText(this, "This is a Toast Message!", Toast.LENGTH_SHORT).show()

            Snackbar.make(this, binding.root, "This is a Snack-bar Message!", Snackbar.LENGTH_INDEFINITE)
                .setBackgroundTint(Color.RED)
                .setAction("Close App") {
                    finish()
                }.show()
        }

    }
}