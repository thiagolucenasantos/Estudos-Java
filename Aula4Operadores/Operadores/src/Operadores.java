public class Operadores {
    public static void main(String[] args) {
    //+ - * /
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 + numero2;

        System.out.println(resultado);

        //%-resto
        int resto = 28 % 3;
        System.out.println(resto);

        // operadores lógicos
        //< >    <= >=    ==(igual)    !=(diferente)
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);

        double valorContaCorrente = 300;
        double valorContaPoupanca = 5000;
        float valorVideoGame = 4500F;
        boolean compraVideoGame = valorContaCorrente > valorVideoGame || valorContaPoupanca > valorVideoGame;
        System.out.println("Compra video Game: " + compraVideoGame);

        //Atribuição
        //= += -= *= /= %=
        double bonus = 1000;
        bonus += 1000;
        bonus -= 500;
        System.out.println(bonus);


    }
}