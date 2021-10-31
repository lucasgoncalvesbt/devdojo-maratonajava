package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());

        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(1L,"Naruto,", 20.1,4));
        mangas.add(new Manga(5L,"One Piece",15.7,0));
        mangas.add(new Manga(3L,"Dragon Ball",27.4,3));
        mangas.add(new Manga(2L,"Death Note",19.6,2));
        mangas.add(new Manga(4L,"Bleach",30.8,0));
        mangas.add(new Manga(4L,"Bleach",30.8,0));

        mangas.descendingSet().forEach(System.out::println);

        Manga yuyu = new Manga(21L, "yuyu", 20.1, 4);
        System.out.println("--------------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());

    }
}
