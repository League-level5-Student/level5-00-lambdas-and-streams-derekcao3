package _01_Lambda_Methods;

import java.util.Random;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			
				String reverse = "";
				for(int j = s.length() - 1; j >= 0; j--)
				 {
				 reverse = reverse + s.charAt(j);
				 }
				System.out.println(reverse);
		}, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		Random rand = new Random();
		printCustomMessage((s)->{
			for(int i = 0; i < s.length(); i++) {	
					if(rand.nextBoolean()) {
						System.out.print(s.substring(i,i+1).toUpperCase());
					}
					else {
						System.out.print(s.substring(i,i+1).toLowerCase());
					}
			}
			System.out.println("");
			
		}, "repeat");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String d = "";
			for(int i = 1; i < s.length()+1; i++) {	
				
				d = s.substring(i-1,i) + ".";
				System.out.print(d);
		
			}
			System.out.println("");
		}, "repeat");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String d = s;
			for (int i = s.length()-1; i >=0; i--) {
				if(d.charAt(i)=='a' ||d.charAt(i)=='e' || d.charAt(i)=='i' || d.charAt(i)=='o' ||d.charAt(i)=='u' ) {
					d = d.substring(0,i) + d.substring(i+1);
					
				}
				
			}
			System.out.println(d);
	}, "repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
