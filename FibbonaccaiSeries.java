import java.lang.*;
import java.util.Scanner;
public class FibbonaccaiSeries {
	public static void main(String[] args) {
	int a=0;
	int b=1;
	System.out.println(a);
	System.out.println(b);
	for(int i=1;i<=10-2;i++) {
		int sum =a+b;
		a=b;
		b=sum;
		System.out.println(b);
		}
	}
}
