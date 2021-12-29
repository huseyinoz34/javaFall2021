package day45collection;

import java.util.LinkedList;

public class C03_LinkList {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		System.out.println(ll);
	ll.add(5);
	ll.add(7);	
    System.out.println(ll.peek());// silmeden ilk elemani bize getiri
    System.out.println(ll.peekFirst());
	LinkedList<Integer> ll2=new LinkedList<>();

    System.out.println(ll2.peekFirst());
    System.out.println(ll2.peek());
    System.out.println(ll.element());
    
    System.out.println(ll.poll());// ilk elemani siler getirir
    System.out.println(ll);
    
    System.out.println(ll.hashCode());// 38 dondurdu
    
	}

}
