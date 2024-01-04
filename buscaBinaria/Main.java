package buscaBinaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[1000000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i * 2;
            // System.out.println(vetor[i]);
        }
        int contador = 0;
        boolean encontrou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;

        System.out.println("Qual número deseja buscar?");
        Scanner leitor = new Scanner(System.in);
        int numeroBusca = leitor.nextInt();

        while (inicio <= fim) {
            meio = (int) ((inicio + fim) / 2);
            contador++; // conta quantos testes foram feitos
            if(vetor[meio] == numeroBusca){
                encontrou = true;
                break;
            }
            else if(vetor[meio] < numeroBusca){
                inicio = meio + 1;
            }
            else{
                fim = meio - 1;
            }
        }

        System.out.println("Testes: " + contador);

        if(encontrou){
            System.out.println("Achou");
        }
        else{
            System.out.println("Não achou");
        }
    }
}
