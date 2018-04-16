package employeeDetails;

public class Employee {
	private String name;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void displayDetails(Employee e){
	     System.out.print("Name: "+ e.getName() );
			System.out.println("\nAddress: "+ e.getAddress().getLine());
			System.out.println("City: " + e.getAddress().getCountry().getCity().getName());
			System.out.println("Country: "+ e.getAddress().getCountry().getName());
			System.out.println("-----------------------------------------------------");
	
	}
}