package com.nilayozel.superkahramanprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //scope
    var numara=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun superKahramanYap(view : View){
//numaraya ulaşabiliriz

        val isim = isimText.text.toString()
        val yas = yasText.text.toString().toIntOrNull()
        //yaş inte çevriliyosa çevir yoksa null göster
        val meslek = meslekText.text.toString()

        if(yas==null){
            sonucText.text="doğru yaşı girin"
        }
        else {
            val superkhrmn = SuperKahraman(isim, yas, meslek)
            sonucText.text = "isim: ${superkhrmn.isim} yaş: ${superkhrmn.yas} meslek: ${superkhrmn.meslek}"
        }


    }
}