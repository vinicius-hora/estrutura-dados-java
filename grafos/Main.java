package grafos;

public class Main {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<String>();
        grafo.adicionarVertice("João");
        grafo.adicionarVertice("Lorenzo");
        grafo.adicionarVertice("Creuza");
        grafo.adicionarVertice("Cleber");
        grafo.adicionarVertice("Claudia");

        grafo.adicionarAresta(2.0, "João", "Lorenzo");
        grafo.adicionarAresta(3.0, "Lorenzo", "Cleber");
        grafo.adicionarAresta(1.0, "Cleber", "Creuza");
        grafo.adicionarAresta(1.0, "João", "Creuza");
        grafo.adicionarAresta(2.0, "Claudia", "Lorenzo");
        grafo.adicionarAresta(2.0, "Claudia", "João");
        
        grafo.buscaEmLargura();

        
    }
}
