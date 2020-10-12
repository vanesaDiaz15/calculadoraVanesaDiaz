package com.example.calculadoravanesadiaz.Activities

class Operations {
    var n1: Double = 0.0
    var n2: Double = 0.0
    var operacion: String =""

    constructor(numberOne: Double, numberTwo: Double, operation: String) {
        this.n1 = numberOne
        this.n2= numberTwo
        this.operacion = operation

    }


    private fun restar(): Double {
        return n1-n2
    }

    private fun sumar(): Double {
        return n1+n2
    }

    private fun dividir(): Double {
        return n1/n2
    }

    private fun multiplicar(): Double {
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