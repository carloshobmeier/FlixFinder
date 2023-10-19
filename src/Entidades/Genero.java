
package Entidades;

public class Genero {
    protected int idGenero;
    protected String tipoGenero;


    public Genero(int idGenero, String tipoGenero) {
        this.idGenero = idGenero;
        this.tipoGenero = tipoGenero;
    }


    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(String tipoGenero) {
        this.tipoGenero = tipoGenero;
    }
}
