import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("ArrayList: " + numbers);
        // Retrieving elements from the ArrayList
        int firstElement = numbers.get(0);
        System.out.println("First element: " + firstElement);
        // Removing elements from the ArrayList
        numbers.remove(2);
        System.out.println("ArrayList after removing element at index 2: " + numbers);
    }
}