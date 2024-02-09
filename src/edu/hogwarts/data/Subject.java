package edu.hogwarts.data;

public class Subject {

    private String name;
    private int schoolYear;
    private boolean elective;


    public Subject() {}

    public Subject(String name, int schoolYear, boolean elective) {
        this.name = name;
        this.schoolYear = schoolYear;
        this.elective = elective;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", schoolYear=" + schoolYear +
                ", elective=" + elective +
                '}';
    }
}
