package mar1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class specialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input= "string%^*)";
		String pattern = "[\\W]";
		
		Pattern view =  Pattern.compile(pattern);
		Matcher view2 = view.matcher(input);
		while(view2.find())
		System.out.println(view2.group());
		
	}

}
