package Entidades;

import java.util.ArrayList;
import java.util.Date;

public class Filme extends Video{

    protected int idFilme;
    protected Date dataLancamento;
    protected String diretor;
    protected String paisOrigem;
    protected double orcamento;
    protected double faturamentoMundial;

    public Filme(String tituloOriginal, String tituloNacional, double nota, int duracao, ArrayList<Genero> generos, ArrayList<Assunto> assuntos, int idFilme, Date dataLancamento, String diretor, String paisOrigem, double orcamento, double faturamentoMundial) {
        super(tituloOriginal, tituloNacional, nota, duracao, generos, assuntos);
        this.idFilme = idFilme;
        this.dataLancamento = dataLancamento;
        this.diretor = diretor;
        this.paisOrigem = paisOrigem;
        this.orcamento = orcamento;
        this.faturamentoMundial = faturamentoMundial;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public double getFaturamentoMundial() {
        return faturamentoMundial;
    }

    public void setFaturamentoMundial(double faturamentoMundial) {
        this.faturamentoMundial = faturamentoMundial;
    }


    @Override
    public String toString() {
        return "Filme{" +
                "idFilme=" + idFilme +
                ", dataLancamento=" + dataLancamento +
                ", diretor='" + diretor + '\'' +
                ", paisOrigem='" + paisOrigem + '\'' +
                ", orcamento=" + orcamento +
                ", faturamentoMundial=" + faturamentoMundial +
                ", tituloOriginal='" + tituloOriginal + '\'' +
                ", tituloNacional='" + tituloNacional + '\'' +
                ", nota=" + nota +
                ", duracao=" + duracao +
                ", genero=" + generos +
                ", assunto=" + assuntos +
                '}';
    }
}





