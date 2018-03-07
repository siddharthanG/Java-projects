package Mar2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class percentageofletters {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String b ="Tiger Runs @ The Speed Of 100km/hour.";
		int count=1;
		int count2=1;
		int count3=1;
		int count4=1;
		int NumberofLetters=0;
		float numberofsmallLetters =0;
		float numberofcaptitalletters=0;
		float numberofdigits =0;
		String a ="[a-zA-Z0-9\\W\\s]";
		String f = "[a-z]";
		String g = "[A-Z]";
		String h = "[0-9]";
		Pattern d =  Pattern.compile(a);
		Pattern i =  Pattern.compile(f);
		Pattern j =  Pattern.compile(g);
		Pattern k =  Pattern.compile(h);
		Matcher e = d.matcher(b);
		Matcher l = i.matcher(b);
		Matcher m = j.matcher(b);
		Matcher n = k.matcher(b);

		while(e.find())
		{
			NumberofLetters=(count++);
			while(l.find())
			{

				numberofsmallLetters=count2++;
			}
			while(m.find())
			{

				numberofcaptitalletters=count3++;
			}
			while(n.find())
			{

				numberofdigits=count4++;
			}
		}

		System.out.println("number of Total Letters both capital and small= "+NumberofLetters);
		System.out.println("percentage of small letters= "+((numberofsmallLetters/NumberofLetters)*100)+"%");
		System.out.println("percentage of capital letters= "+((numberofcaptitalletters/NumberofLetters)*100)+"%");
		System.out.println("percentage of digits= "+((numberofdigits/NumberofLetters)*100)+"%");
	}
}
