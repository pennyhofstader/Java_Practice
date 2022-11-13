package BInarySearchDemo;

import java.util.Scanner;

public class BInarySearchDemo2 {

	Scanner sc = new Scanner(System.in);
	int size;
	int[] array;

	int key;
	int mid;

	public void implementationOfBinarySearch() {

		System.out.println("Enter The Size Of The Array");
		size = sc.nextInt();

		System.out.println("Enter the elements of the array");
		array = new int[size];

		insertValues();
		System.out.println();
		System.out.println("Enter the value to find");
		key = sc.nextInt();

		searchValue();

	}

	public void insertValues() {

// Your code here...
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
			System.out.print(array[i] + " ");
		}

	}

	public void searchValue() {

// Your code here...
		int start = 0;
		int end = size - 1;
		int flag = 0;
		int pos = 0;
		while (start <= end && flag == 0) {
			mid = (start + end) / 2;
			if (array[mid] == key) {
				flag = 1;
				pos = mid + 1;
			} else if (array[mid] < key) {
				start = mid + 1;
			} else if (array[mid] > key) {
				end = mid - 1;
			}
		}

		if (flag == 1) {
			System.out.println("Element found at " + pos + " position");
		} else {
			System.out.println("Element not found");
		}

	}

	public static void main(String[] args) {

// Your code here...

		BInarySearchDemo2 binary = new BInarySearchDemo2();
		binary.implementationOfBinarySearch();

	}

}