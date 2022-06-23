package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	        Child child = new Child("a","a");
	        Parent parent = new Parent("b","b");
	        Parent child1 = new Child("c","c");
	        Parent child2 = child;



	        Parent[] ar ={child, parent};
	        List<String> h = new LinkedList<>();
		System.out.println("до:" +ar[0].getLname());
		System.out.println(ar[1].getLname());

		child.setLname("asdfghjk");

		System.out.println("после:" +ar[0].getLname());

		h.add("");
		h.add("");
		h.add("");
		h.add("");
		h.get(0);







    }
}
