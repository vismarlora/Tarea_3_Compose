package com.example.tarea3compose.util

sealed class Screen(val route: String) {
    object RegistroPersona : Screen("RegistroPersona")
    object RegistroOcupaciones : Screen("RegistroOcupaciones")
    object ConsultaPersona : Screen("ConsultaPersona")
    object ConsultaOcupaciones : Screen("ConsultaOcupaciones")
}