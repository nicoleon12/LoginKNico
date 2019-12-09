package leon.gudino.loginknico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEntrar.setOnClickListener {
            val user=etnombre.text.toString().trim()
            val  pass=etpass.text.toString().trim()


            if (user.equals("") or pass.equals("")) {
                mensaje("Datos vacios", Toast.LENGTH_LONG)
            } else {
                if (user.equals("Nicolas") and pass.equals("1234")) {
                    val i = Intent(this,SegundaActivity::class.java)
                    i.putExtra("nombre","Nicolas")
                    startActivity(i)
                } else {
                    mensaje("No te conozco")
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.wtf("ejemplo", "Debo estar en el  onStart")
    }
    override fun onResume(){
        super.onResume()
        Log.wtf("ejemplo", "Debo estar en el  onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.w("ejemplo","Debo estar en onPause")
    }
    fun mensaje(mensaje: String, dur:Int=Toast.LENGTH_SHORT){
        Toast.makeText(this,mensaje,dur).show();
    }
}

