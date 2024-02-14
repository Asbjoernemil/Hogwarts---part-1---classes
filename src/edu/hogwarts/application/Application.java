package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsPerson;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private final StudentController studentController;
    private final TeacherController teacherController;
    private final UserInterface userInterface;

    public Application() {
        this.studentController = new StudentController();
        this.teacherController = new TeacherController();

        InitApp initApp = new InitApp(studentController, teacherController);
        initApp.init();


        List<HogwartsPerson> hogwartsPeople = new ArrayList<>();

        this.userInterface = new UserInterface(studentController, teacherController, hogwartsPeople);
    }

    public void start() {
        userInterface.start();
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.start();
    }
}
