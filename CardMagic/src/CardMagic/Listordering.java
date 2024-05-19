package CardMagic;

import java.util.ArrayList;
import java.util.List;

public class Listordering {

	public List<String> orderLists(List<String> A,List<String> B,List<String> C ) {
		
		List<String> orderedList = new ArrayList<>(); 
		
		for (String a : A ) {
			orderedList.add(a);
		}
		for (String b : B ) {
			orderedList.add(b);
		}
		for (String c : C ) {
			orderedList.add(c);
		}
		
		return orderedList;

	   

	}
}
