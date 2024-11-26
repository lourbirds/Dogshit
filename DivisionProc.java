package activities;
import java.util.Scanner;
public class DivisionProc {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Instruction about the program
		pl("---------- Welcome to Division Calculator ----------");
		pl(" >>> This program will Devide the two numbers <<<");
		pl("INSTRUCTIONS : ");
		pl("> The Dividend must be greater than divisor ");
		pl("> Negative numbers and 0 are invalid input  ");
		pl("> In order to Exit the Program Enter 0 in dividend");
		divider();
		//declared and initialize the variables
		int dividend, divisor, quotient =0;
		//Gathering INPUT
		p("Enter Dividend : ");
		dividend = in.nextInt();
		
		if (dividend == 0 ) { //exit program 
			divider();
			pl("Program closed");
			System.exit(0);
		} 
		p("Enter Divisor  : ");
		divisor = in.nextInt();
		divider();
		//Restriction for invalid input
		if (divisor <= 0 || dividend < 0) {
			pl("Zero/Negative number/s not accepted");
		} 
		else if (dividend < divisor) {
			pl("Unable to Process");
		} 
		else {
			//main function of the program where the 2 numbers divide and get the quotient and remainder  
		while(dividend >= divisor) {
			dividend -= divisor;
			quotient++;
		}
		//display output
		pl("Quotient       : "+quotient);
		if(dividend !=0) pl("Remainder      : "+ dividend);
		}
		in.close();
	}
	//--------------------print methods--------------<3
	static void pl(String ashs) {
		System.out.println(ashs);
	} static void pl(int ashs) {
		System.out.println(ashs);
	}
	static void p(String ley) {
		System.out.print(ley);
	}
	static void divider() {
		System.out.println("-----------------------------------------------------");
	}
}
