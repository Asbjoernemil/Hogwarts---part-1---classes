package edu.hogwarts.application;

import edu.generic.Student;
import java.util.*;

public class StudentController {
    private final Map<UUID, Student> studentsMap;

    public StudentController() {
        this.studentsMap = new HashMap<>();
    }

    public void createStudent(Student student) {
        UUID id = UUID.randomUUID();
        student.setId(id);
        studentsMap.put(id, student);
    }

    public Student getStudent(UUID id) {
        return studentsMap.get(id);
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(studentsMap.values());
    }

    public void updateStudent(UUID id, Student updatedStudent) {
        if (studentsMap.containsKey(id)) {
            updatedStudent.setId(id);
            studentsMap.put(id, updatedStudent);
        }
    }

    public void deleteStudent(UUID id) {
        studentsMap.remove(id);
    }
}

