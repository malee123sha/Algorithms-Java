import java.util.ArrayList;
import java.util.Collections;
public class Searching {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);
        int position = Collections.binarySearch(numbers,3);
        System.out.println("Position of 3 is :- "+position);
    }
}
