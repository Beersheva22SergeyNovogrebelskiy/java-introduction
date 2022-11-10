
public class Numbers {
	public static int getNdigits(long number) {
		int res = 0;
		do {
			number /= 10;
			res++;
		} while(number != 0);
		return res;
	}
	
	/**
	 * @param number
	 * @return true only if number comprises of 6 digits
	 * and sum of first three digits equals the sum of last three digits
	 */	
	public static boolean sHappyNumber(int number) {
		int sumRightHalf = 0;
		int sumLeftHalf = 0;
		for(int i = 0; i < 3; i++) {
			sumRightHalf += number % 10;
			number = number / 10;
		}
		for(int i = 0; i < 3; i++) {
			sumLeftHalf += number % 10;
			number = number / 10;
		}
		return (sumLeftHalf == sumRightHalf);
	}
	
	public static int[] getDigits(int number) {
		int res[] = new int[getNdigits(number)];
		for(int i = res.length - 1; i >= 0; i--) {
			res[i] = number % 10;
			number /= 10;
		}
		return res;
	}
	
	public static int getNumberFromDigits(int[] digits) {
		int res = 0;
		for(int i = 0; i < digits.length; i++) {
			res = res * 10 + digits[i];
		}
		return res; 
	}

}

