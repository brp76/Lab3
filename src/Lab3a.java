
public class Lab3a {

	public static void main(String[] args) {

		//Initialize steps
		int steps = 0;
		
		//Loop to divide distance by 2 for each step
		for (double distance = 10; distance > 0; distance/=2)	{
			System.out.println("Distance: " + distance + " meters");
			steps ++;
			System.out.println("Steps: " + steps);
		}

		//Display total steps
		System.out.println("Total steps for Paris to reach Helen is " + steps);
	}

}
