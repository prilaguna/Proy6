package com.plecca.proy6;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class DAOReclamo {

    BD  b;
    SQLiteDatabase db;
    Context c;

    public DAOReclamo(Context c) {
        b = new BD(c);
        this.c = c;

    }
    public void AbrirBD(){
        db = b.getWritableDatabase();
    }


    public String registrarReclamo(Reclamo reclamo){
        String mensaje = "";
        try {
            ContentValues valores = new ContentValues();
            valores.put("peticion", reclamo.getPeticion());
            valores.put("codReserva", reclamo.getCodReserva());
            valores.put("fecha", reclamo.getFecha());
            valores.put("centroD", reclamo.getCentroD());
            valores.put("medioContacto", reclamo.getMedioContacto());
            valores.put("contacto", reclamo.getContacto());
            valores.put("correo", reclamo.getCorreo());
            valores.put("motivo", reclamo.getDescMotivo());
            valores.put("descMotivo", reclamo.getDescMotivo());
            valores.put("sustento", reclamo.getSustento());

            long result = db.insert("rec", null, valores);

            if (result == -1){
                mensaje = "error";
            }
            else {
                mensaje = "Se registró";
            }


        }catch (Exception e){
            Log.d("=>", e.getMessage());

        }

        return mensaje;
    }

}
