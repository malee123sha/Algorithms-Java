import java.util.ArrayList;
import java.util.Collections;
public class zFinal {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(2);
        System.out.println(numbers);
        //using sort method
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList :- "+numbers);
        System.out.println(".................................");
        //using shuffle method
        Collections.shuffle(numbers);
        System.out.println("Shuffled ArrayList :- "+numbers);
        System.out.println(".................................");
        //using binarySearch method
        int position = Collections.binarySearch(numbers,3);
        System.out.println("Position of 3 is :- "+position);
        System.out.println(".................................");
        //using frequency method
        int count = Collections.frequency(numbers,2);
        System.out.println("Count of 2 :- "+count);
        System.out.println(".................................");
        int min = Collections.min(numbers);
        int max2 = Collections.max(numbers);
        ArrayList<Integer> newNumbers = new ArrayList<>();
        newNumbers.add(4);
        newNumbers.add(5);
        newNumbers.add(6);
        newNumbers.add(3);
        System.out.println(newNumbers);
        //using addAll method
        newNumbers.addAll(numbers);
        System.out.println("After Added ArrayList :- "+newNumbers);
        System.out.println(".................................");
        //using fill method
        Collections.fill(numbers,0);
        System.out.println("Filled ArrayList   :- "+numbers);
        System.out.println(".................................");
        //using copy method
        Collections.copy(newNumbers,numbers);
        System.out.println("Copied ArrayList   :- "+newNumbers);
        int min1 = Collections.min(newNumbers);
        int max = Collections.max(newNumbers);
        boolean answer = Collections.disjoint(numbers,newNumbers);
        //using disjoint method
        System.out.println("Lists are disjoint :- "+answer);
        System.out.println(".................................");
        //using min & max methods
        System.out.println("numbers array minimum :- "+min);
        System.out.println("numbers array maximum :- "+max2);
        System.out.println(".................................");
        System.out.println("newNumbers array minimum :- "+min1);
        System.out.println("newNumbers array maximum :- "+max);
    }
}
