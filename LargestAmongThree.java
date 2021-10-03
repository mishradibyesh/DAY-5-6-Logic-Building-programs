
public class LargestAmongThree {
	public static void main(String[] args) {
	int a=25;
	int b=29;
	int c=27;
	int largest=(a>b)?a:b;
	largest=(largest>c)?largest:c;
	System.out.println("the largest number is "+largest);
	}
}
