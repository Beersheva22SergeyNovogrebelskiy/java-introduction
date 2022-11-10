import java.util.Arrays;

public class MyArrays {
	/**
	 * 
	 * @param array
	 * @param number
	 * @return NEW APPAY WITH ADDED AT END A GIVEN NUMBER
	 */
	public static int[] addsNumber(int[] array, int number) {
		int[] secondArrays = Arrays.copyOf(array, array.length +1);
		secondArrays[array.length] = number;
		return secondArrays;
	}
	/**
	 * 
	 * @param array
	 * @param index
	 * @return new array with no number at a given index in a given array
	 * if index doesn't exist in a given array it returns the same array
	 */
	public static int[] removeNumber(int array[], int index) {
		int[] secondArrays = array;
		if(index > -1 && index < array.length) {
			secondArrays = new int[array.length - 1];
			System.arraycopy(array, 0, secondArrays, 0, index);
			System.arraycopy(array, index + 1, secondArrays, index, array.length - index - 1);
		}
		return secondArrays;
	}
	/**
	 * 
	 * @param arraySorted
	 * @param number
	 * @return new array with inserted number at an index for keeping array sorted
	 */
	public static int[] insertSorted(int arraySorted[], int number) {
		int i = Arrays.binarySearch(arraySorted, number);
		int[] secondArrays = new int[arraySorted.length + 1];
		if(i < 0) {
			i = -i - 1;
		}
		System.arraycopy(arraySorted, 0, secondArrays, 0, i);
		secondArrays[i] = number;
		System.arraycopy(arraySorted, i, secondArrays, i + 1, arraySorted.length - i);
		return secondArrays;
	}
}
