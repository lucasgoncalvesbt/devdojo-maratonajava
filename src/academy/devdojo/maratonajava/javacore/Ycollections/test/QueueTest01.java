package academy.devdojo.maratonajava.javacore.Ycollections.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("Maria");
        fila.add("João");
        fila.add("José");
        fila.add("Pedro");

        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
    }
}
