/**
 * 
 */
package com.ab.cf.linkedlist;

/**
 * @author berenyia
 * 
 *         <pre>
	Note: Try to solve this task in O(n) time using O(1) additional space, where n is the number of elements in l, since this is what you'll be asked to do during an interview.
	
	Given a singly linked list of integers, determine whether or not it's a palindrome.
	
	Example
	
	For l = [0, 1, 0], the output should be
	isListPalindrome(l) = true;
	For l = [1, 2, 2, 3], the output should be
	isListPalindrome(l) = false.
	Input/Output
	
	[time limit] 3000ms (java)
	[input] linkedlist.integer l
	
	A singly linked list of integers.
	
	Guaranteed constraints:
	0 ≤ list size ≤ 5 · 105,
	-109 ≤ element value ≤ 109.
	
	[output] boolean
	
	Return true if l is a palindrome, otherwise return false.
 *         </pre>
 * 
 */
public class RemoveKFromList {

	public ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {

		// check if l is null
		if (l == null)
			return null;

		// initialize valid first node
		ListNode<Integer> firstNode = null;
		if (l.value != k)
			firstNode = l;
		else
			firstNode = nextGoodNode(l, k);

		if (firstNode == null || firstNode.value == k) {
			return null;
		}

		ListNode<Integer> current = firstNode;
		while (current != null) {
			current.next = nextGoodNode(current, k);
			current = current.next;
		}

		return firstNode;
	}

	public ListNode<Integer> nextGoodNode(ListNode<Integer> node, int k) {
		ListNode<Integer> answer = null;
		while (node.next != null) {
			if (node.next.value != k) {
				answer = node.next;
				break;
			}
			node = node.next;
		}
		return answer;
	}

}
