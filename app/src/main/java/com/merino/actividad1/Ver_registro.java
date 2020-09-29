package com.merino.actividad1;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class Ver_registro extends Generar_registro{
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_registro);
        recycler = findViewById(R.id.recycler);

        recycler.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<String> datos = new ArrayList<>();
        datos.add(txt_name.getText().toString());
        datos.add(txt_apellido.getText().toString());
        datos.add(Float.toString(rating.getRating()));
        datos.add(Boolean.toString(check_si.isChecked()));
        datos.add(Boolean.toString(check_no.isChecked()));


        adaptador adaptadrr =  new adaptador(datos);
        recycler.setAdapter(adaptadrr);

    }
}