
/**
 * Nmae:Mahima M Hampali
 * Description: compilation of java program to return the second largest element in an array of integer type
 	Date: 17/03/21
 */

import java.util.Scanner;
public class ArrayAssignment7 {
	
	public static void main(String[] args) {
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elemenets in an array: ");
		int n=sc.nextInt();
		int[] X=new int[n];
		System.out.println("Enter elemenets of an array: ");
		for(int i=0;i<n;i++) {
			
			X[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++) {
		System.out.println(X[i]);
		}
		
		for(int i = 0; i<n; i++ ){
	         for(int j = i+1; j<n; j++){
	            if(X[i]>X[j]){
	               temp = X[i];
	               X[i] = X[j];
	               X[j] = temp;
	            }
	         }
	      }
	      System.out.println("2nd Smallest element of the array is: "+X[1]);
	   }
	}