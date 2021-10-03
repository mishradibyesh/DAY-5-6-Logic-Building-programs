import java.util.Scanner;
public class VowelConsonent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an alphabet ");
		char letter=sc.next().charAt(0);
		if(letter=='a' || letter=='e' ||letter=='i' ||letter=='o' ||letter=='u' ) {
			System.out.println("this is a Vowel");
		}
		else
			System.out.println("this is a Consonent");
	}

}
