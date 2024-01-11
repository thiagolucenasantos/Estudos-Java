package Exercicios;

public class While {
    public static void main(String[] args) {
        int count = 0;
        while (count < 5){
            System.out.println("Contador: " + count);
            count++;
        }
do {
    System.out.println("Primeira passagem do do");

}while (count < 5);
        System.out.println("Apos o do, agora o while");

    }
}
