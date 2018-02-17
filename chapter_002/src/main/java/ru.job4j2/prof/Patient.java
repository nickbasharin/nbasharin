package ru.job4j2.prof;

public class Patient {
    private String name;
    public int age;

    Patient (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
