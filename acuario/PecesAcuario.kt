package acuario

// Interfaz
interface AccionPez {
    fun comer()
}

// Clase abstracta
abstract class Pez {
    abstract val color: String
}

// Tiburón
class Tiburon : Pez(), AccionPez {
    override val color: String = "gris"
    override fun comer() {
        println("Tiburón: cazar y comer peces")
    }
}

// Pez Payaso
class PezPayaso : Pez(), AccionPez {
    override val color: String = "dorado"
    override fun comer() {
        println("Pez Payaso: comer algas")
    }
}
