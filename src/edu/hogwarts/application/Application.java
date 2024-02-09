package edu.hogwarts.application;

import edu.generic.Student;
import edu.generic.Teacher;
import edu.hogwarts.data.HogwartsTeacher;
import edu.hogwarts.data.House;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        Application app = new Application();
        app.start();
    }

    public void start() {
        var InitApp = new InitApp();
        InitApp.initApp();
    }

    }
