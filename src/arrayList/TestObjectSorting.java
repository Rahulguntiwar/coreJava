package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestObjectSorting {

	public static void main(String[] args) {
		List<State> list = new ArrayList<State>();
		list.add(new State(100, "AB", "BB"));
		list.add(new State(500, "DC", "CC"));
		list.add(new State(300, "BC", "AA"));
		list.add(new State(800, "FC", "FF"));
		list.add(new State(600, "ED", "EE"));

		list.sort(new PopulationSorter());
		System.out.println(list);
		
		//Collections.sort(list,new LanguageSorter());
		//System.out.println(list);
		
		list.sort(new LanguageSorter());
		System.out.println(list);
		
		Collections.sort(list,new DistrictSorter());
		System.out.println(list);

	}

}
