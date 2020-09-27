package com.uniso.lpdm.estoque_aula6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.uniso.lpdm.estoque_aula6.model.Produto;

public class NovoProdutoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_produto);
    }

    public void onClickSalvar(View view){
        /*Quando o botão de salvar for clicado, esse código será executado.
        * Para esse exemplo, a unica coisa que esse código deve fazer é iniciar
        * a atividade ExibirProdutoActivity*/
        EditText editTextId = (EditText) findViewById(R.id.edtIdProdutoNovo);
        EditText editTextNome = (EditText) findViewById(R.id.edtProdutoNovo);
        EditText editTextQtd = (EditText) findViewById(R.id.edtQtdNovo);

        int id = Integer.parseInt(editTextId.getText().toString());
        String nome = editTextNome.getText().toString();
        int qtd = Integer.parseInt(editTextQtd.getText().toString());

        Produto produto = new Produto();
        produto.setId(id);
        produto.setNome(nome);
        produto.setQuantidade(qtd);

        Intent intent = new Intent(this, ExibirPodutoActivity.class);

        intent.putExtra("Produto", produto);

        startActivity(intent);
    }
}