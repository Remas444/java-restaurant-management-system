

import java.io.*;
public abstract class menuItem implements  Serializable  {

		
	     protected String Name ;
		protected double Price ;
		protected char Size ;

		//constructor to initialize menuItem attributes .
		public menuItem (String Name, double Price,char Size)
		{
			this.Name = Name ;
			this.Size = Size ;
			this.Price= Price;
		}
		
		//constructor to help fill itemsList array in restaurant.
		public menuItem(String name, double price)
		{
			Name = name;
			Price = price;
		}

		//abstract  method that is filled in drink and pizza classes.
		public abstract void calculatePrice() ;


		public String toString() {
			return "Name: "+ Name +", Size: "+ Size +" \n" ;
			
		}


		public String getName() {
			return Name;
		}


		public double getPrice() {
			return Price;
		}


		public char getSize() {
			return Size;
		}
		

		
		
	}
