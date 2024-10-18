import java.util.Scanner;
import java.util.Random;

public class PedraPapelTesoura {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random();

        int n=0;
        int usuario;
        int computador;
        int rodada;
        int usuarioGanhou=0;
        int computadorGanhou=0;

        System.out.println(" Usuário! Faça sua escolha!\n 1) Pedra! \n 2) papel! \n 3) Tesoura!");

        while (n < 3) {
            usuario = in.nextInt();
            computador = aleatorio.nextInt(3) + 1;

            
            if ( usuario == computador) {
                System.out.println(" Essa rodada deu empate!");
            } else if ((usuario == 1 && computador == 3) || (usuario == 3 && computador == 2) ||
                    (usuario == 2 && computador == 1) 
            ) {
                System.out.println(" Essa rodada foi do usuário!");
                usuarioGanhou++;
            } else {
                System.out.println(" Essa rodada foi da máquina!");
                computadorGanhou++;
            }
            n++;
        }

        if ( usuarioGanhou > computadorGanhou) {
            System.out.println(" Parabéns! Você ganhou a partida!");
        } else if ( computadorGanhou > usuarioGanhou) {
            System.out.println(" Tente outra vez! O computador ganhou!");
        } else {
            System.out.println(" Essa partida deu empate!");
        }

    } 
 }