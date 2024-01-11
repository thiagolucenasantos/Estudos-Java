package Exercicios;

/**
 * Dado um valor de um carro descubra em quantos ele pode ser parcelado
 * Condição valor parcela >= 1000
 */

public class Exercicio5 {
    public static void main(String[] args) {
        double valorCarro = 30000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorparcela = valorCarro / parcela;
            if (valorparcela < 1000) {
               break;
            } else {
                System.out.println("Parcela " + parcela + " R$ " + valorparcela);
            }
        }
    }
}
