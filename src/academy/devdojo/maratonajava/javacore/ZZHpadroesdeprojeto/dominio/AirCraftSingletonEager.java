package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AirCraftSingletonEager {
    private static final AirCraftSingletonEager INSTANCE = new AirCraftSingletonEager("787-900");
    private final Set<String> avaibleSeats = new HashSet<>();
    private final String name;

    private AirCraftSingletonEager(String name) {
        this.name = name;
    }

    {
        avaibleSeats.add("1A");
        avaibleSeats.add("1B");
    }

    public static AirCraftSingletonEager getINSTANCE() {
        return INSTANCE;
    }

    public boolean bookSeat(String seat) {
        return avaibleSeats.remove(seat);
    }

}
