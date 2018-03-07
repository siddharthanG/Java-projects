/*package mar1;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class reversejava {
static List<Character> a;
	public static void main (String[]args)
	
	
	{
		List<String> reverseInput = newList<String>();
		reverseInput.add("s");
		reverseInput.add("i");
		reverseInput.add("d");
		reverseInput.add("d");
		reverseInput.add("h");
		reverseInput.add("u");
		List<Character> reverseInput1 = new List<Character>();
		reverseInput1.addAll(reverseInput);
		
		a=reverse(reverseInput1);
		System.out.println(a);
	
	}
	
	static List<String> reverse(List<String> reverse1)
	{
		if(reverse1.size()==0)
		
		return reverse1;
				
		else		
		 
			//reverse1.r
				
		return reverse(reverse1);
	}
	
}
*/

/*package mar1;

import java.nio.IntBuffer;

public class reversejava {

	public static void main (String[]args)
	{
		
	int a = 12345;
	int b=0;
	int sum = 0;
	int rem;
for (int i=1;i<=5;i++)
{
	rem =(a/10);
	sum=(sum*10)+rem;
	
	b=rem%10;
}
System.out.println(sum);
	}
	}*/
	
package mar1;



public class reversejava {
	
	public static void main (String[]args)
	{
		String st="niloy";
		String st1= new StringBuffer(st).reverse().toString();
		System.out.println(st1);
	}
}