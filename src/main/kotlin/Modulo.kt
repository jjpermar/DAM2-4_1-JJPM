class Modulo(num_alumno: Int) {
    var almunos = arrayOfNulls<Alumno?>(num_alumno)
    var notas = Array(3) { FloatArray(num_alumno) { -1.0F } }
    var totaldealumnos = 0
    var n_alumno = num_alumno
    fun introducir(alumno: Alumno): Int {
        if (totaldealumnos < n_alumno) // ¿Hay espacio?
            if (almunos.filter { it?.identificador.equals(alumno.identificador) }.size == 0) { // ¿No existe ya?
                almunos[almunos.indexOfFirst { it == null }] = alumno
                totaldealumnos++
            }
        return totaldealumnos
    }

    fun mostrar_array() {
        println(almunos)
    }
}