package ListaExercicios;

import java.util.Scanner;

/**
 * Leia duas notas de um aluno
 * Calcular a média se for maior ou igual a 7 retornar aprovado
 * Reprovado se for menor que 7
 * Aprovado com distinção se for igual a 10
 */
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        int nota1 = scanner.nextInt();
        System.out.println("Digite a segunda nota");
        int nota2 = scanner.nextInt();

        Integer somatoria = (nota1 + nota2) / 2;

        if (somatoria > 10){
            System.out.println("Por favor digite sua nota entre 0 e 10");
        } else if (somatoria == 10){
            System.out.println("Media: "+ somatoria + " Aprovado com distinção");
        } else if (somatoria >= 7) {
            System.out.println("Media: "+ somatoria + " Aprovado");
        } else  {
            System.out.println("Media: "+ somatoria + " Reprovado");
        }


    }
}
