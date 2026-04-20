import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
		
		// HASH TABLE -> data structure that stores data using key-value pairs
		//            -> Key = unique identifier, Value = data being stored
		
		// Hashing = converts a key into an integer index to store in a table
		
		// Key.hashCode() % table size -> makes sure the index generated is within the table size limit
		
		// Index position in a table is also referred to as a BUCKET
		
		// Collision = when 2 different keys generated the same index
		
		// Load factor = number of items / table size
		
		// Less collision = Greater efficiency
		
		// Time complexity:
		// Best case = O(1)
		// Worst case = O(n)
		
		// HASH TABLE OPERATIONS:
		// put(Key, Value) = adds a key and a value to a hash table
		// remove(Key) = removes a key and its value from a hash table
		// containsKey(Key) = return true if a key exists in a hash table
		// get(Key) = returns the value stored at a key
		// KeySet() = returns all the keys in a hash table
		// hashCode() = generates a hash value of a key that is used to help find an index position in a hash table		
		
		
		Hashtable<String, String> students = new Hashtable<>(10);
		
		students.put("237", "Bill");
		students.put("641", "Grady");
		students.put("007", "Alex");
		students.put("899", "Frank");
		
		System.out.println(students.get("899"));
		
		System.out.println("Does this key exist?: " + students.containsKey("101"));
		
		System.out.println("This is the deleted value: " + students.remove("007"));

		
		for (String key : students.keySet()) {
			System.out.println("Index: " + key.hashCode() % 10 + " " + " Value: " + students.get(key));
		}
	}

}
