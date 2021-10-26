package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome = "Luffy";
        estudante1.idade = 21;
        estudante1.sexo = 'M';

        estudante2.nome = "Nami";
        estudante2.idade = 23;
        estudante2.sexo = 'F';

        impressora.imprime(estudante1);
        System.out.println("---------------------------------");
        impressora.imprime(estudante2);


    }
}
