package com.gadv.proyectoforo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gadv.proyectoforo.classes.Respuesta;

import java.util.List;

public class RespuestaAdapter extends RecyclerView.Adapter<RespuestaAdapter.ViewHolder> {

    private List<Respuesta> respuestaList;
    private Context context;

    public RespuestaAdapter(List<Respuesta> respuestaList, Context context) {
        this.respuestaList = respuestaList;
        this.context = context;
    }

    @NonNull
    @Override
    public RespuestaAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_blog, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RespuestaAdapter.ViewHolder holder, int position) {
        holder.setTvNombreUsuario(respuestaList.get(position).getNombreUsuario());
        holder.setTvRespuesta(respuestaList.get(position).getRespuesta());
        holder.setTvCalificacionActual(String.valueOf(respuestaList.get(position).getCalificacion()));
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvNombreUsuario;
        private TextView tvRespuesta;
        private TextView tvCalificacionActual;
        private EditText txtCalificacion;
        private Button btnCalificar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNombreUsuario = itemView.findViewById(R.id.tvNombreUsuario);
            tvRespuesta = itemView.findViewById(R.id.tvRespuesta);
            tvCalificacionActual = itemView.findViewById(R.id.tvCalificacionActual);
            txtCalificacion = itemView.findViewById(R.id.txtCalificacion);
            btnCalificar = itemView.findViewById(R.id.btnCalificar);
        }

        public void setTvNombreUsuario(String nombreUsuario) {
            this.tvNombreUsuario.setText(nombreUsuario);
        }

        public void setTvRespuesta(String respuesta) {
            this.tvRespuesta.setText(respuesta);
        }

        public void setTvCalificacionActual(String calificacionActual) {
            this.tvCalificacionActual.setText(calificacionActual);
        }
    }
}
