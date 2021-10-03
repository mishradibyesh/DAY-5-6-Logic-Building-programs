import java.util.Scanner;
public class PrimeNo {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("enter a number to check prime number ");
		int num =a.nextInt();
		int count=0;
		if(num==1) {
			System.out.println("1 is neither a prime number nor a composite number");
		}
		else if(num>1) {
			int i=2;
			while(i< (num)) {
			   if(num%i==0) {
			   count=1;
			   }
			   i++;

			}
			   if (count>0) {
				   System.out.println("this is not a prime number");
			   }
			   else
				   System.out.println("this is a prime number");
			
		}
	}
}
