package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 76;
        professor.sexo = 'M';

        System.out.println("Nome: "+professor.nome);
        System.out.println("Idade: "+professor.idade);
        System.out.println("Sexo: "+professor.sexo);
    }
}
