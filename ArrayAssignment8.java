
/**
 * Nmae:Mahima M Hampali
 * Description: program to convert array elements to uppercase
 * Date :17/03/21
  */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment8 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elemenets in an array: ");
		int n=sc.nextInt();
		String[] arr=new String[n];
		System.out.println("Enter elemenets of an array: ");
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.next();
			
		}
		for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
		}
		sort(arr,n);
		upperCase(arr,n);

	}
	public static void sort(String[] arr, int n)
	{
		Arrays.sort(arr,0,n);
	
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	}
	public static void upperCase(String[] arr, int n) {
		if(n%2==0) {
			for(int i=0;i<((arr.length)/2);i++) {
			arr[i] = arr[i].toUpperCase();
			System.out.println(arr[i]);
			}
			for(int i=((arr.length)/2);i<=arr.length;i++) {
			arr[i] = arr[i].toLowerCase();
			System.out.println(arr[i]);
			}
			
		}
		else{
			for(int i=0;i<(((arr.length)+1)/2);i++) {
				arr[i] = arr[i].toUpperCase();
				System.out.println(arr[i]);
				}
			for(int i=(((arr.length)+1)/2);i<=arr.length;i++) {
				arr[i] = arr[i].toLowerCase();
				System.out.println(arr[i]);
				}
		}				
	}
}
