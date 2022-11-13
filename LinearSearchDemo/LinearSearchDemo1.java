package LinearSearchDemo;

public class LinearSearchDemo1 {

	public static void main(String[] args) {

		// initializing the variables
		int arr[] = { 1, 2, 6, 8, 5 };
		int key = 5;
		int pos = 0;
		int flag = 0;

		// printing the array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// linear search
		for (int i = 0; i < arr.length && flag == 0; i++) {
			if (arr[i] == key) {

				flag = 1;
				pos = i + 1;

			}

		}

		// search operation if flag is 1
		if (flag == 1) {
			System.out.println("Element found at " + pos + " position");
		} else {
			System.out.println("Element Not Found");
		}
	}

}
