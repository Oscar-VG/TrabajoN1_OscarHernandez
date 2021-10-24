package com.Android.trabajon1_oscarhernandez;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button botonVolver = (Button) findViewById(R.id.buttonVolver);
        TextView tvNombre = (TextView) findViewById(R.id.textView8);
        TextView tvPromedio = (TextView) findViewById(R.id.textView9);
        Intent INTENT = new Intent(this, MainActivity.class);
        Context context = getApplicationContext();

        Intent INTENT1 = getIntent();
        if (INTENT1 != null) {
            double PROMEDIO = INTENT1.getDoubleExtra("promedio", 0);

            Bundle INTENT2 = this.getIntent().getExtras();
            if (INTENT2 != null) {
                String stNombre = INTENT2.getString("nombre");


                Toast.makeText(context, stNombre + " " + "su promedio es: " + PROMEDIO, Toast.LENGTH_SHORT).show();


                tvNombre.setText("Estudiante: " + stNombre);
                tvPromedio.setText("Promedio: " + PROMEDIO);
                botonVolver.setOnClickListener(view -> startActivity(INTENT));

            }
        }
    }
}
