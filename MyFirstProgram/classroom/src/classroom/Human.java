package classroom;

public class Human {
	double weight;
	int age;
	String name;
	Human(String name, int age ,double weight){
		
		this.name=name;
		this.age=age;
		this.weight=weight;
	}
	void eat() {
		System.out.println(this.name+" is eating");
		
	}
	void drink() {
		System.out.println(this.name+" is drink");
		
	}

}
