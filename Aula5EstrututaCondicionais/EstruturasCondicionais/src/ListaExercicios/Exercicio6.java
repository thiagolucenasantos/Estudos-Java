package ListaExercicios;

import java.util.Scanner;

/**
 * Programa que leia 3 numeros e mostre o maior deles
 */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = scanner.nextInt();
        System.out.println("Digite o terceiro número");
        int num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " :Numero 1 é o maior "  );
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " :Numero 2 é o maior "  );
        }else {
            System.out.println(num3 + " :Numero 3 é o maior "  );
        }

    }
}
