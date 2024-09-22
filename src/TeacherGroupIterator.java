import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher> {

    private int count;
    private final List<Teacher> teacherList;

    public TeacherGroupIterator(TeacherGroup teachers) {
        this.count = 0;
        this.teacherList = teachers.getTeachers();
    }

    @Override
    public boolean hasNext() {
        return count < teacherList.size() -1;
    }

    @Override
    public Teacher next() {
        if (!hasNext()){
            return null;
        }
        return teacherList.get(count);
    }
}
