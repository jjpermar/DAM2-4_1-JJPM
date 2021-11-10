class Alumno(
    var identificador: String = "",
    var nombre: String = "",
    var apellido1: String = "",
    var apellido2: String = ""
){
    init{
        require(!identificador.isNullOrEmpty(), { "Numero de Identificacion no puede ser nulo" })
    }
    fun mostrar(): String{
        return "$identificador, $nombre $apellido1 $apellido2"
    }
}

