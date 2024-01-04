package listaLigada;

public class IteratorListaLigada<TIPO> {
    private Elemento<TIPO> elemento;
    
    public IteratorListaLigada(Elemento<TIPO> atual) {
        this.elemento = atual;
    }

    public boolean temProximo(){
        if(this.elemento == null){
            return false;
        }else{
            return true;
        }
    }

    public Elemento<TIPO> getProximo(){
        Elemento<TIPO> atual = this.elemento;
        if(atual != null){
            this.elemento = atual.getProximo();
        }
        return atual;
    }
}
