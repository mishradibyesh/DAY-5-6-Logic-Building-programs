import java.lang.*;
import java.math.*;
public class PoweOfTwo {
	public static void main(String[] args) {
	
	int variable=Integer.parseInt(args[0]);
	int table=1;
	int count=1;
	if (variable > 1)
			{
		            System.out.println("the table of power of 2 is written below ");
                    System.out.println("1");
	                while(count <=  variable )
	                		{
	                                table=(table*2);
	                                System.out.println(table);
	                                count=count +1;
	                		}
			}
	        else
	                System.out.println("please enter a positive number");
			}

	}


