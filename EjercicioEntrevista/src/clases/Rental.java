package clases;

public class Rental extends RentalG{
	
	private float price;
	private int time;
	
	//Atomic class(it means the class that represent the option individual for rent a bike).
	public Rental(String name) {
		super(name); 
	}
	
	//Methods to get and set the values Price and Time.
	public void set_price(float price) {
		this.price = price;
	}
	
	public void set_time(int time) {
		this.time = time;
	}

	@Override
	public float get_price() {
		return this.price * this.time;
	}

	@Override
	public int get_time() {
		return this.time;
	}

}
