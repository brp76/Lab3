import java.util.Scanner;
public class Lab3b {
	public static void main(String[] args) {
		//Initialize variables and scanner
		int bottles = 0;
		boolean invalidInput = false;
		Scanner sc = new Scanner(System.in);
		
		do {
			//Ask for number of bottles
			System.out.println("Enter number of bottles of root beer on wall > ");
			if (sc.hasNextInt()) {
				bottles = sc.nextInt();
				invalidInput = false;
				//Check range
				if (bottles <= 0 || bottles >= 100) {
					System.out.println("Must be greater than 0 and less than 100!");
					invalidInput = true;
				}
			} else {
				invalidInput = true;
				System.out.println("Invalid Input!");
				sc.next();
			}
		} while(invalidInput); //Loop to make sure input is valid
		
	}
}
