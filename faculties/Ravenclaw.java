package ru.skyPro.faculties;

import ru.skyPro.Hogwarts;

public class Ravenclaw extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int fullOfCreativity;

    public Ravenclaw(String name, int powerOfMagic, int powerOfTransgressions, int smart, int wise, int witty, int fullOfCreativity) {
        super(name, powerOfMagic, powerOfTransgressions);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullOfCreativity = fullOfCreativity;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getFullOfCreativity() {
        return fullOfCreativity;
    }

    public void setFullOfCreativity(int fullOfCreativity) {
        this.fullOfCreativity = fullOfCreativity;
    }

    public String showFacultyQuality() {
        return "\nКачества, присущие студенту Когтевранца:\n" + "Ум: " + getSmart() + "\n" + "Мудрость: " + getWise() + "\n" + "Остроумие: " + getWitty() + "\n" + "Творчество: " + getFullOfCreativity();
    }

    public String showStudent() {
        return "Студент " + this.getName() + "\n" + showCommonQuality() + showFacultyQuality();
    }

    public int sumOfFacultyQuality() {
        return this.getFullOfCreativity() + this.getWise() + this.getSmart() + this.getWitty();
    }


    public String compareStudentOfRave(Ravenclaw stud) {
        String result;
        if (stud.sumOfFacultyQuality() < this.sumOfFacultyQuality()) {
            result = String.format("%s лучший Когтевранец,чем %s", this.getName(), stud.getName());
        } else {
            result = String.format("%s лучший Когтевранец,чем %s", stud.getName(), this.getName());
        }
        return result;
    }

}
