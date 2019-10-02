package com.unitec.primeraapp

import android.media.MediaPlayer
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_bienvenido.*
import kotlinx.android.synthetic.main.content_bienvenido.*

class BienvenidoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenido)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            var sonido = MediaPlayer.create(applicationContext,R.raw.Funny)
            //Se inicia el sonido
            sonido.start()
            var sonido2 = MediaPlayer.create(applicationContext,R.raw.Sad)
            //Se inicia el sonido
            sonido2.start()
            var peso= txtpeso.text.toString().toFloat()
            var altura= txtaltura.text.toString().toFloat()
            var imc = MiImc()
            Snackbar.make(view, "Tu peso es $peso tu altura es $altura Tu IMC es ${imc.calcular(peso,altura)}", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
