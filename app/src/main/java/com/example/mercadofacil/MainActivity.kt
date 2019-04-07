package com.example.mercadofacil

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.login.*

class MainActivity : DebugActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        botao_login.setOnClickListener { onClickBotao() }
    }

    fun onClickBotao() {
        val intent = Intent(this, TelaInicialActivity::class.java)
        val param = Bundle()
        param.putString("campo_login", "")
        param.putString("campo_senha","")
        intent.putExtras(param)
        startActivity(intent)


    }

}
