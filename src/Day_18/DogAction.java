package Day_18;

public class DogAction {

	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		d1.name = "Puppy1";
		d1.size = 5;
		d1.bark();
		System.out.println(d1.play("park"));
		
		
		Dog d2 = new Dog();
		d2.name = "Puppy2";
		d2.size = 15;
		d2.bark();
		System.out.println(d1.play("no park"));
		
		
		Dog d3 = new Dog();
		d3.name = "Puppy3";
		d3.size = 25;
		d3.bark();
		//System.out.println(d3.play("park"));
		
		
		
	}

}
