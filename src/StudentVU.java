import java.util.List;

public class StudentVU implements UserVU<Student> {

    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student student: list) {
            System.out.println(student.getStudentId());
        }
    }
}
