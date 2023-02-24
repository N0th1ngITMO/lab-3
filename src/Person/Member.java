package Person;

import Enums.ShapeType;
import Interfaces.Moving;
import Location.*;
import java.util.ArrayList;
import java.util.Objects;

public class Member extends Person implements Moving {
    private final String name;
    private final Location space;
    private final ArrayList<String> MemberOfTheTravelGroup = new ArrayList<>();

    public Member(String name, ShapeType shape, Location space) {
        super(name, shape, space);
        this.name = name;
        this.space = space;
    }

    public void setMemberOfTheTravelGroup(String MemberOfTheTravelGroup) {
        this.MemberOfTheTravelGroup.add(MemberOfTheTravelGroup);
    }

    public int getMemberOfTheGroupSize() {
        return this.MemberOfTheTravelGroup.size();
    }

    public void getMember(int index) {
        System.out.println(MemberOfTheTravelGroup.get(index));
    }

    public void movement(ArrayList<Location> room, int a) {
        System.out.println(this.name + " пришли в " + room.get(a).toString());
        setSpace(room.get(a));
    }

    public void viewing(String object) {
        System.out.println(this.name + " заметили " + object);
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(name, member.name) && Objects.equals(space, member.space) && Objects.equals(MemberOfTheTravelGroup, member.MemberOfTheTravelGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, space, MemberOfTheTravelGroup);
    }
}



