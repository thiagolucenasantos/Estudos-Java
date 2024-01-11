import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {

        int i = 1;
        int max = 10;

        System.out.println("Contando até " + max);
//primeiro avalia a expressão depois executa o código
        while (i <= max){
            System.out.println("Valor de i: " + i);
            i++;
        }
        //primeiro faz o primeiro bloco de código, depois avalia a condição do while
        do {
            i++;
            System.out.println("Valor de i: " + i);
        }while (i < 15);
            System.out.println("Valor de i: " + i);

    }
}