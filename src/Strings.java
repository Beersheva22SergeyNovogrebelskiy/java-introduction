public class Strings {
/**
 * 
 * @param str1
 * @param str2
 * @return true if str2 is an anagram of str1
 * complexity O[N] two passes
 * only one additional array
 * only symbols or English letters
 * 1. the same length
 * 2. the same symbols just in different order
 */
	public static boolean isAnagram(String str1, String str2) {
		boolean res = false;
		int count = str1.length();
		int[] helper = new int[127];
		char[] str1Ar = str1.toCharArray();
		char[] str2Ar = str2.toCharArray();
		if(str1.length() == str2.length()) {
			for(int i = 0; i < str1Ar.length; i++) {
				helper[(byte)str1Ar[i]]++;
			}
		}
		for(int i = 0; i < str2Ar.length; i++) {
			if(helper[str2Ar[i]] > 0) {
				helper[str2Ar[i]]--;
				count--;
			}
		}
		if(count == 0) {
			res = true;
		}
	return res;
}
	
	public static void sortStringNumbers(String[] arString) {
		String[] res = new String[arString.length];
		int[] helper = new int[256];
		int index = 0;
		String temp;
		for(int i = 0; i < arString.length; i++) {
			helper[Integer.parseInt(arString[i])+128]++;
		}
		for(int i = 0; i < helper.length; i++) {
			if(helper[i] > 0) {
				while(helper[i] > 0) {
					temp = Integer.toString(i - 128);
					arString[index] = temp;
					index++;
					helper[i]--;
				}
			}
		}
		
	}
}