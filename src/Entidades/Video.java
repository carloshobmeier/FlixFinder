package Entidades;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Video {
    protected String tituloOriginal;
    protected String tituloNacional;
    protected double nota;
    protected int duracao;
    protected ArrayList<Genero> generos;
    protected ArrayList<Assunto> assuntos;

    public Video(String tituloOriginal, String tituloNacional, double nota, int duracao, ArrayList<Genero> generos, ArrayList<Assunto> assuntos) {
        this.tituloOriginal = tituloOriginal;
        this.tituloNacional = tituloNacional;
        this.nota = nota;
        this.duracao = duracao;
        this.generos = generos;
        this.assuntos = assuntos;
    }

    public String getTituloOriginal() {
        return tituloOriginal;
    }

    public void setTituloOriginal(String tituloOriginal) {
        this.tituloOriginal = tituloOriginal;
    }

    public String getTituloNacional() {
        return tituloNacional;
    }

    public void setTituloNacional(String tituloNacional) {
        this.tituloNacional = tituloNacional;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public ArrayList<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(ArrayList<Genero> generos) {
        this.generos = generos;
    }

    public ArrayList<Assunto> getAssuntos() {
        return assuntos;
    }

    public void setAssuntos(ArrayList<Assunto> assuntos) {
        this.assuntos = assuntos;
    }
}
