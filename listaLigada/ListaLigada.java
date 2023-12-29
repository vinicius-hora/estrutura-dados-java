package listaLigada;

public class ListaLigada {
    private Elemento prmeiro;
    private Elemento ultimo;

    private int tamanho;

    

    public ListaLigada() {
        this.tamanho = 0;
    }

    public Elemento getPrmeiro() {
        return prmeiro;
    }

    public void setPrmeiro(Elemento prmeiro) {
        this.prmeiro = prmeiro;
    }

    public Elemento getUltimo() {
        return ultimo;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(String novoValor){
        Elemento novoElemento = new Elemento(novoValor);
        if(this.prmeiro == null && this.ultimo == null){
            this.prmeiro = novoElemento;
            this.ultimo = novoElemento;
            
        }else{
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
            
        }

        this.tamanho ++;
        
    }

    public void remover(String novoValor){

    }

    public Elemento get(int posicao){
        Elemento atual = this.prmeiro;
        for(int i=0; i < posicao; i++){
            if(atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }
}
