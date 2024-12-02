package com.example.fitproappmy;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Configurar el BottomNavigationView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Establecer el ítem seleccionado
        bottomNavigationView.setSelectedItemId(R.id.nav_perfil);

        // Configurar el Listener para cambiar entre actividades
        bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.nav_perfil) {
                return true; // Ya estamos en esta actividad
            } else if (item.getItemId() == R.id.nav_historial) {
                startActivity(new Intent(this, HistorialActivity.class));
                overridePendingTransition(0, 0); // Sin animación
                return true;
            } else if (item.getItemId() == R.id.nav_entrenar) {
                startActivity(new Intent(this, EntrenamientoActivity.class));
                overridePendingTransition(0, 0);
                return true;
            } else if (item.getItemId() == R.id.nav_ejercicios) {
                startActivity(new Intent(this, EjerciciosActivity.class));
                overridePendingTransition(0, 0);
                return true;
            } else if (item.getItemId() == R.id.nav_ajustes) {
                startActivity(new Intent(this, AjustesActivity.class));
                overridePendingTransition(0, 0);
                return true;
            }
            return false;
        });
    }
}
