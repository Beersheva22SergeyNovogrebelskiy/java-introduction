
public class IsraelIdentity {
/**
 * 
 * @param id
 * @return true for right id otherwise false
 * control sum should be multiple of 10 (sum % 10 == 0)
 * for even indexes (0, 2, 4, 6, 8) digits as is
 * for odd indexes (1, 3, 5, 9) digit = digit * 2, if > 9 the sum of inner digits is taken
 * example, 123456782 => 1 + 4 (2 * 2) + 3 + 8 (4 * 2) + 5 + 3 (6 * 2 = 12 => 1 + 2) + 7 + 7 (8 * 2 = 16 => 1 + 6
 */
	public static boolean verify(int id) {
		int[] idArrays = Numbers.getDigits(id);
		int controlSum = 0;
		int temp = 0;
		for(int i = 0; i < idArrays.length; i++) {
			if(i % 2 == 0) {
				controlSum += idArrays[i];
			} else {
				temp = idArrays[i] * 2;
				if(temp > 9) {
					controlSum += (temp % 10) + 1;
				} else {
					controlSum += temp;
				}
			}
		}
		return (controlSum % 10 == 0);
}
	/**
	 * 
	 * @return random number of 9 digits matching right Israel id
	 * cycle not more than 9 iterations
	 */
	public static int generateRandomId() {
		int[] idArrays = new int[9];
		idArrays[0] = SportLotoAppl.getRandomInt(1, 9);
		int controlSum = idArrays[0];
		int temp = 0;
		for(int i = 1; i < idArrays.length-1; i++) {
			idArrays[i] = SportLotoAppl.getRandomInt(0, 9);
			if(i % 2 == 0) {
				controlSum += idArrays[i];
			} else {
				temp = idArrays[i] * 2;
				if(temp > 9) {
					controlSum += (temp % 10) + 1;
				} else {
					controlSum += temp;
				}
			}
		}
		temp = controlSum % 10;
		if(temp != 0) {
			idArrays[idArrays.length-1] = 10 - temp;
		}
		int id = Numbers.getNumberFromDigits(idArrays);
		return id;
	}
}
