package com.example.alcoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun verifica(view: View){
        val gas = inputGasolina.text.toString()
        val alcool = inputAlcool.text.toString()
        if (valida(gas,alcool)) {
            calcula(gas, alcool)
        }else {
            result.setText("Preencher os campos é obrigatório :)")
        }

    }

    fun calcula(gas: String , alcool: String){
        val valorGasolina = gas.toDouble()
        val valorAlcool = alcool.toDouble()

        if (valorAlcool / valorGasolina >= 0.7) result.setText("Melhor usar gasolina") else result.setText("Melhor usar alcool")

    }

    fun valida(gas: String , alcool: String): Boolean{
        if (gas == null || gas == ""){
            return false
        }else if (alcool == null || alcool =="") {
            return false
        }
        return true
    }

}