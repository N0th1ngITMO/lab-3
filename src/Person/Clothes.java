package Person;

import Enums.Color;
import Interfaces.Nameble;

import java.util.Objects;

public class Clothes implements Nameble {
    private final String name;
    private final Color color;
    public Clothes(String name, Color color){
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color.getName();
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return Objects.equals(name, clothes.name) && color == clothes.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color);
    }
}