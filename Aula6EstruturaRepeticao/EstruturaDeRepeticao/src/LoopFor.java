public class LoopFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++){
            System.out.println("Valor de i: " + i);
        }
        for (int i = 0, j = 5; i <= j; i++, j-- ){
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
