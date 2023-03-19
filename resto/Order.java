package resto;

public interface Order {
	void connectTo (Payment channel);
	boolean checkout ();
	float calculatePrice ();
	boolean isEmpty ();
}