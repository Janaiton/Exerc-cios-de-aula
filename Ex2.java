
// FAÇA UM PROGRAMA QUE MOSTRE OS DIVISORES DE 1 A N DE UM NÚMERO ESCOLHIDO PELO USUARIO
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = 1;
        int divisor;
        int dividi = 0;
        int divisao = 0;

        System.out.print(" Diga um número = ");
        divisor = in.nextInt();

        while (n <= divisor) {
            if (divisor % n == 0) {
                System.out.println(" Esse é divisor");
                dividi++;
            } else {
                System.out.println(" Não é divisor");
            }
            n++;
        }
        System.out.println(" Total de " + dividi + " divisores.");
    }

}
