package BubbleSort;

public class BubbleSortDemo1 {

	public static void main(String[] args) {
		
		int [] array = {7,8,3,1,2};
		
		for(int i = 0; i < array.length -1; i++) {
			for(int j=0; j < array.length-i-1; j++) {
				if(array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		for(int element : array) {
			System.out.print(element + " ");
		}
	}
}
