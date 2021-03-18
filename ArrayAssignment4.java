/**
* Name : Mahima
* Description : program to convert arraylist to array
* Date : 17/3/21
*/
import java.util.ArrayList;
public class ArrayAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> x=new ArrayList<String>();
		x.add("A");
		x.add("B");
		x.add("C");
		x.add("D");
		x.add("E");
		
		Object[] Y=x.toArray(new String[x.size()]);
		
		for(Object Z:Y)
		{
			System.out.print(Z +"\t");
		}

	}

}
