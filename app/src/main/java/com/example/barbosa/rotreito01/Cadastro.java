package com.example.barbosa.rotreito01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {
    private EditText mNome, mSobrenome, mUsuario, mSenha, mConfirmaSenha;
    private Button mButton;
    private Usuario user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        mNome = (EditText) findViewById(R.id.nome);
        mSobrenome = (EditText) findViewById(R.id.sobrenome);
        mUsuario = (EditText) findViewById(R.id.usuario);
        mSenha = (EditText) findViewById(R.id.senha);
        mConfirmaSenha = (EditText) findViewById(R.id.confirmaSenha);
        mButton = (Button) findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cadastrar();
            }
        });

    }

    private void Cadastrar() {
        String nome = mNome.getText().toString();
        String sobrenome = mSobrenome.getText().toString();
        String usuario = mUsuario.getText().toString();
        String senha = mSenha.getText().toString();
        String confirmarSenha = mConfirmaSenha.getText().toString();

        boolean completo = true;
        this.user = new Usuario(nome, sobrenome, usuario, senha);


        View focus = null;
        if (TextUtils.isEmpty(nome)) {
            mNome.setError("Campo Vazio");
            focus = this.mNome;
            focus.requestFocus();
            completo = false;
        }
        if (TextUtils.isEmpty(sobrenome)) {
            mSobrenome.setError("Campo Vazio");
            focus = this.mSobrenome;
            focus.requestFocus();
            completo = false;
        }
        if (TextUtils.isEmpty(usuario)) {
            mUsuario.setError("Campo Vazio");
            focus = this.mUsuario;
            focus.requestFocus();
            completo = false;
        }
        if (TextUtils.isEmpty(senha)) {
            mSenha.setError("Campo Vazio");
            focus = this.mSenha;
            focus.requestFocus();
            completo = false;
        }
        if (TextUtils.isEmpty(confirmarSenha)) {
            mConfirmaSenha.setError("Campo Vazio");
            focus = this.mConfirmaSenha;
            focus.requestFocus();
            completo = false;
        }
        if (!senha.equals(confirmarSenha)) {
            Toast.makeText(getApplicationContext(), "Senhas Não Convergem", Toast.LENGTH_SHORT).show();
            completo = false;
        }


        if (completo) {
            Intent intent = new Intent(this, MainActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("user", usuario);
            intent.putExtras(bundle);
            startActivity(intent);
            finish();
        }

    }

}
