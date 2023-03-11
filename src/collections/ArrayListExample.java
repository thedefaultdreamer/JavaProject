package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "John", "Smith", "Leena", "Priya" };
		System.out.println("The second name is " + names[3]);

		ArrayList<String> list1 = new ArrayList<String>();

		list1.add("Zen");
		list1.add("Smith");
		list1.add("Naiya");
		list1.add("Priya");
		list1.add(null);

		System.out.println("The list is " + list1);
		System.out.println("The size of the list is " + list1.size());
		System.out.println("The first name of the list is " + list1.get(0));
		System.out.println("Last name in the list is " + list1.get(list1.size() - 1));

		list1.set(1, "Mike");
		System.out.println("The list after udpating is " + list1);

		list1.remove(2);
		System.out.println("The list after deleting is " + list1);

		for (int i = 0; i < list1.size(); i++) {
			System.err.println("Element name for loop " + list1.get(i));
		}

		for (String value : list1) {
			System.out.println("Element value foreach " + value);
		}

		Iterator<String> itr = list1.iterator();

		while (itr.hasNext()) {
			System.out.println("while loop element " + itr.next());
		}

		Collections.sort(list1);
		System.out.println("After sorting the list " + list1);

		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("After sorting on descending order " + list1);
	}

}
