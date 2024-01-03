package ListaExercicios;

import java.util.Scanner;

/**
 * Faça um programa que peça dois números e imprima o maior deles
 */

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        int numero2 = scanner.nextInt();


        if (numero1 > numero2){
            System.out.println("O maior numero é: " + numero1);
        }else {
            System.out.println("O maior numero é: " + numero2);
        }
    }
}
