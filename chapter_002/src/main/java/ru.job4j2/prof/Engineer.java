package ru.job4j2.prof;

public class Engineer extends Profession {

    private String engineeringType;

    Engineer(String name, int years, String engineeringType) {
        this.name = name;
        this.years = years;
        this.engineeringType = engineeringType;
    }

    Engine engineering(EngineData engineData) {
        Engine engine = new Engine();
        engine.price = engineData.power * 10;
        return engine;
    }

}
