package ru.skyPro;

import ru.skyPro.faculties.Gryffindor;
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

        System.out.println(malfoy.showStudent());
        System.out.println(harry.compareStudentOfGriff(germiona));
        System.out.println(malfoy.compareStudents(harry));


    }
}
