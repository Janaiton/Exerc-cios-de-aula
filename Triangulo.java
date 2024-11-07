import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int valor;

        System.out.print(" Escolha o tamanho do triângulo = ");
        valor = in.nextInt();

        for (int i = 1; i <= valor; i++) {
            for (int j = valor - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
