package m00;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchTest {

	@Test
	/**
	 * Test if value is in the first half
	 * x = 4, x position = 1
	 */
	public void testBinarySearch1(){
		int[] a = new int[]{2, 4, 5, 8, 10};
		int x = 4;
		int epos = 1; 
		
		assertTrue(Search.find(x, a)==epos);
	}
	
	@Test
	/**
	 * Test if value is the last element
	 * x = 10, x position = 4
	 */
	public void testBinarySearch2(){
		int[] a = new int[]{2, 4, 5, 8, 10};
		int x = 10;
		int epos = 4; 
		
		assertTrue(Search.find(x, a)==epos);
	}
	
	@Test
	/**
	 * Test array has even number of elements
	 * x = 10, x position = 4
	 */
	public void testBinarySearch3(){
		int[] a = new int[]{2, 4, 5, 8, 10, 30};
		int x = 10;
		int epos = 4; 
		
		assertTrue(Search.find(x, a)==epos);
	}
	
	@Test
	/**
	 * Test array has even number of elements
	 * x = 10, x position = 4
	 */
	public void testBinarySearch4(){
		int[] a = new int[]{2, 4, 5, 8, 10, 10, 30};
		int x = 10;
		int epos = 4; 
		
		assertTrue(Search.find(x, a)==epos);
	}
	
	@Test
	/**
	 * Test array does not have x
	 * x = 10, x position = -1
	 */
	public void testBinarySearch5(){
		int[] a = new int[]{2, 4, 5, 8, 10, 10, 30};
		int x = 6;
		
		assertTrue(Search.find(x, a)==-1);
	}
	

}
