package com.unitec.primeraapp

class MiImc {
    //Vamos a generar el metodo´para calcular el imc muy sencillo
    fun calcular(peso: Float, altura: Float): Float {
        var imc = peso / (altura * altura)
        return imc
    }
}