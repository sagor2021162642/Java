class ClothingItem extends Product {

	private String fabricType;

	public ClothingItem(String name, double price, String fabricType) {

		super(name, price);

		this.fabricType = fabricType;
	}

	public String getFabricType() {
		return fabricType;
	}

	public void setFabricType(String fabricType) {
		this.fabricType = fabricType;
	}

	public void changePrice(double percentage) {

		if (fabricType == "cotton") {
			double p = getPrice();
			p -= (percentage / 100) * p;
			setPrice(p);
		}
	}

	@Override
	public String toString() {
		return "ClothingItem [fabricType=" + fabricType + "]";
	}

}