
import java.io.*;
import java.util.*;
public class Restaurant implements  Serializable {
	private String Name; 
	private String Address;
	private int numOrders;
	public menuItem[] itemsList;//Array that consists of items that are offered by restaurant, which will be filled by cashier.
	private Order [] orderList;//Array that consists of orders made by customers.
	private int numItems;
        
	
	public Restaurant(String name, String address,int sizeO) {
		Name = name;
		Address = address;
		numOrders = 0;
		orderList= new Order[sizeO];
                itemsList = new menuItem[15];
		
		
	}
	
	//Used to fill itemsList array .
	public boolean addItem(menuItem item)
	{
		if(numItems<itemsList.length)
                {
			itemsList[numItems++]=item;
                        return true;
                }
                
                return false;
			
	}
	
	
	
	//Used to add a new order to orderList.
	public boolean addOrder(Order o) {
		
		if(numOrders< orderList.length)
		{
			orderList[numOrders++]=o;
			return true;
		}
		
		return false;
		
		
	}
	
	//A method used to search for pizza under a specific price.
	public Pizza[] findPizza (double p) {
		Pizza pizzaList[] = new Pizza [numItems];
		int j = 0;
		for(int i=0; i<numItems;i++) 
		if(itemsList[i] instanceof Pizza)
			if(itemsList[i] .getPrice() < p)
				 pizzaList[j++] = ( (Pizza) itemsList[i]  );
	
		
		if(j==0)
			return null ;
		else
			return pizzaList ;
	}
	//A method to search for a specific customer's order based on phone number.
	public Order getSpecificOrder(String phone) 
	{
		for(int i=0 ;i<numOrders;i++)
			if(orderList[i].getCustomer().getPhoneNumber().equals(phone))
				return orderList[i];
		
		return null;
	}
	

            
	//A method that returna a string that contains restaurant information.
	public String toString()
	{
		String str ="Restaurant information: \n"+"Name: "+Name+"\n"+"Address: "+Address+"\n";
	

		return str;
				

	}

    public int getNumItems() {
        return numItems;
    }

    public menuItem[] getItemsList() {
        return itemsList;
    }
    
    
    public menuItem[] ArrayOfPizza()
    {
        int numPizza=0;
        for(int i=0 ;i<numItems;i++)//count number of pizza in itemsList
        {
           if(itemsList[i] instanceof Pizza)
             numPizza++;  
        }
        
        menuItem [] p= new Pizza[numPizza];
        
        int countNumOfPizza=0;
        
        for(int j=0 ;j<numItems;j++)
        {
           if(itemsList[j] instanceof Pizza)
             p [countNumOfPizza++]=  (Pizza)itemsList[j];
           
           
        }
        
        if(numPizza==0)
            return null;
        
        return p;
        
        
    }
    
    
       public menuItem[] ArrayOfDrinks()
    {
        int numDrinks=0;
        for(int i=0 ;i<numItems;i++)//count number of drinks in itemsList
        {
           if(itemsList[i] instanceof Drink)
             numDrinks++;  
        }
        
        menuItem [] d= new Drink[numDrinks];
        
        int countNumOfDrinks=0;
        
        for(int j=0 ;j<numItems;j++)
        {
           if(itemsList[j] instanceof Drink)
             d [countNumOfDrinks++]=  (Drink)itemsList[j];
           
           
        }
        
        if(numDrinks==0)
            return null;
        
        return d;
        
        
    }

    public int getNumOrders() {
        return numOrders;
    }

    public Order[] getOrderList() {
        return orderList;
    }

    public String getName() {
        return Name;
    }
      
    
       
        
    
     
    
    
        
	
	
}
