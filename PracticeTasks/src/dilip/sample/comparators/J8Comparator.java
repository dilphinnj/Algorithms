package dilip.sample.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;



public class J8Comparator {

	

	public static void main(String[] args) {
		
		List<NewItem> itemList = new ArrayList<NewItem>();

		itemList.add(new NewItem("Umesh Awasthi", 1, 35));
		itemList.add(new NewItem("Robert Hickle",2, 55));
		itemList.add(new NewItem("John Smith",1, 40));
		itemList.add(new NewItem("David",3, 23));
		itemList.add(new NewItem("Mark",4, 63));

//		Items.sort(Comparator.comparing(NewItem::getItemName).thenComparingInt(NewItem::getRel));
//
//		for (NewItem Item : Items) {
//			System.out.println("Item Name is: " + Item.getItemName()+ "- Rel::"+Item.getRel());
//		}

//		Items.sort(Comparator.comparingInt(NewItem::getRel).thenComparing(NewItem::getItemName));
//
//		for (NewItem Item : Items) {
//			System.out.println("Item Name is: " + Item.getItemName()+ "- Rel::"+Item.getRel());
//		}
		
//		Collections.sort(unsortedList,new Comparator<Person>() {
//		    @Override
//		    public int compare(Person a, Person b) {
//		        return a.getName().compareTo(b.getName());
//		    }
//		});
		
		Collections.sort(itemList,new Comparator<NewItem>() {			
			@Override
			public int compare(NewItem itm1, NewItem itm2) {
				int name = itm1.getItemName().compareTo(itm2.getItemName());
				if(name == 0){
                    return name;
                }
                return itm2.getRel() >itm1.getRel() ? 1 : itm2.getRel() < itm1.getRel()  ? -1 : 0;
			}
		});
		
		for (NewItem newItem : itemList) {
			System.out.println("New Item Sorted by Relevance::"+newItem);
		}
		
//		Collections.sort(itemList,new Comparator<NewItem>() {			
//			@Override
//			public int compare(NewItem itm1, NewItem itm2) {
//				int name = itm1.getItemName().compareTo(itm2.getItemName());
//				return name;
//				
//			}
//		});
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(3);
		list.add(4);
		
		Collections.sort(list);
		
		for (Integer newItem : list) {			
			System.out.println("New Item Sorted by Name::"+newItem);
		}
		
		System.out.println("----------------");
		for (NewItem newItem : itemList) {			
			System.out.println("New Item Sorted by Name::"+newItem);
		}
		
		
	}

}
