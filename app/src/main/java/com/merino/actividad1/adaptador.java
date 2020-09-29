package com.merino.actividad1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adaptador extends RecyclerView.Adapter<adaptador.ViewHolderDatos>{
    ArrayList<String>listadatos;

    public adaptador(ArrayList<String> listadatos) {
        this.listadatos = listadatos;
    }

    @NonNull
    @Override
    public adaptador.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.actividad_datos,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adaptador.ViewHolderDatos holder, int position) {
    holder.datosasignados(listadatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listadatos.size() ;
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView text;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.text);
        }

        public void datosasignados(String s) {
            text.setText(s);
        }
    }
}
