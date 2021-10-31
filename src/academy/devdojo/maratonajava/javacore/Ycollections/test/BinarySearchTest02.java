package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaById mangaById = new MangaById();
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1L,"Naruto,", 20.1));
        mangas.add(new Manga(5L,"One Piece",15.7));
        mangas.add(new Manga(3L,"Dragon Ball",27.4));
        mangas.add(new Manga(2L,"Death Note",19.6));
        mangas.add(new Manga(4L,"Bleach",30.8));

        //Collections.sort(mangas);
        mangas.sort(mangaById);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(4L, "Bleach", 30.8);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaById));
    }
}
