package comparacao;

import java.util.ArrayList;

import listaLigada.IteratorListaLigada;
import listaLigada.ListaLigada;

public class comparacao {
    public static void main(String[] args) {
        ListaLigada<Integer> lista = new ListaLigada<Integer>();

        ArrayList<Integer> vetor = new ArrayList<Integer>();

        int limite = 1000000;
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal = 0;
        for (int i = 0; i < limite; i++) {
        
            vetor.add(i);
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo de inserção no vetor: " + (tempoFinal - tempoInicial) + "ms");

        tempoInicial = System.currentTimeMillis();
    
        for (int i = 0; i < limite; i++) {
        
            lista.adicionar(i);
        }

        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo de inserção na lista: " + (tempoFinal - tempoInicial) + "ms");

        //ler valores
        tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < vetor.size(); i++) {
        
            vetor.get(i);
        }
        tempoFinal = System.currentTimeMillis();

        System.out.println("Tempo de leitura no vetor: " + (tempoFinal - tempoInicial) + "ms");

        tempoInicial = System.currentTimeMillis();

        IteratorListaLigada<Integer> iterator = lista.getIterator();
        while(iterator.temProximo()){
            iterator.getProximo();
        }

        tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de leitura da lista: " + (tempoFinal - tempoInicial) + "ms");
    }
}
