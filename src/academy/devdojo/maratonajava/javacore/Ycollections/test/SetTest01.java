package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(1L,"Naruto,", 20.1,4));
        mangas.add(new Manga(5L,"One Piece",15.7,0));
        mangas.add(new Manga(3L,"Dragon Ball",27.4,3));
        mangas.add(new Manga(2L,"Death Note",19.6,2));
        mangas.add(new Manga(4L,"Bleach",30.8,0));
        mangas.add(new Manga(4L,"Bleach",30.8,0));

        mangas.forEach(System.out::println);
    }
}
