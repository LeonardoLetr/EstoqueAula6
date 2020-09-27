package com.uniso.lpdm.estoque_aula6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NovoProdutoActivity extends AppCompatActivity {

    String id;
    String nome;
    String qtd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_produto);
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString("produto_id", id);
        savedInstanceState.putString("produto_nome", nome);
        savedInstanceState.putString("produto_qtd", qtd);

        super.onSaveInstanceState(savedInstanceState);
    }

    public void onClickSalvar(View view){
        /*Quando o botão de salvar for clicado, esse código será executado.
        * Para esse exemplo, a unica coisa que esse código deve fazer é iniciar
        * a atividade ExibirProdutoActivity*/
        EditText editTextId = (EditText) findViewById(R.id.edtIdProdutoNovo);
        EditText editTextNome = (EditText) findViewById(R.id.edtProdutoNovo);
        EditText editTextQtd = (EditText) findViewById(R.id.edtQtdNovo);

        id = editTextId.getText().toString();
        nome = editTextNome.getText().toString();
        qtd = editTextQtd.getText().toString();

        String produtoInfo = id + ";" + nome + ";" + qtd;

        Intent intent = new Intent(this, ExibirPodutoActivity.class);

        intent.putExtra(ExibirPodutoActivity.EXTRA_PRODUTO, produtoInfo);

        startActivity(intent);
    }
}