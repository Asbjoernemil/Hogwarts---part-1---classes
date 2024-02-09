package edu.hogwarts.data;
import edu.generic.Student;
import edu.generic.Teacher;

import java.util.ArrayList;
import java.util.Arrays;

public class Course {
    private Subject subject;
    private Teacher teacher;
    private ArrayList<HogwartsStudent> students;
    private TeachingMaterial[] materials;


    public Course(Subject subject, Teacher teacher, ArrayList<HogwartsStudent> students, TeachingMaterial[] materials) {
        this.subject = subject;
        this.teacher = teacher;
        this.students = students;
        this.materials = materials;
    }

    public Course() {
        this(new Subject(), new Teacher(), new ArrayList<>(), new TeachingMaterial[0]);
    }


    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<HogwartsStudent> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<HogwartsStudent> students) {
        this.students = students;
    }

    public TeachingMaterial[] getMaterials() {
        return materials;
    }

    public void setMaterials(TeachingMaterial... materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "Course{" +
                "subject=" + subject +
                ", teacher=" + teacher +
                ", students=" + students +
                ", materials=" + Arrays.toString(materials) +
                '}';
    }
}
