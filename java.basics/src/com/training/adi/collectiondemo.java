package com.training.adi;

import java.util.*;

public class collectiondemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<employee> mylist = new ArrayList<>();
//		//mylist.add("hello");
//
		mylist.add(new  employee(1,"ajay","it",2000));
		mylist.add(new  employee(2,"isha","hr",2000));
		mylist.add(new  employee(3,"abhi","fin",2000));
		mylist.add(new  employee(4,"itawa","mech",2000));
//		
//		
////		Iterator <employee> it= mylist.iterator();
//			for (employee emp:mylist) {
//				if(emp.getEmpName().charAt(0)=='a') {
//					System.out.println(emp.getEmpName());
//				}
//			}
//		Map<Integer,String> mymap = new HashMap();
//		mymap.put(1, "ajay");
//		mymap.put(2, "vijay");
//		mymap.put(3, "vikram");
//		for(Map.Entry<Integer ,String> entry :mymap.entrySet()) {
//			System.out.println(entry.getKey()+ ":"+entry.getValue());
//		}
		
		name_compare nc = new name_compare();
		Collections.sort(mylist,nc);
		for (employee emp:mylist) {

			System.out.println(emp.getEmpName());
		}
		
		id_compare ic= new id_compare();
		Collections.sort(mylist,ic);
		System.out.println("------------------------------------------------");

		for (employee emp:mylist) {

			System.out.println(emp.getEmpName());
		}
		
		
		
	}

}

