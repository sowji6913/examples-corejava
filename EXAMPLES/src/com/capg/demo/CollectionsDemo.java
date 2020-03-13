package com.capg.demo;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
public class CollectionsDemo {

	public static void main(String[] args) {
	Collection<Object>items=new ArrayList<>();
		items.add("abc");
		items.add(100);
		items.add(true);
		items.add(5.26);
		System.out.println("with iterator :");
		Iterator itr=items.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(Object item:items) {
		System.out.println("Element : "+item);
		}
	
       items.remove(100);
       System.out.println("after removal");
       
       for(Object item:items) {
    	   System.out.println("elements ="+item);
       }
       System.out.println("size="+items.size());
       System.out.println(items.contains(200));
	}
	
}