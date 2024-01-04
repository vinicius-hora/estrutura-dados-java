package buscaLinear;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[8];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10);
            System.out.println(vetor[i]);
        }

        System.out.println("Qual número deseja buscar?");
        Scanner leitor = new Scanner(System.in);
        int numeroBusca = leitor.nextInt();
        boolean encontrou = false;

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == numeroBusca){
                encontrou = true;
                break;
            }
        }

        if(encontrou){
            System.out.println("Achou");
        }
        else{
            System.out.println("Não achou");
        }
    }
}
