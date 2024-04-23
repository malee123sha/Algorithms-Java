import java.util.ArrayList;
import java.util.Collections;
public class Shuffling {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println("Before Shuffling :- "+numbers);
        //using shuffle method
        Collections.shuffle(numbers);
        System.out.println("After Shuffling  :- "+numbers);
    }
}
