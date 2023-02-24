package Person;

import Enums.ShapeType;
import Interfaces.Nameble;
import Location.*;

public abstract class Person implements Nameble {
    private String name;
    private ShapeType shape;
    private Location space;
    public Person(String name, ShapeType shape, Location space){
        this.name = name;
        this.shape = shape;
        this.space = space;
    }
    public Person(){}

    public String getName() {
        return this.name;
    }

    public ShapeType getShape() {
        return shape;
    }

    public Location getSpace() {
        return space;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShape(ShapeType shape) {
        this.shape = shape;
    }

    public void setSpace(Location space) {
        this.space = space;
    }
}

