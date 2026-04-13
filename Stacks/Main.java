import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        
        // STACK -> LIFO structure (Last In First Out)
        //       -> stores objects like a stack of pancakes

        // empty() -> returns either true or false if a stack is empty or not
        // pop() -> remove the last item added to the stack
        // peek() -> returns the item at the top of the stack
        // search() -> returns the index of the object in the stack
        
        Stack<String> movies = new Stack<String>();

        movies.push("A Clockwork Orange");
        movies.push("Blue Velvet");
        movies.push("The Shining");
        movies.push("Seven Samurai");
        movies.push("Kill Bill Vol 1");

        System.out.println("Is movies empty? " + movies.empty());

        movies.pop();

        System.out.println(movies.peek());

        System.out.println(movies.search("The Shining"));

        System.out.println(movies);
    }
}
