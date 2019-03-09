/* Open This Description:
Complete the function which takes two arguments and returns all numbers which are divisible by given divisor. First argument is an array of numbers and the second is the divisor.

Example
divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]
divisibleBy([1, 2, 3, 4, 5, 6], 2) == [2, 4, 6]
ALGORITHMSARRAYS
 */
package divisible_by_given_number;

import java.util.ArrayList;

public class DivisibleNumbers {
	public static int[] divisibleBy(int[] numbers, int divider) {
		ArrayList <Integer> arraylist = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % divider == 0) {
				arraylist.add(numbers[i]);
			}
		}
		int [] arr = new int[arraylist.size()];
		for(int i = 0; i<arraylist.size(); i++) {
			arr[i] = arraylist.get(i);
		}
		return arr;
	}
}