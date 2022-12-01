package telran.digital.numbers;

public class DigitalNumbersPrinting {
private static final String SYMBOL = "*";
public static void displayDigitalNumber(int number, int offset, int width, int height) {
	int digit = 0;
	String [] res = new String[height];
	digit = number % 10;
	number /= 10;
	String [] temp = computeDigit(digit, offset, width, height);
	for (int i = 0; i < res.length; i++) {
		res[i] = temp[i];
	}
	if(number != 0) {
		while(number != 0) {
			digit = number % 10;
			number = number / 10;
			temp = computeDigit(digit, offset, width, height);
			for (int i = 0; i < res.length; i++) {
			res[i] = temp[i] + res[i];
			}
		}
	}
	displayStrings(res);
	
}
private static String[] computeDigit(int digit, int offset, int width, int height) {
	String [] res = new String [height]; 
		switch(digit) {
		case 0: res = zero(offset, width, height); break;
		case 1: res = one(offset, width, height); break;
		case 2: res = two(offset, width, height); break;
		case 3: res = three(offset, width, height); break;
		case 4: res = four(offset, width, height); break;
		case 5: res = five(offset, width, height); break;
		case 6: res = six(offset, width, height); break;
		case 7: res = seven(offset, width, height); break;
		case 8: res = eight(offset, width, height); break;
		case 9: res = nine(offset, width, height); break;
		}
	return res;
}
public static String line(int offset, int length) {
	return " ".repeat(offset) + SYMBOL.repeat(length);
}
public static String[] verticalLine(int offset, int height) {
	String [] res = new String[height];
	for (int i = 0; i < res.length; i++) {
		res[i] = " ".repeat(offset) + SYMBOL;
	}
	return res;
}
public static String[] halfRightVerticalLineUp(int offset, int width, int height) {
	String [] res = new String[(height + 1) / 2];
	for (int i = 0; i < res.length; i++) {
		res[i] = " ".repeat(offset) + " ".repeat(width - 1) + SYMBOL;
	}
	return res;
}
public static String[] halfLeftVerticalLineUp(int offset, int width, int height) {
	String [] res = new String[(height + 1) / 2];
	for (int i = 0; i < res.length; i++) {
		res[i] = " ".repeat(offset) + SYMBOL + " ".repeat(width - 1);
	}
	return res;
}
public static String[] halfRightVerticalLineLower(int offset, int width, int height) {
	String [] res = new String[(height) / 2];
	for (int i = 0; i < res.length; i++) {
		res[i] = " ".repeat(offset) + " ".repeat(width - 1) + SYMBOL;
	}
	return res;
}
public static String[] halfLeftVerticalLineLower(int offset, int width, int height) {
	String [] res = new String[(height) / 2];
	for (int i = 0; i < res.length; i++) {
		res[i] = " ".repeat(offset) + SYMBOL + " ".repeat(width - 1);
	}
	return res;
}
public static String[] twoVerticalLines(int offset, int width, int height) {
	String [] res = new String[height];
	for (int i = 0; i < res.length; i++) {
		res[i] = " ".repeat(offset) + SYMBOL + " ".repeat(width - 2) + SYMBOL;
	}
	return res;
}
public static String[] zero(int offset, int width, int height) {
	String [] res = new String[height];
	res[0] = line(offset, width);
	String [] lines = twoVerticalLines(offset, width, height - 2);
	System.arraycopy(lines, 0, res, 1, lines.length);
	res[height - 1] = line(offset, width);
	return res;
}
public static String [] one(int offset, int width, int height) {
	return verticalLine(offset + width - 1, height);
}
public static String[] two(int offset, int width, int height) {
	String [] res = new String[height];
	res[0] = line(offset, width);
	String [] lines = halfRightVerticalLineUp(offset, width, height - 2);
	System.arraycopy(lines, 0, res, 1, lines.length);
	res[(height-1)/2] = line(offset, width);
	lines = halfLeftVerticalLineLower(offset, width, height - 2);
	System.arraycopy(lines, 0, res, (res.length+1)/2, lines.length);
	res[height - 1] = line(offset, width);
	return res;
}
public static String[] three(int offset, int width, int height) {
	String [] res = new String[height];
	res[0] = line(offset, width);
	String [] lines = halfRightVerticalLineUp(offset, width, height - 2);
	System.arraycopy(lines, 0, res, 1, lines.length);
	res[(height-1)/2] = line(offset, width);
	lines = halfRightVerticalLineLower(offset, width, height - 2);
	System.arraycopy(lines, 0, res, (res.length+1)/2, lines.length);
	res[height - 1] = line(offset, width);
	return res;
}
public static String[] four(int offset, int width, int height) {
	String [] res = new String[height];
	String [] lines = twoVerticalLines(offset, width, (height - 1) / 2);
	System.arraycopy(lines, 0, res, 0, lines.length);
	res[(height-1)/2] = line(offset, width);
	lines = halfRightVerticalLineLower(offset, width, height );
	System.arraycopy(lines, 0, res, (res.length+1)/2, lines.length);
	
	return res;
}
public static String[] five(int offset, int width, int height) {
	String [] res = new String[height];
	res[0] = line(offset, width);
	String [] lines = halfLeftVerticalLineUp(offset, width, height - 2);
	System.arraycopy(lines, 0, res, 1, lines.length);
	res[(height-1)/2] = line(offset, width);
	lines = halfRightVerticalLineLower(offset, width, height - 2);
	System.arraycopy(lines, 0, res, (res.length+1)/2, lines.length);
	res[height - 1] = line(offset, width);
	return res;
}
public static String[] six(int offset, int width, int height) {
	String [] res = new String[height];
	res[0] = line(offset, width);
	String [] lines = halfLeftVerticalLineUp(offset, width, height - 2);
	System.arraycopy(lines, 0, res, 1, lines.length);
	res[(height-1)/2] = line(offset, width);
	lines = twoVerticalLines(offset, width, (height - 2) / 2);
	System.arraycopy(lines, 0, res, (res.length+1)/2, lines.length);
	res[height - 1] = line(offset, width);
	return res;
}
public static String[] seven(int offset, int width, int height) {
	String [] res = new String[height];
	res = verticalLine(offset + width - 1, height);
	res[0] = line(offset, width);
	return res;
}
public static String[] eight(int offset, int width, int height) {
	String [] res = new String[height];
	res[0] = line(offset, width);
	String [] lines = twoVerticalLines(offset, width, height - 2);
	System.arraycopy(lines, 0, res, 1, lines.length);
	res[(height-1)/2] = line(offset, width);
	res[height - 1] = line(offset, width);
	return res;
}
public static String[] nine (int offset, int width, int height) {
	String [] res = new String[height];
	res[0] = line(offset, width);
	String [] lines = twoVerticalLines(offset, width, (height - 2) / 2);
	System.arraycopy(lines, 0, res, 1, lines.length);
	res[(height-1)/2] = line(offset, width);
	lines = halfRightVerticalLineLower(offset, width, height - 2);
	System.arraycopy(lines, 0, res, (res.length+1)/2, lines.length);
	res[height - 1] = line(offset, width);
	return res;
}
public static  void displayStrings(String[] strings) {
	for(int i = 0; i < strings.length; i++) {
		System.out.println(strings[i]);
	}
}
}