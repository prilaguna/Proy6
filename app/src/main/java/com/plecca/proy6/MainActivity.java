package com.plecca.proy6;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
EditText txtprueba;
Button btnreg;
DAO pruebadao = new DAO(this);

Prueba pruebaClase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asignarReferencias();

    }

    private void asignarReferencias() {
    txtprueba = findViewById(R.id.pruebatxt);
    btnreg = findViewById(R.id.botonprueba);

    btnreg.setOnClickListener(view -> {

    if (capturarDatos()==true){
        pruebadao.AbrirBD();
        String msj =pruebadao.registrarPrueba(pruebaClase);
        MostrarMsj(msj);


    }
    });

    }

    private void MostrarMsj(String msj) {
        AlertDialog.Builder vent= new AlertDialog.Builder(this);
        vent.setTitle("msje");
        vent.setMessage(msj);
        vent.setPositiveButton("aceptar", null);
        vent.create().show();

    }

    private Boolean capturarDatos() {
        boolean val = true;
        String prueba = txtprueba.getText().toString();
        if (prueba.equals("")){
            txtprueba.setError("DAto obligatorio");
            val = false;
        }
        if (val==true){
            pruebaClase = new Prueba(prueba);
        }

        return val;
    }


}