import java.util.ArrayList;
import java.util.HashSet;

public class ListVsSetExperiment {
    public static void main(String[] args) {
        int[] values = {10, 20, 30, 20, 40, 10, 50, 30};

        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for (int value : values) {
            list.add(value);
            set.add(value);
        }

        System.out.println("ArrayList: " + list);
        System.out.println("HashSet: " + set);
    }
}