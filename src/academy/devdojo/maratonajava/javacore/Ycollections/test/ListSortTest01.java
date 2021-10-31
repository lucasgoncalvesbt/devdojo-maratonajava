package academy.devdojo.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Naruto");
        mangas.add("One Piece");
        mangas.add("Dragon Ball");
        mangas.add("Death Note");
        mangas.add("Bleach");

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.0);
        dinheiros.add(98.0);
        dinheiros.add(26.0);
        dinheiros.add(56.0);

        Collections.sort(mangas);
        for (String manga : mangas) {
            System.out.println(manga);
        }

        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);
    }
}
