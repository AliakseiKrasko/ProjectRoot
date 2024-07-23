import java.util.List;

public class Controller {
    private StudyGroupService studyGroupService;
    private List<Student> students;
    private Teacher teacher;

    public Controller(StudyGroupService studyGroupService, List<Student> students, Teacher teacher) {
        this.studyGroupService = studyGroupService;
        this.students = students;
        this.teacher = teacher;
    }

    public StudyGroup createStudyGroup() {
        return studyGroupService.createStudyGroup(teacher, students);
    }

    public List<Integer> getStudentIds() {
        return students.stream().map(Student::getId).toList();
    }

    public int getTeacherId() {
        return teacher.getId();
    }
}
