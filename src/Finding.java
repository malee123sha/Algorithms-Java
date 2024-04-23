import java.util.ArrayList;
import java.util.Collections;
public class Finding {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        System.out.println("First ArrayList :- "+numbers);
        int min = Collections.min(numbers);
        int max2 = Collections.max(numbers);
        System.out.println("First ArrayList Minimum  :- "+min);
        System.out.println("First ArrayList Maximum  :- "+max2);
        System.out.println(".................................");
        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(4);
        newNumbers.add(5);
        newNumbers.add(6);
        newNumbers.add(3);
        System.out.println("Second ArrayList :- "+newNumbers);
        int min1 = Collections.min(newNumbers);
        int max = Collections.max(newNumbers);
        System.out.println("Second ArrayList Minimum :- "+min1);
        System.out.println("Second ArrayList Maximum :- "+max);
    }
}
