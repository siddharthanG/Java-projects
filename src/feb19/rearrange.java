package feb19;



public class rearrange {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String z="123456";
		int array[] = null;
	
		
		for(int c=0;c<z.length();c++){
			for(int d=c+1;d<z.length();d++)
			{
				if(array[c]<array[d])
						{
					System.out.println(array[c]);
						}
			}
			
			
		}
				
		
	}

}
