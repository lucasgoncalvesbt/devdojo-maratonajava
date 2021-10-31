package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;


public class MethodReferenceTest04 {
    public static void main(String[] args) {

        Supplier<AnimeComparators> newAnimeComparator = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparator.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One piece", 900), new Anime("Naruto", 500)));

        animeList.sort(animeComparators::compareByEpisodesNoStatic);

        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        Anime anime = animeBiFunction.apply("One piece", 900);
    }
}
