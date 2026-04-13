import java.util.LinkedList;
import java.util.Queue;

public class queues {
    
    public static void main(String[] args) {
        
        // QUEUE -> FIFO data structure (Last In First Out)
        //       -> Linear data structure
        //       -> adds elements to the back (tail) of the queue and removes them from the front (head)


        //  offer() -> adds an element to the back (tail) of a queue. This is known as ENQUEUE
        //  pop() -> removes an element from the front (head) of a queue. This is know as DEQUEUE
        //  peek() -> returns the element at the front (head) of a queue
        //  contains() -> returns true or false if an element exists
        //  size() -> returns the total number of elements in a queue
        //  isEmpty() -> returns true if the queue is empty, otherwise false
        

        // We cannot use the queue constructor as it is an interface
        Queue<String> carBrands = new LinkedList<>();

        carBrands.offer("BMW");
        carBrands.offer("Mercedes");
        carBrands.offer("Audi");
        carBrands.offer("Mazda");
        carBrands.offer("Porsche");

        carBrands.poll();
        carBrands.poll();

        System.out.println(carBrands.peek());

        System.out.println("Does BMW exists in the queue carBrands?: " + carBrands.contains("BMW"));

        System.out.println("Size of carBrands: " + carBrands.size());

        System.out.println("Is carBrands empty?: " + carBrands.isEmpty());

        System.out.println(carBrands);
    }
}
