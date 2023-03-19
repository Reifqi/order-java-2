package resto;

public class OrderButton implements UserInterface  {
	private Order cart;

	public OrderButton () {
		cart = null;
	}

	@Override
	public void pressed () {
		if ( cart != null ) {
			boolean checkoutStatus = cart.checkout();

			if ( checkoutStatus )
				System.out.println("\nCheckout done succesfully! ");
			else
				System.out.println("\nCheckout failed!");
		}
		else {
			System.out.println("Cart not Connected!");
		}
	}

	public void connectTo (Order cart) {
		System.out.println("\nConnecting to checkout cart ...");
		this.cart = cart;
		System.out.println("--> Cart connected");
	}
}