// Write a Java program to insert elements into the linked list at the first and last position.

import java.util.LinkedList;

public class InsertLinkedlist1
{
	public static LinkedList<Integer> getList()
	{
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(12);
		list.add(13);
		list.add(14);
		
		return list;
	}
	
	public static void main(String[] args)
	{
		LinkedList<Integer> list = getList();
		
		System.out.println(list);
		
		list.addFirst(11);
		list.addLast(15);
		
		System.out.println(list);
	}
}