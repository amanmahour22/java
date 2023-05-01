package products;

public class Catalogue {
	private static Product [] listOfProducts;
	private Catalogue [] subCatalogue;
	private String productId;
	private String sub;
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public static Product[] getListOfProducts() {
		System.out.println("Some Products");
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		product1.setProductId("1");		
		product1.setCost("1000");
		product1.setProductName("Samsung S20");
		product2.setProductId("2");
		product2.setCost("5000");
		product2.setProductName("AC");
		product3.setProductId("3");
		product3.setCost("9000");
		product3.setProductName("Bullet");
		listOfProducts = new Product[3];
		listOfProducts[0] = product1;
		listOfProducts[1] = product2;
		listOfProducts[2] = product3;
		return listOfProducts;
	}
	public static Product[] setlistofproductafter(Product[] allproduct) {
		allproduct =getListOfProducts();
		return allproduct;
	}
	public static void setListOfProducts(Product[] listOfProducts) {
		Catalogue.listOfProducts = listOfProducts;
	}
	public Catalogue[] getSubCatalogue() {
		return subCatalogue;
	}
	public void setSubCatalogue(Catalogue[] subCatalogue) {
		this.subCatalogue = subCatalogue;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}	
}


