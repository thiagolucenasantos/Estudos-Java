package ListaExercicios;

import java.util.Scanner;

/**
 * Verifique se a letra digitada é vogalou consoante
 */

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma consoante");
        String letra = scanner.next();

        if (letra.length() > 1){
            System.out.println("Digite apenas uma letra");
        }else {
            switch (letra){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("É uma consoante");break;
                default:
                    System.out.println("Não é uma consoante");
            }
        }

    }
}
