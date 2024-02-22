package pilha;

import listaLigada.ListaLigada;

public class Pilha {
    private ListaLigada<String>  lista;

    public Pilha() {
        this.lista = new ListaLigada();
    }

    public void adicionar(String valor) {
        this.lista.adicionarNoComeco(valor);
    }

    public void remover() {
        this.lista.remover(this.get());
    }

    public String get() {
        return this.lista.getPrimeiro().getValor();
    }
}
