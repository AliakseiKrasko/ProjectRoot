import java.util.Scanner;

public class ConsoleUI {
    private Controller controller;

    public ConsoleUI(Controller controller) {
        this.controller = controller;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Get Students Info");
            System.out.println("3. Sort Students by Age");
            System.out.println("4. Sort Students by Name");
            System.out.println("5. Finish");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    controller.addStudent(new Student(id, name, age));
                    break;
                case 2:
                    controller.getStudentsInfo();
                    break;
                case 3:
                    controller.sortStudentsByAge();
                    break;
                case 4:
                    controller.sortStudentsByName();
                    break;
                case 5:
                    controller.finish();
                    return;
            }
        }
    }
}
