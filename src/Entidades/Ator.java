package Entidades;

import java.util.Date;

public class Ator {
    protected int idAtor;
    protected String nomeAtor;
    protected String nacionalidadeAtor;
    protected Date dataNascimento;
    protected char generoAtor;
    protected double altura;

    public Ator(int idAtor, String nomeAtor, String nacionalidadeAtor, Date dataNascimento, char generoAtor, double altura) {
        this.idAtor = idAtor;
        this.nomeAtor = nomeAtor;
        this.nacionalidadeAtor = nacionalidadeAtor;
        this.dataNascimento = dataNascimento;
        this.generoAtor = generoAtor;
        this.altura = altura;
    }

    public int getIdAtor() {
        return idAtor;
    }

    public void setIdAtor(int idAtor) {
        this.idAtor = idAtor;
    }

    public String getNomeAtor() {
        return nomeAtor;
    }

    public void setNomeAtor(String nomeAtor) {
        this.nomeAtor = nomeAtor;
    }

    public String getNacionalidadeAtor() {
        return nacionalidadeAtor;
    }

    public void setNacionalidadeAtor(String nacionalidadeAtor) {
        this.nacionalidadeAtor = nacionalidadeAtor;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getGeneroAtor() {
        return generoAtor;
    }

    public void setGeneroAtor(char generoAtor) {
        this.generoAtor = generoAtor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Ator{" +
                "idAtor=" + idAtor +
                ", nomeAtor='" + nomeAtor + '\'' +
                ", nacionalidadeAtor='" + nacionalidadeAtor + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", generoAtor=" + generoAtor +
                ", altura=" + altura +
                '}';
    }
}
