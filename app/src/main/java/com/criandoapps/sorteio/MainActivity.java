package com.criandoapps.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sortear(View view){
        TextView texto = findViewById(R.id.resultado);
        int x = new Random().nextInt(101);
        texto.setText( "Numero é: " + x );

    }

}