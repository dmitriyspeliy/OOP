package ru.skyPro.faculties;

import ru.skyPro.Hogwarts;

public class Hufflepuff extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Hufflepuff(String name, int powerOfMagic, int powerOfTransgressions, int hardworking, int loyal, int honest) {
        super(name, powerOfMagic, powerOfTransgressions);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public String showFacultyQuality() {
        return "\nКачества, присущие студенту Пуффендуя:\n" + "Трудолюбие: " + getHardworking() + "\n" + "Верность: " + getLoyal() + "\n" + "Честь: " + getHonest();
    }

    public String showStudent() {
        return "Студент " + this.getName() + "\n" + showCommonQuality() + showFacultyQuality();
    }

    public int sumOfFacultyQuality() {
        return this.getHardworking() + this.getHonest() + this.getLoyal();
    }


    public String compareStudentOfHuff(Hufflepuff stud) {
        String result;
        if (stud.sumOfFacultyQuality() < this.sumOfFacultyQuality()) {
            result = String.format("%s лучший Пуфендуец,чем %s", this.getName(), stud.getName());
        } else {
            result = String.format("%s лучший Пуфендуец,чем %s", stud.getName(), this.getName());
        }
        return result;
    }

}
