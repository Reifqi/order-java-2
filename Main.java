import resto.*;

class Main {
	public static void main(String[] args) {
		Gopay gopay = new Gopay (250);
		Dana dana = new Dana (100);
	

		Cart cart = new Cart ();
		OrderButton button = new OrderButton ();

		button.connectTo (cart);
		cart.connectTo (gopay);

		// gopay.topUp(100);

		cart.addProduct ( new Product ("nasi-goreng", 20));
		cart.addProduct ( new Product ("teh-manis", 15));

		button.pressed();
	}
}
