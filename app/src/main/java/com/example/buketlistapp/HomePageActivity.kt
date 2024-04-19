package com.example.buketlistapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomePageActivity : AppCompatActivity() {
    private lateinit var buttonViewBucketList: Button
    private lateinit var buttonAddBucketListItem: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        enableEdgeToEdge()

        // Initialize the button
        buttonViewBucketList = findViewById(R.id.buttonViewBucketList)
        buttonAddBucketListItem = findViewById(R.id.buttonAddBucketListItem)

        // Set the click listener to the button
        buttonViewBucketList.setOnClickListener {
            // Navigate to ViewBucketListActivity
            val intent = Intent(this, ViewBucketList::class.java)
            startActivity(intent)
        }
        buttonAddBucketListItem.setOnClickListener {
            // Navigate to LoginActivity
            val intentAdd = Intent(this, AddItemInList::class.java)
            startActivity(intentAdd)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
