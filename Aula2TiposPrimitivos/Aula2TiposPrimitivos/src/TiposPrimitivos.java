public class TiposPrimitivos {
    public static void main(String[] args) {

        /**
         * Tipos Primitivos
         * int, double, float, char, byte, short, long, boolean
         */

        int idade = 10;
        byte idade1 = 30;
        short idade2 = 20;
        double salario = 3800;
        double salariao1 = 2000;
        float salario2 = 1000;
        long salario3 = 200000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u8841';//código da tabela unicode

        //FAZENDO UM CAST, BASICAMENTE COLOCAR VALORES QUE O TIPO PRIMITIVO NÃO SUPORTA
        float cast = (float) 24456555666777888.90F;

        System.out.println("A idade é "+ idade + " anos.");
        System.out.println(cast);// a impressão não sairá como deveria porque o cast não comporta
    }
}