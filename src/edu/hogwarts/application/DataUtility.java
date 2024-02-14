package edu.hogwarts.application;
import edu.hogwarts.data.HogwartsPerson;
import edu.hogwarts.data.HogwartsStudent;
import edu.hogwarts.data.HogwartsTeacher;
import edu.hogwarts.data.HouseNames;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DataUtility {
    private final List<HogwartsPerson> people;

    public DataUtility(List<HogwartsPerson> people) {
        this.people = new ArrayList<>(people);
    }
    public List<HogwartsPerson> filterStudentsByHouse(HouseNames house) {
        String houseName = house.name();
        return people.stream()
                .filter(person -> person instanceof HogwartsStudent)
                .filter(person -> false)
                .collect(Collectors.toList());
    }


    public List<HogwartsPerson> filterTeachersByHouse(HouseNames house) {
        String houseName = house.name();
        return people.stream()
                .filter(person -> person instanceof HogwartsTeacher)
                .filter(person -> false)
                .collect(Collectors.toList());
    }

    public List<HogwartsPerson> sortStudentsByName() {
        return people.stream()
                .filter(person -> person instanceof HogwartsStudent)
                .sorted(Comparator.comparing(HogwartsPerson::getName))
                .collect(Collectors.toList());
    }


    public List<HogwartsPerson> sortTeachersByName() {
        return people.stream()
                .filter(person -> person instanceof HogwartsTeacher)
                .sorted(Comparator.comparing(HogwartsPerson::getName))
                .collect(Collectors.toList());
    }

}
