public class Product{
	private String id;
	private String name;
	private double price;
	private int quantity;
	private static double maxPrice = 0;
	private static double minPrice = 99999;
	static int count = 1;

	{
		this.id="P"+ String.format("%03d",count++);
	}

	public Product(String name, double price, int quantity){
		this.name = name;
		if(price > 0)
			this.price = price;
		if(quantity > 0)
			this.quantity = quantity;
		if(price > maxPrice)
			maxPrice = price;
		if(price < minPrice)
			minPrice = price;
	}

	public void displayProduct(){
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
		System.out.println("Quantity: " + quantity);
		System.out.println("Max Price: " + maxPrice);
		System.out.println("Min Price: " + minPrice);
	}

}