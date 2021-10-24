package com.Android.trabajon1_oscarhernandez;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button botonCalc;
    private EditText etNombre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre=(EditText) findViewById(R.id.editTextTextPersonName);
        final EditText etNota1 = findViewById(R.id.editTextNumberDecimal),
                etNota2 = findViewById(R.id.editTextNumberDecimal2),
                etNota3 = findViewById(R.id.editTextNumberDecimal3);

        botonCalc=(Button) findViewById(R.id.buttonCalc);


        Intent INTENT=new Intent(this,MainActivity2.class);

        botonCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String i = etNota1.getText().toString(),
                        x = etNota2.getText().toString(),
                        z = etNota3.getText().toString();

                double etNota1 =  Double.parseDouble(i), etNota2 = Double.parseDouble(x),
                        etNota3 = Double.parseDouble(z);

                double PROMEDIO = (etNota1+etNota2+etNota3)/3;

                INTENT.putExtra("nombre",etNombre.getText().toString());
                INTENT.putExtra("promedio",PROMEDIO);


                startActivity(INTENT);

            }
        });

    }
}