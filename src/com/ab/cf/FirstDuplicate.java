/**
 * 
 */
package com.ab.cf;

/**
 * @author berenyia
 *
 */
public class FirstDuplicate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int firstDuplicate(int[] a) {
	    
	    int answer = -1;    
	    // loop over the array
	    for(int i = 0; i < a.length; i++) {
	        // each value is an index
	        int ind = Math.abs(a[i]) - 1;
	        // look up the value at the index
	        if(a[ind] > 0) {
	            a[ind] *= -1;
	        } else {
	            // if the value at index is negative, then the value is duplicate
	            return Math.abs(a[i]);
	        }                
	    }
	    return answer;    
	}

}
