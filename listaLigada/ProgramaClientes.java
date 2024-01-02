package listaLigada;

public class ProgramaClientes {
    public static void main(String[] args) {
        ListaLigada<Cliente> clientes = new ListaLigada<Cliente>();

        clientes.adicionar(new Cliente("123", "João"));
        clientes.adicionar(new Cliente("125", "Juca"));

        System.out.println("numeros antes da remoção: ");
        for(int i=0; i < clientes.getTamanho(); i++){
            System.out.println(clientes.get(i).getValor());
        }
    }
}
