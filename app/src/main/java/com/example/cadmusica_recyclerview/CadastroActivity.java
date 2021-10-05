package com.example.cadmusica_recyclerview;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cadmusica_recyclerview.controller.MusicaDAO;
import com.example.cadmusica_recyclerview.model.Musica;

public class CadastroActivity extends AppCompatActivity {

    EditText etTituloMusica;
    EditText etGenero;
    EditText etCompositor;
    EditText etAnoLancamento;
    Button bSalvar;

    MusicaDAO musicaDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        etTituloMusica        = findViewById(R.id.etTituloMusica);
        etGenero        = findViewById(R.id.etGenero);
        etCompositor    = findViewById(R.id.etCompositor);
        etAnoLancamento = findViewById(R.id.etAnoLancamento);
        bSalvar         = findViewById(R.id.bSalvar);

        musicaDAO = new MusicaDAO();


        bSalvar.setOnClickListener(v ->{

            if(etTituloMusica.getText().toString().isEmpty()     ||
                    etGenero.getText().toString().isEmpty()     ||
                    etCompositor.getText().toString().isEmpty() ||
                    etAnoLancamento.getText().toString().isEmpty()) {

                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();

            } else {

                Musica musica = new Musica(
                        etTituloMusica.getText().toString(),
                        etGenero.getText().toString(),
                        etCompositor.getText().toString(),
                        Integer.parseInt(etAnoLancamento.getText().toString())
                );

                musicaDAO.addMusicas(musica);

                Toast.makeText(this, "Música salvo!", Toast.LENGTH_SHORT).show();

                finish();

            }

        });


    }
}