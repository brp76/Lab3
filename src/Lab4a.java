import java.util.Scanner;

public class Lab4a {
	public static int choice = 0, utils = 0;
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String name;
		
		int count = 0;
		
		System.out.print("What is your name? > ");
		name = sc.next();
		
		//Repeat until death
		do {
			System.out.println("(1) - Buy people ice cream");
			System.out.println("(2) - Steal ice cream from people");
			System.out.println("(3) - Dream about people eating ice cream");
			System.out.println("(4) - Die");
			
			//Function for user to enter choice
			icecreamChoice(name);
			
			System.out.print("How many people? > ");
			count = sc.nextInt();
			
		} while (choice != 4);

		
	}
	//Accepts one argument and returns one value
	public static int icecreamChoice(String n){
		//Prompt user for action
		System.out.printf("Enter next action of %s > ", n);
		choice = sc.nextInt();
		while (choice > 4 || choice < 1) {
			System.out.printf("Enter next action of %s (1-4)> ", n);
			choice = sc.nextInt();
		}
		return choice;
	}
	
}
