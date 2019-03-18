package exercise5;

import java.util.Objects;

public class Bus {
    private String numberSeats;
    private String engineСapacity;

    Bus(String numberSeats, String engineСapacity){
        this.numberSeats = numberSeats;
        this.engineСapacity = engineСapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return Objects.equals(numberSeats, bus.numberSeats) &&
                Objects.equals(engineСapacity, bus.engineСapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberSeats, engineСapacity);
    }
}
