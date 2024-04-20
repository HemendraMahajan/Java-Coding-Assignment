 // Write a Java program to insert an element into the array list at the first position.
 
 import java.util.ArrayList;
 
 public class InsertArraylist
 {
	public static ArrayList<Integer>  getList()
	{
		ArrayList<Integer> list = new ArrayList<>();
        
        list.add(12);
      	list.add(13);
        list.add(14);	
        list.add(15);

		return list;	
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> list = getList();
		
		System.out.println(list);
		
		list.add(0,11);
		
		System.out.println(list);
	}
 }