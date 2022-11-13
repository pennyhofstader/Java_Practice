package BubbleSort;

import java.util.Scanner;

public class BubbleSortDemo2 {

	// initializing the variables
	public int array[];
	public int NUM_ELEMENTS, temp, i, j;
	public boolean status;
	Scanner sc = new Scanner(System.in);

	public void implmentationOfBubbleSort() {

		// user inputs
		System.out.println("Enter The Size Of Array");
		NUM_ELEMENTS = sc.nextInt();
		System.out.println("Enter The Elements Of The Array");
		array = new int[NUM_ELEMENTS];

		// calling the insert sort and print methods
		insertValues();
		sortValues();
		printValues();

	}

	// inserting elements in array
	public void insertValues() {

		for (int i = 0; i < NUM_ELEMENTS; i++) {
			array[i] = sc.nextInt();
		}

	}

	// if statement to check status
	public boolean checkForStatus() {

		if (status == true) {
			return true;
		}
		return false;
	}

	// bubble sort
	public void sortValues() {

		for (i = 0; i < NUM_ELEMENTS - 1; i++) {
			for (j = 0; j < NUM_ELEMENTS - i - 1 && status == false; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					status = true;
				}

			}
			// checking the status
			checkForStatus();
		}

	}

	// printing the elements
	public void printValues() {

		for (int i = 0; i < NUM_ELEMENTS; i++) {
			System.out.print(array[i] + " ");
		}

	}

	public static void main(String[] args) {

		// driver code

		BubbleSortDemo2 bubblesort = new BubbleSortDemo2();
		bubblesort.implmentationOfBubbleSort();

	}

}