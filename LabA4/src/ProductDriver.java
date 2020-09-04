public class ProductDriver {

	public static void main(String[] args) {
		System.out.println("Product Lab 2019-20");
		Product p1 = new Product("GE Energy Smart Bulb - 8 pack", 5.5, 14.99, 10, 2);
		p1.setCompany("Amazing Amigos, Inc");
		System.out.println(p1);
		Product p2 = new Product("Duracell AA battery - 24 pack", 3.45, 12.19, 10);
		System.out.println(p2);
		Product p3 = new Product();
		p3.setName("Kitchen Aid Coffee Maker");
		p3.setCost(15.56);
		p3.setPrice(98.99);
		p3.setDiscount(30);
		p3.setQuantitySold(3);
		System.out.println(p3);
		System.out.println("********Company Renamed by Duracell Batteries**********\n\n");
		p2.setCompany("Amazing Products, Inc");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}