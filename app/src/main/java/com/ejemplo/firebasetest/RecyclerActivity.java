package com.ejemplo.firebasetest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.ejemplo.firebasetest.adaptador.AdapterProducto;
import com.ejemplo.firebasetest.databinding.ActivityProfileBinding;
import com.ejemplo.firebasetest.databinding.ActivityRecyclerBinding;
import com.ejemplo.firebasetest.modelo.Producto;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    ActivityRecyclerBinding binding;

    private RecyclerView rv;

//    List<User> listaUsuarios;
    List<Producto> listaProductos;

//    Adapter adaptadorUsuarios;
    AdapterProducto adaptadorProductos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_recycler);
        binding = ActivityRecyclerBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        rv = (RecyclerView) findViewById(R.id.recycler);
        rv.setLayoutManager(new LinearLayoutManager(this));

//        listaUsuarios = new ArrayList<>();
        listaProductos = new ArrayList<Producto>();
//        adaptadorUsuarios = new Adapter(listaUsuarios);
        adaptadorProductos = new AdapterProducto(listaProductos);
//        rv.setAdapter(adaptadorUsuarios);
        rv.setAdapter(adaptadorProductos);

        FirebaseDatabase db = FirebaseDatabase.getInstance("https://fir-test-f6388-default-rtdb.europe-west1.firebasedatabase.app/");
        db.getReference().child("productos").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
//                listaUsuarios.removeAll(listaUsuarios);
                listaProductos.removeAll(listaProductos);
                for (DataSnapshot ds :
                        snapshot.getChildren()) {
//                    User us = ds.getValue(User.class);
                    Producto pro = ds.getValue(Producto.class);
//                    listaUsuarios.add(us);
                    listaProductos.add(pro);
                }
//                adaptadorUsuarios.notifyDataSetChanged();
                adaptadorProductos.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}