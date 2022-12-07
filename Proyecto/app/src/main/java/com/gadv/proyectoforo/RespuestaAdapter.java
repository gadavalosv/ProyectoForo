package com.gadv.proyectoforo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

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
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RespuestaAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
