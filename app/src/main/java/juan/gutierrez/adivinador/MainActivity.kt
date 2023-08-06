package juan.gutierrez.adivinador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val campo_numero: EditText = findViewById(R.id.etxtAdivinaNum)
        val boton_adivina: Button = findViewById(R.id.btnAdivinar)
        val etiqueta_intentos: TextView = findViewById(R.id.txtvIntentos)

        var num: Int = Random.nextInt(100)
        var intentos: Int = 0

        boton_adivina.setOnClickListener{
            var num_ad : Int = campo_numero.text.toString().toInt()

            intentos++

            if(num_ad == num){
                Toast.makeText(this,  "CORRECTO el número era $num", Toast.LENGTH_LONG).show()
            }

            if(num_ad < num){
                Toast.makeText(this,  "Dame un número mayor", Toast.LENGTH_LONG).show()
            }

            if(num_ad > num){
                Toast.makeText(this,  "Dame un número menor", Toast.LENGTH_LONG).show()
            }

            etiqueta_intentos.text = "$intentos intentos"
        }

    }
}