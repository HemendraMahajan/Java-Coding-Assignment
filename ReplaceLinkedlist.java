// Write a Java program to replace an element in a linked list.

import java.util.LinkedList;

public class ReplaceLinkedlist
{
	public static LinkedList<Integer> getList()
	{
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(4);
		list.add(5);
		
		return list;
	}
	
	public static void main(String[] args)
	{
		LinkedList<Integer> list = getList();
		
		System.out.println(list);
		
		list.set(2,3);
		
		System.out.println(list);
	}
}