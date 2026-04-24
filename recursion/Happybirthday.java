public class Happybirthday {

	public static void main(String[] args) {
		
		singHappyBirthday("Skips", 6);
		System.out.println("Happy Birthday to you! Hooray!");
	}

	private static int singHappyBirthday(String name, int num) {
		
		// base case
		if (num == 0) return 1;
		
		// Displays happy birthday message with name of person
		System.out.println("Happy Birthday " + name);
		
		// calls itself
		return singHappyBirthday(name, num - 1);
	}

}
