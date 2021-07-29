package classroom;

import java.swing.JOptionPane;
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
		
//		
//		
//		Scanner scanner =new Scanner(System.in);
//		
//		System.out.println("what is your name");
//		String name = scanner.nextLine();
//		
//		System.out.println("how old are you");
//		int age = scanner.nextInt();
//		
//		System.out.println("favor food");
//		String food = scanner.nextLine();
//		scanner.nextLine();
//		
//		System.out.println("hello "+ name);
//		System.out.println("you are "+ age + "years old");
//		
		
		
		
		//TODO expressions
		
//		int friends = 10 ;
//		friends++;
//		
//
//		
//		System.out.println(friends);
		
		
		
		//TODO GUI
		
//		String name = javax.swing.JOptionPane.showInputDialog("enter your name");
//		javax.swing.JOptionPane.showMessageDialog(null, "hello "+name);
//		
//		
//		int age = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("enter your age"));
//		javax.swing.JOptionPane.showMessageDialog(null, "you are "+age+" years old");
//		
//		
//		Double height = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("enter your heiht"));
//		javax.swing.JOptionPane.showMessageDialog(null, "you are "+height+" cm tall");
		
		
		//TODO Math class 
		
		double x;
		double y;
		double z;
	    Scanner scanner =new Scanner(System.in);
	    
	    System.out.println("enter side x:");
	    x= scanner.nextDouble();
	    System.out.println("enter side xy");
	    y= scanner.nextDouble();
	    
	    z = Math.sqrt((x*x)+(y*y));
	    
		System.out.println("the hypotenuse is:"+z);
		scanner.close();
	}

}
