package com.example.pizza_login;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText IngUsuario = findViewById(R.id.Ingresar_Usuario);
        EditText IngPassword = findViewById(R.id.Ingresar_Password);
        Button BotonInicio = findViewById(R.id.Boton_Inicio);



    }
}