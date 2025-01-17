
public class Main {
	public static void main(String[] args) {

		ClothingItem obj = new ClothingItem("Shirt", 1500, "silk");
		ClothingItem obj2 = new ClothingItem("Pant", 4000, "cotton");
		ClothingItem obj3 = new ClothingItem("Shirt", 1500, "silk");
		ClothingItem obj4 = new ClothingItem("Shirt", 1500, "silk");
		ClothingItem obj5 = new ClothingItem("Shirt", 1500, "silk");

		ElectronicDevice obj6 = new ElectronicDevice("Mobile", 35000, "Oppo Reno 4", "1 Year");
		ElectronicDevice obj7 = new ElectronicDevice("Macbook", 150000, "Macbook Pro", "1 Year");
		ElectronicDevice obj8 = new ElectronicDevice("Macbook", 150000, "Macbook Pro", "1 Year");
		ElectronicDevice obj9 = new ElectronicDevice("Macbook", 150000, "Macbook Pro", "6 month");
		ElectronicDevice obj10 = new ElectronicDevice("Macbook", 150000, "Macbook Pro", "1 Year");

		System.out.println(obj.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		System.out.println(obj4.toString());
		System.out.println(obj5.toString());

		obj2.changePrice(15);
		obj9.changePrice(15);

		System.out.println(obj6.toString());
		System.out.println(obj7.toString());
		System.out.println(obj8.toString());
		System.out.println(obj9.toString());
		System.out.println(obj10.toString());

		System.out.println(obj2.toString());

		System.out.println(obj9.toString());

	}

}
