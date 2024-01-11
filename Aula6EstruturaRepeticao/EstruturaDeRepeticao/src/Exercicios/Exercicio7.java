package Exercicios;

/**
 * Imprima os 25 números dos 50 lançados
 */
public class Exercicio7 {
    public static void main(String[] args) {
        int valorMaximo = 50;
        for (int i = 0; i <= valorMaximo; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }


}
