package experience;

import java.util.Scanner;
public class TestExperience {


	public static void main(String[] args) {
		int[] scores = {10, 20, 30, 40, 50};
		printArray(scores);
		int[] numbers = {7, 8, 9};
		printArray(numbers);
	}
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}
}