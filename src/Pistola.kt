class Pistola(municion: Int, tipoDeMunicion: String, danio: Int, radio: String) : ArmaDeFuego("Pistola", municion, tipoDeMunicion, danio, radio) {
    override val municionARestar = 1
}