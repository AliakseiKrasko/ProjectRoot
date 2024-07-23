import java.util.List;

public class GetStudentsInfo implements Command {
    private List<Student> students;

    public GetStudentsInfo(List<Student> students) {
        this.students = students;
    }

    @Override
    public void execute() {
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Age: " + student.getAge());
        }
    }
}
