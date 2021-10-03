import java.lang.*;
import java.util.Scanner;
public class EvenODD {
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the number to check even and odd ");
	int num =sc.nextInt();
	if (num % 2==0) {
		System.out.println("it is an even number");
	}
	else
		System.out.println("it is an odd number");
	}
}
