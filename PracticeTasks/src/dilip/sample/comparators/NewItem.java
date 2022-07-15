package dilip.sample.comparators;

public class NewItem {
	String itemName;
	int rel, price;

	public NewItem(String itemName, int rel, int price) {
		this.itemName = itemName;
		this.rel = rel;
		this.price = price;
	}
	

	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getRel() {
		return rel;
	}
	public void setRel(int rel) {
		this.rel = rel;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return this.itemName + " - relevance:" + this.rel + " - price:" + this.price;
	}
}

