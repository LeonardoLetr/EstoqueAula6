package com.uniso.lpdm.estoque_aula6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ExibirPodutoActivity extends AppCompatActivity {

    public static final String EXTRA_PRODUTO= "";

    //No metodo onCreate estou recebendo o EXTRA_PRODUTO do intent e passando ele para os campos TextView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_poduto);

        Intent intentReceiver = getIntent();

        String[] produtoInfo =  intentReceiver.getStringExtra(EXTRA_PRODUTO).split(";");

        String id = produtoInfo[0];
        String nome = produtoInfo[1];
        String qtd = produtoInfo[2];

        TextView txtProduto = (TextView) findViewById(R.id.txtId);
        TextView txtNome = (TextView) findViewById(R.id.txtNome);
        TextView txtQtd = (TextView) findViewById(R.id.txtQtd);

        txtProduto.setText(id);
        txtNome.setText(nome);
        txtQtd.setText(qtd);
    }
}