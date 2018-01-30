package ru.job4j2.prof;

public class Teacher extends Profession {

    private String teachType;
    Teacher (String name, int years, String teachType){
        this.name = name;
        this.years = years;
        this.teachType = teachType;
    }

    Knoledge teach(Student student){
        Knoledge knoledge = new Knoledge();
        knoledge.iQ = 10 * years;
        knoledge.studType = student.getName()+" + " + teachType + " ready to work";
        return knoledge;
    }
}
