# Exp-09 Write a program to add, retrieve and remove the element from the ArrayList.
## AIM:
To Write a program to add, retrieve and remove the element from the ArrayList.
## PROCEDURE:
### STEP 1:
Create an arraylist with named as nuumbers.
### STEP 2:
Add values to the arraylist through add function.
### STEP 3:
Retrive the elements through get function.
### STEP 4:
Remove the element using remove function.
### STEP 5:
Display every manipulation done in arraylist.
### STEP 6:
End the program.
## PROGRAM:
```java
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
```
## OUTPUT:
![image](https://github.com/Karthikeyan21001828/Java_EX09/assets/93427303/8e14c0ab-afc1-4b5d-9791-2462dc320da6)
## RESULT:
A program to add, retrieve and remove the element from the ArrayList has been executed successfully.
