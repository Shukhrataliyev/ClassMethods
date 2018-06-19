package Day_18;

public class Dog {

	String name;
	int size;
	
	public void bark() {
		if (size > 20) {
			System.out.println("Woof Woof Woof");
		}else if(size > 10) {
			System.out.println("Poof Poof Poof");
		}else {
			System.out.println("No barking today");
		}
	}
	
	public int play(String str) {
		if (str.equals("park")){
			return 1;
		}else {
			return 0;
		}
	}
	
	
}
