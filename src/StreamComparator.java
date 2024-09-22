import java.util.Comparator;

public class StreamComparator implements Comparator<Potoc> {

    @Override
    public int compare(Potoc o1, Potoc o2) {
        return Integer.compare(o1.getStudentGroups().size(), o2.getStudentGroups().size());
    }
}
