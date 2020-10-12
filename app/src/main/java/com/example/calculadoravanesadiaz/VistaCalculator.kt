import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadoravanesadiaz.Activities.Operations
import com.example.calculadoravanesadiaz.R


class VistaCalculator : AppCompatActivity() {

    private var num1: Double = 0.0
    private var num2: Double = 0.0
    private var lastPressedKey= false
    private var op : String = ""

    private lateinit var operation: Operations

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculadora)

        var usr : String = intent.getStringExtra("usuario").toString()

        var textView = findViewById<TextView>(R.id.textViewUsr)
        textView.text = "Hola " +usr
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
            num1 = 7.0
        }else{
            num2 = 7.0
        }
    }
    fun n4(view: View) {
        if (!lastPressedKey){
        num1 = 4.0
    }else{
        num2 = 4.0
    }}
    fun n1(view: View) {
        if (!lastPressedKey){
            num1 = 1.0
        }else{
            num2 = 1.0
        }
    }
    fun n8(view: View) {
        if (!lastPressedKey){
            num1 = 8.0
        }else{
            num2 = 8.0
        }
    }
    fun n5(view: View) {
        if (!lastPressedKey){
            num1 = 5.0
        }else{
            num2 = 5.0
        }
    }
    fun n2(view: View) {
        if (!lastPressedKey){
            num1 = 2.0
        }else{
            num2 = 2.0
        }
    }
    fun n0(view: View) {
        if (!lastPressedKey){
            num1 = 0.0
        }else{
            num2 = 0.0
        }
    }
    fun n9(view: View) {
        if (!lastPressedKey){
            num1 = 9.0
        }else{
            num2 = 9.0
        }
    }
    fun n6(view: View) {
        if (!lastPressedKey){
            num1 = 6.0
        }else{
            num2 = 6.0
        }
    }
    fun n3(view: View) {
        if (!lastPressedKey){
            num1 = 3.0
        }else{
            num2 = 3.0
        }
    }

    fun operar(view: View) {
        var textViewResult = findViewById<TextView>(R.id.textViewResultado)
        operation = Operations(num1 , num2, op)
        textViewResult.text = operation.calcular()
    }

}
