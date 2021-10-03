import java.lang.*;
import java.util.Scanner;
public class RemainderAndQuotient {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
//taking a number from user to divide
		System.out.println("enter a number ");
		int number=sc.nextInt();
//taking a number from user with which we will devide the number
		System.out.println("enter a number with which we divide ");
		int number2=sc.nextInt();
		int Rem=number % number2;
//printing the remainder
		System.out.println("the remainder is "+Rem);
		int Quot=number/number2;
		System.out.println("the Quotient is "+Quot);
	}	
}
