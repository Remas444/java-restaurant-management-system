public class Drink extends menuItem {
	
	private int numOfdrinks ;
	private String type  ;

	public Drink(String Name,double Price,char Size , int numOfdrinks, String type) {
		super(Name ,Price,Size);
		this.numOfdrinks = numOfdrinks;
		this.type = type;
	}
	
	//constructor to help fill itemsList array in restaurant.
	public Drink(String name, double price,String type) {
		super(name, price);
		this.type=type;
	}

   //a method to fill abstract method,calculates price based on size and type.
	public void calculatePrice() {
		
		if(type.equalsIgnoreCase("Smoothie")) 
			switch(Size) {
			
			case'L' :case'l' :
				Price  = Price+ 12;
			break ;
				
			case'M' :case'm' :
				Price  = Price+ 10 ;
			break ;
				
			case'S' :case's' :
				Price  = Price+8 ; 
			break ;	
			}
		else 
			if(type.equalsIgnoreCase("Soft drink")) 
				switch(Size) {
				
				case'L' :case'l' :
					Price  = Price+ 8;
				break ;
					
				case'M' :case'm' :
					Price  = Price+ 6 ;
				break ;
					
				case'S' :case's' :
					Price = Price+4 ; 
				break ;	
				}
			else 
				if(type.equalsIgnoreCase("Juice")) 
					switch(Size) {
					
					case'L' :case'l' :
						Price = Price+ 10  ;
					break ;
						
					case'M' :case'm' :
						Price = Price+ 8;
					break ;
						
					case'S' :case's' :
						Price = Price +6; 
					break ;	
					}
		Price = Price  * numOfdrinks ;
		
	
	}

	public String toString() {
		return super.toString() + " Number Of Drinks :" + numOfdrinks + ", type: " + type + " , Price : "  +Price ;
	}


	public int getNumOfdrinks() {
		return numOfdrinks;
	}


	public String getType() {
		return type;
	}
}
