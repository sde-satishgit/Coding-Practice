package streams;

public class Item {

	private String item;
	private int price;
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Item(String item, int price) {
		super();
		this.item = item;
		this.price = price;
	}
	
	
}
