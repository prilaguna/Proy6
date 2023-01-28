package com.plecca.proy6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ActivityListarProv extends AppCompatActivity {
    FloatingActionButton btnReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_prov);
        asignarReferencias();
    }

    private void asignarReferencias() {
        btnReg = findViewById(R.id.btnRegCD);
        btnReg.setOnClickListener(v -> {
            Intent in = new Intent(this, CD_Prov_Activity.class);
            startActivity(in);

        });
    }
}