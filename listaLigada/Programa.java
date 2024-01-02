package listaLigada;

import javax.print.DocFlavor.STRING;

public class Programa {
    public static void main(String[] args) {
        ListaLigada<String> lista = new ListaLigada<String>();

        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
        
        System.out.println("tamanho: " + lista.getTamanho());
        System.out.println("primeiro: " +lista.getPrimeiro().getValor());
        System.out.println("ultimo: " +lista.getUltimo().getValor());

        System.out.println("Lista antes da remoção: ");
        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }

        //remover   
        lista.remover("ac");
        //imprimir
        System.out.println("Lista após remoção: ");
        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }

        //adicionar
        lista.adicionar("SP");
        System.out.println("Lista após adição: ");
        for(int i=0; i < lista.getTamanho(); i++){
            System.out.println(lista.get(i).getValor());
        }
    }
}
