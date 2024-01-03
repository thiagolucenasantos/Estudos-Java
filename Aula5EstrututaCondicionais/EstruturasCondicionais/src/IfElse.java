import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com sua idade");
        int idade = scanner.nextInt();

        if (idade >= 18){
            System.out.println("Maior de Idade");
        }else {
            System.out.println("Não é maior de idade");
        }

        System.out.println("Entre com o valor do produto");
        double valor = scanner.nextDouble();
        if (valor <= 10){
            System.out.println("Está barato");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Pedir desconto");            
        } else if (valor >= 15 && valor <17) {
            System.out.println("Pode pesquisar mais");
        }else { // valor maior que 17, não precisa deixar explicito a condição
            System.out.println("Caríssimo");
        }
    }
}
