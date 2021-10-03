import java.lang.*;
import java.util.Scanner;
public class PerfectNo {
	public static void main(String[] args) {
	//scanner class is being intantiated 
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check perfect number");
		int num=sc.nextInt();
		int sum=0;
		System.out.println("the perfect divisors are ");
		for(int i=1;i<=num/2;i++) {
			if(num % i ==0) {
				System.out.print(" "+i);
				sum+=i;
			}
		}
		System.out.println("");
		System.out.println("sum of these numbers is "+sum);
  //checking for perfect number
		if(sum==num) {
			System.out.println("it is a perfect number");
		}
		else
			System.out.println("it is not a perfect number");	
	}
}
