package com.oraclejava.exam2;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Dog();
//		animal.cry();
		
		
		Animal animal2 = new Cat();
//		animal2.cry();
		
		cryer(animal);
		cryer(animal2);
		
		Dog dog = new Dog();
		System.out.println(dog instanceof Animal);

	}

	public static void cryer(Animal ani) {
		ani.cry();
	}
	
}
