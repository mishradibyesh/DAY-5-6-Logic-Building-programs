public class SwapNumber {
	public static void main(String[] args) {
		int a=20;
		int b=10;
     // swapping using third variable
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a= "+a);
		System.out.println("b= "+b);

    // without third variable
		int x = 10;
		int y = 5;
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}
}
