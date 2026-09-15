
public class Pizza extends menuItem {
	private int numOfBoxes ;
	private String Dough ;

		public Pizza(String Name, double price ,char Size, int numOfBoxes, String Dough) {
			super(Name ,price,Size);
			this.numOfBoxes = numOfBoxes;
			this.Dough = Dough ;
			
		}
		
		//constructor to help fill itemsList array in restaurant.
		public Pizza(String name, double price)
		{
			super(name, price);
		}
		
		 //a method to fill abstract method,calculates price based on size and dough.
		public void calculatePrice() {
			if(Dough.equalsIgnoreCase("thick")) 
			
				switch(Size) {
				
				case'L' :case'l' :
					Price = Price +15 ;
				break ;
					
				case'M' :case'm' :
					Price = Price+10;
				break ;
					
				case'S' :case's' :
					Price = Price+8 ; 
				break ;	
				}
		
			else 
				if(Dough.equalsIgnoreCase("thin")) 
					switch(Size) {
					
					case'L' :case'l' :
						Price =Price+ 9 ;
					break ;
						
					case'M' :case'm' :
						Price = Price+7 ;
					break ;
						
					case'S' :case's' :
						Price =Price+ 5 ; 
					break ;	
					}
				
				
			Price = Price  * numOfBoxes ;
			
		}
		
		

		public String toString() {
			return super.toString() + " Number Of Boxes :" + numOfBoxes + ", Dough: " + Dough + " , Price : "  +Price ;
		}
		


		public int getNumOfBoxes() {
			return numOfBoxes;
		}


		public String getDough() {
			return Dough;
		}


		
		}
