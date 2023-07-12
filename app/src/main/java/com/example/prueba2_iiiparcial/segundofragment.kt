package com.example.prueba2_iiiparcial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.os.bundleOf


class segundofragment : Fragment(R.layout.fragment_segundofragment) {

    private var name:String? = ""
    private var age:Int? = 0
    private var fecha_hora:String? = ""
    private var number:Int? = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        name = requireArguments().getString(NOMBRE)
        age = requireArguments().getInt(EDAD)
        number = requireArguments().getInt(NUMERO)
        fecha_hora = requireArguments().getString(FECHA)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val texto1 = view.findViewById<TextView>(R.id.txtPoliza)
        val texto2 = view.findViewById<TextView>(R.id.txtNombre)
        val texto3 = view.findViewById<TextView>(R.id.txtEdad)
        val texto4 = view.findViewById<TextView>(R.id.txtFecha)

        texto1.text = "No. Poliza: $number"
        texto2.text = "Nombre: $name"
        texto3.text = "Edad: $age"
        texto4.text = "Fecha/Hora: $fecha_hora"

    }

    companion object{
        private const val NUMERO = "numero"
        private const val NOMBRE = "nombre"
        private const val EDAD = "edad"
        private const val FECHA = "fecha"

        fun nuevaInstancia(numero:Int, nombre:String, edad:Int, fecha:String) = segundofragment().apply {
            arguments = bundleOf(NUMERO to numero, NOMBRE to nombre, EDAD to edad, FECHA to fecha)
        }
    }
}

