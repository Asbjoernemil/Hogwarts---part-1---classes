package edu.hogwarts;

import java.time.LocalDate;

public class Teacher extends Person {

    private String employment;
    private LocalDate employmentStart;
    private LocalDate employmentEnd;

    public Teacher() {
    }

    public Teacher(String firstName, String lastName, String middleName, String employment, LocalDate employmentStart, LocalDate employmentEnd){
        super(firstName, lastName, middleName);
        this.employment = employment;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }

    @Override
    public String toString() {
        String name = getFirstName() + " " + (getMiddleName() != null ? getMiddleName() + " " : "") + getLastName();

        return String.format("Teacher Klasse{" +
                        "name='%s', " +
                        "employment='%s', " +
                        "employmentStart=%s, " +
                        "employmentEnd=%s}",
                name, employment, employmentStart, employmentEnd) + super.toString();
    }

}
