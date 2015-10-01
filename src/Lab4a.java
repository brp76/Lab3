import java.util.Scanner;

public class Lab4a {
	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is your name? > ");
		name = sc.next();
		
		System.out.printf("Your name: %s", name);
		
	}

}
