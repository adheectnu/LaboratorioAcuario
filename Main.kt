package org.example

import acuario.*

fun crearPeces() {
    val tiburon = Tiburon()
    val payaso = PezPayaso()

    println("Color Tiburón: ${tiburon.color}")
    tiburon.comer()

    println("Color Pez Payaso: ${payaso.color}")
    payaso.comer()
}

fun main() {
    println("=== Laboratorio de Acuario Final ===")
    crearPeces()
}
