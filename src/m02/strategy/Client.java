package m02.strategy;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();
		list.add(1);
		list.add(4);
		
		SortStrategy mysorter = new QuickSort();
		CatalogSearchEngine engine = new CatalogSearchEngine(mysorter);
		engine.search(list);
		

	}

}
