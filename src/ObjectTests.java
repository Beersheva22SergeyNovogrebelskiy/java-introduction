import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ObjectTests {

	@Test
	//@Disabled
	void wrapperTest() {
		
		Integer a = 10;
		Integer b = 11;
		assertEquals(++a , b);
		Integer c = 201;
		Integer d = 201;
		assertEquals(c, d);
		assertTrue(a == b);
		assertFalse(c == d);
		assertTrue(c.equals(d));
	}
	@Test
	//@Disabled
	void stringTest() {
		String hello = "hello";
		char[] helloAr = hello.toCharArray();
		assertEquals('h', helloAr[0]);
		//System.out.println((byte)helloAr[0]);
		assertEquals(5, hello.length());
	}
	
	@Test
	//@Disabled
	void isAnagramTest() {
		String word = "yellow";
		assertTrue(Strings.isAnagram(word, "loweyl"));
		assertTrue(Strings.isAnagram(word, "elolyw"));
		assertTrue(Strings.isAnagram(word, "wolley"));
		assertTrue(Strings.isAnagram(word, "loleyw"));
		assertFalse(Strings.isAnagram(word,""));
		assertFalse(Strings.isAnagram(word, "yellob"));
		assertFalse(Strings.isAnagram(word,"yello"));
		assertFalse(Strings.isAnagram(word,"yelllo"));
	}
	
	@Test
	//@Disabled
	void sortStringNumbersTest() {
	String[] array1 = { "5", "-37", "15", "2", "22", "120", "118", "-110", "5", "2", "1", "0", "127", "-128", "1", "5" };
	String[] array2 = { "-128", "-110", "-37", "0", "1", "1", "2", "2", "5", "5", "5", "15", "22", "118", "120", "127" };
	Strings.sortStringNumbers(array1);
	assertArrayEquals(array2, array1);
	}
	
	@Test
	void javaVariableTest() {
		assertTrue("java".matches(Strings.javaNameExp()));
		assertFalse("1java".matches(Strings.javaNameExp()));
		assertFalse("_".matches(Strings.javaNameExp()));
		assertTrue("__".matches(Strings.javaNameExp()));
		assertTrue("java_1_2".matches(Strings.javaNameExp()));
		assertTrue("$".matches(Strings.javaNameExp()));
		assertFalse("$ _".matches(Strings.javaNameExp()));
	}

	@Test
	  void ipV40OctetTest() {
	    assertTrue("0".matches(Strings.ipV4Octet()));
	    assertTrue("10".matches(Strings.ipV4Octet()));  
	    assertTrue("25".matches(Strings.ipV4Octet()));  
	    assertTrue("00".matches(Strings.ipV4Octet()));
	    assertTrue("99".matches(Strings.ipV4Octet()));  
	    assertTrue("000".matches(Strings.ipV4Octet()));
	    assertTrue("1".matches(Strings.ipV4Octet()));
	    assertTrue("01".matches(Strings.ipV4Octet()));
	    assertTrue("001".matches(Strings.ipV4Octet()));
	    assertTrue("10".matches(Strings.ipV4Octet()));
	    assertTrue("010".matches(Strings.ipV4Octet()));
	    assertTrue("100".matches(Strings.ipV4Octet()));
	    assertTrue("199".matches(Strings.ipV4Octet()));
	    assertTrue("200".matches(Strings.ipV4Octet()));
	    assertTrue("249".matches(Strings.ipV4Octet()));
	    assertTrue("250".matches(Strings.ipV4Octet()));
	    assertTrue("255".matches(Strings.ipV4Octet()));
	    assertFalse("-15".matches(Strings.ipV4Octet()));  
	    assertFalse("256".matches(Strings.ipV4Octet()));
	    assertFalse("260".matches(Strings.ipV4Octet()));
	    assertFalse("300".matches(Strings.ipV4Octet()));
	    assertFalse("0000".matches(Strings.ipV4Octet()));
	    assertFalse("1000".matches(Strings.ipV4Octet()));
	  }
	  
	  @Test
	  void ipV4() {
	    assertTrue("0.0.0.0".matches(Strings.ipV4()));
	    assertTrue("10.0.0.0".matches(Strings.ipV4()));   
	    assertTrue("01.001.010.249".matches(Strings.ipV4()));
	    assertTrue("0.120.20.255".matches(Strings.ipV4()));    
	    assertTrue("255.255.255.255".matches(Strings.ipV4()));
	    assertFalse("25.0.0".matches(Strings.ipV4()));  
	    assertFalse("256.0.0.0".matches(Strings.ipV4()));  
	    assertFalse("1.1.1.256".matches(Strings.ipV4()));
	    assertFalse("1.1.1.260".matches(Strings.ipV4()));
	    assertFalse("1.1.1.300".matches(Strings.ipV4()));
	    assertFalse("1.1.1.1000".matches(Strings.ipV4()));
	  }
}