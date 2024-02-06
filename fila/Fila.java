package fila;

import listaLigada.ListaLigada;

public class Fila {
    private ListaLigada<String> lista = new ListaLigada();

    public void adicionar(String novoValor){
        this.lista.adicionar(novoValor);

    }

    public void remover(){
        this.lista.remover(this.get());

    }

    public String get(){
        return this.lista.getPrimeiro().getValor();
    }
    
}
