package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Pig pig = new Pig();
		Cow cow = new Cow();
		Cat cat = new Cat();
		Dog dog = new Dog();
		farm.add(pig);
		farm.add(cow);
		farm.add(cat);
		farm.add(dog);
		
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).eat();
		}
		
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).makenoise();
		}
		
	}
	
	
	
	
}
