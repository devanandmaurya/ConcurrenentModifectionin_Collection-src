package ConcurrenentModifectionin.dkh.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemooveElementfromcollectioncertainelementfromIterator {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();

		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		System.out.println("The orginal list is ::" + list);
		deleteFromcolection(list);
		System.out.println("After delete Element " + list);
	}

	public static void deleteFromcolection(List<Integer> marks) {
		for (Iterator<Integer> itr = marks.iterator(); itr.hasNext();) {
			Integer mark = itr.next();
			// for (Integer a : mark) {
			if (mark > 12) {
				itr.remove(); // Exception in thread "main"
				// java.util.ConcurrentModificationException
marks.removeIf(i-> i>12);	
	}
//SO TO SOLVE THE PROBLEM DONE BY ITERATOR INTERFACE 
	}
	}
}
