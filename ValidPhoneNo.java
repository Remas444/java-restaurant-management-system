
public class ValidPhoneNo  extends Exception {
	
	public ValidPhoneNo()
	{
		super("Invalid phone number length!! ");
		
	}
	
	public ValidPhoneNo(String ErrorMassage)
	{
		super(ErrorMassage);
		
	}
	

}