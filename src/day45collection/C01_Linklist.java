package day45collection;

import java.util.LinkedList;

public class C01_Linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<Integer> ll=new LinkedList<>();
		System.out.println(ll);
	ll.add(5);
	ll.add(7);	
	System.out.println(ll);
	ll.add(0, 10);
	
	
	LinkedList<Integer> ll2=new LinkedList<>();
	
	ll2.addAll(ll);
	System.out.println(ll2);
	
	
	
	}
}