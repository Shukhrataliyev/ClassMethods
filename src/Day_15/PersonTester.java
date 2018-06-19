package Day_15;

public class PersonTester {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.age = 10;
		p1.gender = 'f';
		p1.name = "Adam";
		p1.eat();
		p1.read();
		int n = p1.run();
		System.out.println("it burns " +n+ " callories");
		System.out.println("Person name is "+ p1.name+" and his initials is "+p1.getInitial());
		p1.goHome("miles about ", 10);
		//System.out.println();
		
//		Person p2 = new Person();
//		p2.age = 10;
//		p2.gender = 'M';
//		p2.name = "Adam";
//		
//		System.out.println("This person has a name of "+p2.name+" he is "+p2.age+" years old "+ " his gender is " + p2.gender );
	}

}
