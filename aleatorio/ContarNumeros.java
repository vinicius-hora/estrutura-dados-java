package aleatorio;

public class ContarNumeros {
    public static void main(String[] args) {
        Integer numeroVerificar = 100;
        int fim = 1000;
        int contador = 0;

        for(int i = 0; i < fim; i++){
            if(Integer.toString(i).contains(numeroVerificar.toString())){
                contador++;
            }
        }

        System.out.println("O número " + numeroVerificar + " aparece " + contador + " vezes.");
    }
}
