import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        int valor;

        System.out.println(" Insira a dimensão do retangulo");
        
        System.out.print(" Valor = ");
        valor =  in.nextInt();

        for ( int i = 0; i <= valor; i++) {
            for ( int j = valor - i; j > 0; j--) {
                System.out.print(" ");
            }
            for ( int k = 0; k <= i; k++) {
                System.out.print("* ");
            }    
            System.out.println();
        }
    }
}



