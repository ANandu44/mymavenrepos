package collection;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("apple");
		ar.add("banana");
		ar.add("mango");
		ar.add("orange");
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		
		

	}

}
