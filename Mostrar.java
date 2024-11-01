import java.util.Scanner;

public class Mostrar {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);

        int valor1, valor2, n, numero, resultado;
        
        System.out.println(" Numeros de 1 a 10!");
        for ( int i = 1; i <= 10; i++) {
            System.out.println(" Numero " + i);
        } 
        System.out.println("\n Numeros Pares!");
        for ( int i = 100; i <= 120; i = i + 2) {
            System.out.println(" Numero par = " + i);
        }
        System.out.println("\n Numeros Impares!");
        for ( int i = 50 -1; i >= 30; i = i - 2) {
            System.out.println(" Numeros impar = " + i);
        }  
        
        System.out.println("\n Multiplos de 3 entre dois numeros fornecidos pelo usuário!");
        
        System.out.println(" Diga dois valores!");

        System.out.print(" Valor 1 = ");
        valor1 = in.nextInt();
        System.out.print(" Valor 2 = ");        
        valor2 = in.nextInt();
        for( int i= valor1; i <= valor2; i++) {
            if( i % 3 == 0)
            System.out.println("Multiplos de 3 = " + i);
        }

        System.out.println("\n Divisores de um numero N");
        System.out.print(" Escolha um numero = ");
        n = in.nextInt();

        for ( int i = 1; i <= n; i++) {
            if ( n % i == 0) {    
                System.out.println(" Divisores de N = " + i);
            }
        }
        System.out.println("\n Tabuada de um numero de 1 a 10");
        System.out.print(" Escolha o numero =");
        numero = in.nextInt();

        for( int i = 0; i <= 10; i++) {
            resultado = i * numero;
            System.out.println(i + " * " + numero + " = " + resultado);
                  
        }          
    }
}