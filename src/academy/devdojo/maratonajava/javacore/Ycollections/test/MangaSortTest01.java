package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaById  implements Comparator<Manga> {

    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1L,"Naruto,", 20.1));
        mangas.add(new Manga(5L,"One Piece",15.7));
        mangas.add(new Manga(3L,"Dragon Ball",27.4));
        mangas.add(new Manga(2L,"Death Note",19.6));
        mangas.add(new Manga(4L,"Bleach",30.8));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---------------");

        Collections.sort(mangas);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---------------");

        Collections.sort(mangas, new MangaById());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
