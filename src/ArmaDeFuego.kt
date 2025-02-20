import kotlin.random.Random

// Clase abstracta para armas de fuego
abstract class ArmaDeFuego( val nombre: String, private var municion: Int, val tipoDeMunicion: String, val danio: Int, val radio: String) {
    protected abstract val municionARestar: Int

    companion object {
        var cantidadMunicionExtra: Int = Random.nextInt(5, 16)
    }

    fun dispara() {
        println("\nDisparo con $nombre")
        if (municion >= municionARestar) {
            municion -= municionARestar
            println("Munición restante: $municion")
        } else {
            println("No hay suficiente munición, intentando recargar...")
            recarga()
            if (municion >= municionARestar) {
                dispara()
            } else {
                println("No hay suficiente munición para disparar.")
            }
        }
    }

    fun recarga() {
        val cantidadARecargar = municionARestar * 2
        println("Intentando recargar $nombre...")
        when {
            cantidadMunicionExtra >= cantidadARecargar -> {
                municion += cantidadARecargar
                cantidadMunicionExtra -= cantidadARecargar
            }
            cantidadMunicionExtra >= municionARestar -> {
                municion += municionARestar
                cantidadMunicionExtra -= municionARestar
            }
            else -> {
                println("No hay suficiente munición extra para recargar.")
                return
            }
        }
        println("$nombre recargado. Munición actual: $municion")
    }

    fun mostrarInfo() {
        println("Nombre: $nombre, Munición: $municion, Tipo de Munición: $tipoDeMunicion, Daño: $danio, Radio: $radio")
    }
}