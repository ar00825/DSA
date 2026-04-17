import java.util.LinkedList;

public class linkedLists {
    
    public static void main(String[] args) {
        
        // LINKED LISTS -> type of DS (data structure) that stores data
        //                 in separate nodes that are linked together
        //              -> Each node contains data and a next pointer (points to the next node)

        // TYPES OF LINKED LISTS:
        //      - Singley linked lists = each node contains data and a pointer to next node
        //      - Doubly linked lists = each node contains data and a pointer to the next node and the previous node     

        // STACK OPERATIONS ON LINKED LIST:
        // push() -> adds an element to a linked list
        // pop() -> deletes an element from a linked list

        // QUEUE OPERATIONS ON LINKED LIST:
        // offer() -> adds an element to the end of a queue (known as the TAIL)
        // poll() -> removes an element from the start of a queue (known as the HEAD)

        // LINKED LIST OPERATIONS:
        // add() -> adds an element to a linked list, typically at the end (tail)
        // remove() -> removes an element from the head (start) of a linked list

        LinkedList<String> citiesInUK = new LinkedList<>();

        // //We can treat a linked list like a stack (REMEMBER like a stack of pancakes)
        
        // citiesInUK.push("Oxford");
        // citiesInUK.push("Birmingham");
        // citiesInUK.push("Bath");
        // citiesInUK.push("Manchester");
        // citiesInUK.push("Liverpool");
        // citiesInUK.pop();

        // System.out.println("First node: " + citiesInUK.peekFirst());

        // System.out.println("Last node: " + citiesInUK.peekLast());

        // System.out.println("Linked List treated as a stack: " + citiesInUK);

        // We can treat a linked list like a queue (REMEMBER like a queue at a supermarket)
        // citiesInUK.offer("Cardiff");
        // citiesInUK.offer("Glasgow");
        // citiesInUK.offer("Leeds");
        // citiesInUK.offer("Swindon");
        // citiesInUK.offer("Swansea");

        // System.out.println("Linked list treated as a queue: " + citiesInUK);

        // System.out.println("First node: " + citiesInUK.peekFirst());

        // System.out.println("Last node: " + citiesInUK.peekLast());

        // System.out.println("Deleted node: " + citiesInUK.poll());

        // System.out.println("Index of Glasgow: " + citiesInUK.indexOf("Glasgow"));

        citiesInUK.add("Cardiff");
        citiesInUK.add("Glasgow");
        citiesInUK.add("Leeds");
        citiesInUK.add("Swindon");
        citiesInUK.add("Swansea");
        citiesInUK.add(3, "Bristol");
        citiesInUK.remove("Leeds");

        System.out.println("Linked List: " + citiesInUK);

        System.out.println("First node: " + citiesInUK.peekFirst());

        System.out.println("Last node: " + citiesInUK.peekLast());

        System.out.println("Deleted node: " + citiesInUK.remove());
        
    }
}
