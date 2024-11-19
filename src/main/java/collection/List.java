package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		useOfArrayList();
		useOfLinkedList();
		useOfVector();
	}
	
	/*The ArrayList class is a Java class that you can use to store lists of objects. 
	You can also store objects in an array, but arrays have a couple of obvious problems. 
	To create an array, you have to specify a size for the array. 
	Sometimes you won't know what size array you will need at the instant you create the array.*/
	public static void useOfArrayList() {
		
		//declare the array list
		ArrayList<String> cars = new ArrayList<String>();
		
		//add values to the list dynamically
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    //remove values from the list by index
	    int pos = cars.indexOf("Ford");
	    cars.remove(pos);
	    System.out.println("Current Cars: ");
	    System.out.println(cars);
	    
	    //remove values from the list by object
	    System.out.println("Current Cars: ");
	    for(String car: cars) {
	    	if(car.equalsIgnoreCase("bmw")) {
	    		 cars.remove(car);
	    	}
	    }
	    System.out.println(cars);
	    
	}
	
	/*Java LinkedList is an implementation of the List and Deque interfaces. 
	 * It is one of the frequently used List implementation class. 
	 * It extends AbstractSequentialList and implements List and Deque interfaces. 
	 * It is an ordered collection and supports duplicate elements. It stores elements in Insertion order.*/
	public static void useOfLinkedList() {
		
		// Creating a LinkedList
        LinkedList<String> list = new LinkedList<String>();
        
        // Adding elements to the LinkedList using add() method
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        // Printing the LinkedList
        System.out.println(list);
	    
	}
	
	public static void useOfVector() {
		// Create a new vector
        Vector<Integer> v = new Vector<>(3, 2);

        // Add elements to the vector
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);

        // Insert an element at index 1
        v.insertElementAt(0, 1);

        // Remove the element at index 2
        v.removeElementAt(2);

        // Print the elements of the vector
        for (int i : v) {
            System.out.println(i);
        }
	}
	
}
