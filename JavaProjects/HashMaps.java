//***********************************************************************************************
// edit for Git
// second edit for git
//
// HashMap   =  Stores values like an ArrayList in form of (key:value)   FIFO (First-In First-Out)
//				  Ex: (Name,email); (user-name, userID); (country, capital)
//				Stores OBJECTS => need to user Wrapper Class
//				  Ex: HashMap<String, Boolean>; HashMap<Integer, String>; etc
//
// Methods: put(key, value) - adds a pair
//			remove(key) - removes a pair; argument needed is the object from the left (the KEY)
//			get(key)	- returns the value of the key
//			clear()		- clears the entire HashMap
//			size()		- returns the size of HashMap
//			replace(hey, new value) - changes the the value of a key
//			containsKey(key) - checks if this 'key' exists (boolean)
//			containsValue(value) - checks if this 'value' exists (boolean)
//          keySet() - displays all the 'keys'
//
// Uses of stacks:  1. Undo/redo features in text editors (Ctrl-z thingy)
//					2. Moving back/forward through browser history
//					3. Backtracking algorithms (maze, file directories)
//					4. Calling functions (call stack) 
//
//***********************************************************************************************


import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) {
		
		HashMap<String, String> countries = new HashMap();
		
		System.out.println("Is the queue empty? " +countries.isEmpty());
		// add a key and value
		countries.put("USA", "Washington DC");
		countries.put("India", "New Delhi");
		countries.put("Russia", "Moscow");
		countries.put("China", "Beijing");
		
//		System.out.println(countries.keySet());
//		System.out.println(countries);
//		
//		System.out.println("Remove a country");
//		countries.remove("USA");
//		System.out.println(countries);
//		
//		System.out.println("Get a value using a key");
//		System.out.println(countries.get("Russia"));
//		
//		System.out.println("The size of HashMap is: "+ countries.size());
//		
//
//		System.out.println(countries.get("Russia"));
//		countries.replace("Russia", "Kaliningrad");
//		System.out.println(countries.get("Russia"));
//		System.out.println(countries.containsKey("England"));
//		System.out.println(countries.containsValue("Beijing"));
		
		for(String i : countries.keySet()) {
			System.out.print(i+ "\t: "); 					// <-- displays all 'keys'
			System.out.println(countries.get(i));	// <-- displays all 'values'
		} 
		System.out.println("Is the queue empty? " +countries.isEmpty());
	}

}
