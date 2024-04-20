// 9.Write a Java program to insert the specified element at the specified position in the linked list.

import java.util.LinkedList;

public class InserLinkedlist
{
	public static LinkedList<Integer> getList()
	{
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(11);
		list.add(12);
		list.add(14);
		list.add(15);
		
		return list;
	}
	
	public static void main(String[] args)
	{
		LinkedList<Integer> list = getList();
		
		System.out.println(list);
		
		list.add(2,13);
		
		System.out.println(list);
	}
}