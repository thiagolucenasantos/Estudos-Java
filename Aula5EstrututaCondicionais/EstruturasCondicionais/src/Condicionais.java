public class Condicionais {
    public static void main(String[] args) {

        int idade = 17;
        String categoria;
        if (idade < 15){
            categoria = "Categoria juvenil.";
        } else if (idade >=15 && idade <=18) {
            categoria = "Categoria Juvenil";
        }else{
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);

    }
}