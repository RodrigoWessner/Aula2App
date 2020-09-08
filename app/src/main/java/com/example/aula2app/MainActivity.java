package com.example.aula2app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    final String TAG = "TESTE";
    private int i = 0;
    private Button btn1;
    private EditText txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"Estou no onCreate " + i);
        i++;

        btn1 = findViewById(R.id.Fahreinheit);
        txt1 = (EditText) findViewById(R.id.editTextNumberDecimal);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                Log.d("ok",""+Integer.parseInt(String.valueOf(txt1.getText())));
                intent.putExtra("celsius", Float.parseFloat(String.valueOf(txt1.getText())));

                startActivity(intent);
                

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Estou no onStart " + i);
        i++;
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"Estou no onResume " + i);
        i++;
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Estou no onPause " + i);
        i -= 5;
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Estou no onStop " + i);
        i -= 10;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Estou no onDestroy " + i);
        i = 0;
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"Estou no onRestart " + i);
        i += 50;
    }

}