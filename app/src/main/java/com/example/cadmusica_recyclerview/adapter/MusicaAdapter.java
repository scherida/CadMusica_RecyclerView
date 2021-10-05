package com.example.cadmusica_recyclerview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cadmusica_recyclerview.R;
import com.example.cadmusica_recyclerview.controller.MusicaDAO;
import com.example.cadmusica_recyclerview.model.Musica;

public class MusicaAdapter extends RecyclerView.Adapter {

    // parâmetros obrigatórios para seu adapter
    private Context context; // qual contexto a recycler vier se encontra
    private MusicaDAO musicaDAO; // objeto que consegue acessar a fonte de dados (listaJogos)

    public MusicaAdapter(Context context, MusicaDAO musicaDAO) {
        this.context = context;
        this.musicaDAO = musicaDAO;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // determinou qual o contexto que será usado este adaptador.
        // em seguida, informamos qual o arquivo de layout xml será 'inflado' dentro da recycler view
        View view = LayoutInflater.from(context).inflate(R.layout.layout_musica, parent, false);

        // determina qual o vieHolder será usado por este adapter, informando como parâmetro
        // a view configurada acima, que basicamente é o layout 'inflado' do xml criado anteriormente (layout_jogo)
        com.example.cadmusica_recyclerview.adapter.MusicaViewHolder musicaViewHolder = new com.example.cadmusica_recyclerview.adapter.MusicaViewHolder(view);

        return musicaViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        // a cada rolagem de tela, precisamos garantir que cada célula receba os dados
        // correspondentes a posição atual da nossa fonte de dados (listaJogos)
        // quem faz isso é o holder! Logo, precisamos criar um objeto do tipo jogoViewHolder aqui também
        com.example.cadmusica_recyclerview.adapter.MusicaViewHolder musicaViewHolder = (com.example.cadmusica_recyclerview.adapter.MusicaViewHolder) holder;

        // cada célula da recycler view irá receber um objeto de uma das posições válidas da listaJogos
        Musica musica = MusicaDAO.getMusicas(position);

        // podemos associar agora os elementos de interface com as posições dinâmicas do holder:
        musicaViewHolder.tvTitulo.setText(musica.getTituloMusica());
        musicaViewHolder.tvGenero.setText("Gênero: " + musica.getGenero());
        musicaViewHolder.tvCompositor.setText("Compositor: " + musica.getCompositor());
        musicaViewHolder.tvAnoLancamento.setText("Ano de lançamento: " + musica.getAnoLancamento());


    }

    @Override
    public int getItemCount() {
        return MusicaDAO.getListaMusicas().size();
    }
}
