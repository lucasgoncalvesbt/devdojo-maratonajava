package academy.devdojo.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        List<String> nomes2 = new ArrayList<>();

        nomes.add("Lucas");
        nomes.add("banana");
        nomes2.add("Lucasaasda");
        nomes2.add("bananaasdfa");

        nomes.addAll(nomes2);

        for(String nome : nomes) {
            System.out.println(nome);
        }

        nomes.add("Suane");
        System.out.println("-------------");

        nomes.forEach(s -> System.out.println(s));
    }
}
