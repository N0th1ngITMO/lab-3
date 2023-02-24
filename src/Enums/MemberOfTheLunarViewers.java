package Enums;

import Interfaces.Nameble;

public enum MemberOfTheLunarViewers implements Nameble {
    BANKER("Банкиры"), POLICEMAN("Полицейские"), DOCTOR("Доктора"), HOUSEWIFE("Домохозяйки"), FIREFIGHTER("Пожарные"), POLITICIAN("Политики"), PENSIONER("Пенсионеры");
    private final String name;
    MemberOfTheLunarViewers(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
