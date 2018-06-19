package Day_15;

public class Person {
	
	String name;
	int age;
	char gender;

	public void eat() {
	
		System.out.println(name+ " is eating");
	}
	
	public void read() {
		if (gender == 'm' || gender == 'M') {
			System.out.println(name+ " is reading and he is "+age+" years old");
		}else if(gender == 'f' || gender == 'F'){
			System.out.println(name+ " is reading and she is "+age+" years old");
		}else {
			System.out.println("incorrect gender");
		}
	}
	
	public int run(){
		
		System.out.println("run 1 mile");
		return 10;
		
	}
	
	public char getInitial() {
		char c = name.charAt(0);
		
		return c; 
	}
	
	public void goHome(String trget, int distance) {
		System.out.println("Go home for "+trget+distance);
	}
}