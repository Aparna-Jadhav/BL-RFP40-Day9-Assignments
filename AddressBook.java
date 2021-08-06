
import java.util.Scanner;


class ContactPerson 
{

	private String firstName, lastName, city, state;
	private long phoneNumber, zip;

	ContactPerson( ) 
	{
       		this.firstName = " ";
		this.lastName = " ";
		this.city = " ";
		this.state = " ";
       		this.phoneNumber = 0;
    		this.zip = 0;
	}


	public void addOrEditContact()
	{
		String firstName, lastName, city, state;
    		long phoneNumber;
		
		

		Scanner input = new Scanner(System.in);
		

		System.out.print("Enter first name: ");
		this.firstName =input.nextLine();
		
		System.out.print("\n");

		System.out.print("Enter last name : ");
		this.lastName =input.nextLine();

		System.out.print("\n");

		System.out.print("Enter city      : ");
		this.city =input.nextLine();
		
		System.out.print("\n");

		System.out.print("Enter state     : ");
		this.state =input.nextLine();

		System.out.print("\n");

		System.out.print("Enter ph-number : ");
		this.phoneNumber =input.nextLong();
		
		System.out.print("\n");


		System.out.print("Enter zip code : ");
		this.zip =input.nextLong();

		System.out.print("\n");

	}	


	public void printContact()
	{
		System.out.print("User contact details : \n");

		System.out.println("First name  : "+firstName + "\n" + 
				   "Last name   : "+lastName +"\n"+ 
				   "City        : "+city + "\n" +
				   "State       : "+state + "\n" +
				   "Phone no    : "+phoneNumber +"\n" +
				   "Zip code    : "+zip +"\n" );
	}

	public void deleteContact()
	{

		firstName = " ";
		lastName = " ";
		city = " ";
		state = " ";
       		phoneNumber = 0;
    		zip = 0;
	}

}   


class AddressBook
{

	Scanner input = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.println("Welcome to address Book Program \n");

		ContactPerson addr = new ContactPerson();

		System.out.println("Adding contact details : \n");

		addr.addOrEditContact(); 

		addr.printContact();

		System.out.println("Editing contact details : \n");
		
		addr.addOrEditContact(); 
		
		addr.printContact();
		
		System.out.println("Deleting contact details : \n");
	
		addr.deleteContact();

		addr.printContact();
		
	}
}

