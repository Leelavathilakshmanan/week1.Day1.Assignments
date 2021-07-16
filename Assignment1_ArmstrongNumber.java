package week1.day1;
//To find whether a number is armstrong number

/*Input=153
 * Output=(1*1*1)+(5*5*5)+(3*3*3)=153
 * use if and while loop
 */

public class Assignment1_ArmstrongNumber {

	public static void main(String[] args) {
		// Declare your input

		int armnumber = 153;

		/*
		 * Declare a three more input variables as calculated,remainder,original
		 * (tip:intialize calculated alone)
		 */
		int calculated = 0;
		int remainder, original, quotient;

		// Assign input into variable original

		original = armnumber;

		System.out.println("Input number: " + armnumber);

		/*
		 * use loop to calculate,use while loop to set condition until the number
		 * greater than 0
		 */

		while (armnumber > 0) {

			// get the remainder when done by 10

			remainder = armnumber % 10;

			// get the quotient when done by 10

			quotient = armnumber / 10;

			// within loop:Add calculated with the cube of remainder
			// and assign it to calculated

			calculated = calculated + (remainder * remainder * remainder);
			armnumber = quotient;

		}

		/*
		 * check whether calculated and original are same if it matches print it as
		 * armstrong number
		 */

		if (original == calculated) {

			System.out.println("The number is Armstrong Number");

		} else {
			System.out.println("Its not an Armstrong number");
		}

	}

}
