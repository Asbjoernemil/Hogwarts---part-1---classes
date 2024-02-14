package edu.hogwarts.application;

import edu.generic.Teacher;
import java.util.*;

public class TeacherController {
    private final Map<UUID, Teacher> teachersMap;

    public TeacherController() {
        this.teachersMap = new HashMap<>();
    }

    public void createTeacher(Teacher teacher) {
        UUID id = UUID.randomUUID();
        teacher.setId(id);
        teachersMap.put(id, teacher);
    }

    public Teacher getTeacher(UUID id) {
        return teachersMap.get(id);
    }

    public List<Teacher> getAllTeachers() {
        return new ArrayList<>(teachersMap.values());
    }

    public void updateTeacher(UUID id, Teacher updatedTeacher) {
        if (teachersMap.containsKey(id)) {
            updatedTeacher.setId(id);
            teachersMap.put(id, updatedTeacher);
        }
    }

    public void deleteTeacher(UUID id) {
        teachersMap.remove(id);
    }
}

