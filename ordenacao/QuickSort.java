package ordenacao;

public class QuickSort {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            // System.out.println(vetor[i]);
        }

        System.out.println("Antes do quickSort: \n");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        // quick sort O(n log n)
        quickSort(vetor, 0, vetor.length - 1);

        System.out.println("\n\nDepois do quickSort: \n");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

    }

    static void quickSort(int[] vetor, int esquerda, int direita){
        if(esquerda < direita){
            int p = particao(vetor, esquerda, direita);
            quickSort(vetor, esquerda, p);
            quickSort(vetor, p + 1, direita);
        }
    }

    static int particao(int[] vetor, int esquerda, int direita){
        int meio = (int) (esquerda + direita) / 2;
        int pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;

        while(true){
            do{
                i++;
            } while(vetor[i] < pivo);
            do{
                j--;
            } while(vetor[j] > pivo);
            if(i >= j){
                return j;
            }

            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }
    
}
