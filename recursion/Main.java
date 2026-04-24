public class Main {

	public static void main(String[] args) {
		
		steps(10);

	}

	private static int steps(int step) {
		
		// base case (used to stop recursion from running infinitely)
		if (step == 0) return 1;
		
		System.out.println("You have taken step " + step);
		
		// calls the method itself
		return step * steps(step - 1);
	}

}
