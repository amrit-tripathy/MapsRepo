package com.grayMatter;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoOnMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>map = new HashMap<Integer, String>();
		map.put(11, "Mohan");
		map.put(9, "Shruti");
		map.put(23, "Shweta");
		map.put(1, "amrit");
		System.out.println(map);
		System.out.println(map.get(11));//gets value at 11
		System.out.println(map.keySet());//keys 
		System.out.println(map.values());//values
		for(Entry<Integer, String> e:map.entrySet()) {  //to iterate on map follow this syntax
			System.out.println(e);
		}
		
//		map.put(null, "abc");
//		System.out.println(map.get(null));//works
//		
//		Set<Entry<Integer, String>> entSet = map.entrySet();//to iterate we have to convert it to set
//		
//		Iterator<Entry<Integer,String>> itr = entSet.iterator();
//		
//		for(Entry<Integer,String> e:entSet) {
//			System.out.println(e.getKey()+" "+e.getValue());
//		}
//		
//		Address add = new Address("hyd","telanaga");
//		Employee e1 = new Employee("Amrit",123,40000,"hyderabad");
//		Employee e2 = new Employee("abcd",234,25000,"hyderabad");
//		Employee e3 = new Employee("defg",567,45000,"Delhi");
//		Employee e4 = new Employee("defg",678,21000,"Delhi");
//		
//		TreeMap<Integer,Employee> treemap = new TreeMap<Integer, Employee>();
//		treemap.put(1,e1);
//		treemap.put(2,e2);
//		treemap.put(3,e3);
//		treemap.put(4,e4);
//		for(Entry<Integer,Employee> e:treemap.entrySet()) {
//			System.out.println(e);
//		}
//		
//		TreeMap<Employee,Address> mymap = new TreeMap<Employee, Address>();//requires comparable as Employee is a user defined object
//		mymap.put(e1, add);
//		mymap.put(e2, add);
//		mymap.put(e3, add);
//		mymap.put(e4, add);
//		System.out.println("     ");
//		for(Entry<Employee, Address> e:mymap.entrySet()) {  //to iterate on map follow this syntax
//			System.out.println(e);
//		}
		
		
		
		
	}

}
