package pe.edu.unfv.miprimeraappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun declaracionDeVariables(){
        var nombre = "Eleazar"
        val apellido = "Alfriadez"
        var precio = 31
        var edad : Int
        var peso : Double
        var eSalto: Boolean
    }

    fun declaracionDeVariablesNull(){
        var nombreNulo: String?
        nombreNulo = null
        var ciudad = null
    }

    fun declaracionDeArraylist(){
        val participantes = ArrayList<String>()
        participantes.add("Jesus")
        participantes.add("Santiago")
        participantes.add("Belen")
        participantes.add("Jean")
        participantes.add("Doris")
    }
}