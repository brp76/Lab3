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
			iceCreamChoice(name);
			
			if (choice != 4) {
				System.out.print("How many people? > ");
				count = sc.nextInt();
				//Calculate util gain/loss
				utilCalculate(choice, count);
			}

		} while (choice != 4);
		
	}
	
	public static int iceCreamChoice(String n){ //Accepts one argument and returns one value
		//Prompt user for action
		System.out.printf("Enter next action of %s > ", n);
		choice = sc.nextInt();
		while (choice > 4 || choice < 1) {
			System.out.printf("Enter next action of %s (1-4)> ", n);
			choice = sc.nextInt();
		}
		return choice;
	}
	
	public static int utilCalculate(int a, int b) { //Calculate utils from choice and count
		int c = 0;
		switch (a) {
		case 1:
			c = 3 * b;
			break;
		case 2:
			c = -5 * b;
			break;
		case 3: default:
			c = 0;
		}
		//Print outcome
		System.out.printf("This action caused %d utils of happiness\n", c);
		//Add outcome to total utils
		utils += c;
		return utils;
	}
}
