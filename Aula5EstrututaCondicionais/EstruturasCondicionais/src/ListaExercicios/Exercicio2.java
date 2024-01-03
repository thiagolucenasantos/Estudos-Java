package ListaExercicios;

import java.util.Scanner;

/**
 * Faça um programa que peça um número e mostre na tela se é positivo ou negativo
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scanner.nextInt();

        if (numero >= 0){
            System.out.println("Numero positivo");
        }else {
            System.out.println("Numero negativo");
        }

    }
}
