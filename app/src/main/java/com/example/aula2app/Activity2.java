package com.example.aula2app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.aula2app.R.id.btnVoltar;

public class Activity2 extends AppCompatActivity {
    private float celsius = 0;
    private float fahr = 0;
    private TextView fahrText;
    private Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        celsius = intent.getFloatExtra("celsius", -1);
        Log.d("testeCel", "" + celsius);

        fahr = CelsiusToFahrenheit(celsius);
        fahrText = (TextView) findViewById(R.id.Fahreinheit);
/*        fahrText.setText();*/
        Log.d("Fahrenheit", " " + fahr);

        btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Activity2.this, MainActivity.class);
                startActivity(intent1);
            }
        });

    }
    private float CelsiusToFahrenheit(float celsius){
        float fahr = 0;

        fahr = ((celsius*9) / 5) + 32;

        return fahr;
    }
}