package edu.hogwarts;

import java.time.LocalDate;

public class HogwartsTeacher extends Teacher {

    private House house;
    private boolean headOfHouse;

    public HogwartsTeacher(String firstName, String lastName, String middleName, String employment, LocalDate employmentStart, LocalDate employmentEnd, House house, boolean headOfHouse) {
        super(firstName, lastName, middleName, employment, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    @Override
    public String toString() {
        return "house: " + house +
                ", headOfHouse=" + headOfHouse +
                "} " + super.toString();
    }
}

