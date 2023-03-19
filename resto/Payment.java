package resto;

public interface Payment {
	boolean pay (float ammout);
	void topUp (float ammount);
	void withdraw (float ammount);
	float getBalance ();
	String getChannelName(); 
}