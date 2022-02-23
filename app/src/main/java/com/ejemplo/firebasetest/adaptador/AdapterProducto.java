package com.ejemplo.firebasetest.adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ejemplo.firebasetest.R;
import com.ejemplo.firebasetest.modelo.Producto;

import java.util.List;

public class AdapterProducto extends RecyclerView.Adapter<AdapterProducto.ProductosViewHolder> {

    List<Producto> listaProductos;

    public AdapterProducto(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    @NonNull
    @Override
    public AdapterProducto.ProductosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fila_recycler, parent, false);
        AdapterProducto.ProductosViewHolder holder = new AdapterProducto.ProductosViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterProducto.ProductosViewHolder holder, int position) {
        Producto producto = listaProductos.get(position);
        holder.tvNombre.setText(producto.getId());
        holder.tvEmail.setText(producto.getLocalización());
        holder.tvPassword.setText(producto.getNombre());
    }

    @Override
    public int getItemCount() {
        return listaProductos.size();
    }

    public static class ProductosViewHolder extends RecyclerView.ViewHolder {

        TextView tvNombre, tvEmail, tvPassword;

        public ProductosViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvEmail = itemView.findViewById(R.id.tvEmail);
            tvPassword = itemView.findViewById(R.id.tvPassword);


        }
    }
}
