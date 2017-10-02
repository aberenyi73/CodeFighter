/**
 * 
 */
package com.ab.cf;

import java.util.Arrays;

/**
 * @author berenyia
 *
 */
public class FirstNotRepeatingCharacter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char c = firstNotRepeatingCharacter("abacabad");
		System.out.println(c);
	}

	static char firstNotRepeatingCharacter(String s) {
	       int[] occ = new int[26];
	       Arrays.fill(occ, 0);
	       for(int i = 0; i < s.length(); i++) {
	              char c = s.charAt(i);
	              int ind = ((int) c) - 97;
	              int val = occ[ind];
	              if(val < 0) continue;
	              if(val == 0) {
	                     occ[ind] = i + 1;
	              }
	              if(val > 0) {
	                     occ[ind] = -Math.abs(occ[ind]);
	              }              
	       }
	       
	       int smallestPos = Integer.MAX_VALUE;
	       for(int i = 0; i < occ.length; i++) {
	              if(occ[i] > 0 && occ[i] < smallestPos) {
	                     smallestPos = occ[i];
	              }
	       }
	       
	       char answer = '_';	       
	       if(smallestPos > 0 && smallestPos != Integer.MAX_VALUE) {	              
	              answer = s.charAt(smallestPos-1);
	       }
	       return answer;
	}
}
