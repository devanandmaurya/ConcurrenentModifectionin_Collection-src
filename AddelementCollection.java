package ConcurrenentModifectionin.dkh.java;

import java.util.ArrayList;
import java.util.Collection;

public class AddelementCollection {
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
		addCollolection(list);
		System.out.println("After added new  Element here:: " + list);
	}

	public static void addCollolection(Collection<Integer> marks) {
		ArrayList<Integer> templist = new ArrayList<>();
		for (Integer mark : marks) {

			if (mark >= 12) 
			{
				templist.add(mark);
		}
		}
			marks.addAll(templist);
		}
	}

