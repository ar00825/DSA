import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number to calculate its factorial: ");
		int number = scan.nextInt();
		
		System.out.println(number + "! = " + factorial(number));

	}

	private static int factorial(int num) {
		
		if (num == 0) return 1;
		return num * factorial(num - 1);
	}

}
