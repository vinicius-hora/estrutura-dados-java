package ordenacao;

public class InsertionSort {
    public static Resultado insertionSort(int[] vetor) {
        int trocas = 0;

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        // System.out.println("Antes do insertion sort: \n");
        // for(int i = 0; i < vetor.length; i++){
        //     System.out.println(vetor[i]);
        // }
        int aux;
        int j;
        for(int i = 1; i < vetor.length; i++){
            aux = vetor[i];
            j = i - 1;
            while(j >= 0 && vetor[j] > aux){
                vetor[j + 1] = vetor[j];
                j--;
                trocas++;
            }
            vetor[j + 1] = aux;
            trocas++;
        }
        // System.out.println("Depois do insertion sort: \n");
        // for(int i = 0; i < vetor.length; i++){
            
        //     System.out.println(vetor[i]);
        // }

        return new Resultado(vetor, trocas);
    }
}
