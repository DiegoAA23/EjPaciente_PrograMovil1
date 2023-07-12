package com.example.prueba2_iiiparcial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.commit


class primerfragment : Fragment(R.layout.fragment_primerfragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val boton = view.findViewById<Button>(R.id.btnIngresar)
        val poliza = view.findViewById<EditText>(R.id.numeroPoliza)
        val nombre = view.findViewById<EditText>(R.id.nombreCompleto)
        val edad = view.findViewById<EditText>(R.id.edad)
        val fecha = view.findViewById<EditText>(R.id.fechaHora)

        boton.setOnClickListener {
            requireActivity().supportFragmentManager.commit {
                replace(R.id.contenedorFragmento, segundofragment.nuevaInstancia(poliza.text.toString().toInt(), nombre.text.toString(), edad.text.toString().toInt(), fecha.text.toString()))
            }
        }
    }

}

