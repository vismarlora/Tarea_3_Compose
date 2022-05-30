package com.example.tarea3compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tarea3compose.ui.theme.Tarea3ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tarea3ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

@Composable
fun MyApp() {
    Column() {

    Button(onClick = { /*TODO*/ }) {
    Text("Nuevo")
    }
        val lista = listOf("Vismar", "Nachely", "Kelvin")

        LazyColumn(modifier = Modifier.fillMaxWidth()){
            items(lista) { nombre ->
                RowNombre(nombre)
            }
        }
    }
}

@Composable
fun RowNombre(nombre: String){
    Row(){
        Text("El nombre es: $nombre")


    }
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun DefaultPreview() {
    Tarea3ComposeTheme {
        MyApp()
    }
}