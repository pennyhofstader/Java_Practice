package LinearSearchDemo;

import java.util.Scanner;

public class LinearSearchDemo2 {
	// scanner class
	Scanner sc = new Scanner(System.in);
	// initializing the variables
	int size;
	int[] array;
	int pos = 0;
	int flag = 0;
	int key;

	public void implementationOfLinearSearch() {

		// user inputs
		System.out.println("Enter the size of the array");
		size = sc.nextInt();
		array = new int[size];
		System.out.println("Enter the elements of the array");

		insertValues();

		printValues();
		System.out.println();
		System.out.println("Enter the elements to find");
		key = sc.nextInt();
		searchValue(key);

	}

	// inserting elements in array
	public void insertValues() {

		// Your code here...
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();

		}

	}

	// printing elements in array
	public void printValues() {

		// Your code here...
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}

	}

	// linear search
	public void searchValue(int value) {

		// Your code here...

		for (int i = 0; i < size && flag == 0; i++) {
			if (array[i] == key) {
				flag = 1;
				pos = i + 1;
			}
		}

		// search operation if flag is 1

		if (flag == 1) {
			System.out.println("Element foundt at " + pos + " position");
		} else {
			System.out.println("Element Not Found");
		}
	}

	// driver code
	public static void main(String[] args) {

		LinearSearchDemo2 linearsearch = new LinearSearchDemo2();

		linearsearch.implementationOfLinearSearch();

	}

}
