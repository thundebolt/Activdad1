package com.merino.actividad1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;

import java.util.ArrayList;

public class adaptador extends RecyclerView.Adapter<adaptador.ViewHolderDatos>{
    ArrayList<registro_datos>listaregistro;


    public adaptador(Ver_registro ver_registro, ArrayList<registro_datos> listaregistro) {
        this.listaregistro = listaregistro;
    }

    @NonNull
    @Override
    public ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.actividad_datos,parent ,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adaptador.ViewHolderDatos holder, int position) {

        holder.text.setText(listaregistro.get(position).getNombre());
        holder.text.setText(listaregistro.get(position).getApellido());
        holder.text.setText(listaregistro.get(position).getValoracion());
        holder.text.setText(listaregistro.get(position).getCheck());

    }

    @Override
    public int getItemCount() {
        return listaregistro.size() ;
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView text;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.text);
        }
    }
}
