package EquipmenAndElectronics;

import Enums.WireAppearance;
import Location.*;

import java.util.ArrayList;
import java.util.Objects;

public class Wire{
    private final WireAppearance appearance;
    private final boolean availability;
    public Wire(WireAppearance appearance, boolean availability){
        this.appearance = appearance;
        this.availability = availability;
    }
    public boolean getAvailability(){
        return availability;
    }
    public void wireLie(Camera camera, ArrayList<Location> room, int a){
            switch (appearance){
                case FAT -> System.out.println("Тольстый черный провод тянулся от " + camera.getName() + " по полу и исчезал в глубине " + room.get(a).toString());
                case THIN -> System.out.println( "Тонкий черный провод тянулся от " + camera.getName() + " по полу и исчезал в глубине " + room.get(a).toString());
                case AVERAGE -> System.out.println( "Черный провод тянулся от " + camera.getName() + " по полу и исчезал в глубине " + room.get(a).toString());
            }
    }

    @Override
    public String toString(){
        return "провод";
    }
    public WireAppearance getAppearance(){
        return appearance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wire wire = (Wire) o;
        return availability == wire.availability && appearance == wire.appearance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(appearance, availability);
    }
}