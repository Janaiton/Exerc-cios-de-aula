import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
                          //  [TAMANHO]
        int [] v1 = {10, 20, 30, 40, 50};        // ULTIMA POSICAO É TAMANHO-1       // 0 É A PRIMEIRA POSICAO
        int [] v2 = {7, 9, 11, 13, 15};

        for (int i = 0; i < v1.length; i++) {
            System.out.println(i + " = " + v1[i] + " ");      // v1[x]    => v1 na posicao x
        }
        System.out.println();

        for (int i = 0; i < v2.length; i++) {
            System.out.println(i + " = " + v1[i] + " ");
        }
        System.out.println();


        // duas entrada
        // int posicao = in.nextInt();
        // int valor = in.nextInt();

        for ( int j = v1.length-1; j >= 0; j--) {
            System.out.println(j + " = " + v1[j] + " ");
        }
        System.out.println();


        for(int i = 0; i < v1.length; i++) {
        System.out.println(" Escolha um novo valor para o vetor = ");
        v1 [i]= in.nextInt();
        System.out.println(i + " = " + v1[i]);
        
        }

    
    }
}