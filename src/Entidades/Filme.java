package Entidades;

import java.util.Date;

public class Filme {

    protected int idFilme;
    protected String tituloOriginal;
    protected String tituloNacional;
    protected Date dataLancamento;
    protected String diretor;
    protected String paisOrigem;
    protected double nota;
    protected double orcamento;
    protected double faturamentoMundial;
    protected int duracao;

    public Filme(int idFilme, String tituloOriginal, String tituloNacional, Date dataLancamento, String diretor, String paisOrigem, double nota, double orcamento, double faturamentoMundial, int duracao) {
        this.idFilme = idFilme;
        this.tituloOriginal = tituloOriginal;
        this.tituloNacional = tituloNacional;
        this.dataLancamento = dataLancamento;
        this.diretor = diretor;
        this.paisOrigem = paisOrigem;
        this.nota = nota;
        this.orcamento = orcamento;
        this.faturamentoMundial = faturamentoMundial;
        this.duracao = duracao;
    }

    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
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

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
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

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }


    @Override
    public String toString() {
        return "Filme{" +
                "idFilme=" + idFilme +
                ", tituloOriginal='" + tituloOriginal + '\'' +
                ", tituloNacional='" + tituloNacional + '\'' +
                ", dataLancamento='" + dataLancamento + '\'' +
                ", diretor='" + diretor + '\'' +
                ", paisOrigem='" + paisOrigem + '\'' +
                ", nota=" + nota +
                ", orcamento=" + orcamento +
                ", faturamentoMundial=" + faturamentoMundial +
                ", duracao=" + duracao +
                '}';
    }
}
