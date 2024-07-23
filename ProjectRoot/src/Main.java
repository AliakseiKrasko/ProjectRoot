import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "Alice", 20), new Student(2, "Bob", 22));
        Teacher teacher = new Teacher(1, "Dr. Smith");

        StudyGroupService studyGroupService = new StudyGroupService();
        Controller controller = new Controller(studyGroupService, students, teacher);

        StudyGroup studyGroup = controller.createStudyGroup();

        System.out.println("Teacher ID: " + controller.getTeacherId());
        System.out.println("Student IDs: " + controller.getStudentIds());
    }
}
