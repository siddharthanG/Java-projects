package mar6;

public class AlphaNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		String a ="TestLeaf: like, ... [] {} this is a string";
		
		StringBuffer d = new StringBuffer(a.replaceAll("[\\w\\s]",""));
		
		System.out.println(d);
	}

}
