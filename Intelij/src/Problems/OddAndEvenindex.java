import java.util.ArrayList;
import java.util.Collections;

public class OddAndEvenindex {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 7, 0, 1, 2, 3};
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                even.add(array[i]);
            else
                odd.add(array[i]);
        }

        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);

        int evenInd = 0;
        int oddInd = 0;
        int n = even.size() + odd.size();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(even.get(evenInd++)+ " ");
            } else {
                System.out.print(odd.get(oddInd++) + " ");
            }
        }
    }
}