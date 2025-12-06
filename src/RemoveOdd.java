import java.util.ArrayList;
import java.util.Iterator;

public class RemoveOdd {


    public static void main(String[] args) {

        // Creating an ArrayList of Integer type
        ArrayList<Integer> al = new ArrayList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 10; i++) {
            al.add(i);
        }

        // Printing the original list
        System.out.println("Original List: " + al);

        // Creating an Iterator for the ArrayList
        Iterator<Integer> itr = al.iterator();

        // Iterating through the list and removing odd elements
        while (itr.hasNext()) {

            // Getting the next element
            int i = itr.next();

            System.out.print(i + " ");

            // Removing odd elements
            if (i % 2 != 0) {
                itr.remove();
            }
        }

        System.out.println();

        // Printing the modified list after removal of odd elements
        System.out.println("Modified List: " + al);
    }
}