package BInarySearchDemo;

public class BinarySearchDemo1 {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 7, 9, 10 };
		int start = 0;
		int end = arr.length - 1;
		int mid = 0;
		int pos = 0;
		int flag = 0;
		int key = 20;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		while (start <= end && flag == 0) {
			mid = (start + end) / 2;
			if (arr[mid] == key) {
				flag = 1;
				pos = mid + 1;
			} else if (arr[mid] < key) {
				start = mid + 1;
			} else if (arr[mid] > key) {
				end = mid - 1;
			}
		}

		if (flag == 1) {
			System.out.println("Element found at " + pos + " position");
		} else {
			System.out.println("Element not found");
		}

	}

}
