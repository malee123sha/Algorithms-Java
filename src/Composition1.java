import java.util.ArrayList;
import java.util.Collections;
public class Composition1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.add(2);
        System.out.println("numbers   :- "+numbers);
        int count = Collections.frequency(numbers,2);
        System.out.println("Count of 2 :- "+count);
        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(4);
        newNumbers.add(5);
        newNumbers.add(6);
        newNumbers.add(3);
        System.out.println("newNumbers:- "+newNumbers);
        boolean answer = Collections.disjoint(numbers,newNumbers);
        System.out.println("Lists are disjoint :- "+answer);
    }
}
