/**
 * 
 */
package com.ab.cf.linkedlist;

/**
 * @author berenyia
 *
 */
public class ListNode<T> {
	public ListNode(T x) {
		value = x;
	}

	T value;
	public ListNode<T> next;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		ListNode<T> current = this;
		while (current.next != null) {
			sb.append(current.value).append(", ");
			current = current.next;
		}
		sb.append(current.value).append("]");
		return sb.toString();
	}

}
