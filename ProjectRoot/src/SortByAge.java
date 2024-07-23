import java.util.List;

public class SortByAge implements Command {
    private List<Student> students;

    public SortByAge(List<Student> students) {
        this.students = students;
    }

    @Override
    public void execute() {
        students.sort(new StudentComparatorByAge());
    }
}
