package ListaExercicios;

import java.util.Scanner;

/**
 * Digite o período M, V, N e retorne bom dia, boa tarde e boa noite
 */

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o período que você estuda, M, V ou N");
        String turno = scanner.next();
        if (turno.equalsIgnoreCase("M")){
            System.out.println("Bom dia");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa tarde");
        }else if (turno.equalsIgnoreCase("N")){
            System.out.println("Boa noite");
        }else {
            System.out.println("Digite um período válido");
        }
    }
}
