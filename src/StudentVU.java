import java.util.List;

public class StudentVU implements UserVU<Student> {

    public  void sendOnConsole(StudentGroup studentGroup) {
        System.out.println("Преподаватель: " + studentGroup.getTeacher().getFirstName() + " " + studentGroup.getTeacher().getLastName());
        System.out.println("Студенты: ");
        for (Student student : studentGroup.getStudentList()) {
            System.out.println(" -" + student.getFirstName() + " " + student.getLastName());
        }

    }

    @Override
    public void sendOnConsole(List<Student> list) {
        for (Student student: list) {
            System.out.println(student.getStudentId());
        }
    }
}
