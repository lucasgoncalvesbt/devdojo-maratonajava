package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {

    public static void main(String[] args) {

        int idade = 15;

        boolean isAutorizado = idade >= 18;
        if(isAutorizado) {
            System.out.println("Autorizado");
        }

        if(!isAutorizado) {
            System.out.println("Não autorizado");
        }

        System.out.println("Fora do if");

    }

}
