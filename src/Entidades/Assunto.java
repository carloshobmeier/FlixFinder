
package Entidades;

public class Assunto {

    protected int idAssunto;
    protected String temaAssunto;

    public Assunto(int idAssunto, String temaAssunto) {
        this.idAssunto = idAssunto;
        this.temaAssunto = temaAssunto;
    }

    public int getIdAssunto() {
        return idAssunto;
    }

    public void setIdAssunto(int idAssunto) {
        this.idAssunto = idAssunto;
    }

    public String getTemaAssunto() {
        return temaAssunto;
    }

    public void setTemaAssunto(String temaAssunto) {
        this.temaAssunto = temaAssunto;
    }
}