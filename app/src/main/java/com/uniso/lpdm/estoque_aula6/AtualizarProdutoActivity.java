package com.uniso.lpdm.estoque_aula6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AtualizarProdutoActivity extends AppCompatActivity {

    String id;
    String nome;
    String qtd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atualizar_produto);

        if (savedInstanceState != null) {
            id = savedInstanceState.getString("produto_id");
            nome = savedInstanceState.getString("produto_nome");
            qtd = savedInstanceState.getString("produto_qtd");

            TextView txtId = (TextView) findViewById(R.id.txtId);
            TextView txtNome = (TextView) findViewById(R.id.txtNome);
            TextView txtQtd = (TextView) findViewById(R.id.txtQtd);

            txtId.setText(id);
            txtNome.setText(nome);
            txtQtd.setText(qtd);
        }
    }
}