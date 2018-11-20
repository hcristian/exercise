package testCases;

import org.testng.AssertJUnit;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import clases.Rental;
import clases.RentalC;
import clases.RentalG;

public class TestFamilyRental {
	
  RentalG rh, rd, rw, rc;
  
  //Set values in promotion but less than the minimum value to check the correct output.
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
	  
	  ((RentalC)rc).add_rental(rh);
	  ((RentalC)rc).add_rental(rd);	  
  }

  //Here I expect that the price is zero, because there are only two rentals in promotion.  
  @Test
  public void TestFamRentalPrice() {
	  
	  float curr_price, comp_price;	 
	  
	  curr_price = rc.get_price();
	  comp_price = 0;
	  
	  AssertJUnit.assertEquals(curr_price, comp_price);
	  
  }
  
  //Here I expect that the time is zero, because there are only two rentals in promotion. 
  @Test
  public void TestFamRentalTime() {
	  
	  int curr_time, comp_time;	 
	  
	  curr_time = rc.get_time();
	  comp_time = 0;
	  
	  AssertJUnit.assertEquals(curr_time, comp_time);
	  
  }  
}
