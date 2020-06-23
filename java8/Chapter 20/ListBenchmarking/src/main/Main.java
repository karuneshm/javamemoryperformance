package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Date start = new Date();
		
		Map<Integer,Book> books = new HashMap<Integer,Book>(500000);
		for (int i = 0; i < 10000000; i++) {
			books.put(i,new Book(i,"Jane Eyre","Charlotte Bronte",14.99));
		}
		
		
//		Book book = books.get(4967421);
//		System.out.println(book);
		Date end = new Date();
		System.out.println("Elapsed time was " + (end.getTime() - start.getTime()) +" ms.");
	}
}
