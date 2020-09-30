package com.merino.actividad1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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

        holder.txtnombre.setText(listaregistro.get(position).getNombre());
        holder.txtapellido.setText(listaregistro.get(position).getApellido());
        holder.txtvaloracion.setText(listaregistro.get(position).getValoracion());
        holder.txtcheck.setText(listaregistro.get(position).getCheck());
        holder.txtno.setText(listaregistro.get(position).getChecks());

    }

    @Override
    public int getItemCount() {
        return listaregistro.size() ;
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView txtapellido,txtnombre,txtcheck,txtvaloracion,txtno;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            txtnombre = itemView.findViewById(R.id.txtnombre);
            txtapellido = itemView.findViewById(R.id.txtapellido);
            txtcheck = itemView.findViewById(R.id.txtcheck);
            txtvaloracion = itemView.findViewById(R.id.txtvaloracion);
            txtno = itemView.findViewById(R.id.txtno);


        }
    }
}
