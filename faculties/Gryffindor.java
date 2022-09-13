package ru.skyPro.faculties;

import ru.skyPro.Hogwarts;

public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String name,int powerOfMagic, int powerOfTransgressions, int nobility, int honor, int courage) {
        super(name,powerOfMagic, powerOfTransgressions);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public String showFacultyQuality(){
        return "\nКачества, присущие студенту Грифендора:\n" +
                "Благородство: " + getNobility()+"\n" +
                "Честь: " + getHonor() + "\n" +
                "Храбрость: " + getCourage();
    }

    public String showStudent(){
        return "Студент " + this.getName() + "\n" + showCommonQuality() + showFacultyQuality();
    }

    public int sumOfFacultyQuality(){
        return this.getNobility() + this.getHonor() + this.getCourage();
    }

    public String compareStudentOfGriff(Gryffindor stud){
        String result;
        if(stud.sumOfFacultyQuality()<this.sumOfFacultyQuality()){
            result = String.format("%s лучший Гриффиндорец,чем %s",this.getName(),stud.getName());
        }else {
            result = String.format("%s лучший Гриффиндорец,чем %s",stud.getName(),this.getName());
        }
        return result;
    }

}
