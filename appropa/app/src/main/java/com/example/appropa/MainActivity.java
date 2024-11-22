package com.example.appropa;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar los componentes
        username = findViewById(R.id.Username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        // Configurar el evento de clic para el botón de inicio de sesión
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener texto de los campos de entrada
                String usernameInput = username.getText().toString().trim();
                String passwordInput = password.getText().toString().trim();

                // Validar campos vacíos
                if (usernameInput.isEmpty() || passwordInput.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
                } else if (usernameInput.equals("user") && passwordInput.equals("1234")) {
                    // Login exitoso
                    Toast.makeText(MainActivity.this, "Inicio de sesión correcto", Toast.LENGTH_SHORT).show();
                } else {
                    // Login fallido
                    Toast.makeText(MainActivity.this, "Credenciales incorrectas. Intenta de nuevo", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
