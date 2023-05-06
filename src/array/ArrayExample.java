package array;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayExample {
	
	private static final Logger logger = Logger.getLogger(ArrayExample.class.getName());
	/*
	 * 1. Removing Duplicate Elements in given array
	 * 2. Reverse given array
	 * 3. Sort given array
	 * 5. Searching an element in given array
	 * 6. Product of array elements except itself
	 * 7. Move all zeros to end of array
	 * 8. Maximum sum sub array
	 */
	public static void main(String[] args) {
		int a[] = { 4,6,8,2,1,5,6,2,8};
		removeDuplicateElements(a);
	}

	/**
	 * 1. Removing Duplicate Elements in given array
	 * @param array
	 */
	private static void removeDuplicateElements(int[] array) {
		int[] result = new int[array.length];
		int count=0;
		for(int i=0;i<array.length;i++) {
			boolean flag=false;
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					flag=true;
				}
			}
			if(!flag) {
				result[count++]=array[i];
			}
		}
		logger.log(Level.INFO,Arrays.toString(result));
	}
}
