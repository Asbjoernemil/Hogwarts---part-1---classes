package edu.hogwarts;

import java.util.Arrays;

public class HogwartsStudent extends Student implements HogwartsPerson {
    private House house;
    private boolean prefect;
    private String[] teams;

    public HogwartsStudent(String firstName, String middleName, String lastName, int enrollmentYear, int graduationYear, boolean graduated, House house, boolean prefect, String[] teams) {
        super(firstName, middleName, lastName, enrollmentYear, graduationYear, graduated);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "HogwartsStudent{" +
                "house='" + house + '\'' +
                ", prefect=" + prefect +
                ", teams=" + Arrays.toString(teams) +
                '}';
    }
}
