package mar1;

public class niloyrecString {

			public static void main(String[] args) {
				String s1="";
				String s2="clep";
				
				s1=RecStr(s2);
				System.out.println(s1);
	

			}

		 static String RecStr( String s3){
			
				if(s3.length()<=1)
					
					return s3;
				
					else
						return RecStr(s3.substring(1)) +s3.charAt(0);
		 
			} 
		} 


