package clases;

public abstract class RentalG  {
	
	private String name;
	
	//Abstract class with a common attribute "Name".
	//There are two abstract methods for Price and Time.
	public RentalG(String name){
		this.name = name;
	}
	
	public String get_name() {
		return this.name;
	}
	
	public abstract float get_price();
	
	public abstract int get_time();
	
}
