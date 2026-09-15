
import java.io.*;


public class Customer implements  Serializable {

private String Name;
private String phoneNumber;
private boolean premium;


public Customer(String Name, String phoneNumber,boolean premium){
this.Name=Name;
this.phoneNumber=phoneNumber;

this.premium=premium;
}

public String toString(){
	String str ="Customer Information:\n";
	str=str+"Name: "+Name+"\nPhone Number: "+phoneNumber+"\nPremium Member: "+(premium? "Yes":"No")+"\n";
return str;
}

public String getName(){
return Name;
}

public String getPhoneNumber(){
return phoneNumber;
}

public boolean getPremium(){
return premium;
}


}

