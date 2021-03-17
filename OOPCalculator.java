package OOPCalculator;

import java.util.Scanner;
import java.io.*;

public class OOPCalculator {
	
	Scanner readInput = new Scanner(System.in);
	
	int calFunc = 0; //used to set operator
	float n1, n2; // two floats acquired by user
	String toContinue = " ";
	
	/**
	 * Display a thank you message when user select "5", "X" or "x"
	 * 
	 * @param None
	 */
	public void displayBye() {
		
		System.out.println();
		
		System.out.println("Thank you for using <Ting-Tzu Chiu's> Handy Calculator.");
		toContinue = pressAnyKeyToContinue();
		
	}
	
	
	/**
	 * Returns the key entered by the user
	 * 
	 * @param None
	 */
	public static String pressAnyKeyToContinue() {
		   String toContinue = null;
		   System.out.print("Press the ENTER key to continue...");
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   try {
		    toContinue = br.readLine();
		   }
		   
		   catch (IOException e){
		    e.printStackTrace();
		    System.exit(1);
		    
		   }
		   return toContinue;
		 }
	
	/**
	 * Show the calculate result, depending on users selection 
	 * 
	 * @param None
	 */
	public void displayResults() {
		
		if (calFunc == 1) {
			System.out.printf("Result of addition %.2f and %.2f is %.2f \n", n1, n2, n1 + n2);
		}
		else if (calFunc == 2) {
			System.out.printf("Result of subtraction %.2f and %.2f is %.2f \n", n1, n2, n1 - n2);
		}
		else if (calFunc == 3) {
			System.out.printf("Result of multiplcation %.2f and %.2f is %.2f \n", n1, n2, n1 * n2);
		}
		else if (calFunc == 4){
			System.out.printf("Result of divition %.2f and %.2f is %.2f \n", n1, n2, n1 / n2);
		}
		
		toContinue = pressAnyKeyToContinue();
		
		System.out.println(" ");
		
	}
	
	/**
	 * Ask user to input two floats properly
	 * 
	 * @param None
	 */
	public void askTwoValues() {
		
		String strFunc;
		
		if (calFunc == 1) {
			strFunc = "add";
		}
		else if (calFunc == 2) {
			strFunc = "substract";
			
		}
		else if (calFunc == 3) {
			strFunc = "multiply";
		}
		else {
			strFunc = "divide";
		}
		
		System.out.printf("Please enter two floats to %s , separated by a space: ", strFunc);
		while (true) {
			
			
			try {
		
		n1 = readInput.nextFloat();
		n2 = readInput.nextFloat();
		
		if ((n2 == 0) && (calFunc == 4)) {
			throw new ArithmeticException();
		}
		
		break;
			}
			
			catch (ArithmeticException e) {
				System.out.printf("You cannot divide by zero. Please re---enter both floats: ");
				readInput.nextLine(); //clean buffer
			}
			
			catch(Exception e) {
				System.out.printf("You have entered invalid floats. Please re---enter: ");
				readInput.nextLine(); //clean buffer
			}
		}
		readInput.nextLine();
		
	}
	
	/**
	 * Return the selection from the users input 
	 * 
	 * @param option
	 */
	public int askCalcChoice(){
		
		String selection;
		
		while (true) {
			
		try {
				
		System.out.println("Welcome to <Ting-Tzu Chiu's> Handy Calculator");
		System.out.println();
		System.out.println();
		System.out.println("  1. Addition");
		System.out.println("  2. Subtraction");
		System.out.println("  3. Multiplication");
		System.out.println("  4. Division");
		System.out.println("  5. Exit");
		System.out.println();
		System.out.println();
		
		System.out.printf("What would you like to do? ");
		
		selection = readInput.nextLine();		
		
		if ((Integer.parseInt(selection) < 1) || (Integer.parseInt(selection) > 5) ) {
			System.out.println("You have entered an invalid choice. Try again.");		
		}
		
		else if ((selection.charAt(0) == '1') || (selection.charAt(0) == 'A') || (selection.charAt(0) == 'a') ){ 
			calFunc = 1;
			break;
		}
		
		else if ((selection.charAt(0) == '2') || (selection.charAt(0) == 'S') || (selection.charAt(0) == 's') ) {
			calFunc = 2;
			break;
		}
		
		else if ((selection.charAt(0) == '3') || (selection.charAt(0) == 'M') || (selection.charAt(0) == 'm') ) {
			calFunc = 3;
			break;
		}
		
		else if ((selection.charAt(0) == '4') || (selection.charAt(0) == 'D') || (selection.charAt(0) == 'd') ) {
			calFunc = 4;
			break;
		}
		
		else if ((selection.charAt(0) == '5') || (selection.charAt(0) == 'X') || (selection.charAt(0) == 'x') ){
			calFunc = 5;
			break;
		}

		else {
			calFunc = 0;
			System.out.println("You have entered an invalid choice. Try again.");
			System.out.println();
		}
		}
		catch (Exception e) {
			System.out.println("You have entered an invalid choice. Try again.");
		}
		
	  }
		return calFunc;
			
			
	}
		
		
	}


