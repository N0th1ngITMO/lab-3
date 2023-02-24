package Person;

import Enums.ShapeType;
import Enums.WireAppearance;
import Location.Location;
import EquipmenAndElectronics.*;

import java.util.ArrayList;
import java.util.Objects;

public class HotelOwner extends Person{
    private Location space;
    private final ArrayList<Clothes> typeOfClothes = new ArrayList<>();

    public HotelOwner(String name, String officePost, ShapeType shape, Location space) {
        super(name, shape, space);
    }

    public void movement(Member member, ArrayList<Location> room, int a, ShapeType shape, Wire wire, Location location) {
        space = member.getSpace();
        if (space.equals(room.get(a)) && wire.getAppearance() == WireAppearance.FAT) {
            switch (shape) {
                case FAT -> {
                    System.out.println(shape.getName() + " коротышка, запыхавшись, уже шел навстречу " + member.getName() + ", но неожиданно споткнулся о " + wire.toString() + " и сильно ударился рукой");
                }
                case SKINNY -> {
                    System.out.println(shape.getName() + " мужичок быстрым шагом шел навстречу" + member.getName());
                }
                case SPORT -> {
                    System.out.println(shape.getName() + " мужчина уже бежал навстречу" + member.getName());
                }
            }
        }else if(room.get(a).toString().equals(getSpace().toString()) && wire.getAppearance() != WireAppearance.FAT){
            switch (shape) {
                case FAT -> {
                    System.out.println(shape.getName() + " коротышка, запыхавшись, уже шел навстречу " + member.getName());
                }
                case SKINNY -> {
                    System.out.println(shape.getName() + " мужичок быстрым шагом шел навстречу" + member.getName());
                }
                case SPORT -> {
                    System.out.println(shape.getName() + " мужчина уже бежал навстречу" + member.getName());
                }
            }
        }else if(!room.get(a).toString().equals(getSpace().toString())){
            System.out.println(toString() + " потерялся в своем(-ей) " + location.toString());
            System.out.println(member.getName() + "это непонравилось, они ушли в другой(-ую)" + location.toString());
            System.exit(1);
        }
        setSpace(room.get(a));
    }
    public void movement(Member member, ArrayList<Location> room, int a, ShapeType shape, Wire wire) {
        setSpace(room.get(a));
        if (wire.getAppearance() == WireAppearance.FAT) {
            switch (shape) {
                case FAT -> {
                    System.out.println(getName() + ", немного кряхтя от дискомфорта в руке,  пришел в " + room.get(a));
                }
                case SKINNY, SPORT -> {
                    System.out.println(getName() + " пришел в " + room.get(a));
                }
            }
        }else{
            System.out.println(getName() + " пришел в " + room.get(a));
        }
    }

    public void greeting(ShapeType shape, Member member, Wire wire) {
        if (wire.getAppearance() == WireAppearance.FAT) {
            switch (shape) {
                case FAT -> System.out.println("Из-за сильной боли в руке и чувства невероятного стыда, не пожал " + member.getName() + " руки, а просто неловно улыбнулся");
                case SPORT -> System.out.println("Поклонился " + member.getName() + " практически до лунного грунта");
                case SKINNY -> System.out.println("Еле заметно, но грациозно поклонился " + member.getName());
            }
        } else {
            switch (shape) {
                case FAT -> System.out.println("Неуклюже поклонился " + member.getName());
                case SPORT -> System.out.println("Поклонился " + member.getName() + " практически до лунного грунта");
                case SKINNY -> System.out.println("Еле заметно, но грациозно поклонился " + member.getName());
            }
        }
    }
    public void dressed(ArrayList<Clothes> typeOfClothes, HotelOwner hotelOwner) {
        System.out.print(hotelOwner.getName() + ", так звали " + hotelOwner.toString() + ", был одет в ");
        for (int i = 0; i < typeOfClothes.size(); i++) {
            if (i + 1 == typeOfClothes.size()) {
                System.out.println(typeOfClothes.get(i).getColor() + " " + typeOfClothes.get(i).getName());
            } else {
                System.out.print(typeOfClothes.get(i).getColor() + " " + typeOfClothes.get(i).getName() + ", ");
            }
        }
    }
    public void showRoom(Member member){
        System.out.println(getName() + " показывает " + getSpace() + " "+ member.getName());
    }
    public String toString(){
        return "Владелец гостиницы";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelOwner that = (HotelOwner) o;
        return Objects.equals(space, that.space) && Objects.equals(typeOfClothes, that.typeOfClothes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(space, typeOfClothes);
    }
}

