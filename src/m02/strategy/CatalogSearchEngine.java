package m02.strategy;

import java.util.ArrayList;

public class CatalogSearchEngine {

	private SortStrategy sorter_;
	
	public CatalogSearchEngine(SortStrategy sorter){
		sorter_ = sorter;
	}
	
	public ArrayList search(ArrayList list){
		
		sorter_.sort(list);
		
		return list;
	}
	
}
