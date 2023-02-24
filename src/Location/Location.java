package Location;

import java.util.Objects;

public class Location{
    private final String locationName;

    public Location(String locationName){
        this.locationName = locationName;
    }

    @Override
    public String toString(){
        return this.locationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return Objects.equals(locationName, location.locationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationName);
    }
}
