package ordenacao;

public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = new int[100000];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            // System.out.println(vetor[i]);
        }
        long tempoInicial = System.currentTimeMillis();
        long fim;
        // bubble sort O(n^2)
        int aux;
        for(int i = 0; i < vetor.length; i++){ // O(n)
            for( int j = i + 1; j < vetor.length; j++){ // O(n)
                if(vetor[i] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
        fim = System.currentTimeMillis();
        System.out.println("Tempo de ordenação: " + (fim - tempoInicial) + "ms");

        // System.out.println("Depois do bubble sort: \n");
        // for(int i = 0; i < vetor.length; i++){
        //     System.out.println(vetor[i]);
        // }
    }
}
