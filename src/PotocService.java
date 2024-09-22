import java.util.Collections;
import java.util.List;

public class PotocService {
    public void sortPotocs(List<Potoc> potocs) {
        Collections.sort(potocs, new StreamComparator());
    }

}
