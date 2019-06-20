package test_programs_java_8;

import java.util.ArrayList;

@FunctionalInterface
interface Addition {
	public void add(int a, int b);
}

public class LambdaTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a2 = (int a, int b) ->   {
			System.out.println(a * b);
		};
		
		a2.add(1,2);
		
		
		
//		 ArrayList<Integer> arrL = new ArrayList<Integer>(); 
//	        arrL.add(1); 
//	        arrL.add(2); 
//	        arrL.add(3); 
//	        arrL.add(4); 
//	  
//	        // Using lambda expression to print all elements 
//	        // of arrL 
//	        arrL.forEach(n -> System.out.println(n)); 
//	  
//	        // Using lambda expression to print even elements 
//	        // of arrL 
//	        arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); }); 
	}

}
