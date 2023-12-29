package vetor;

import java.util.Scanner;

public class Texto {
    public static void main(String[] args) {
        String[] estados = new String[10];
        estados[0] = "AC";
        estados[1] = "AL";
        estados[2] = "AP";
        estados[3] = "AM";
        estados[4] = "BA";
        estados[5] = "CE";
        estados[6] = "ES";
        estados[7] = "GO";
        estados[8] = "MA";
        estados[9] = "MT";

        for (int i = 0; i < estados.length; i++) {
            System.out.println(estados[i]);
        }

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do estado: ");
        String siglaBusca = leitor.nextLine();

        //busca linear
        boolean encontrou = false;
        for(int i = 0; i < estados.length; i++){
            String elemento = estados[i];
            if(elemento.equalsIgnoreCase(siglaBusca)){
                encontrou = true;
                break;
            }
        }

        if(encontrou){
            System.out.println("achou");
        }
        else{
            System.out.println("nao achou");
        }

    }
}
