package collection;

import java.util.ArrayList;

public class ClearMethod {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("apple");
		ar.add("banana");
		ar.add("mango");
		ar.add("orange");
		ar.add("pineapple");
		ar.clear();
		System.out.println(ar);

	}

}
