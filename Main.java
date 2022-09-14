package ru.skyPro;

import ru.skyPro.faculties.Gryffindor;
import ru.skyPro.faculties.Hufflepuff;
import ru.skyPro.faculties.Ravenclaw;
import ru.skyPro.faculties.Slytherin;

public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер",34,30,
                40,60,100);
        Gryffindor germiona = new Gryffindor("Гермиона Гренчжер",
                50,80,
                40,50,60);

        Slytherin malfoy = new Slytherin("Дарко малфой",31,30,
                40,60,100,100, 100);

        Hufflepuff smith = new Hufflepuff(" Захария Смит",41,21,30,60,90);

        Ravenclaw chang = new Ravenclaw("Чжоу Чанг",41,10,80,100,12,92);

        System.out.println(malfoy.showStudent());
        System.out.println(harry.compareStudentOfGriff(germiona));
        System.out.println(malfoy.compareStudents(harry));
        System.out.println(smith.showStudent());
        System.out.println(chang.compareStudents(smith));


    }
}
