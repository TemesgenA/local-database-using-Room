package com.selamta.localdatabaseusingroom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.room.Room
import com.selamta.localdatabaseusingroom.data.AppDatabase
import com.selamta.localdatabaseusingroom.ui.theme.LocalDatabaseUsingRoomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Create the database instance
        val database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "app-database"
        )
            .build()
        // Store the database instance in a global variable so that it can be accessed from anywhere in the app
        MainActivity.database = database

        setContent {
            LocalDatabaseUsingRoomTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }

    companion object {
        // Global variable to store the database instance
        lateinit var database: AppDatabase
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LocalDatabaseUsingRoomTheme {
        Greeting("Android")
    }
}