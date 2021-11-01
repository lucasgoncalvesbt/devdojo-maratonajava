package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person person = Person.PersonBuilder
                .builder()
                .firstName("Lucas")
                .lastName("Gonçalves")
                .userName("ryu")
                .email("lucas@email.com")
                .build();

        System.out.println(person);
    }
}
