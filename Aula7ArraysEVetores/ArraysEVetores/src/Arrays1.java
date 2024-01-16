public class Arrays1 {
    public static void main(String[] args) {
        // array sempre precisa ser inicializado, mostrando a quantidade de posições disponíveis na memória
       //tipo references do lado esquerdo e do lado direito inicializando o objeto
        int[] idade = new int[3];
        idade[0] = 20;
        idade[1] = 40;
        idade[2] = 70;

        //for que interage com o array e retorna o tamanho dele automaticamente
        for (int i = 0; i < idade.length; i++) {
            System.out.println(idade[i]);
        }
    }
}
