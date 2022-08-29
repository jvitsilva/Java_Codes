import java.util.Arrays;
import java.util.Scanner;

public class Baralho {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String respCarta, respNipe;

        String[] nipes = { "ouros", "paus", "copas", "espadas" };
        String[] cartas = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

        // menu
        System.out.println("### DESCUBRA A POSIÇÃO DE SUA CARTA! ###");
        System.out.println("NIPES: ouros, paus, copas, espadas");
        System.out.println("CARTAS: A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K\n");

        System.out.println("Digite o nipe: ");
        respNipe = ler.next();
        System.out.println("Digite o numero ou a letra da carta(Maiúsculo): ");
        respCarta = ler.next();

        // achar o index na lista
        int indexNipe = Arrays.asList(nipes).indexOf(respNipe);
        int indexCarta = Arrays.asList(cartas).indexOf(respCarta);

        System.out.println("SUA CARTA ESTÁ NA POSIÇÃO [" + indexNipe + "][" + indexCarta + "] do baralho");

    }

}
