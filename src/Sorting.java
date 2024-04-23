import java.util.ArrayList;
import java.util.Collections;
public class Sorting {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(4);
        //using sort method
        System.out.println("Unsorted ArrayList :- "+numbers);
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList   :- "+numbers);
    }
}
