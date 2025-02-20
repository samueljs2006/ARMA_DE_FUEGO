class Bazooka(municion: Int, tipoDeMunicion: String, danio: Int, radio: String) : ArmaDeFuego("Bazooka", municion, tipoDeMunicion, danio, radio) {
    override val municionARestar = 3
}