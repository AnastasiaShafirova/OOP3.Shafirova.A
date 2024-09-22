import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Potoc implements Iterable<StudentGroup> {

    private List<StudentGroup> studentGroups;

    public Potoc() {

        studentGroups = new ArrayList<>();
    }

    public List<StudentGroup> getStudentGroups() {

        return studentGroups;
    }

    public void setStudentGroups(List<StudentGroup> studentGroups) {

        this.studentGroups = studentGroups;
    }

    @Override
    public Iterator<StudentGroup> iterator() {

        return studentGroups.iterator();
    }


}
