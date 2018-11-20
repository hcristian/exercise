package clases;

import java.util.Iterator;
import java.util.Vector;

public class RentalC extends RentalG{
	
	private int min_rent, max_rent;
	private float discount;
	private Vector<RentalG> plan_complex; 

	//Complex class. In this class we have:
	
	//Constructor with the call to the super class constructor.	
	public RentalC(String name) {
		super(name);
		Init();
	}
	
	//Init method: this is used to initialize class variables.
	private void Init() {
		min_rent = 0;
		max_rent = 0;
		plan_complex = new Vector<RentalG>();		
	}


	//Methods to set allows range to add rentals in promotion.	
	public void set_min_rent(int min) {
		this.min_rent = min;
	}
	
	public void set_max_rent(int max) {
		this.max_rent = max;
	}
	
	//Method to set discount value.
	public void set_discount(float disc) {
		this.discount = disc;
	}

	//Method to add the corresponding rentals in promotion.
	public void add_rental(RentalG rent) {
		
		if (plan_complex.size() < max_rent)
			plan_complex.addElement(rent);
	   else
		   ;
	}	
	
	//Override methods to set and get Price and Time.	
	@Override
	public float get_price() {
		
		RentalG obj;
		float price_partial = 0;
		Iterator<RentalG> i = plan_complex.listIterator();
				
		if ((plan_complex.size() >= min_rent) && (plan_complex.size() <= max_rent)){
		
			while(i.hasNext()){						
				obj = i.next();
				price_partial = price_partial + obj.get_price();
			}		
			
			price_partial = price_partial - ((price_partial * discount) / 100);		
		}
		else 
			price_partial = 0;			
		
		return price_partial;
	}

	@Override
	public int get_time() {
		
		RentalG obj;
		int time_partial = 0;
		Iterator<RentalG> i = plan_complex.listIterator();
		
		if ((plan_complex.size() >= min_rent) && (plan_complex.size() <= max_rent)){
		
			while(i.hasNext()){			
				obj = i.next();
				time_partial = time_partial + obj.get_time();
			}				
		}
		else
			time_partial = 0;
		
		return time_partial;
	}

}
