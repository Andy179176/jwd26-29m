package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	  Map<String,Integer> map = new HashMap<>();
	  map.put("a",1);
	  map.put("b",2);
	  map.put("c",3);
	  map.put("d",1);

        System.out.println(map);
		Set<String> keySet=map.keySet();
		System.out.println(keySet);

		Set<String> set = new HashSet<>();


		//Collection<String> strings = new LinkedList<>();
		//List<String> strings1 = new LinkedList<>();
		//Deque<String> strings2 = new LinkedList<>();
		//LinkedList<String> strings2 = new LinkedList<>();


		Collection<Integer> values = map.values();
		System.out.println(values);

		System.out.println("----------- map iterate 1 ---------");
		for (String s : map.keySet()) {
			System.out.println("key: " +s +"  value: " + map.get(s));
		}

		System.out.println("----------- map iterate 1 (entrys) ---------");
		// Map.Entry <String, Integer>
		Set< Map.Entry<String,Integer> >  entries= map.entrySet();
		map.remove("a");
		for (Map.Entry<String,Integer> entry: entries) {
			System.out.print("Map.Entry: "+ entry + ": ");
			System.out.println("key: "+ entry.getKey() + " value: "+entry.getValue());

		}


		System.out.println("------------------------------");
		for (Map.Entry<String,Integer> entry: map.entrySet()){
			System.out.println("key: "+ entry.getKey() + " value: "+entry.getValue());
			///entry.setValue(entry.getValue()+1);
		}

		System.out.println(map);

    }


}
