class ElectronicDevice extends Product {

	private String model;
	private String warranty;

	public ElectronicDevice(String name, double price, String model, String warranty) {
		super(name, price);
		this.model = model;
		this.warranty = warranty;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getWarranty() {
		return warranty;
	}

	public void setWarranty(String warranty) {
		this.warranty = model;
	}

	public void changePrice(double percentage) {

		if (warranty == "6 month") {
			double p = getPrice();
			p -= (percentage / 100) * p;
			setPrice(p);
		}
	}

	@Override
	public String toString() {
		return "ElectronicDevice [model=" + model + ", warranty=" + warranty + "]";
	}

	
}