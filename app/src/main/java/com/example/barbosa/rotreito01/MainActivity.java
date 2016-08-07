package com.example.barbosa.rotreito01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUsuario = (TextView) findViewById(R.id.usuario);
        Bundle b = getIntent().getExtras();
        String texto = b.getString("user");
        this.mUsuario.setText(texto);
    }
}
