
public class SportLotoAppl {

	/**
	 * Application displays out 5 random numbers from 1 to 49 inclusive
	 * numbers can not be repeated in a sequence of 6 random number
	 * 
	 */
	public static void main(String[] args) {
		int count = 0;
		long check = 0l;
		do {
			int number = getRandomInt(1, 49);
			if (0 == BitOperations.getBitValue(check, number)) {
				check = BitOperations.setBitValue(check, number, true);
				count++;
				System.out.print(number + " ");
			} 
		} while (count < 6);
		
	}
	
	public static int getRandomInt(int min, int max) {
		return (int) (min + Math.random() * (max -min + 1));
	}
}
