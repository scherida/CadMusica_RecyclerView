package com.example.cadmusica_recyclerview.model;

public class Musica {

    private String tituloMusica;
    private String genero;
    private String compositor;
    private int anoLancamento;

    public Musica(){}

    public Musica(String tituloMusica, String genero, String compositor, int anoLancamento) {
        this.tituloMusica = tituloMusica;
        this.genero = genero;
        this.compositor = compositor;
        this.anoLancamento = anoLancamento;
    }

    public String getTituloMusica() {
        return tituloMusica;
    }

    public void setTituloMusica(String tituloMusica) {
        this.tituloMusica = tituloMusica;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}
