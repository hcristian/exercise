package testCases;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import clases.Rental;
import clases.RentalC;
import clases.RentalG;

public class TestFamilyRentals {
	
	  RentalG rh, rd, rw, rc;
	  
	  //Set values in promotion between minimum and maximum value to check the correct output.
	  @BeforeTest
	  public void setUpClass() {
		  
		  rc = new RentalC("Family");
		  ((RentalC)rc).set_min_rent(3);
		  ((RentalC)rc).set_max_rent(5);
		  
		  rh = new Rental("By hour");
		  ((Rental)rh).set_time(1);
		  ((Rental)rh).set_price(5);
		  
		  rd = new Rental("By day");
		  ((Rental)rd).set_time(1);
		  ((Rental)rd).set_price(20);
		  
		  rw = new Rental("By week");
		  ((Rental)rw).set_time(1);
		  ((Rental)rw).set_price(60);		  
		  
		  ((RentalC)rc).add_rental(rh);
		  ((RentalC)rc).add_rental(rd);
		  ((RentalC)rc).add_rental(rw);
	  }
		
	  //Here I expected the sum of all rentals:
	  //We have 1 hour - $5
	  //		1 day  - $20
	  //		1 week - $60
	  //Total		   - $85
	  @Test
	  public void TestFamRentalPrice() {
		  
		  float curr_price, comp_price;	 
		  
		  curr_price = rc.get_price();
		  comp_price = 85;
		  
		  AssertJUnit.assertEquals(curr_price, comp_price);
		  
	  }	
	  
	  //Here I expected the sum of all rentals with a discount of 10%:
	  //We have 1 hour : $5
	  //		1 day  : $20
	  //		1 week : $60	  
	  //SubTotal       : $85
	  //Discount	   : $8.5
	  //Total		   : $76.5
	  @Test
	  public void TestFamRentalPriceDiscount() {
		  
		  float curr_price, comp_price;
		  
		  ((RentalC)rc).set_discount(10);
		  
		  curr_price = rc.get_price();
		  comp_price = (float) 76.5;
		  
		  AssertJUnit.assertEquals(curr_price, comp_price);		  
		  
	  }

}
