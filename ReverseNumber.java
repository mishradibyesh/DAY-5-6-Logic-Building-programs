import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int n, rev = 0, remainder;
		System.out.println("Enter an integer: ");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		while (num != 0) {
			remainder = num % 10;
			rev = rev * 10 + remainder;
			num =num/10;
		}
		System.out.println("Reversed number = "+rev);
	}
}

