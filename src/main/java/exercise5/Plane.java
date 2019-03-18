package exercise5;

import java.util.Objects;

public class Plane {
    private String numberSeats;
    private String engineСapacity;

    Plane(String numberSeats, String engineСapacity){
        this.numberSeats = numberSeats;
        this.engineСapacity = engineСapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return Objects.equals(numberSeats, plane.numberSeats) &&
                Objects.equals(engineСapacity, plane.engineСapacity);
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
