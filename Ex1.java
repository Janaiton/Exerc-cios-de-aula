// FAÇA UM PROGRAMA QUE LEIA 5 VALORES E INDIQUE QUAL FOI O MAIOR VALOR DIGITADO PELO USUARIO

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = 0;
        int maior = 0, valor = 0;

        System.out.println(" Vamos começar a brincadeira!");

        while (n < 5) {
            System.out.print(" Digite o valor = ");
            valor = in.nextInt();

            if (valor > maior) {
                System.out.println(" Esse é o maior valor ");
                maior = valor;
            } else {
                System.out.println(" Esse é menor que o anterior");
            }

            n++;
        }
        System.out.println(" O maior valor escolhido pelo usuario foi = " + valor);
    }
}