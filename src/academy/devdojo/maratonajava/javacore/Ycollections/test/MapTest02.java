package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor c1 = new Consumidor("Pedro");
        Consumidor c2 = new Consumidor("Lucas");

        Manga m1 = new Manga(1L,"Naruto,", 20.1);
        Manga m2 = new Manga(5L,"One Piece",15.7);
        Manga m3 = new Manga(3L,"Dragon Ball",27.4);
        Manga m4 = new Manga(2L,"Death Note",19.6);
        Manga m5 = new Manga(4L,"Bleach",30.8);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(c1, m1);
        consumidorManga.put(c2, m4);

        for(Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }

    }
}
