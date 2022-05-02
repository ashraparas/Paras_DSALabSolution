package com.glearning.pg.main;

import com.glearning.pg.services.*;

public class Driver {
	
	public static void main(String[] args) {
		
       String text = "( [ [ { } ] ] )" ;
       String text1 = "( [ [ { } ] ) )";
       String text2 = "(){})";
       String text3 = "( ( [ [ { } ]( ] ) )";
       Boolean result ; 
       
       System.out.println("..........................................................");
      
       /* function to check if brackets are balanced */ 
       
       result = Services.balanceBrackets(text);
       System.out.println("Result for String Text " + text + " is");
       
       /* Function to print result value for balanced Brackets */
       
       Services.printResult(result);
       
       result = Services.balanceBrackets(text1);
       System.out.println("Result for String Text " + text1 + " is");
       Services.printResult(result);
       
       result = Services.balanceBrackets(text2);
       System.out.println("Result for String Text " + text2 + " is");
       Services.printResult(result);
       
       result = Services.balanceBrackets(text3);
       System.out.println("Result for String Text " + text3 + " is");
       Services.printResult(result);
       
       }

}
