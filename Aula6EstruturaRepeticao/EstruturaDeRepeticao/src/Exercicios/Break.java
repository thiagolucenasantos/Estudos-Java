package Exercicios;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um número");
        int numero = scanner.nextInt();

        System.out.println("Entre com um limite");
        int limite = scanner.nextInt();

        for (int i = numero; i <= limite ; i++) {
            //primeiro numero divisível por 7
            if (i % 7 == 0) {
                System.out.println("O numero de divisível por 7 é: " + i);
                break;
            }
        }
    }
}
