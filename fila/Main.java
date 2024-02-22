package fila;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.adicionar("Jão");
        fila.adicionar("Zé");
        fila.adicionar("Juca");
        fila.adicionar("Maria");
        fila.adicionar("Ana");

        System.out.println("Primeiro da fila: " + fila.get());
        fila.remover();
        System.out.println("Primeiro da fila: " + fila.get());

        int[] vetor;
        vetor = new int[10];
        vetor
    }
}
