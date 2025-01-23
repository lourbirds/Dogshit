package comprog2_Acts;
import java.util.*;
public class Act2LMSys {
	    static Scanner in = new Scanner(System.in);
		public static void main(String[] args) {
	        String a1, a2, a3, a4; //authors
	        String t1, t2, t3 ,t4; //titles	        
			String b1, b2, b3, b4;//id's
			double p1, p2, p3, p4; //prices
	        int choice; 
	        String user;
			System.out.println("Enter details for Book 1 : ");
	        b1= getBookID(in);
	        t1=getTitle(in);
	        a1=getAuthor(in);
	        p1=getPrice(in);
		   System.out.println("Enter details for Book 2 : ");
		    b2 = getBookID(in);
	        t2=getTitle(in);
	        a2=getAuthor(in);
	        p2=getPrice(in); 
		    System.out.println("Enter details for Book 3 : ");
		    b3 = getBookID(in);
	        t3=getTitle(in);
	        a3=getAuthor(in);
	        p3=getPrice(in);    
	        System.out.println("Enter details for Book 4 : ");
		    b4= getBookID(in);
	        t4=getTitle(in);
	        a4=getAuthor(in);
	        p4=getPrice(in);	        
	       while(true){
	        System.out.println("______________________________________________________");
	        System.out.println("Select an Option \n [1] View All Books by Author \n [2] View All Books by Title \n [3] View All Books Price by ID \n [0] Exit");
	        System.out.print("Enter number (0-3) : ");
	        choice=in.nextInt();
	         in.nextLine();
	        switch (choice){
	        	case 1:
	        		System.out.println("______________________________________________________");
		        	System.out.print("Enter Book Author : ");
		        	user= in.nextLine();
		        	System.out.println("______________________________________________________");
		        	viewBA(user, b1, b2 ,  b3,  b4,  a1, a2,  a3,  a4, t1, t2, t3, t4, p1, p2, p3, p4);
	        	break;
	        	case 2:
	        		System.out.println("______________________________________________________");
	        		System.out.print("Enter Book Title : ");
		        	user= in.nextLine();
		        	 System.out.println("______________________________________________________");
		        	viewBT(user, b1, b2 ,  b3,  b4,  a1, a2,  a3,  a4, t1, t2, t3, t4, p1, p2, p3, p4);
	        	break;
	        	case 3:
	        		 System.out.println("______________________________________________________");
	        		System.out.print("Enter Book ID : ");
		        	user= in.nextLine();
		        	System.out.println("______________________________________________________");
	        		viewBPID(user, b1, b2 ,  b3,  b4,  a1, a2,  a3,  a4, t1, t2, t3, t4, p1, p2, p3, p4);
	        	break;
	        	case 0:
	        		 System.out.println("______________________________________________________");
	        		System.out.println("Bye <3...");
	        		System.exit(1);
	        	break;
	        	default:
	        		 System.out.println("______________________________________________________");
	        		System.out.println("Invalid Input. Try again.");
	        		 System.out.println("______________________________________________________");
	        	break;
	        }
	       }
		}
		//getters
	static String getTitle(Scanner in){
		System.out.print("Enter Book Title : ");
		return in.nextLine();
	}
	static String getAuthor(Scanner in){
		System.out.print("Enter Book Author : ");
		return in.nextLine();
	}
	static String getBookID(Scanner in){
		System.out.print("Enter Book ID : ");
		return  in.nextLine();
	}
	static double getPrice(Scanner in){
		System.out.print("Enter Book Price : ");
		double price = in.nextDouble();
		 in.nextLine();
		return price;
	}
	//Searching methods
	/*a1,b1,t1,p1
	 * */
	static void viewBA(String user,String b1, String b2 , String b3, String b4, String a1, String a2, 
		String a3, String a4, String  t1,   String  t2,  String  t3,  String  t4, double p1, double p2, double p3, double p4){
		if (user.equalsIgnoreCase(a1)) {
			System.out.println("Book 1 : ");
			System.out.println("Book ID:  "+b1);
			System.out.println("Title :  "+t1);
			System.out.printf("Price : %.2f%n ",p1);
			System.out.println("______________________________________________________");
		} 	
		if (user.equalsIgnoreCase(a2)) {
			System.out.println("Book 2 : ");
			System.out.println("Book ID :  "+b2);
			System.out.println("Title :  "+t2);
			System.out.printf("Price : %.2f%n ",p2);
			 System.out.println("______________________________________________________");
		}
		if (user.equalsIgnoreCase(a3)) {
			System.out.println("Book 3 : ");
			System.out.println("Book ID :  "+b3);
			System.out.println("Title :  "+t3);
			System.out.printf("Price : %.2f%n ",p3);
			System.out.println("______________________________________________________");
		}
		if (user.equalsIgnoreCase(a4)) {
			System.out.println("Book 4 : ");
			System.out.println("Book ID :  "+b4);
			System.out.println("Title :  "+t4);
			System.out.printf("Price : %.2f%n ",p4);
			System.out.println("______________________________________________________");
		} 
		if(!user.equalsIgnoreCase(a1) && !user.equalsIgnoreCase(a2) && !user.equalsIgnoreCase(a3) && !user.equalsIgnoreCase(a4)) {
			System.out.println("No book found for the author : " + user);
			System.out.println("______________________________________________________");
		}		
	}
	static void viewBT(String user, String b1, String b2 , String b3, String b4, String a1, String a2, 
		String a3, String a4, String  t1,   String  t2,  String  t3,  String  t4, double p1, double p2, double p3, double p4){
		System.out.println();
		if (user.equalsIgnoreCase(t1)) {
			System.out.println("Book 1 : ");
			System.out.println("Book ID :  "+b1);
			System.out.println("Author :  "+a1);
			System.out.printf("Price : %.2f%n ",p1);
			System.out.println("______________________________________________________");
		} 	
		if (user.equalsIgnoreCase(t2)) {
			System.out.println("Book 2 : ");
			System.out.println("Book ID :  "+b2);
			System.out.println("Author :  "+a2);
			System.out.printf("Price : %.2f%n ",p2);
			System.out.println("______________________________________________________");
		}
		if (user.equalsIgnoreCase(t3)) {
			System.out.println("Book 3 : ");
			System.out.println("Book ID :  "+b3);
			System.out.println("Author :  "+a3);
			System.out.printf("Price : %.2f%n ",p3);
			System.out.println("______________________________________________________");
		}
		if (user.equalsIgnoreCase(t4)) {
			System.out.println("Book 4 : ");
			System.out.println("Book ID :  "+b4);
			System.out.println("Author :  "+a4);
			System.out.printf("Price : %.2f%n ",p4);
			System.out.println("______________________________________________________");
		} 
		if (!user.equalsIgnoreCase(t1) && !user.equalsIgnoreCase(t2) && !user.equalsIgnoreCase(t3) && !user.equalsIgnoreCase(t4)) {
			System.out.println("No book found for the title : " + user);
			System.out.println("______________________________________________________");
		}		
	}
	static void viewBPID(String user, String b1, String b2 , String b3, String b4, String a1, String a2, 
			String a3, String a4, String  t1,   String  t2,  String  t3,  String  t4, double p1, double p2, double p3, double p4){
		if (user.equalsIgnoreCase(b1)) {
			System.out.println("Book 1 : ");
			System.out.println("Title :  "+t1);
			System.out.println("Author :  "+a1);
			System.out.printf("Price : %.2f%n ",p1);
			System.out.println("______________________________________________________");
		} 	
		if (user.equalsIgnoreCase(b2)) {
			System.out.println("Book 2 : ");
			System.out.println("Title :  "+t2);
			System.out.println("Author :  "+a2);
			System.out.printf("Price : %.2f%n ",p2);
			System.out.println("______________________________________________________");
		}
		if (user.equalsIgnoreCase(b3)) {
			System.out.println("Book 3 : ");
			System.out.println("Title :  "+t3);
			System.out.println("Author :  "+a3);
			System.out.printf("Price : %.2f%n ",p3);
			System.out.println("______________________________________________________");
		}
		if (user.equalsIgnoreCase(b4)) {
			System.out.println("Book 4 : ");
			System.out.println("Title :  "+t4);
			System.out.println("Author :  "+a4);
			System.out.printf("Price : %.2f%n ",p4);
			System.out.println("______________________________________________________");
		} 
		if (!user.equalsIgnoreCase(b1) && !user.equalsIgnoreCase(b2) && !user.equalsIgnoreCase(b3) && !user.equalsIgnoreCase(b4)) {
			System.out.println("No book found for the BookID : " + user);
			System.out.println("______________________________________________________");
		}		
	}
}

