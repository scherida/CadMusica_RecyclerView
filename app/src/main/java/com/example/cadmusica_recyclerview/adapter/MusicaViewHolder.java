package com.example.cadmusica_recyclerview.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cadmusica_recyclerview.R;

public class MusicaViewHolder extends RecyclerView.ViewHolder {

    TextView tvTitulo;
    TextView tvGenero;
    TextView tvCompositor;
    TextView tvAnoLancamento;

    public MusicaViewHolder(@NonNull View itemView) {
        super(itemView);

        // capturar os elementos do itemView para cada célula da recycler view
        tvTitulo = itemView.findViewById(R.id.tvTitulo);
        tvGenero = itemView.findViewById(R.id.tvGenero);
        tvCompositor = itemView.findViewById(R.id.tvCompositor);
        tvAnoLancamento = itemView.findViewById(R.id.tvAnoLancamento);
    }
}
