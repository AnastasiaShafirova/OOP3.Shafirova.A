import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class TeacherGroup implements Iterable<Teacher> {

    private List<Teacher> teachers = new ArrayList<>();

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }



    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this);
    }


    public void createTeacher(String firstName, String lastName, String middleName) {
        teachers.add(new Teacher(firstName, lastName, middleName));
    }
}
