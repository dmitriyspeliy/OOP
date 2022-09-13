package ru.skyPro.faculties;

import ru.skyPro.Hogwarts;

public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int powerOfMagic, int powerOfTransgressions, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfMagic, powerOfTransgressions);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public String showFacultyQuality() {
        return "\nКачества, присущие студенту Слизерина:\n" + "Хитрость: " + getCunning() + "\n" + "Решительность: " + getDetermination() + "\n" + "Амбициозность: " + getAmbition() + "\n" + "Находчивость: " + getResourcefulness() + "\n" + "Жажда власти: " + getLustForPower();
    }

    public String showStudent() {
        return "Студент " + this.getName() + "\n" + showCommonQuality() + showFacultyQuality();
    }

    public int sumOfFacultyQuality() {
        return this.getAmbition() + this.getCunning() + this.getLustForPower() + this.getDetermination() + this.getResourcefulness();
    }

    public String compareStudentOfSlyth(Slytherin stud) {
        String result;
        if (stud.sumOfFacultyQuality() < this.sumOfFacultyQuality()) {
            result = String.format("%s лучший Слизеренец,чем %s", this.getName(), stud.getName());
        } else {
            result = String.format("%s лучший Слизеренец,чем %s", stud.getName(), this.getName());
        }
        return result;
    }
}
