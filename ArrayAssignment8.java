
/**
 * Nmae:Mahima M Hampali
 * Description: program to convert array elements to uppercase
 * Date :170/21
  */

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment8 {
	//private static String[] arr= {"Soap","Sugar","Teapowder","Oil","Soap","Teapowder"};
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elemenets in an array: ");
		int n=sc.nextInt();
		String[] arr=new String[n];
		System.out.println("Enter elemenets of an array: ");
		for(int i=0;i<n;i++) {
			
			arr[i]=sc.toString();
			
		}
		for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
		}
		sort();
		upperCase();

	}
	public static void sort()
	{
		char[][] arr = null;
		Arrays.sort(arr,0,6);
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		
	}
}
	public static void upperCase() {
		
		String[][] arr;
		for(int i=0;i<arr.length;i++) {
			arr[i] = arr[i].toUpperCase();
			System.out.println(arr[i]);
		}
	}
}