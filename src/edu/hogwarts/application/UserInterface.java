package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsPerson;

import java.util.*;
import java.util.stream.Collectors;

public class UserInterface {
    private final Scanner scanner;
    private final StudentController studentController;
    private final TeacherController teacherController;
    private final List<HogwartsPerson> hogwartsPeople;

    public UserInterface(StudentController studentController, TeacherController teacherController, List<HogwartsPerson> hogwartsPeople) {
        this.scanner = new Scanner(System.in);
        this.studentController = studentController;
        this.teacherController = teacherController;
        this.hogwartsPeople = hogwartsPeople;
    }

    public void displayMenu() {
        System.out.println("Welcome to the Hogwarts Information System!");
        System.out.println("1. View Hogwarts People");
        System.out.println("2. Sort View");
        System.out.println("3. Filter View");
        System.out.println("4. Exit");
    }

    public void start() {
        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    viewHogwartsPeople();
                    break;
                case 2:
                    sortView();
                    break;
                case 3:
                    filterView();
                    break;
                case 4:
                    System.out.println("Exiting the Hogwarts Information System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    public void viewHogwartsPeople() {
        System.out.println("Displaying Hogwarts People...");
        for (HogwartsPerson person : hogwartsPeople) {
            System.out.println(person);
        }
    }

    public void sortView() {
        System.out.println("Sorting View...");
        hogwartsPeople.sort(Comparator.comparing(HogwartsPerson::getName));
        viewHogwartsPeople();
    }

    public void filterView() {
        System.out.println("Filtering View...");
        String houseToFilter = "Gryffindor";
        List<HogwartsPerson> filteredPeople = hogwartsPeople.stream()
                .filter(person -> houseToFilter.equalsIgnoreCase(person.getHouseName()))
                .toList();
        for (HogwartsPerson person : filteredPeople) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        List<HogwartsPerson> hogwartsPeople = new ArrayList<>();
        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();
        UserInterface userInterface = new UserInterface(studentController, teacherController, hogwartsPeople);
        userInterface.start();
    }
}
