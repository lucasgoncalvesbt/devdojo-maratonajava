package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("111C1", "Samsumg");
        Smartphone s2 = new Smartphone("444C1", "iPhone");
        Smartphone s3 = new Smartphone("33BC1", "Xiaomi");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);

        for(Smartphone smartphone : smartphones){
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("555B1", "Pixel");
        smartphones.add(s4);

        System.out.println(smartphones.contains(s4));

        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexSmartphone4));
    }
}
