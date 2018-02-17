package ru.job4j2.prof;

public class EngineData {
    private String name;
    public int power;
    EngineData (String name, int power){
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }
}
