package ordenacao;

public class InsertionSort {
    public static void main(String[] args) {
        int[] vetor = new int[100000];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        // System.out.println("Antes do insertion sort: \n");
        // for(int i = 0; i < vetor.length; i++){
        //     System.out.println(vetor[i]);
        // }

        long tempoInicial = System.currentTimeMillis();
        long fim;
        int aux;
        int j;
        for(int i = 1; i < vetor.length; i++){
            aux = vetor[i];
            j = i - 1;
            while(j >= 0 && vetor[j] > aux){
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = aux;
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo de ordenação: " + (fim - tempoInicial) + "ms");

        // System.out.println("Depois do insertion sort: \n");
        // for(int i = 0; i < vetor.length; i++){
            
        //     System.out.println(vetor[i]);
        // }
    }
}
