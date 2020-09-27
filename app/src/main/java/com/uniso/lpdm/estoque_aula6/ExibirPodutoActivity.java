package com.uniso.lpdm.estoque_aula6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.uniso.lpdm.estoque_aula6.model.Produto;

public class ExibirPodutoActivity extends AppCompatActivity {

    public static final Produto EXTRA_PRODUTO = new Produto();

    //No metodo onCreate estou recebendo o EXTRA_PRODUTO do intent e passando ele para os campos TextView
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_poduto);

        Produto produto = (Produto) getIntent().getSerializableExtra("Produto");

        String id = String.valueOf(produto.getId());
        String nome = produto.getNome();
        String qtd = String.valueOf(produto.getQuantidade());

        TextView txtProduto = (TextView) findViewById(R.id.txtId);
        TextView txtNome = (TextView) findViewById(R.id.txtNome);
        TextView txtQtd = (TextView) findViewById(R.id.txtQtd);

        txtProduto.setText(id);
        txtNome.setText(nome);
        txtQtd.setText(qtd);
    }

}