package com.csto.evaluacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    ImageButton agregar;
    TextView total, canthombres, cantmujeres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        total = (TextView) findViewById(R.id.txt_total);
        canthombres = (TextView) findViewById(R.id.txt_hombres);
        cantmujeres = (TextView) findViewById(R.id.txt_mujeres);
        Bundle B = getIntent().getExtras();
        Integer totalpersonas = B.getInt("total");
        Integer totalhombres = B.getInt("total hombres");
        Integer totalmujeres = B.getInt("total mujeres");

        total.setText(totalpersonas);
        canthombres.setText(totalhombres);
        cantmujeres.setText(totalmujeres);
    }

}