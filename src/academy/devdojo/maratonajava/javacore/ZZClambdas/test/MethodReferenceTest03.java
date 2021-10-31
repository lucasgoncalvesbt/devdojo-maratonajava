package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;


public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String > nomes = new ArrayList<>(List.of("Luffy" ,"Kuririn", "Goku"));
        nomes.sort(String::compareTo);
        System.out.println(nomes);

        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer num = numStringToInteger.apply("10");

        System.out.println(num);

        BiPredicate<List<String>, String> checkName = (list, name) -> list.contains(name);
        BiPredicate<List<String>, String> checkNameMR = List::contains;

        System.out.println(checkNameMR.test(nomes, "Goku"));
    }
}
