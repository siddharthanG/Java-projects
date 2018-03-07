package mar1;

public class NiloyRecursive {


			public static void main(String[] args) {
				
				int f=0;
				
				f=fact(5);
				
				
		System.out.println(f);
			}
			
			static int fact(int r){
				
				if(r==0)
					return 1;
				else
					return r*fact(r-1);
				
			}

		} 
