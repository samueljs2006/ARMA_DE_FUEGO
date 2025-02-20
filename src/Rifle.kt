class Rifle(municion: Int, tipoDeMunicion: String, danio: Int, radio: String) : ArmaDeFuego("Rifle", municion, tipoDeMunicion, danio, radio) {
    override val municionARestar = 2
}
