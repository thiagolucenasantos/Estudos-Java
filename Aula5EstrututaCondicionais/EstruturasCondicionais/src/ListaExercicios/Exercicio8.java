package ListaExercicios;

import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o salario");

        double salario = scanner.nextDouble();
        int percentual = 0;

        if (salario <= 280) {
            percentual = 20;
        } else if (salario > 280 && salario < 700) {
            percentual = 15;
        } else if (salario > 700 && salario < 1500) {
            percentual = 10;
        } else if (salario > 1500) {
            percentual = 5;
        }
        double aumento = (salario / 100) * percentual;
        double salarioAjustado = salario + aumento;
        System.out.println("Salario: " + salario);
        System.out.println("Percentual: " + percentual);
        System.out.println("Aumento: " + percentual);
        System.out.println("Salario ajustado: " + salarioAjustado);

    }
}