package edu.hogwarts;
import java.util.ArrayList;
import java.util.Arrays;

public class Course {
    Subject subject;
    Teacher teacher;
    ArrayList<Student> students;
    ArrayList<TeachingMaterial> materials;


    public Course() {
    }

    public Course(Subject subject, Teacher teacher, ArrayList<Student> students, ArrayList<TeachingMaterial> materials) {
        this.subject = subject;
        this.teacher = teacher;
        this.students = students;
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "Course{" +
                "subject=" + subject +
                ", teacher=" + teacher +
                ", students=" + students +
                ", materials=" + materials +
                '}';
    }
}
