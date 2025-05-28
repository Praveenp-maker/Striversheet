package com.takeuforward.striver.linkedlist;

import java.util.LinkedList;
import java.util.List;


public class Blinked {
	
	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
		}
	}

		Node head;

		// Insert at first
		public void insertAtFirst(String data) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}

		// Insert at last
		public void insertAtLast(String data) {
			Node newNode = new Node(data);
			if (head == null) {
				head = newNode;
				return;
			}
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}

		// Print list
		public void printList() {
			Node current = head;
			while (current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
		}

		public static void main(String[] args) {
			Blinked list = new Blinked();
			list.insertAtLast("str1");
			list.insertAtLast("str2");
			list.insertAtLast("str3");
			list.insertAtLast("str4");

			list.insertAtFirst("firstStr");
			list.insertAtLast("lastStr");

			list.printList(); // Output: firstStr str1 str2 str3 str4 lastStr
		}
	}


