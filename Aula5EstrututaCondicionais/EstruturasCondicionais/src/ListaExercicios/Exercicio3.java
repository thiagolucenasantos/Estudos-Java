package ListaExercicios;

import java.util.Scanner;

/**
 * Verifique se o sexo é M masculino ou F feminino ou inválido
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite M para masculino ou F para feminino");
        String sexo = scanner.next();
        switch (sexo){
            case "M":
                System.out.println("Masculino");break;
            case "F":
                System.out.println("Feminino");break;
            default:
                System.out.println("Sexo Inválido");
        }
    }
}
