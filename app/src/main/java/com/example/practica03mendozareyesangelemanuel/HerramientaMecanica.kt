package com.example.practica03mendozareyesangelemanuel

class HerramientaMecanica (marca: String, modelo: String, codigo: Int, costo: Double
) : Herramienta(marca,modelo,codigo,costo){

    var peso: Float? = null
    var tamanio: Float? = null
    var dimensiones: String = ""
}