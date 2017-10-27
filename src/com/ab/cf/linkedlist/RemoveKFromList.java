/**
 * 
 */
package com.ab.cf.linkedlist;

/**
 * @author berenyia
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
