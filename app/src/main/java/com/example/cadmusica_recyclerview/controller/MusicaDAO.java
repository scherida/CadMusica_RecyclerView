package com.example.cadmusica_recyclerview.controller;

import com.example.cadmusica_recyclerview.model.Musica;

import java.util.ArrayList;
import java.util.List;

public class MusicaDAO {

    private static List<Musica> listaMusicas = new ArrayList<>();

    public void addMusicas(Musica musica){
        listaMusicas.add(musica);
    }

    public static Musica getMusicas(int position){
        return listaMusicas.get(position);
    }

    public static List<Musica> getListaMusicas(){
        return listaMusicas;
    }
}
