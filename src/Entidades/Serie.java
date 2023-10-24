package Entidades;

public class Serie extends Video{

    protected int idSerie;
    protected int numeroTemporadas;

    public Serie(String tituloOriginal, String tituloNacional, double nota, int duracao, Genero genero, Assunto assunto, int idSerie, int numeroTemporadas) {
        super(tituloOriginal, tituloNacional, nota, duracao, generos, assuntos);
        this.idSerie = idSerie;
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(int idSerie) {
        this.idSerie = idSerie;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }


    @Override
    public String toString() {
        return "Serie{" +
                "idSerie=" + idSerie +
                ", numeroTemporadas=" + numeroTemporadas +
                ", tituloOriginal='" + tituloOriginal + '\'' +
                ", tituloNacional='" + tituloNacional + '\'' +
                ", nota=" + nota +
                ", duracao=" + duracao +
                ", genero=" + genero +
                ", assunto=" + assunto +
                '}';
    }
}
