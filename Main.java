import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int escolha;

        do {
            System.out.println("*-*-*-*-*-*-*-*-*-*-*");
            System.out.println("Menu LOTOFÁCIL (PAGAAA):");
            System.out.println("1) Apostar de 0 a 100");
            System.out.println("2) Apostar de A à Z");
            System.out.println("3) Apostar em par ou ímpar");
            System.out.println("0) Sair");
            System.out.println("**************************");

            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    apostarDe0a100(scanner, random);
                    break;
                case 2:
                    apostarDeAaZ(scanner);
                    break;
                case 3:
                    apostarParOuImpar(scanner);
                    break;
                case 0:
                    System.out.println("Saindo do programa. Obrigado por jogar!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }

        } while (escolha != 0);

        scanner.close();
    }

    public static void apostarDe0a100(Scanner scanner, Random random) {
        System.out.print("Digite um número de 0 a 100 para apostar: ");
        int numeroApostado = scanner.nextInt();

        if (numeroApostado < 0 || numeroApostado > 100) {
            System.out.println("Aposta inválida.");
            return;
        }

        int numeroSorteado = random.nextInt(101);
        System.out.println("Número sorteado: " + numeroSorteado);

        if (numeroApostado == numeroSorteado) {
            System.out.println("Você ganhou (PAGOU MUITO) R$ 1.000,00 reais.");
        } else {
            System.out.println("Que pena (NÃO PAGOU) ! O número sorteado foi: " + numeroSorteado + ".");
        }
    }

    public static void apostarDeAaZ(Scanner scanner) {
        System.out.print("Digite uma letra de A à Z: ");
        char letraApostada = Character.toUpperCase(scanner.next().charAt(0));

        if (!Character.isLetter(letraApostada)) {
            System.out.println("Aposta inválida.");
            return;
        }

        char letraPremiada = 'J'; // Letra premiada escolhida como exemplo

        if (letraApostada == letraPremiada) {
            System.out.println("Você ganhou (PAGOU DEMAIS) R$ 500,00 reais.");
        } else {
            System.out.println("Que pena! (NÃO PAGOU)  A letra sorteada foi: " + letraPremiada + ".");
        }
    }

    public static void apostarParOuImpar(Scanner scanner) {
        System.out.print("Digite um número inteiro: ");
        int numeroDigitado = scanner.nextInt();

        if (numeroDigitado % 2 == 0) {
            System.out.println("Você ganhou R$ 100,00 reais. (PAGOU)");
        } else {
            System.out.println("Que pena! (NÃO PAGOU) O número digitado é ímpar e a premiação foi para números pares.");
        }
    }
}
