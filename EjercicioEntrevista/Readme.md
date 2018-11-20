Desgin:

One abstract class(RentalG) with a common attribute(Name) and abstract methods to get time and price.
Two class that inherit from RentalG and implements abstract methods.
These classes are to modeling the different aspect of the problem. One of them(Rental) is for the individual Rentals for example(rental By hour $10), 
the other one(RentalC) is for create the promotion(in this case Family plan) but in this way we can create a lot of individual rentals and 
we can combine them as we want. I applied polymorphism and dynamic binding for the cases where I declared a variable like RentalG but in fact I created like RentalC or Rental.

Test cases: the order is just for chronology: 

1 - TestFamilyRental.
2 - TestFamilyRentals.
3 - TestFamilyRentalsMultipleDays.