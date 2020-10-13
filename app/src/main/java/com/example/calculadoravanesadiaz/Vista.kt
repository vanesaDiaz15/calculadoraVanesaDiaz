package com.example.calculadoravanesadiaz

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadoravanesadiaz.Activities.Operations


class Vista : AppCompatActivity() {
    var num1: String = ""
    var num2: String = ""
    private var lastPressedKey= false
    var op : String = ""
    private lateinit var operation: Operations

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculadora)

        if (savedInstanceState != null) {
            num1 = savedInstanceState.getString("numer1").toString()

            op = savedInstanceState.getString("ope").toString()

            num2 = savedInstanceState.getString("numer2").toString()
        }

        var usr : String = intent.getStringExtra("usuario").toString()
        var apellido : String = intent.getStringExtra("apellido").toString()

        var textView = findViewById<TextView>(R.id.textViewUsr)
        textView.text = "Hola " +usr + " " + apellido
    }

    fun dividir(view: View) {
        lastPressedKey = true
        op = "dividir"
    }
    fun multiplicar(view: View) {
        lastPressedKey = true
        op = "multiplicar"
    }
    fun restar(view: View) {
        lastPressedKey = true
        op="restar"
    }
    fun sumar(view: View) {
        lastPressedKey = true
        op = "sumar"
    }
    fun n7(view: View) {
        if (!lastPressedKey){
            num1 += 7
        }else{
            num2 += 7
        }
    }
    fun n4(view: View) {
        if (!lastPressedKey){
            num1 += 4
        }else{
            num2 += 4
        }}
    fun n1(view: View) {
        if (!lastPressedKey){
            num1 += 1
        }else{
            num2 += 1
        }
    }
    fun n8(view: View) {
        if (!lastPressedKey){
            num1 += 8
        }else{
            num2 += 8
        }
    }
    fun n5(view: View) {
        if (!lastPressedKey){
            num1 += 5
        }else{
            num2 += 5
        }
    }
    fun n2(view: View) {
        if (!lastPressedKey){
            num1 += 2
        }else{
            num2 += 2
        }
    }
    fun n0(view: View) {
        if (!lastPressedKey){
            num1 += 0
        }else{
            num2 += 0
        }
    }
    fun n9(view: View) {
        if (!lastPressedKey){
            num1 += 9
        }else{
            num2 += 9
        }
    }
    fun n6(view: View) {
        if (!lastPressedKey){
            num1 += 6
        }else{
            num2 += 6
        }
    }
    fun n3(view: View) {
        if (!lastPressedKey){
            num1 += 3
        }else{
            num2 += 3
        }
    }

    fun operar(view: View) {
        var textViewResult = findViewById<TextView>(R.id.textViewResultado)
        textViewResult.text = num1
        operation = Operations(num1 , num2, op)
        textViewResult.text = operation.calcular()
        num1 = ""
        num2 = ""
        op = ""
        lastPressedKey = false
    }

    fun borrar(view: View) {
        var textViewResult = findViewById<TextView>(R.id.textViewResultado)
        textViewResult.text = ""
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString("numer1", num1)
        outState.putString("ope", op)
        outState.putString("numer2", num2)
        super.onSaveInstanceState(outState)
    }
}