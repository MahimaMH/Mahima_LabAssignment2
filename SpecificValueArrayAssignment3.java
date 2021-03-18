/**
* Name : Mahima
* Description : Program to display specific number
* Date : 17/3/21
*/

import java.util.Scanner;

public class SpecificValue {
	
	private static int[] num= {1,2,3,4,5,6,7,8,9};
	private static int specificValue;
	
	public static void main(String[] args) {
		System.out.println("enter specific number: ");
		Scanner in=new Scanner(System.in);
		specificValue=in.nextInt();
		System.out.println(test(num,specificValue));
	}
	public static boolean test(int num[],int specificvValue) {
		for(int i:num)
		{
			if(specificValue==i)
				
			{
				
				return true;
			}
		}
				return false;
	}	
	

}
