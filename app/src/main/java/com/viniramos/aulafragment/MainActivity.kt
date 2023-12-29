package com.viniramos.aulafragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.viniramos.aulafragment.fragments.ChamadasFragment
import com.viniramos.aulafragment.fragments.ConversasFragment

class MainActivity : AppCompatActivity() {
    private lateinit var btnConversas: Button
    private lateinit var btnChamadas: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConversas = findViewById( R.id.btn_conversas )
        btnChamadas = findViewById( R.id.btn_chamadas )

        val conversasFragment = ConversasFragment()
        btnConversas.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .add( R.id.fragment_conteudo, conversasFragment )
                .commit()
        }

        btnChamadas.setOnClickListener {
            supportFragmentManager
                .beginTransaction().
//                remove( R.id.fragment_conteudo, ChamadasFragment() )
                remove(conversasFragment)
                    .commit()
        }
    }
}

