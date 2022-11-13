package DSAQuestions;

import java.util.*;
/*
Question 1

A rectangle is golden if the ratio of its sides is in between
[1.6,1.7] , both inclusive

Take N rectangle’s width and height as input and return the number of
the golden rectangle as output.

Sample input
2 // no of rectangles

165 100
180 100
*/

public class DSAQuestion1 {
	// initializing the variables

	Scanner sc = new Scanner(System.in);
	int size;
	int[] rectArray;
	float length;
	float breadth;
	int num;
	float ratio;

	void DSAQuestionImplementation() {

		System.out.println("Enter The Number Of Rectangles");

		size = sc.nextInt();
		for (int i = 0; i < size; i++) {

			// taking input for rectangle length and breadth
			System.out.println("Enter The Width Of Rectangle");
			length = sc.nextInt();
			System.out.println("Enter The Breadth Of Rectangle");
			breadth = sc.nextInt();

			// calculating the ratio
			if (breadth < length) {
				ratio = length / breadth;
			} else {
				ratio = breadth / length;
			}

			// incrementing the number of golden rectangles if the condition is true
			if (ratio >= 1.6 && ratio <= 1.7) {
				num++;
			}
		}
		System.out.println("Number Of Golden Rectangles are " + num);
	}

	public static void main(String[] args) {

		DSAQuestion1 dsaq1 = new DSAQuestion1();

		dsaq1.DSAQuestionImplementation();

	}

}
