package SelectionSort;

import java.util.Scanner;

public class SelectionSortDemo2 {

	// initializing the variables
	Scanner sc = new Scanner(System.in);
	int smallest;
	int size;
	int[] array;
	boolean status;
	int temp;

	public void implementationOfSelectionSort() {

		// user inputs

		System.out.println("Enter The Size Of Array");
		size = sc.nextInt();
		System.out.println("Enter The Elements Of Array");
		array = new int[size];

		// calling the methods
		insertValues();
		sortValues();
		printValues();

	}

	// inserting elements in array
	public void insertValues() {

		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

	}

	// selection sort
	public void sortValues() {

		for (int i = 0; i < array.length - 1 && status == false; i++) {
			smallest = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[smallest] > array[j]) {
					status = true;
					smallest = j;
				}
			}
			// swap
			temp = array[smallest];
			array[smallest] = array[i];
			array[i] = temp;
		}
		checkForStatus();

	}

	// printing values
	public void printValues() {

		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

	}

	// status check return true if status is true
	public boolean checkForStatus() {

		if (status == true) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {

		// driver code

		SelectionSortDemo2 selectionsort = new SelectionSortDemo2();
		selectionsort.implementationOfSelectionSort();

	}

}
