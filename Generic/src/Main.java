import java.util.*;
class Animal { }
class Dog extends Animal { }
public class Main {
	static void dogMethod(List<Dog> list) { }
	static void animalMethod(List<Animal> list) { }
	static void myMethod(List<? extends Animal> list) { }
	public static void main(String[] args) {
		List<Dog> dogList = new ArrayList<Dog>();
		dogMethod(dogList); // 1
		animalMethod(dogList); // 2
		myMethod(dogList); // 3
		List<Animal> animalList = new ArrayList<Animal>();
		myMethod(animalList); // 4
	}
}