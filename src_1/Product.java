public abstract class Product {

	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void changePrice(double percentage);

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	
}