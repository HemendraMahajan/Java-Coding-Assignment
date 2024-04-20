
import java.util.*;

public class AppendLinkedlist
{
	public static LinkedList<Integer> getList()
	{
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		return list;
	}
	
	public static void main(String[] args)
	{
		LinkedList<Integer> list = AppendLinkedlist.getList();
		
		System.out.println(list);
		
		list.add(5);
		
		System.out.println(list);
		
		
	}
	
}