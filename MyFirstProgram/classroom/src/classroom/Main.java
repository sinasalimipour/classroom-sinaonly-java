package classroom;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//TODO variables 101
		
		//int a;//deckaration	
		//a=5;// assignment
		
//		int a=123;//initialization
//		System.out.println("x");
//		System.out.println("my number is: "+a);
		
		//String name = "bro";
		
		//TODO swap two variables 102
		
//		String x = "water";
//		String y = "kool-aid";
//		String tamp ;
//		
//		tamp=x;
//		x=y;
//		y=tamp;
//		
//		
//		System.out.println("x: "+x);
//		System.out.println("y: "+y);
		
		//TODO user input 103
		
		
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("what is your name");
		String name = scanner.nextLine();
		System.out.println("how old are you");
		int age = scanner.nextInt();
		
		
		System.out.println("hello "+ name);
		System.out.println("you are "+ age + "years old");
		
	}

}
