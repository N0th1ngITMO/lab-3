package Person;

import Enums.MemberOfTheLunarViewers;
import Enums.ShapeType;
import EquipmenAndElectronics.Camera;
import Interfaces.Moving;
import Location.*;

import java.util.ArrayList;
import java.util.Objects;

public class LunarViewer extends Person implements Moving {
    private final String name;
    private final ArrayList<MemberOfTheLunarViewers> memberOfTheLunarViewer = new ArrayList<>();
    private final Location space;


    public LunarViewer(String name, ShapeType shape, Location space) {
        super(name, shape, space);
        this.name = name;
        this.space = space;
    }

    public void setLunarMember(MemberOfTheLunarViewers obj){
        this.memberOfTheLunarViewer.add(obj);
    }

    public void getMember(int index) {
        System.out.println(memberOfTheLunarViewer.get(index));
    }
    public void viewing(Camera camera, Member member, HotelOwner hotelOwner){
        if (camera.shooting(member, hotelOwner) && memberOfTheLunarViewer.size() != 0){
            System.out.println(getName() + " наблюдают за заселением " + member.getName());
        }else if (memberOfTheLunarViewer.size() == 0){
            System.out.println("Никто не смотрит за заселением " + member.getName());
        }else{
            System.out.println("Телевещание не идет, поэтому никто не смотрит за заселением " + member.getName());
        }
    }

    public void movement(ArrayList<Location> room, int a) {
        System.out.println(this.name + " пришёли в " + room.get(a).toString());
        setSpace(room.get(a));
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LunarViewer that = (LunarViewer) o;
        return Objects.equals(name, that.name) && Objects.equals(memberOfTheLunarViewer, that.memberOfTheLunarViewer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, memberOfTheLunarViewer);
    }

    @Override
    public Location getSpace() {
        return space;
    }
}
