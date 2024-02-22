package pilha;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.adicionar("C");
        pilha.adicionar("B");
        pilha.adicionar("A");
        pilha.adicionar("D");
        pilha.adicionar("E");

        System.out.println("Topo da pilha: " + pilha.get());
        pilha.remover();
        System.out.println("Topo da pilha: " + pilha.get());
    }
    
}