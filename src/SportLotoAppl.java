
public class SportLotoAppl {

	/**
	 * Application displays out 5 random numbers from 1 to 49 inclusive
	 * numbers can not be repeated in a sequence of 6 random number
	 * 
	 */
	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 =  0, temp;
		for (int i = 0; i < 6; i++) {
			num6 = num5;
			num5 = num4;
			num4 = num3;
			num3 = num2;
			num2 = num1;
			temp = getRandomInt(1, 49);
			if((temp != num2) && (temp != num3)&& (temp != num4)&& (temp != num5)&& (temp != num6)) {
				num1 = temp;
			} else {
				while((temp == num2) || (temp == num3) || (temp == num4) || (temp == num5) || (temp == num6)) {
					temp = getRandomInt(1, 49);
				}
				num1 = temp;
			}	
		}
		System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " +num6);
		
	}
	
	public static int getRandomInt(int min, int max) {
		return (int) (min + Math.random() * (max -min + 1));
	}
	
	

}
