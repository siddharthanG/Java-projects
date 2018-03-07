/*package mar5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Removingspecialcharectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String b ="\\w{1,}";
		
		String a ="{java}/\\*(selenium)";
		
		Pattern c = Pattern.compile(b);
		Matcher d = c.matcher(a);
		
		while(d.find()) {
			
		System.out.println(d.group());
		
		}
	}

}
*/

package mar5;



public class Removingspecialcharectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String a ="{java}/\\*(selenium)";
		
		StringBuffer d = new StringBuffer(a.replaceAll("[^a-zA-Z0-9]", ""));
		
		System.out.println(d);
		
	}
}
		
		
		
		
