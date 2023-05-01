import java.util.Iterator;
import java.util.Scanner;

import Orders.Cart;
import User.Customer;
import User.Seller;
import products.Catalogue;
import products.Product;

/*
 * Ask which type of user are you? Customer, Seller, Administrator
 * User- Customer, Seller, Administration
 * Customer - View products, View Cart, Contact Us
 * View Products - Add the product to the cart, view cart, checkout.
 * Seller - View your products, add a product, Contact us
 * View your products - delete this product, add a product - submit details of the product
 * Administration
 * Product
 * Category
 * Cart
 * Order
*/

public class AmanStore {
	public static void main(String[] args) {
		System.out.println("Welcome to the ecommerce store!");
		Scanner sc = new Scanner(System.in);
		String typeOfUser;
		System.out.println("Which user are you? \n 1. customer  2. seller  3. Admin");
		int choice = sc.nextInt();
		if (choice == 1) {
			typeOfUser = "Customer";
			Customer current1 = new Customer();
			System.out.println("What is your UserId ");
			sc.nextLine();
			current1.setUserId(sc.nextLine());
			System.out.println("What is your Password ");
			sc.nextLine();
			current1.setPassword(sc.nextLine());
			if (current1.verifyUser() == true) {
				System.out.println("User Verified");
				while (true) {
					System.out.println("Do you want to :  1. View Products  2. View Cart  3. Contact us  4. exit");
					int choice1 = sc.nextInt();
					if (choice1 == 1) {
						System.out.println("View Products");
						Catalogue catalogue = new Catalogue();
						Product[] allProducts = catalogue.getListOfProducts();
						for (int i = 0; i < allProducts.length; i++) {
							System.out.println("______________________________________________________");
							System.out.println("S.No.    Type Product         Id/Value/Cost");
							System.out.println("  1.     Product Id      :  " + allProducts[i].getProductId());
							System.out.println("  2.     Product Name    :  " + allProducts[i].getProductName());
							System.out.println("  3.     Product Cost    :  " + allProducts[i].getCost());
							System.out.println("______________________________________________________");
						}
						System.out.println("Do you want to add any product to the cart? Y/N");
						sc.nextLine();
						String addToCart = sc.nextLine();
						if (addToCart.equals("Y")) {
							System.out.println("Input the productid of the product which you want to add to cart.");
							String productId = sc.nextLine();
							Product[] cartProducts = new Product[1];
							for (int i = 0; i < allProducts.length; i++) {
								if (allProducts[i].getProductId().equals(productId)) {
									cartProducts[0] = allProducts[i];
								}
							}
							Cart cart = new Cart();
							cart.setListOfProducts(cartProducts);
							current1.setCart(cart);
							System.out.println("The product is successfully added to the cart.");
						}
					} else if (choice1 == 2) {
						Product[] cartProducts = current1.getCart().getListOfProducts();
						System.out.println(current1.getCart().getCartId());
						for (int i = 0; i < cartProducts.length; i++) {
							System.out.println("______________________________________________________");
							System.out.println("S.No.  Type Product        Items/Value/Id");
							System.out.println("1.     Product Id    :  " + cartProducts[i].getProductId());
							System.out.println("2.     Product Name  :  " + cartProducts[i].getProductName());
							System.out.println("3.     Product Cost  :  " + cartProducts[i].getCost());
							System.out.println("______________________________________________________");
						}
						System.out.println("Do you want to checkout? Y/N");
						sc.nextLine();
						String checkout = sc.nextLine();
						if (checkout.equals("Y") == true) {
							System.out.println("Your order is placed successfully..");
						} else if (checkout.equals("N")) {
							return;
						}
					} else if (choice1 == 3) {
						System.out.println("To contact us, please email on store@ecommercegmail.com");
					} else if (choice1 == 4) {
						System.out.println("Thanks for visiting");
						break;
					} else {
						System.out.println("Invalid choice try again");
					}
				}
			}
		} else if (choice == 2) {
			typeOfUser = "Seller";
			Customer current2 = new Customer();
			System.out.println("What is your seller id");
			sc.nextLine();
			current2.setUserId(sc.nextLine());
			System.out.println("What is your password");
			sc.nextLine();
			current2.setPassword(sc.nextLine());
			System.out.println("User verified");
			System.out.println("Do you want to : 1. View your products  2. Add a product  3. Contact us  4. exit");
			int choice2 = sc.nextInt();
			if (choice2 == 1) {
				System.out.println("View your Products");
				Catalogue catalogue = new Catalogue();
				Product[] allProducts = catalogue.getListOfProducts();
				for (int i = 0; i < allProducts.length; i++) {
					System.out.println("______________________________________________________");
					System.out.println("S.No.  Type Product        Id/Value/Cost");
					System.out.println("  1.   Product Id    :  " + allProducts[i].getProductId());
					System.out.println("  2.   Product Name  :  " + allProducts[i].getProductName());
					System.out.println("  3.   Product Cost  :  " + allProducts[i].getCost());
					System.out.println("______________________________________________________");
				}
			} else if (choice2 == 2) {
				System.out.println("Add a product");
				System.out.println("How many products do you want to add");
				int add = sc.nextInt();
				int i = 0;
				do {
					Product product4 = new Product();
					System.out.println("Enter Product Id");
					sc.nextLine();
					product4.setProductId(sc.nextLine());					
					System.out.println("Enter Product Name");
					product4.setProductName(sc.nextLine());
					System.out.println("Enter Product Cost");
					product4.setCost(sc.nextLine());
					i++;
				} while (i > add);
				System.out.println("Product added successfully...");
			} else if (choice2 == 3) {
				System.out.println("Contact us");
			} else if (choice2 == 4) {
				return;
			} else {
				System.out.println("Invalid choice please try again");
			}
		} else if (choice == 3) {
			typeOfUser = "Admin";
			Customer current3 = new Customer();
			System.out.println("What is your Admin id");
			sc.nextLine();
			current3.setUserId(sc.nextLine());
			System.out.println("What is your password");
			sc.nextLine();
			current3.setPassword(sc.nextLine());
			System.out.println("View your Products");
			Catalogue catalogue = new Catalogue();
			Product[] allProducts = catalogue.getListOfProducts();
			for (int i = 0; i < allProducts.length; i++) {
				System.out.println("______________________________________________________");
				System.out.println("S.No.  Type Product        Id/Value/Cost");
				System.out.println("  1.   Product Id    :  " + allProducts[i].getProductId());
				System.out.println("  2.   Product Name  :  " + allProducts[i].getProductName());
				System.out.println("  3.   Product Cost  :  " + allProducts[i].getCost());
				System.out.println("______________________________________________________");
			}
		}

	}
}