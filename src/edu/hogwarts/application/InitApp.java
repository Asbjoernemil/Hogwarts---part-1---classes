package edu.hogwarts.application;

import edu.generic.Student;
import edu.generic.Teacher;
import edu.hogwarts.data.HogwartsTeacher;
import edu.hogwarts.data.HogwartsStudent;
import edu.hogwarts.data.House;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InitApp {
    private final StudentController studentController;
    private final TeacherController teacherController;

    public InitApp(StudentController studentController, TeacherController teacherController) {
        this.studentController = studentController;
        this.teacherController = teacherController;
    }

    public void init() {
        initStudents();
        initTeachers();
    }

    private void initStudents() {
        List<Student> students = new ArrayList<>();

        // Gryffindor
        var harry = new HogwartsStudent(House.getGryffindor(), false, new String[]{"Quidditch"}, 1991, 1998, false, "Harry James Potter", LocalDate.of(1980, 7, 31));
        var ron = new HogwartsStudent(House.getGryffindor(), false, new String[]{"Chess"}, 1991, 1998, false, "Ron Weasley", LocalDate.of(1980, 3, 1));
        var hermione = new HogwartsStudent(House.getGryffindor(), false, new String[]{"Books"}, 1991, 1998, false, "Hermione Granger", LocalDate.of(1979, 9, 19));

        // Ravenclaw
        var luna = new HogwartsStudent(House.getRavenclaw(), false, new String[]{"Nargles"}, 1991, 1998, false, "Luna Lovegood", LocalDate.of(1981, 2, 13));
        var cho = new HogwartsStudent(House.getRavenclaw(), false, new String[]{"Studying"}, 1991, 1998, false, "Cho Chang", LocalDate.of(1980, 6, 12));

        // Slytherin
        var draco = new HogwartsStudent(House.getSlytherin(), false, new String[]{"Quidditch"}, 1991, 1998, false, "Draco Malfoy", LocalDate.of(1980, 6, 5));
        var pansy = new HogwartsStudent(House.getSlytherin(), false, new String[]{"Gossip"}, 1991, 1998, false, "Pansy Parkinson", LocalDate.of(1980, 7, 20));

        // Hufflepuff
        var cedric = new HogwartsStudent(House.getHufflepuff(), false, new String[]{"Quidditch"}, 1991, 1998, false, "Cedric Diggory", LocalDate.of(1979, 9, 12));
        var tonks = new HogwartsStudent(House.getHufflepuff(), false, new String[]{"Metamorphmagus"}, 1991, 1998, false, "Nymphadora Tonks", LocalDate.of(1979, 12, 10));

        students.add(harry);
        students.add(ron);
        students.add(hermione);

        students.add(luna);
        students.add(cho);

        students.add(draco);
        students.add(pansy);

        students.add(cedric);
        students.add(tonks);

        System.out.println("Studerende:");
        for (Student student : students) {
            studentController.createStudent(student);
            System.out.println(student);
        }
    }

    private void initTeachers() {
        List<Teacher> teachers = new ArrayList<>();

        var snape = new HogwartsTeacher(House.getSlytherin(), true, LocalDate.of(1970, 1, 1), LocalDate.of(1998, 5, 2), "Severus Snape", LocalDate.of(1960, 1, 9));
        teachers.add(snape);

        System.out.println("Lærere:");
        for (Teacher teacher : teachers) {
            teacherController.createTeacher(teacher);
            System.out.println(teacher);
        }
    }
}
