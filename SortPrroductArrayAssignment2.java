/**
* Name : Mahima
* Description : Program to sort the array list
* Date : 17/3/21
*/
import java.util.Arrays;

public class SortPrroduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] product = {"Oil","Salt","Sugar","Sugar","CoffeePowder","Salt","Oil","Dal","Jagery"};
		
		Arrays.sort(product,0,9);
		for(int i=0;i<product.length; i++) {
			System.out.println (product[i]);
		}

	}

}
