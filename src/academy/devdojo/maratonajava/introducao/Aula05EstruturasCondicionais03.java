package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {

    public static void main(String[] args) {

        double salary = 6000;
        String mensagemDoar = "Eu vou doar 500 reais pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições";

        String resultado = salary > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }

}
