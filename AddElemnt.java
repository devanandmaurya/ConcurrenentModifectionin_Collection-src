package ConcurrenentModifectionin.dkh.java;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AddElemnt {
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
		addFromcolection(list);
		System.out.println("After new element add Element " + list);
	}

	public static void addFromcolection(Collection<Integer> marks) {
	for (ListIterator<Integer> li =((ArrayList<Integer>)marks)
				
			.listIterator();
			li.hasNext();)
	{
			Integer mark = li.next();
			if (mark > 12) {
				li.add(mark); 
	}
	}
	}
}
