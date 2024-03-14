package cz.example.pirate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cz.example.pirate.ui.theme.PirateTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PirateTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CaptainGame() 
                }
            }
        }
    }
    @Composable
    fun CaptainGame(){
        var treasureFound by remember {
            mutableStateOf(0) }
        var direction by remember {
            mutableStateOf("North")
        }
        var stormOrTreasure by remember {
            mutableStateOf("")
        }

        Column {
            Text(text = "Treasures foung: ${treasureFound}")
            Text(text = "Current direction: ${direction}")
            Text(text = "Storm or treasure? current: ${stormOrTreasure}")
            Button(onClick = {
                direction = "West"
                if(Random.nextBoolean()){
                    treasureFound += 1
                    stormOrTreasure = "Treasure founded"
                }else{
                    stormOrTreasure = "Strorm ahead!"
                }
            }) {
                Text(text = "Sail West")
            }
            Button(onClick = {
                direction = "West"
                if(Random.nextBoolean()){
                    treasureFound += 1
                    stormOrTreasure = "Treasure founded"
                }else{
                    stormOrTreasure = "Strorm ahead!"
                }
            }) {
                Text(text = "Sail West")
            }
            Button(onClick = {
                direction = "South"
                if(Random.nextBoolean()){
                    treasureFound += 1
                    stormOrTreasure = "Treasure founded"
                }else{
                    stormOrTreasure = "Strorm ahead!"
                }
            }) {
                Text(text = "Sail South")
            }
            Button(onClick = {
                direction = "North"
                if(Random.nextBoolean()){
                    treasureFound += 1
                    stormOrTreasure = "Treasure founded"
                }else{
                    stormOrTreasure = "Strorm ahead!"
                }
            }) {
                Text(text = "Sail North")
            }
        }
    }
}

