package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1L,"Naruto,", 20.1,4));
        mangas.add(new Manga(5L,"One Piece",15.7,0));
        mangas.add(new Manga(3L,"Dragon Ball",27.4,3));
        mangas.add(new Manga(2L,"Death Note",19.6,2));
        mangas.add(new Manga(4L,"Bleach",30.8,0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            Manga manga = mangaIterator.next();
//            if(manga.getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
