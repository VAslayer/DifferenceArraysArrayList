import java.util.ArrayList;

public class DifferenceArraysArrayLists {

    public static void main(String[] args) {
        // This will be the example for an Array
        int[] intArray = {10, 20, 30}; // Here we state the array that will be fixed numbers
        System.out.println("Array_Length:" + intArray.length); // The fixed array length will be printed 

        // Here is our ArrayList example 
        ArrayList<Integer> intArrayList = new ArrayList<>(); // We generate our arraylist, which will be growing dynamically
        intArrayList.add(10); intArrayList.add(20); intArrayList.add(30); intArrayList.add(40);
        System.out.println("ArrayList_Size:" + intArrayList.size()); // This line will print the dynamic arraylist

        // This will be accessing the numbers 
        System.out.println("First Array_Element:" + intArray[0]); // This first number of the array 
        System.out.println("First ArrayList_Element:" + intArrayList.get(0)); // This first number of the arraylist 

        // The numbers will be performing their functions 
        System.out.println("Array Elements:");
        for (int i : intArray) System.out.println(i); // The array number will perform their function and printed

        System.out.println("ArrayList Elements:");
        for (int i : intArrayList) System.out.println(i); // The arraylist will perform their function and be printed

        // Shows the dynamics of the arraylist
        intArrayList.remove(2); intArrayList.add(50); // A number will be removed and then a new one will be added, showing how dynamic structure functions
        System.out.println("New ArrayList_Size:" + intArrayList.size()); // The new arraylist will be printed
        System.out.println("New ArrayList_Elements:");
        for (int i : intArrayList) System.out.println(i); // After performing the functions given, it will print the new arraylist.
    }
}


