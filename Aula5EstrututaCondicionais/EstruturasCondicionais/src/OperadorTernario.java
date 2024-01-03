public class OperadorTernario {
    public static void main(String[] args) {
        double salario = 4000.00;
        String doar = "Vou doar";
        String naoDoar = "Não vou doar";

        //sintaxe operador ternário: (condição) ? verdadeiro : falso
        String resultadoDoacao = salario > 5000 ? doar : naoDoar;

        System.out.println(resultadoDoacao);


    }
}
