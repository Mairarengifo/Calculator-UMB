package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declaro los edittext para los numero a y b
    private EditText numberf;
    private EditText numbero;

    //aqui va  la respuesta de los operadores logicos
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declaracion de ID conectados a la interfaz grafica
        numberf = findViewById(R.id.numberf);
        numbero = findViewById(R.id.numbero);
        answer = findViewById(R.id.answer);

    }
    // este es el metodo sumar
    public void sumar (View view){
        int answerSum = Integer.parseInt (numberf.getText().toString()) + Integer.parseInt(numbero.getText().toString());

        answer.setText("Este es el resultado = " + answerSum);
    }

    //este es el metodo restar
    public void restar (View view){
        int answerRest = Integer.parseInt(numberf.getText().toString()) - Integer.parseInt(numbero.getText().toString());

        answer.setText("Este es el resultado = " + answerRest);
    }

    //este es el metodo multiplicar
    public  void multiplicar (View view){
        int answerMult = Integer.parseInt(numberf.getText().toString()) * Integer.parseInt(numbero.getText().toString());

        answer.setText("Este es el resultado = " + answerMult);
    }

    //este es el metodo dividir
    public void dividir (View view){
        int answerDiv = Integer.parseInt(numberf.getText().toString()) / Integer.parseInt(numbero.getText().toString());

        answer.setText("Este es el resultado = " + answerDiv);
    }

}