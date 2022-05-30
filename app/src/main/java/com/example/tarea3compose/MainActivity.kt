package com.example.tarea3compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
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
    val navHostController = rememberNavController( )

    NavHost(navController = navHostController, startDestination = "Consulta"){
        composable(route="Consulta"){
            ConsultaScreen()
        }
        composable(route="Registro"){
            RegistroScreen()
        }
    }
}

@Composable
fun RegistroScreen(){
    var ocup by rememberSaveable() {
        mutableStateOf("")
    }
    Column(modifier = Modifier.padding(8.dp)){
        OutlinedTextField(
            label = {
                    Text(text = "Ocupación")
            },
            leadingIcon = {
                          Icon(imageVector = Icons.Default.Person, contentDescription = null)
            },
            value = ocup,
            onValueChange = {ocup = it},
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedButton(onClick = { /*TODO*/ }) {
            Text(text = "Guardar")
        }
    }
}

@Composable
fun ConsultaScreen(){
    Column(modifier = Modifier.padding(8.dp)) {

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

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    Tarea3ComposeTheme {
        MyApp()
    }
}