package listaLigada;

public class Programa {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adicionar("AC");
        lista.adicionar("BA");
        lista.adicionar("CE");
        lista.adicionar("DF");
        System.out.println(lista.getTamanho());
        System.out.println(lista.getPrmeiro().getValor());
        System.out.println(lista.getUltimo().getValor());

        System.out.println(lista.get(0).getValor());
        System.out.println(lista.get(1).getValor());
        System.out.println(lista.get(2).getValor());
        System.out.println(lista.get(3).getValor());
    }
}
