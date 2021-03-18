/**
* Name : Mahima
* Description : Program to print fron given input integer
* Date : 17/3/21
*/

import java.util.Scanner;
public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;  
		int positiveCount = 0, negativeCount = 0, zeroCount=0, evenCount=0,oddCount=0;
		int i;
		Scanner in=new Scanner(System.in);  
		//System.out.print("Enter the 20 input integer: ");  
		  
		//n=in.nextInt();  
		
		int[] a = new int[5];  
		System.out.println("Enter the input integers: ");  
		for( i=0; i<5; i++)  
		{     
		a[i]=in.nextInt();  
		}  
		/*System.out.println("Array elements are: ");  
	  
		for (int i=0; i<5; i++)   
		{  
		System.out.println(a[i]);  
		}  */
		
		for(i = 0; i <5; i++)
		{
			if(a[i] > 0)
			{
				positiveCount++;
			}
			else if(a[i]<0)
			{
				negativeCount++;
			}
		}	
		for(i = 0; i <5; i++)
		{
		if(a[i]==0) {
			
			zeroCount++;
		}
		}
		for(i=0;i<5;i++)
		{
			if(a[i]%2==0)
			{
				evenCount++;
			}
			else if(a[i]>0)
			{
				oddCount++;
			}
		}
		
		
		System.out.println("\n Total Number of Positive Numbers in the Array = " + positiveCount);
		System.out.println("\n Total Number of Negative Numbers in the Array = " + negativeCount);
		System.out.println("\n Total Number of Zeros in the Array = " + zeroCount);
		System.out.println("\n Total Number of Even Numbers in the Array = " + evenCount);
		System.out.println("\n Total Number of odd Numbers in the Array = " + oddCount);
	}

}
