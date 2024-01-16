/**
 * Inicializando um array diretamente
 */

public class Arrays2 {
    public static void main(String[] args) {
        //formas de inicializer um array
        int[] numeros1 = new int[2];
        int[] numeros2 = new int[]{4,3,5,6};
        int[] numeros = {1,2,3,4}; // array de 4 posições


        for (int i = 0; i < numeros.length; i++) {
            System.out.println(i);
        }
        System.out.println("----------------");
        //interassão mais simplificada com o array, através do foreach
        for(int num: numeros2){ //interagindo o array com uma variável local
            System.out.println(num);
        }
    }
}
