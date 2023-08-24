package com.Day11_LiveSession;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeSet;

/*
 * Collection is a framework in java which contains multiple functionalities to many -
 * 			-frequently used functions
 * Collection framework was introduced in-order to over come the problem with the array data structure.
 * 
 * In the collection framework we have 7 different collection classes: 
 * 		1.ArrayList			----> Dynamic Array Data Structure
 * 									-In order insertion of data
 * 									-store Heterogeneous data
 * 									-It is efficient for data operations in rear(last) position.
 * 									-It supports the iterators and List Iterators
 * 									-It implements from List interface
 * 									-It allows Duplicates
 * 
 * 
 * 		2.LinkedList		----> Doubly Linked List Data Structure
 *   								-In order insertion of data
 *   								-store Heterogeneous data
 *   								-It is efficient for data operations in any position.
 *   								-It supports the iterators and List Iterators
 *    								-It implements from List interface & Queue
									-It allows Duplicates
 *   
 *   
 * 		3.ArrayDeque		----> Dynamic Array & Double ended Queue Data Structure
 * 									-In order insertion of data
 * 									-store Heterogeneous data
 * 									-It is efficient for data operations in front and rear position.
 * 									-It supports the iterators.
 * 									-It implements from Dequeue Interface which extends the queue interface
 * 									-It allows Duplicates
 * 
 * 
 * 		4.PriorityQueue		----> Min-Heap Data Structure
 * 									-It will contain the element*** with minimum value.
 * 									-It cannot store Heterogeneous data as sorting b/w multiple types -
 * 															-becomes difficult
 * 									-It supports the iterators.
 *   								-It implements from Queue Interface
									-It allows Duplicates
 * 
 * 
 * 		5.TreeSet			----> Balanced Binary Tree Data Structure
 * 									-the elements will be stored in sorted order. 
 * 									-It cannot store Heterogeneous data as sorting b/w multiple types -
 * 															-becomes difficult
 * 									-It supports the iterators.
 * 									-It implements from Set Interface
 * 									-It does not allows Duplicates
 * 
 * 		6.HashSet			----> Hashing Algorithm
 * 									-Uses Mathematical equation to generate the random order
 * 									-store Heterogeneous data
 * 									-It supports the iterators.
 *  								-It implements from Set Interface
 * 									-It does not allows Duplicates

 * 
 * 
 * 		7.LinkedHashSet		----> Doubly LinkedList & Hashing algorithm
 * 									-Uses mathematical equations in the algorithm it retains the 
 * 										order of insertion as per the linked List term.
 * 									- It can store heterogeneous data.
 * 									-It supports the iterators.
 *   								-It extends the HashSet class
 *   								-It is the child of HashSet
 *  								-It does not allows Duplicates

 * 
 *  All collection classes belongs to java.util package
 */
public class Collections1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList<>();
		al.add(9);
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(7);
		System.out.println("ArrayList: "+al);
//		System.out.println(al.addAll(3, al));
//		System.out.println(al.indexOf(300));
		
		Iterator iterator = al.iterator(); 
		while (iterator.hasNext()==true) {
			System.out.println(iterator.next());
		}
		Collections.sort(al);
		System.out.println("After Sorting: "+al);
		System.out.println("Binary search : "+Collections.binarySearch(al,6));
		
		
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		System.out.println("LinkedList: "+ll);
		System.out.println(ll.lastIndexOf(30));
		
		ArrayDeque ad = new ArrayDeque();
		ad.add(1);
		ad.add(2);
		ad.add(3);
		ad.add(4);
		ad.add(5);
		System.out.println("ArrayDeque: "+ad);
		System.out.println(ad.element());
		System.out.println(ad.peekLast());
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(400);
		pq.add(5);
		pq.add(600);
		pq.add(7);
		pq.add(800);
		pq.add(9);
		System.out.println("PriorityQueue: "+pq);
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		
		TreeSet ts = new TreeSet();
		ts.add(400);
		ts.add(5);
		ts.add(600);
		ts.add(7);
		ts.add(800);
		ts.add(9);
		System.out.println("TreeSet: "+ts);
		
		HashSet hs = new HashSet();
		hs.add(100);
		hs.add(20);
		hs.add(3);
		hs.add(4);
		hs.add(10);
		hs.add(2);
		hs.add(6);
		hs.add(400);
		hs.add(5);
		hs.add(600);
		hs.add(7);
		hs.add(9);
		System.out.println("HashSet: "+hs);
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(100);
		lhs.add(20);
		lhs.add(3);
		lhs.add(4);
		lhs.add(10);
		lhs.add(2);
		lhs.add(6);
		lhs.add(400);
		lhs.add(5);
		lhs.add(600);
		lhs.add(7);
		lhs.add(9);
		lhs.add("ram");
		lhs.add('e');
		lhs.add(555.99f);
		System.out.println("LinkedHashSet: "+lhs);
			
	}

}
