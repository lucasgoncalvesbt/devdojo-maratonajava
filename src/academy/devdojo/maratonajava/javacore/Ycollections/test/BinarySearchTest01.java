package academy.devdojo.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(7);
        numeros.add(5);

        Collections.sort(numeros);

        System.out.println(Collections.binarySearch(numeros, 0));
        System.out.println(Collections.binarySearch(numeros, 1));
    }
}
