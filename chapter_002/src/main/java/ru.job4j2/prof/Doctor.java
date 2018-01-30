package ru.job4j2.prof;

public class Doctor extends Profession {

    private String healType;

    Doctor (String name, int years, String healType) {
        this.name = name;
        this.years = years;
        this.healType = healType;
    }

    Diagnose heal(Patient patient) {
        Diagnose diagnose = new Diagnose();
        diagnose.drug = patient.getName() + healType;
        diagnose.type = "" + patient.age * 3;
        return diagnose;
    }

}
