package edu.hogwarts;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        Application app = new Application();
        app.initApp();
    }

    public void initApp() {
        List<Student> students = new ArrayList<>();
        List<Teacher> teachers = new ArrayList<>();

        //*******************STUDENTS***********************//
        // Gryffindor
        students.add(new Student("Harry", null, "Potter", 1991, 1998, true));
        students.add(new Student("Ron", null, "Weasley", 1991, 1998, true));
        students.add(new Student("Hermione", null, "Granger", 1991, 1998, true));

        // Ravenclaw
        students.add(new Student("Luna", null, "Lovegood", 1991, 1998, true));
        students.add(new Student("Cho", null, "Chang", 1991, 1998, true));

        // Slytherin
        students.add(new Student("Draco", null, "Malfoy", 1991, 1998, true));
        students.add(new Student("Pansy", null, "Parkinson", 1991, 1998, true));

        // Hufflepuff
        students.add(new Student("Cedric", null, "Diggory", 1991, 1998, true));
        students.add(new Student("Nymphadora", null, "Tonks", 1991, 1998, true));

        // Student information
        for (Student student : students) {
            System.out.println(student);
        }

        //*******************TEACHERS***********************//
        var slytherin = new House("Slytherin", "Salazar Slytherin", new String[]{"Green", "Silver"});

        teachers.add(new HogwartsTeacher("Horace", "Slughorn", null, "Potions Professor",
                LocalDate.of(1996, 9, 1), null, slytherin, false));


        teachers.add(new HogwartsTeacher("Severus", "Snape", null, "Potions Professor",
                LocalDate.of(1981, 9, 1), null, slytherin, true));


        //Teacher information
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
    }
