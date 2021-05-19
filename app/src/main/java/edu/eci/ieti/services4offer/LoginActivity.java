package edu.eci.ieti.services4offer;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    public static final String EXTRA_EMAIL = "edu.eci.IETI.secureapi.EMAIL";
    public static final String EXTRA_PASSWORD = "edu.eci.IETI.secureapi.PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login(View view) {

        EditText editTextEmail = (EditText) findViewById(R.id.email);
        String email = editTextEmail.getText().toString();

        EditText editTextPassword = (EditText) findViewById(R.id.password);
        String password = editTextPassword.getText().toString();

        if (!email.equals("services4all")){
            editTextEmail.setError("User not found");
        } else if ( !password.equals("contraseña") ) {
            editTextPassword.setError("Invalid password");
        } else {
            AlertDialog alertDialog1 = new AlertDialog.Builder(this).create();

            alertDialog1.setTitle("Login Correcto");

            alertDialog1.show();

        }
    }

}
