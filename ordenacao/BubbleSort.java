package ordenacao;

public class BubbleSort {
    public static Resultado bubleSort(int[] vetor) {
        int trocas = 0;

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            // System.out.println(vetor[i]);
        }
        
        // bubble sort O(n^2)
        int aux;
        for(int i = 0; i < vetor.length; i++){ // O(n)
            for( int j = i + 1; j < vetor.length; j++){ // O(n)
                if(vetor[i] > vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                    trocas++;
                }
            }
        }
        return new Resultado(vetor, trocas);
    }
}
