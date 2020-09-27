package com.uniso.lpdm.estoque_aula6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.uniso.lpdm.estoque_aula6.model.Produto;

import org.w3c.dom.Text;

public class AtualizarProdutoActivity extends AppCompatActivity {

    String id;
    String nome;
    String qtd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atualizar_produto);
    }
}