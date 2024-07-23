import java.util.List;

public class AddStudent implements Command {
    private List<Student> students;
    private Student student;

    public AddStudent(List<Student> students, Student student) {
        this.students = students;
        this.student = student;
    }

    @Override
    public void execute() {
        students.add(student);
    }
}
