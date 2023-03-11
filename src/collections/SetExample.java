package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set1 = new HashSet<String>();

		set1.add("Zen");
		set1.add("Lily");
		set1.add("Naina");
		set1.add("Naina");
		set1.add(null);

		System.out.println("The set is " + set1);
		
		//Sorted set
		TreeSet<String> set2 = new TreeSet<String>();
		
		set2.add("Zen");
		set2.add("Lily");
		set2.add("Naina");
		set2.add("Naina");
		
		System.out.println("The set is " + set2);
		
		//Convert set to list
		ArrayList<String> list1 = new ArrayList<String>(set1);
		System.out.println(list1);

	}

}
