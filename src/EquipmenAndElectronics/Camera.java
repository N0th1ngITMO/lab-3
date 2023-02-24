package EquipmenAndElectronics;

import Interfaces.Nameble;
import Person.*;

import java.util.Objects;

public class Camera implements Nameble {
    private final String name;
    private final boolean condition;
    private final boolean availabilityOfAnOperator;
    public Camera(String name, boolean condition, boolean availabilityOfAnOperator){
        this.name = name;
        this.condition = condition;
        this.availabilityOfAnOperator = availabilityOfAnOperator;
    }
    public boolean shooting(Member member, HotelOwner hotelOwner){
        if(this.condition && this.availabilityOfAnOperator){
            System.out.println(name + " снимает " + member.getName() + " и " + hotelOwner.getName());
            return true;
        }else{
            System.out.println(name + "не снимает " + member.getName());
            return false;
        }
    }
    public String getName(){
        if(availabilityOfAnOperator){
            return  name + ", управляемая оператором";
        }else{
            return name;
        }
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Camera camera = (Camera) o;
        return condition == camera.condition && availabilityOfAnOperator == camera.availabilityOfAnOperator && Objects.equals(name, camera.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, condition, availabilityOfAnOperator);
    }
}
