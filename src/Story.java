import Location.*;
import Person.*;
import Enums.*;
import EquipmenAndElectronics.*;


import java.util.ArrayList;

public class Story{
    public static void main(String[] args) {
        Location location = new Location("Гостиница");
        Location location1 = new Location("Улица");
        Location room1 = new Location("Вестибюль гостиницы");
        Location room2 = new Location("Коридор");
        Location room3 = new Location("Номер");
        Location room4 = new Location("Гостиные к своим экранам");
        ArrayList<Location> room = new ArrayList<>();
        room.add(room1);
        room.add(room2);
        room.add(room3);
        room.add(room4);

        Member member = new Member("Незнайка и его друзья", null, location1);
        member.setMemberOfTheTravelGroup("Незнайка");
        member.setMemberOfTheTravelGroup("Козлик");
        member.setMemberOfTheTravelGroup("Пончик");
        member.setMemberOfTheTravelGroup("Чел");

        Camera camera = new Camera("Камера на колесиках",true, true);

        Wire wire = new Wire(WireAppearance.FAT, true);

        HotelOwner hotelOwner = new HotelOwner("Мистер Хапс", "Владелец", ShapeType.FAT, location);

        Clothes thing1 = new Clothes("Костюм", Color.BLUE);
        Clothes thing2 = new Clothes("Галстук", Color.RED);
        ArrayList<Clothes> typeOfClothes = new ArrayList<>();
        typeOfClothes.add(thing1);
        typeOfClothes.add(thing2);

        LunarViewer lunarViewer = new LunarViewer("Лунные зрители", null, room4);
        lunarViewer.setLunarMember(MemberOfTheLunarViewers.BANKER);
        lunarViewer.setLunarMember(MemberOfTheLunarViewers.HOUSEWIFE);

       if(member.getMemberOfTheGroupSize() == 0 ){
            System.out.println("Никто не приехал");
            System.exit(1);
       }
       member.movement(room, 0);
       member.viewing(camera.getName());

       wire.wireLie(camera, room, 1);

       hotelOwner.movement(member, room, 0, hotelOwner.getShape(), wire, location);
       hotelOwner.dressed(typeOfClothes, hotelOwner);
       hotelOwner.greeting(hotelOwner.getShape(), member, wire);
       hotelOwner.movement(member, room, 2, hotelOwner.getShape(), wire);

       member.movement(room, 2);

       hotelOwner.showRoom(member);

       lunarViewer.movement(room, 3);
       lunarViewer.viewing(camera, member, hotelOwner);
    }
}