package com.example.ejercicio_46;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menuopciones, menu);
        return true;
    }
    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();
        if (id == R.id.opcion1) {
            Toast.makeText(this,R.string.mensaje_1, Toast.LENGTH_LONG).show();
        }
        if (id == R.id.opcion2) {
            Toast.makeText(this,R.string.mensaje_2, Toast.LENGTH_LONG).show();

        }
        if (id == R.id.opcion1) {
            Toast.makeText(this,R.string.mensaje_3, Toast.LENGTH_LONG).show();

        }
        return super.onOptionsItemSelected(item);
    }
    public void ocultar (View v){
        getSupportActionBar().hide();
    }
    public void mostrar (View v){
        getSupportActionBar().show();
    }
}
