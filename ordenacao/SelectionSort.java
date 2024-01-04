package ordenacao;

public class SelectionSort {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
            // System.out.println(vetor[i]);
        }

        System.out.println("Antes do insertion sort: \n");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        // selection sort O(n^2)
        int posicaoMenor;
        int aux;
        for(int i=0; i < vetor.length; i++){
            posicaoMenor  = i;
            for(int j = i + 1; j < vetor.length; j++){
               if(vetor[j] < vetor[posicaoMenor]){
                    posicaoMenor = j;
                }
            }
            aux = vetor[posicaoMenor];
            vetor[posicaoMenor] = vetor[i];
            vetor[i] = aux;

        }

         System.out.println("Depois do insertion sort: \n");
        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
}
