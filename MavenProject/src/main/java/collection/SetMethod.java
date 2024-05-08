package collection;

import java.util.ArrayList;

public class SetMethod {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("apple");
		ar.add("banana");
		ar.add("mango");
		ar.add("orange");
		ar.set(0,"grape");
		System.out.println(ar);
		

	}

}
