public class MainMenu {
    public static void main(String[] args) {
        // Create students and teacher
        List<Student> students = List.of(new Student(1, "Alice", 20), new Student(2, "Bob", 22));
        Teacher teacher = new Teacher(1, "Dr. Smith");

        // Create service and controller
        StudyGroupService studyGroupService = new StudyGroupService();
        Controller controller = new Controller(studyGroupService, students, teacher);

        // Create and start console UI
        ConsoleUI consoleUI = new ConsoleUI(controller);
        consoleUI.start();
    }
}
