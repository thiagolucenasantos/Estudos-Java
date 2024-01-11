package Exercicios;

import java.util.Scanner;

/**
 * Faça um programa que aceite o nome de usuário e senha, porém não aceite a senha
 * o nome de usuário, mostrando uma mensagem de erro e voltando a pedir a senha
 */

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String senha;

        boolean informacoesValidas = false;
        do {
            System.out.println("Digite seu nome de usuário");
            nome = scanner.next();
            System.out.println("Entre com a senha!");
            senha = scanner.next();

            if (nome.equals(senha)){
                informacoesValidas = false;
                System.out.println("Senha não confere!!");
            }else {
                informacoesValidas = true;
                System.out.println("Seja bem vindo!!");
            }
        }while (!informacoesValidas);
    }
}
