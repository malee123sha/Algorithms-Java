import java.util.ArrayList;
import java.util.Collections;
public class Routing {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers);
        //using reverse method
        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList :- "+numbers);
        //using swap method
        Collections.swap(numbers,0,2);
        System.out.println("Swapped ArrayList  :- "+numbers);
        //using addAll method
        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.addAll(numbers);
        System.out.println("After Added ArrayList :- "+newNumbers);
        //using fill method
        Collections.fill(numbers,0);
        System.out.println("Filled ArrayList   :- "+numbers);
        //using copy method
        Collections.copy(newNumbers,numbers);
        System.out.println("Copied ArrayList   :- "+newNumbers);
    }
}
