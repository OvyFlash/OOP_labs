import java.util.Comparator;

public class ComparatorByCity
        implements Comparator<University> {


    @Override
    public int compare(University o1, University o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


