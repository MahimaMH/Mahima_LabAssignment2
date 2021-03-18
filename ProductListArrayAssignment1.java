/**
* Name : Mahima
* Description : Program to display duplicate value
* Date : 17/3/21
*/
public class ProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] product = {"Oil","Salt","Sugar","Sugar","CoffeePowder","Salt","Oil"};

		for(int i=0;i<product.length; i++)
			 for (int j=i+1;j<product.length;j++)
		{

			if (product[i] .equals(product[j])) {
		 System.out.println (product[j]);
			}
		}
	}
}
