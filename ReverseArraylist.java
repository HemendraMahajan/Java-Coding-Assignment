//Write a Java program to reverse elements in a array list.

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraylist
{
	
	public static ArrayList<Integer> getList()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		return list;
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> list = ReverseArraylist.getList();
		
		
		Collections.reverse(list);
	
		System.out.println(list);
	}
}