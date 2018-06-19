package Day_18;

import java.util.Arrays;

public class DogGenerator {

	public static void main(String[] args) {
		
		String[] names = {"Puppy1","Puppy2","Puppy3","Puppy4","Puppy5"};
		int [] sizes = {1,2,3,4,5};
		
		Dog[] doggy = new Dog[5];
		for(int i = 0; i<doggy.length; i++) {
			System.out.println("Doggy names: "+names[i]+" and sizes "+sizes[i]);
			doggy[i] = new Dog();
			doggy[i].name = names[i];
			doggy[i].size = sizes[i];
			
			
			
		}

		for(Dog eachDog: doggy) {
			eachDog.bark();
			System.out.println(doggy);
		}
		
	}

}
