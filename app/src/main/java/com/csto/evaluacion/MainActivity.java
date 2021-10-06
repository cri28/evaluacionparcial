package com.csto.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String usuario, clave;
    EditText USUARIO, CLAVE;
    Button botoncito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        USUARIO = (EditText) findViewById(R.id.txt_cajonusuario);
        CLAVE = (EditText) findViewById(R.id.txt_cajonclave);
        botoncito = (Button) findViewById(R.id.btn_conectar);

    }



    public void onClick(View view) {
        usuario = USUARIO.getText().toString();
        clave = CLAVE.getText().toString();
        String adm123 = "adm123";

        if((USUARIO.getText().toString().equals(adm123.toString())) && (CLAVE.getText().toString().equals(adm123.toString())))
        {
            Intent I = new Intent(getApplicationContext(), MainActivity2.class);
            startActivity(I);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"usuario o clave incorrecto", Toast.LENGTH_SHORT).show();
        }
    }
}