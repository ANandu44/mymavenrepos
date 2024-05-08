package collection;

import java.util.LinkedList;

public class AddFirst {

	public static void main(String[] args) {
		LinkedList<String> ar=new LinkedList<String>();
		ar.add("hi");
		ar.add("hi");
		ar.add("hi");
		ar.add("hi");
		ar.addFirst("bruh");
		System.out.println(ar);

	}

}
