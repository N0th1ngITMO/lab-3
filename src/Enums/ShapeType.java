package Enums;

import Interfaces.Nameble;

public enum ShapeType implements Nameble{
    FAT("Толстый"), SPORT("Спортивный"), SKINNY("Худощавый");

    private final String name;

    ShapeType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
