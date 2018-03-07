package mar1;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "oooo   rrrrrr   kkkkkk";
		
		System.out.println("Before replacing " +input);
		
		String a =input.replaceAll("   ", " ");
		
		System.out.println("After removing " +a);
	}

}
