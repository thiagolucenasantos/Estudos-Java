package Exercicios;

import java.util.Scanner;

/**
 * Digite 2 núeros e mostre o maior numero entre eles
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        int num2;

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o numero");
            num1 = scanner.nextInt();

            System.out.println("Digite o numero");
            num2 = scanner.nextInt();

            if (num1 > num2) {
                System.out.println("O maior numero digitado é: " + num1);
            }else {
                System.out.println("O maior numero digitado é: " + num2);
            }
        }
    }
}