package ru.skyPro;

public class Hogwarts {
    private int powerOfMagic;
    private int powerOfTransgressions;
    private final String name;

    public Hogwarts(String name, int powerOfMagic, int powerOfTransgressions) {
        this.name = name;
        this.powerOfMagic = powerOfMagic;
        this.powerOfTransgressions = powerOfTransgressions;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getPowerOfTransgressions() {
        return powerOfTransgressions;
    }

    public String getName() {
        return name;
    }

    public void setPowerOfTransgressions(int powerOfTransgressions) {
        this.powerOfTransgressions = powerOfTransgressions;
    }

    public String showCommonQuality() {
        return "Качества, присущие каждому студенту:\n" + "Сила магии: " + getPowerOfMagic() + "\n" + "Расстояние трансгресии: " + getPowerOfTransgressions();
    }

    public int sumOfCommonQuality() {
        return this.getPowerOfMagic() + this.getPowerOfTransgressions();
    }

    public String compareStudents(Hogwarts stud){
        String result;
        if(stud.sumOfCommonQuality()<this.sumOfCommonQuality()){
            result = String.format("%s обладает бОльшей мощностью магии, чем %s",this.getName(),stud.getName());
        }else {
            result = String.format("%s обладает бОльшей мощностью магии, чем %s",stud.getName(),this.getName());
        }
        return result;
    }

}
