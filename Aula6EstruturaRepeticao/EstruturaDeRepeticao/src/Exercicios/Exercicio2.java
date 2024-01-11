package Exercicios;

import java.util.Scanner;

/**
 * Faça um programa que leia e valide as seguintes informações
 * Nome: maior que 3 caracteres
 * Idade: entre 0 e 100;
 */
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean infoValida = false;
        String nome;
        int idade;

        do {
            System.out.println("Entre com o nome");
            nome = scanner.next();
            if (nome.length() > 3) {
                infoValida = true;
            } else {
                System.out.println("Nome precisa no mínimo 3 caracteres");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Entre com a idade");
            idade = scanner.nextInt();
            if (idade >= 0 && idade <= 100) {
                infoValida = true;
            } else {
                System.out.println("Digite uma idade entre 0 e 100");
            }

        } while (!infoValida);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
