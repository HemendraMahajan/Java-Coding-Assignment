// Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;

public class RetrieveArraylist
{
	public static ArrayList<Integer> getList()
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		
		return list;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> list = getList();
		
		System.out.println(list);
		
		int index = 2;
		
		int element = list.get(index);
		
		System.out.println("Element at index " + index + ": " + element);
	}
}