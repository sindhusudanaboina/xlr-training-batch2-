// Demo032 - wap to create a hashset to store Homogeneous string values
import java.util.HashSet;

public class Demo032 {
    public static void main(String[] args) {
        // Create a HashSet to store homogeneous string values
        HashSet<String> stringSet = new HashSet<>();

        // Adding string values to the HashSet
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Mango");

        // Attempting to add a duplicate value
        stringSet.add("Apple");  // This will not be added, as HashSet does not allow duplicates

        // Displaying the HashSet values
        System.out.println("HashSet contents: " + stringSet);

        // Checking if a particular value exists
        if (stringSet.contains("Banana")) {
            System.out.println("Banana is present in the HashSet.");
        }

        // Removing an element from the HashSet
        stringSet.remove("Cherry");
        System.out.println("After removing Cherry: " + stringSet);

        // Iterating over the HashSet
        System.out.println("Iterating through HashSet:");
        for (String item : stringSet) {
            System.out.println(item);
        }
    }
}
