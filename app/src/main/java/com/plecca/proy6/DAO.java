package com.plecca.proy6;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class DAO {
    BD b;
    SQLiteDatabase db;
    Context c;

    public DAO (Context c){
        b = new BD(c);
        this.c = c;

    }

    public void AbrirBD(){
        db = b.getWritableDatabase();
    }

    public String registrarPrueba(Prueba p){
        String msj = "";
        try {
            ContentValues val = new ContentValues();
            val.put("prueba",p.getPruebaClase());
            long res = db.insert("tablaprueba",null,val);
            if (res==-1){
                msj="error";

            }else {
                msj="ok";
            }
        }catch (Exception e){
            Log.d("=>", e.getMessage());
        }
        return msj;
    }
}
