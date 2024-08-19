package exercicio01;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        int numero1 = -1;
        int numero2 = -1;
        Scanner leitor = new Scanner(System.in);

        while (numero1 < 0) {
            System.out.println("Digite o primeiro número: ");
            numero1 = leitor.nextInt();
        }

        while (numero2 < 0) {
            System.out.println("Digite o segundo número: ");
            numero2 = leitor.nextInt();
        }

        if (numero1 < numero2) {
            for (int i = numero1; i <= numero2; i++) {
                if (ehPrimo(i)) {
                    System.out.println(i + " é primo.");
                } else {
                    System.out.println(i + " não é primo.");
                }
            }
        } else if (numero1 > numero2) {
            for (int i = numero2; i <= numero1; i++) {
                if (ehPrimo(i)) {
                    System.out.println(i + " é primo.");
                } else {
                    System.out.println(i + " não é primo.");
                }
            }
        }
    }
    private static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int j = 2; j <= Math.sqrt(numero); j++) {
            if (numero % j == 0) {
                return false;
            }
        }
        return true;
    }
}