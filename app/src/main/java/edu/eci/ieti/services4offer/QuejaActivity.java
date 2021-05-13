package edu.eci.ieti.services4offer;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class QuejaActivity extends AppCompatActivity {



    public static final String EXTRA_EMAIL = "edu.eci.IETI.secureapi.EMAIL";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Reclamo);
    }

    public void registrar(View view) {

        EditText editTextEmail = (EditText) findViewById(R.id.email);
        String email = editTextEmail.getText().toString();

        if (!email.equals("")){
            editTextEmail.setError("Reclamo no encontrado");
        }else {
            AlertDialog alertDialog1 = new AlertDialog.Builder(this).create();
            alertDialog1.setTitle("Reclamo encontrado, registro exitoso");
            alertDialog1.show();

        }
    }
}