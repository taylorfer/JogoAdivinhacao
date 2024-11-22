import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {

    public static void main(String[] args) {
        // Gerar um número aleatório entre 0 e 100
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int tentativas = 5;
        boolean acertou = false;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100.");

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            int palpite = scanner.nextInt();

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + " em " + i + " tentativas.");
                acertou = true;
                break;
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor do que " + palpite + ".");
            } else {
                System.out.println("O número é maior do que " + palpite + ".");
            }
        }

        if (!acertou) {
            System.out.println("Suas tentativas acabaram. O número era " + numeroAleatorio + ".");
        }

        scanner.close();
    }
}
