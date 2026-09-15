
import java.io.*;
import javax.swing.JOptionPane;


public class Order implements  Serializable {
	
	   private int orderNum;//contains  a unique number for each order based on oNum.
	   private int numItems;
	   private Customer customer;
	   private menuItem[] items;
	   private static int oNum ;//increases each time a customer creates an order.


	   public Order(Customer cus)
	   {
		   orderNum = ++oNum ;
	      items= new menuItem[100];
	      customer = new Customer(cus.getName(),cus.getPhoneNumber(),cus.getPremium());
	      
	      
	   }
       // A method used to add item to items array .
	   public void addItem(menuItem item)
	   {
	   
	      if(numItems <items.length)
	      {
	         if(item instanceof Pizza)
	         {
	            items[numItems++]= new Pizza(item.getName(),item.getPrice(),item.getSize(),((Pizza) item).getNumOfBoxes(),((Pizza) item).getDough());
	            items[numItems-1].calculatePrice() ;
	            
	         }
	      
	      
	         if(item instanceof Drink)
	         {
	            items[numItems++]= new Drink(item.getName(),item.getPrice(),item.getSize(),((Drink)item).getNumOfdrinks(),((Drink)item).getType());
	            items[numItems-1].calculatePrice() ;
	           
	         }
	      }
	   
	     
	   }

	   //A method used to remove item from items array .
	   public void removeItem(String name) {
	        for (int i = 0; i < numItems; i++) {
	            if (items[i].getName().equalsIgnoreCase(name)) {
	                for (int j = i; j < numItems - 1; j++) {
	                    items[j] = items[j + 1];
	                }
	                items[numItems- 1] = null;
	                numItems--;
	                JOptionPane.showMessageDialog(null,"item successfully removed") ;
	                return ;
	            }
	        }
	        JOptionPane.showMessageDialog(null,"Can not find item with the name "+name);
	    }

	   // A method used to calculate total price of all items in items array and adds extra 18 riyals if the customer isn't Premium.

	   public double calculateTotalPrice() {
	        double totalPrice = 0;
	        for (int i = 0; i < numItems; i++) 
	                totalPrice += items[i].getPrice();
	        	
	        
	        if (!customer.getPremium()) {
	            totalPrice += 18;
	        }
	        
	        return totalPrice;
	    }
	   
	   //toStrung to return customer information and his/her order information.

	   public String toString() {
		 String str =  "*********************************\n";
	    str =str+customer.toString()+"\n";
	    str=str+"********************\n";
	    str=str+"Order Number:##"+orderNum;
	    str=str+"\nItems information:\n";
	    for (int i = 0; i < numItems; i++)        
	            str=str+(i + 1) + ". " + items[i].toString()+"\n";
	        
	    
	    str=str+"Total Price: " + calculateTotalPrice()+"\n";
            
            return str;
	   
	   }

	public Customer getCustomer() {
		return customer;
	}

}
