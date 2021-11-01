package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class Aircraft {
    private final Set<String> avaibleSeats = new HashSet<>();

    {
        avaibleSeats.add("1A");
        avaibleSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return avaibleSeats.remove(seat);
    }

}
