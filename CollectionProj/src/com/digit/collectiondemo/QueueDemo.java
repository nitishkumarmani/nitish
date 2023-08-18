package com.digit.collectiondemo;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.Deque;
import java.util.Iterator;
import java.util.ArrayDeque;
public class QueueDemo {
    public static void main(String[] args) {
		Queue<String>queue=new LinkedList<String>();
		queue.add("swapna");
		queue.add("Amit");
		queue.add("keerti");
		queue.add("kunal");
		
		Iterator<String>itr=queue.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	/*	System.out.println("Element removed: "+queue.remove());
		System.out.println("Element removed: "+queue.remove());
		System.out.println("Element removed: "+queue.remove());
		System.out.println("Element removed: "+queue.remove());
		System.out.println("Element removed: "+queue.remove());*/
		
		System.out.println("Element polled: "+queue.poll());
		System.out.println("Element polled: "+queue.poll());
		System.out.println("Element polled: "+queue.poll());
		System.out.println("Element polled: "+queue.poll());
		System.out.println("Element polled: "+queue.poll());

		System.out.println("Is empty: "+queue.isEmpty());
		
		queue.offer("apple");
		System.out.println("Element at peek: "+queue.peek());
		System.out.println(queue.size());
		
		ArrayBlockingQueue<Integer>abq=new ArrayBlockingQueue<Integer>(10);
		System.out.println(abq.remainingCapacity());
		
		/*for(int i=1;i<=10;i++)
			System.out.println(abq.offer(i));
		abq.offer(11);
		for(Integer i:abq)
			System.out.println(i);*/
		
		for(int i=10;i<20;i++)
		     abq.add(i);
		for(Integer i:abq)
			System.out.println(i);
		abq.add(56);
		
		/*PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(56);
		System.out.println(pq.peek());
		pq.add(78);
		System.out.println(pq.peek());
		pq.add(34);
		System.out.println(pq.peek());*/
		
		Deque<Integer>deque=new ArrayDeque<Integer>();
		deque.addFirst(34);
		deque.addFirst(56);
		deque.addFirst(78);
		//System.out.println(deque.removeLast());
		System.out.println(deque.removeFirst());
		System.out.println(deque.removeLast());
		
		deque.addLast(89);
		deque.addLast(23);
		deque.addLast(45);
		for(Integer i:deque)
			System.out.println(i);
		System.out.println(deque.removeFirst());
		System.out.println(deque.removeLast());
	}
}
