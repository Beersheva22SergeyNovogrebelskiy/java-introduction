
public class BitOperations {
	
private static final int N_BITS = 64;

/**
 * 
 *  right nBit value [0, 63]
 *  all methods will return -1 in the case of wrong nBit value
 * 
 * @param number - any number
 * @param nBit - bit number
 * @return value of bit with number nBit
 */
	static public int getBitValue(long number, int nBit) {
		int res = -1;
		if (checkNbit(nBit)) {
			long mask = getMask(nBit);
			res = (number & mask) == 0 ? 0 : 1;
/*			if ((number & mask) == 0) {
				res = 0;
			} else {
				res = 1;
			} */
		}
		return res;
	}

private static long getMask(int nBit) {
	return 1l <<nBit;
}
	
	private static boolean checkNbit(int nBit) {
	return nBit < N_BITS && nBit >= 0;
}
	/**
	 * 
	 * @param number - any number
	 * @param nBit - bit number
	 * @param value -true for 1, false for 0
	 * @return new number in which value of nBit'h bit will have a given value
	 */
	static public long setBitValue(long number, int nBit, boolean value) {
		long res = -1;
		if (checkNbit(nBit)) {
			if (value == true) {
				long mask = getMask(nBit);
				res = value ? number | mask : number & ~mask;
//			long mask = 1 << nBit;
			res = number | mask;
//			} else {
//				long mask = ~(1 <<nBit);
//				res = number & mask;
		}
		}
		
		return res;
	}
	/**
	 * 
	 * @param number - any number
	 * @param nBit - bit number
	 * @return new number in which nBit'h bit will be reverted (old value  -1, new value - 0)
	 */
	static public long revertBitValue(long number, int nBit) {
		long res = -1;
		if (checkNbit(nBit)) {
			long mask = getMask(nBit);
			res = number ^ mask;
		}
			
//			int value = getBitValue(number, nBit);
//			if (value == 0) {
//				long mask = 1 <<nBit;
//				res = number | mask;
//			} else {
//				long mask = ~(1 <<nBit);
//				res = number & mask;
//			}		
//		}
		return res;
	}
	
	static public int leadingZeros(long number) {
		int res = 0;
		int nBit = N_BITS - 1;
		while(nBit >= 0 && getBitValue(number, nBit) == 0) {
			nBit--;
			res++;
		}
		return res;
	}
	
	public static int onesInNumber(long number) {
		int res = 0;
		for (int i = 0; i < N_BITS; i++) {
			if (getBitValue(number, i) == 1) {
				res++;
			}
		}
		return res;
	}
}
