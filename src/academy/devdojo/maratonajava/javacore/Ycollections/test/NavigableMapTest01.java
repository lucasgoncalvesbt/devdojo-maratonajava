package academy.devdojo.maratonajava.javacore.Ycollections.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String,String> map = new TreeMap<>();
        map.put("A", "LetraA");
        map.put("E", "LetraA");
        map.put("D", "LetraA");
        map.put("B", "LetraA");
        map.put("C", "LetraA");

        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        System.out.println(map.headMap("C", true));
    }
}
