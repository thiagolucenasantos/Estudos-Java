/**
 * Modos de inicializar arrays multidimensionais
 */

public class Arrays4 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};

        int[][] arrayInt = new int[2][];

        arrayInt[0] = array;
        arrayInt[1] = new int[]{4, 5, 6};

        for (int[] arrayBase: arrayInt){
            System.out.println("\n--------");
            for (int num: arrayBase){
                System.out.print(num);
            }
        }


    }
}
