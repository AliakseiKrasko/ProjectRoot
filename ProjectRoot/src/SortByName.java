import java.util.List;

public class SortByName implements Command {
    private List<Student> students;

    public SortByName(List<Student> students) {
        this.students = students;
    }

    @Override
    public void execute() {
        students.sort(new StudentComparatorByName());
    }
}
