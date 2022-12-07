package com.gadv.proyectoforo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gadv.proyectoforo.classes.Baneados;
import com.gadv.proyectoforo.classes.Respuesta;

import java.util.List;

public class BaneadosAdapter extends RecyclerView.Adapter<BaneadosAdapter.ViewHolder> {

    private List<Baneados> baneadosList;
    private Context context;

    public BaneadosAdapter(List<Baneados> baneadosListList, Context context) {
        this.baneadosList = baneadosListList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_ban, parent, false);
        return new BaneadosAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setTvCorreoBan(baneadosList.get(position).getCorreo());
        holder.setTvFechaInicio(baneadosList.get(position).getFechaInicio());
        holder.setTvFechaFin(baneadosList.get(position).getFechaFin());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvCorreoBan;
        private TextView tvFechaInicio;
        private TextView tvFechaFin;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCorreoBan = itemView.findViewById(R.id.tvCorreoBan);
            tvFechaInicio = itemView.findViewById(R.id.tvFechaInicio);
            tvFechaFin = itemView.findViewById(R.id.tvFechaFin);
        }

        public void setTvCorreoBan(String correo) {
            this.tvCorreoBan.setText(correo);
        }

        public void setTvFechaInicio(String fechaInicio) {
            this.tvFechaInicio.setText(fechaInicio);
        }

        public void setTvFechaFin(String fechaFin) {
            this.tvFechaFin.setText(fechaFin);
        }
    }
}
