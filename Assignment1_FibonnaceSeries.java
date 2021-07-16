package week1.day1;

/*
 * Goal: To find Fibonnaci Series for given range
 * input(range):8 input
 * output: 0,1,1,2,3,5,8,13
 */
public class Assignment1_FibonnaceSeries {

	public static void main(String[] args) {

		// intialize 3 intput variables(Tip range=8,firstnum=0,secNum=1,sum in series
		int range = 7;
		int firstNum = 0;
		int secondNum = 1;
		int sum = 1;

		// print first number

		System.out.println("The Fibonnace Series:");
		System.out.println(firstNum);
		System.out.println(secondNum);

		// iterate from 1 to the range

		for (int i = 1; i < range; i++) {
			// add first and second number assign to sum

			sum = firstNum + secondNum;

			// Assign second number to first number

			firstNum = secondNum;

			// Assign sum to second number

			secondNum = sum;

			// print sum

			System.out.println(sum);
		}
	}
}
