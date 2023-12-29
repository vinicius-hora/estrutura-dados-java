package listaLigada;

public class Elemento {
    private String valor;
    private Elemento proximo;

    public Elemento(String novoString) {
        this.valor = novoString;
    }

    public String getValor() {
        return valor;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }
    
}
