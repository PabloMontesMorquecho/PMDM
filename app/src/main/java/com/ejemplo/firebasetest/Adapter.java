package com.ejemplo.firebasetest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ejemplo.firebasetest.modelo.User;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.UsuariosViewHolder> {

    List<User> listaUsuarios;

    public Adapter(List<User> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @NonNull
    @Override
    public UsuariosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fila_recycler, parent, false);
        UsuariosViewHolder holder = new UsuariosViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull UsuariosViewHolder holder, int position) {
        User user = listaUsuarios.get(position);
        holder.tvNombre.setText(user.getNombre());
        holder.tvEmail.setText(user.getEmail());
        String auto;
        if (user.isAutonomo()) auto = "true";
        else auto = "false";
        holder.tvPassword.setText(auto);
    }

    @Override
    public int getItemCount() {
        return listaUsuarios.size();
    }

    public static class UsuariosViewHolder extends RecyclerView.ViewHolder {

        TextView tvNombre, tvEmail, tvPassword;

        public UsuariosViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvEmail = itemView.findViewById(R.id.tvEmail);
            tvPassword = itemView.findViewById(R.id.tvPassword);


        }
    }
}
