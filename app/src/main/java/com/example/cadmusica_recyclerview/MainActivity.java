package com.example.cadmusica_recyclerview;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cadmusica_recyclerview.adapter.MusicaAdapter;
import com.example.cadmusica_recyclerview.controller.MusicaDAO;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvMusicas;
    FloatingActionButton fabAdd;

    MusicaDAO musicaDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMusicas = findViewById(R.id.rvMusicas);
        fabAdd = findViewById(R.id.fabAdd);

        musicaDAO = new MusicaDAO();

        fabAdd.setOnClickListener(v -> {
            startActivity(new Intent(this, CadastroActivity.class));
        });

        // configurar o layout da recycler view
        RecyclerView.LayoutManager musicasLayout = new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        );

        // setar o layout configurado para a recycler view
        rvMusicas.setLayoutManager(musicasLayout);

    }

    @Override
    protected void onResume() {
        super.onResume();

        // criar o adapter para a recycler view
        MusicaAdapter musicaAdapter = new MusicaAdapter(this, musicaDAO);
        // setar o adapter criado
        rvMusicas.setAdapter(musicaAdapter);
    }
}