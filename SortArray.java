//4.	Write a Java program to sort a given array list.

import java.util.*;

public class SortArray
{
        
	    public static ArrayList<String> getList(){
	    	ArrayList<String> list = new ArrayList<String>();
	    	list.add("GHI");
	    	list.add("STU");
	    	list.add("ABC");
	    	list.add("XYZ");
	    	list.add("LMN");
	    	list.add("PQR");
	    	
	    	return list;
	    }
	 public static void main(String[] args)
	 {
		 ArrayList<String> list =  SortArray.getList();
		 
		 //Collections.sort(list);
		list.sort(null);
		 System.out.println(list);
	 }
}
