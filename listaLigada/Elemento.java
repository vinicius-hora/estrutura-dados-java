package listaLigada;

public class Elemento<TIPO> {
    private TIPO valor;
    private Elemento<TIPO> proximo;

    public Elemento(TIPO novoString) {
        this.valor = novoString;
    }

    public TIPO getValor() {
        return valor;
    }

    public Elemento<TIPO> getProximo() {
        return proximo;
    }

    public void setProximo(Elemento<TIPO> proximo) {
        this.proximo = proximo;
    }
    
    public void setValor(TIPO valor) {
        this.valor = valor;
    }
}
