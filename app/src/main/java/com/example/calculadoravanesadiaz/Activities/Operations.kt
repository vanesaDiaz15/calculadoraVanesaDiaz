package com.example.calculadoravanesadiaz.Activities

class Operations {
    var n1: Int = 0
    var n2: Int = 0
    var operacion: String =""

    constructor(numberOne: String, numberTwo: String, operation: String) {
        this.n1 = numberOne.toInt()
        this.n2= numberTwo.toInt()
        this.operacion = operation

    }


    private fun restar(): Int {
        return n1-n2
    }

    private fun sumar(): Int {
        return n1+n2
    }

    private fun dividir(): Int {
        return n1/n2
    }

    private fun multiplicar(): Int {
        return n1 * n2
    }

    fun calcular(): String {
        when (operacion) {
            "sumar" -> return sumar().toString()
            "restar" -> return restar().toString()
            "multiplicar" -> return multiplicar().toString()
            "dividir" -> return dividir().toString()
            else -> return "Operación inválida"
        }
    }
}