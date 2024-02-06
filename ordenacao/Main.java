package ordenacao;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[100];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        long inicio, fim;
        Resultado resultado;

        System.out.println("\n Bubble Sort \n");
        inicio = System.currentTimeMillis();
        resultado = BubbleSort.bubleSort(vetor.clone());
        fim = System.currentTimeMillis();

        System.out.println("Tempo de execução: " + (fim - inicio) + "ms");
        System.out.println("Número de trocas: " + resultado.getTrocas());


        System.out.println("\n Heap Sort \n");
        inicio = System.currentTimeMillis();
        resultado = HeapSort.heapSort(vetor.clone());
        fim = System.currentTimeMillis();

        System.out.println("Tempo de execução: " + (fim - inicio) + "ms");
        System.out.println("Número de trocas: " + resultado.getTrocas());

        System.out.println("\n Insertion Sort \n");
        inicio = System.currentTimeMillis();
        resultado = InsertionSort.insertionSort(vetor.clone());
        fim = System.currentTimeMillis();

        System.out.println("Tempo de execução: " + (fim - inicio) + "ms");
        System.out.println("Número de trocas: " + resultado.getTrocas());
    }

    
    
}
