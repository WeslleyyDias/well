package com.example.conexaosql;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    EditText txtUsuarioLogin, txtSenhaLogin;
    TextView lbResultadoLogin;
    Button btnLogar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuarioLogin = findViewById(R.id.txtUsuarioLogin);
        txtSenhaLogin = findViewById(R.id.txtSenhaLogin);
        btnLogar = findViewById(R.id.btnLogar);



    }
    public void login(View V){
        String nome = txtUsuarioLogin.getText().toString();
        String senha = txtSenhaLogin.getText().toString();

        if(nome.equalsIgnoreCase("login")){
            if(senha.equalsIgnoreCase("123456")){
                lbResultadoLogin.setText("Login com sucesso!");
                Intent intent = new Intent(MainActivity.this, MenuPrincipal.class);
                startActivity(intent);

                finish();
            }else{
                lbResultadoLogin.setText("Senha invalida");
                limpar();
            }

        }else{
            lbResultadoLogin.setText("Usuario Invalido");
            limpar();
        }
    }

    private void limpar(){
        txtUsuarioLogin.setText("");
        txtSenhaLogin.setText("");
        txtUsuarioLogin.requestFocus();
    }

}
