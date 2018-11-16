package com.example.administrator.icare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        klikDisini = findViewById(R.id.belumPunyaAkun);
        login = findViewById(R.id.login);
        Tombol();

    }

    EditText username, password;
    TextView klikDisini;
    Button login;

    private void Tombol(){
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(Login.this , Beranda.class);
                startActivity(login);
            }
        });

        klikDisini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent klikDisini = new Intent(Login.this, Pilih.class);
                startActivity(klikDisini);
            }
        });
    }
}
