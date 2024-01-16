/**
 * Arrays multidimensionais, arrays interligados em outros arrays
 */
public class Arrays3 {
    public static void main(String[] args) {
        //Primeiro array representa os meses
        //Segundo representa a quantidade dos dias que cada mês tem

        int[][] dias = new int[2][2]; //sintaxe do array multidimensional
        dias[0][0] = 20;
        dias[0][1] = 30;


        dias[1][0] = 40;
        dias[1][1] = 50;

        //interando no for o array multimdimensional
        //Onde o i representa a primeiro array e o j o segundo
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
            System.out.println("---------------------");
        //Interando array multidimensionalcom foreach
            for (int[] arrayBase: dias){
                for (int num: arrayBase){
                    System.out.println(num);
                }
            }
        }


    }
}
