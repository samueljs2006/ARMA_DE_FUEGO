import kotlin.random.Random
fun main() {
    val armas = listOf(
        Pistola(6, "9mm", 3, "Corto"),
        Rifle(10, "7.62mm", 7, "Intermedio"),
        Bazooka(2, "RPG", 15, "Enorme")
    )

    val objetosDisparables = listOf( Casa(), Coche(), Bocadillo() )

    println("\nMunición extra = ${ArmaDeFuego.cantidadMunicionExtra}... para todas las armas de fuego.\n")

    val disparos = List(12) { armas.random() to Random.nextInt(1, 4) }

    for ((arma, veces) in disparos) {
        println("\n--- Disparo con ${arma.nombre} ---")
        repeat(veces) {
            arma.dispara()
            arma.mostrarInfo()
        }
    }

    println("\n--- Disparos de objetos aleatorios ---")
    repeat(9) {
        objetosDisparables.random().dispara()
    }
}