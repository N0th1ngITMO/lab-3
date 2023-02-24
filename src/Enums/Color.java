package Enums;

import Interfaces.Nameble;

public enum Color implements Nameble {
     WHITE("Белый"), RED("Красный"), BLUE("Синий"), BLACK("Черный"), GREEN("Зеленый"), YELLOW("Желтый");

     private final String name;
     Color(String name){
          this.name = name;
     }

     public String getName(){
          return name;
     }
}

