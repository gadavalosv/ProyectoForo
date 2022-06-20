package com.gadv.proyectoforo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gadv.proyectoforo.classes.Respuesta;

import java.util.ArrayList;

public class RespuestaAdapter extends RecyclerView.Adapter<RespuestaAdapter.ViewHolderPreguntas> {
    private ArrayList<Respuesta> listaRepuestas;

    public RespuestaAdapter(ArrayList<Respuesta> listaRepuestas) {
        this.listaRepuestas = listaRepuestas;
    }

    @NonNull
    @Override
    public ViewHolderPreguntas onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.respuesta_item,parent,false);
        return new ViewHolderPreguntas(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPreguntas holder, int position) {
        holder.tvNombreUsuario.setText(listaRepuestas.get(position).getNombreUsuario());
        holder.tvRespuesta.setText(listaRepuestas.get(position).getRespuesta());
        holder.tvCalificacionActual.setText(listaRepuestas.get(position).getCalificacion());
    }

    @Override
    public int getItemCount() {
        return listaRepuestas.size();
    }

    public class ViewHolderPreguntas extends RecyclerView.ViewHolder{
        TextView tvNombreUsuario, tvRespuesta, tvCalificacionActual;

        public ViewHolderPreguntas(@NonNull View itemView) {
            super(itemView);
            tvNombreUsuario = itemView.findViewById(R.id.tvNombreUsuario);
            tvRespuesta = itemView.findViewById(R.id.tvRespuesta);
            tvCalificacionActual = itemView.findViewById(R.id.tvCalificacionActual);
        }
    }
}
