package com.example.ejercicio_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1= (EditText) findViewById(R.id.editText);
        num = (int) (Math.random()*10001);
        String cadena =String.valueOf(num);
        Toast notificacion =Toast.makeText(this,cadena,Toast.LENGTH_LONG);
        notificacion.show();
    }


     public void controlar (View v){
        String valorIngresado=et1.getText().toString();
        int valor=Integer.parseInt(valorIngresado);
        if(valor ==num){
            Toast notificacion=Toast.makeText(this,"ADIVINASTE", Toast.LENGTH_LONG);
            notificacion.show();
        }else{
            Toast notificacion=Toast.makeText(this,"INCORRECTO",Toast.LENGTH_LONG);
            notificacion.show();
        }
     }
}