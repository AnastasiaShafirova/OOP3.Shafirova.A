import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{

    private List<Student> studentList;
    private Teacher teacher;

    public StudentGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.studentList = students;
    }

    public List<Student> getStudentList() {

        return studentList;
    }

    public void setStudentList(List<Student> studentList) {

        this.studentList = studentList;
    }

    public void createStudent(String firstName, String lastName, String middleName){
        studentList.add(new Student(firstName, lastName, middleName));
    }
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

}
