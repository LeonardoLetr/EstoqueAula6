package com.uniso.lpdm.estoque_aula6;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    /* Leonardo Rodrigues Batista Geraldo RA:00101457
    *
    * Não consegui completar o botão de atualizar não consegui fazer uma forma
    * de enviar os dados para a tela de atualizar os dados o unico modo que tenho em mente seria
    * usar um SQLLITE ou salvar em um arquivo  para poder recuperar depois, mas não acredito que seja
    * essa a ideia da aplicação.
    * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCadastrarEmail(View view){
        Intent intent = new Intent(this, CriarEmailActivity.class);

        startActivity(intent);
    }

    public void onClickNovo(View view){
        Intent intent = new Intent(this, NovoProdutoActivity.class);

        startActivity(intent);
    }

    public void onClickAtualizar(View view){
        Intent intent = new Intent(this, AtualizarProdutoActivity.class);

        startActivity(intent);
    }
}